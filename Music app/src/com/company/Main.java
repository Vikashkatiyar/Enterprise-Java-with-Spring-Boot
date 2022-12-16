package com.company;
import java.util.Scanner;
import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Album1" , "AC/BC");
        album.addSong("TNT", 4.5);
        album.addSong("Sajeyaa", 5.5);
        album.addSong("Highway", 3.5);
        albums.add(album);

        album = new Album("Album2","Jubin");
        album.addSong("shorts",2.5);
        album.addSong("Raata Lambeya", 4.5);
        album.addSong("Befikra", 5.00);
        albums.add(album);

        LinkedList<Music> playlist_1 = new LinkedList<>();
        albums.get(0).addToPlaylist("TNT", playlist_1);
        albums.get(0).addToPlaylist("Highway", playlist_1);
        albums.get(1).addToPlaylist("Sajeyaa", playlist_1);
        albums.get(1).addToPlaylist("Rozana", playlist_1);

        play(playlist_1);



    }
    private static void play(LinkedList<Music> playlist) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Music> listIterator = playlist.listIterator();

        if(playlist.size()==0){
            System.out.println("Playlist have no songs!!");
        }else{
            System.out.println("Now Playing " + listIterator.next().toString());
            printname();
        }
        while (!quit){
            int action = sc.nextInt();
            switch(action){
                case 0:
                    System.out.println("Playlist Complete");
                    quit =true;
                    break;

                case 1:
                    if(forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward=true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now Playing " + listIterator.next().toString());
                    }else{
                        System.out.println("We have no songs available...");
                        forward=false;
                    }
                    break;

                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else{
                        System.out.println("We are at first Song ");
                        forward=false;
                    }
                    break;

                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now Playing " + listIterator.previous().toString());
                            forward=false;

                        }else{
                            System.out.println("We are at the start of list");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now Playing " + listIterator.next().toString());
                            forward=true;
                        }else{
                            System.out.println(" We have reached to the end of list");
                        }
                    }
                    break;

                case 4:
                    printlist(playlist);
                    break;

                case 5:
                    printname();
                    break;

                case 6:
                    if(playlist.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now Playing "+ listIterator.next().toString());
                            forward=true;
                        }
                        else{
                            if(listIterator.hasPrevious()) {
                                System.out.println("Now Playing " + listIterator.previous().toString());
                            }
                        }
                    }
            }
        }
    }



    private static void printname(){
        System.out.println("Available options\n press");
        System.out.println("0 - to quit\n " +
                "1 - to play next song\n " +
                "2 - to play previous song\n " +
                "3 - to replay the current song\n " +
                "4 - list of all songs\n " +
                "5 - print all available options\n " +
                "6 - delete current song");
    }

    public static void printlist(LinkedList<Music> playlist ) {
        Iterator<Music> iterator = playlist.listIterator();
        System.out.println("........................................");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("........................................");
    }
}