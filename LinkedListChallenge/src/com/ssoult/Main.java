package com.ssoult;

public class Main {

    public static void main(String[] args) {

//        Album album = new Album( "For whom the bells tolls");
//        album.addSong("For whom the bells tolls", 13.11);
//        album.addSong("For whom the bells tolls", 1);
//        album.addSong("For whom the bells tolls", 13.11);
//
//        album.printAlbumList();
//        album.deleteSong("For whom the bells tolls",13.11);
        System.out.println("===========");
//        album.printAlbumList();
        Playlist migosPlaylist = new Playlist("Migos");
        migosPlaylist.addAlbum("Culture II");
        migosPlaylist.addAlbum("Culture");
        migosPlaylist.addSong("Culture II","Work Hard",4.31);
        migosPlaylist.addSong("Culture II","Narcos",6.15);
        migosPlaylist.addSong("Culture II","Walk it Talk it",3.21);
        migosPlaylist.addSong("Culture II","Stir fry",5.25);
        migosPlaylist.addSong("Culture II","White Sand",4.50);

        migosPlaylist.removeSong("Culture II","White Sand",4.50);

        migosPlaylist.playSong("Culture II","Work Hard",4.31);
        migosPlaylist.replaySong();
        migosPlaylist.skipToNextSong();
        migosPlaylist.replaySong();

        migosPlaylist.skipToPreviousSong();
        migosPlaylist.replaySong();


    }
}
