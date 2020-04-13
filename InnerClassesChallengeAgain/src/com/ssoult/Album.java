package com.ssoult;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by dev on 18/09/15.
 */
public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {

            return this.songs.add(new Song(title, duration));

    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(trackNumber);

        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;

    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }




    private class SongList{

        private List< Song > songList;

        private SongList(){
            songList = new ArrayList<Song>();
        }

        private boolean add(Song song){
            if (!songList.contains(song)) {
                songList.add(song);
                return true;
            }
            return false;
        }
        private Song findSong(int trackNumber){
            int index = trackNumber -1;
            if (index >= 0 && index < songList.size() ){
                return songList.get(index);
            }
            System.out.println("Wrong track number");
            return null;
        }
        private Song findSong(String title){
            for (int i = 0 ; i < songList.size(); i++) {
                Song checkedSong = songList.get(i);
                if (checkedSong.getTitle().equals(title)){
                    return checkedSong;
                }
            }
            return null;
        }


    }














}
