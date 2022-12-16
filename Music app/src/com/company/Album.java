package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private  String artist;
    private ArrayList<Music> songs;
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Music>();
    }
    public Album(){

    }
    // it will find song
    public Music findSong(String title){
        for (Music checkedSong: songs) {
            if(checkedSong.getTitle().equals(title)) return checkedSong;
        }
        return null;
    }

    //checking if our song is already exist then don't add it to the album else add it to the album
    public  boolean addSong(String title, double duration){
        if(findSong(title) == null){
            songs.add(new Music(title, duration));
//            System.out.println(title+ "Successfully added to a list");
            return  true;
        }else{
//            System.out.println("Song with the name " + title + "already exist");
            return false;
        }
    }
    //checking if song is already present in the album then only add it to playlist
    public boolean addToPlaylist(int tracknumber, LinkedList<Music> playlist){
        int index = tracknumber-1;
        if(index>0 && index<=this.songs.size()){
            playlist.add(this.songs.get(index));
            return true;
        }
//        System.out.println("This album does not have Song with track " + tracknumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Music> Playlist){
        for (Music checkedSong: this.songs) {
            if(checkedSong.getTitle().equals(title)){
                Playlist.add(checkedSong);
                return true;
            }
        }
//        System.out.println( title + " No such Song!!");
        return false;
    }


}