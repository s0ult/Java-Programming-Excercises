package com.ssoult;

import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String albumName;
    private LinkedList<Song> songs;

    public Album(String albumName) {
        this.albumName = albumName;
        this.songs = new LinkedList<>();
        System.out.println("New album \" " + albumName + " \" was created.");
    }

    public String getAlbumName() {
        return albumName;
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }

    public boolean addSong(String songName, double duration) {

        if (findSong(songName,duration) == null ) {
            songs.add(new Song(songName, duration));
            return true;
        }
        System.out.println("Song "+ findSong(songName,duration).toString()+" already exists.");
        return false;
    }


    public boolean removeSong(String songName, double duration) {

        Song song = findSong(songName, duration);
        if ( song != null ) {
            songs.remove(song);
            System.out.println("Removed \" "+song.getTitle()+" \" from the playlist.");
            return true;
        }
        System.out.println("Can't remove song \" "+song.getTitle()+" \" .");
        return false;
    }

    public Song findSong(String songName, double duration) {
        ListIterator<Song> listIterator = songs.listIterator();
        while (listIterator.hasNext()) {
            Song searchedSong = listIterator.next();
            if (searchedSong.getTitle().equals(songName) &&
                    searchedSong.getDuration() == duration) {
                System.out.println("Found song \" " + searchedSong.getTitle() + " \" duration " + searchedSong.getDuration() + ".");
                return searchedSong;
            }
        }
        System.out.println("Song not found.");
        return null;
    }

    public boolean playSong(String songName, double duration) {
        Song songToPlay = findSong(songName, duration);
        if (songToPlay != null) {
            System.out.println("Now playing \" " + songToPlay.getTitle() + " \" duration " + songToPlay.getDuration() + ".");
            return true;
        } else {
            System.out.println("Can't find \" " + songName + " \" duration " + duration+ ".");
            return false;
        }
    }

    public boolean deleteSong( String songName, double duration){

        Song songToDelete = findSong(songName, duration);

        if (songToDelete != null){
            System.out.println("Song: \" "+songToDelete.getTitle()+" \" Duration: "+songToDelete.getDuration()+" was deleted");
            songs.remove(songToDelete);
            return true;
        }
        System.out.println("Error deleting song.");
        return false;
    }

    public void printAlbumList(){
        ListIterator < Song > listIterator = songs.listIterator();
        while (listIterator.hasNext()){
            Song song = listIterator.next();
            System.out.println("Song: \" "+song.getTitle()+" \" Duration: "+song.getDuration()+".");
        }
    }
}
