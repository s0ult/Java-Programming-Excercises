package com.ssoult;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {

    public static void main(String[] args) {


    }

    private Scanner scanner = new Scanner(System.in);
    private String playlistName;
    private LinkedList < Album > albums;
    private Album currentAlbum;
    private Song currentSong;


    public Playlist( String playlist ) {
        this.playlistName = playlist;
        this.albums = new LinkedList<>();
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public LinkedList<Album> getAlbums() {
        return albums;
    }

    public void showPlaylistSongs(){

    }

    public boolean addAlbum( String albumName ) {

        if (findAlbum(albumName) == null) {
            Album album = new Album( albumName );
            albums.add( album );
            System.out.println("Added album \" "+album.getAlbumName()+" \".");
            return true;
        }
        System.out.println("Album already exists.");
        return false;
    }

    public Album findAlbum( String albumName ){
        ListIterator < Album > albumListIterator = this.albums.listIterator();
        while (albumListIterator.hasNext()){
            Album album = albumListIterator.next();
            if (album.getAlbumName().equals( albumName )){
                System.out.println("Album \" "+album.getAlbumName()+" \" found.");
                return album;
            }
        }
        System.out.println("Album \" "+albumName+" \" not found.");
        return null;
    }
    public boolean addSong( String albumName, String songName, double duration ){
        Album album = findAlbum(albumName);
        if ( album != null){
            album.addSong(songName, duration);
            System.out.println("Added song \" "+songName+" \" to \" "+playlistName+" \" playlist.");
            return true;
        }
        System.out.println("Album \" "+albumName+" \" not found.");
        return false;
    }

    public boolean removeSong( String albumName, String songName, double duration ){
        Album album = findAlbum(albumName);
        if ( album != null){
            album.removeSong(songName, duration);
            System.out.println("Removed song \" "+songName+" \" to \" "+playlistName+" \" playlist.");
            return true;
        }
        System.out.println("Album \" "+albumName+" \" not found.");
        return false;
    }

    public boolean deleteSong( String albumName, String songName, double duration ){
        Album album = findAlbum(albumName);
        if (album != null){
            album.deleteSong(songName, duration);
            return true;
        }
        System.out.println("Album \" "+albumName+" \" not found.");
        return false;
    }

    public Song playSong( String albumName, String songName, double duration ){
        Album album = findAlbum( albumName );
        if (album != null){
            Song song = album.findSong( songName, duration);
            if (song != null ){
                System.out.println("Now playing \" " + song.getTitle() + " \" duration " + song.getDuration() + ".");
                this.currentAlbum = album;
                this.currentSong = song;
                return song;
            }else {
                System.out.println("Can't find \" "+songName+" \" in album "+album.getAlbumName()+".");
                return null;
            }
        }
        System.out.println("Can't find album \" "+albumName+" \".");
        return null;
    }

    public boolean skipToNextSong( ){

        ListIterator < Album > albumIterator = getAlbums().listIterator();
        if ( albumIterator.hasNext() ){
            Album album = albumIterator.next();
            ListIterator< Song > songIterator = album.getSongs().listIterator();
            Song nextSong = songIterator.next();
            System.out.println("Skipping to next song \" "+nextSong.getTitle()+" \" "+nextSong.getDuration());
            playSong(album.getAlbumName(), nextSong.getTitle(), nextSong.getDuration());
            albumIterator.previous();
            return true;
        }
        System.out.println("Unable to play next song.");
        albumIterator.previous();
        return false;
    }

    public boolean replaySong(){

            ListIterator < Album > albumIterator = getAlbums().listIterator();
            if ( albumIterator.hasPrevious() ){
                Album album = albumIterator.next();
                ListIterator< Song > songIterator = album.getSongs().listIterator();
                Song replayingSong = songIterator.previous();
                System.out.println("Replaying song \" "+replayingSong.getTitle()+" \" "+replayingSong.getDuration());
                playSong(album.getAlbumName(), replayingSong.getTitle(), replayingSong.getDuration());
                albumIterator.previous();
                return true;
            }
            System.out.println("Unable to replay song.");
//            albumIterator.previous();
            return false;
    }


    public boolean skipToPreviousSong(){

        ListIterator < Album > albumIterator = getAlbums().listIterator();
        if ( albumIterator.hasNext() ){
            Album album = albumIterator.next();
            ListIterator< Song > songIterator = album.getSongs().listIterator();
            songIterator.previous();
            Song previousSong = songIterator.previous();
            System.out.println("Skipping to next song \" "+previousSong.getTitle()+" \" "+previousSong.getDuration());
            playSong(album.getAlbumName(), previousSong.getTitle(), previousSong.getDuration());
            albumIterator.previous();
            return true;
        }
        System.out.println("Unable to play next song.");
        albumIterator.previous();
        return false;
    }

    public void printMenu(){
        boolean quit = false;
        while ( !quit ){
            int action = scanner.nextInt();
            switch ( action ){
                case 0:
                    System.out.println("Quiting the app.");
                    quit = true;
                    break;
                case 1:
                    skipToNextSong();
                    System.out.println("Skipping to the next song.");
                    break;
                case 2:
                    skipToPreviousSong();
                    System.out.println("Skipping to the previous song.");
                    break;
                case 3:
                    replaySong();
                    System.out.println("Replaying current song.");
                    break;
                    default:
                        break;
            }
        }
    }
}
