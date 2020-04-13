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
        return this.songs.add(new Song (title,duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {

        Song checkedSong = this.songs.findSong(trackNumber);

        if (checkedSong != null){
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



    class SongList{

        private List < Song > songList;

        public SongList() {
            this.songList = new ArrayList<Song>();
        }

        public List<Song> getSongList() {
            return songList;
        }


        private Song findSong(String title) {
            for(Song checkedSong: this.songList) {
                if(checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        private boolean add(Song song){
            if (!songList.contains(song)){
                songList.add(song);
                System.out.println("Added song to the list");
                return true;
            }
            System.out.println("Song is already in the song list");
            return false;
        }

        public Song find(String title){

            for (Song checkedSong : this.songList){

                if (checkedSong.getTitle().equals(title)){
                    System.out.println("Found "+title);
                    return checkedSong;
                }

            }
            System.out.println(title+" was not found in the song list");
            return null;
        }

        public Song findSong(int trackNumber){
            int index = trackNumber - 1;

            if (index > 0 && index < songList.size()) {
                return songList.get(index);
            }
            return null;
        }
    }

















}
