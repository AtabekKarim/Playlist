package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Genre> Genres = new ArrayList<>();
    public static ArrayList<Song> Songs = new ArrayList<>();

    public static void main(String[] args) {

    int select = -1;

    while (select != 0){

        System.out.println("1.Add genre");
        System.out.println("2.Add song");
        System.out.println("3.Search song by artist");
        System.out.println("4.Search song by category");
        System.out.println("5.Search song by name");
        System.out.println("6.List of songs");
        select = sc.nextInt();

        if (select == 1){
            addgenre();
            } else if (select == 2){
            addsong();
            } else if (select == 3){
            searchsongbyartist();
            } else if (select == 4){
            searchsongbygenre();
            } else if (select == 5){
            searchsongbyname();
            } else if (select == 6){
            listofsongs();
            }

        }
    }

    private static void addgenre(){

        System.out.println("Please, enter genre that you want to add to the list of genres: ");
        String name = sc.next();
        Genre newGenre = new Genre(name);
        Genres.add(newGenre);

    }

    private static void addsong(){

        System.out.println("Please, enter song that you want to add to the list of songs: ");
        String name = sc.next();
        System.out.println("Who is author of this song? ");
        String artist = sc.next();
        System.out.println("When was this song published? ");
        String date = sc.next();
        System.out.println("What is genre of this song? ");
        String genre = sc.next();
        Song newSong = new Song(name, artist, date, genre);
        Songs.add(newSong);

    }

    private static void searchsongbyartist(){

        System.out.println("Enter artist: ");
        String artist = sc.next();
        boolean check = false;
        for (int i = 0; i < Songs.size(); i++) {
            if (Songs.get(i).artist.equals(artist)){
            check = true;
                System.out.println("Artist: " + Songs.get(i).artist);
                System.out.println("Name of song: " + Songs.get(i).name);
            }
        }
        if (check == false){
            System.out.println("Unfortunately, there is no artist with such name in the list!");
        }
    }

    private static void searchsongbygenre(){

        System.out.println("Enter genre: ");
        String genre = sc.next();
        boolean check = false;
        for (int i = 0; i < Songs.size(); i++) {
            if (Songs.get(i).genre.equals(genre)){
                check = true;
                System.out.println("Artist: " + Songs.get(i).artist);
                System.out.println("Name of song: " + Songs.get(i).name);
            }
        }
        if (check == false){
            System.out.println("Unfortunately, there is no such genre in the list!");
        }
    }

    private static void searchsongbyname(){

        System.out.println("Enter name: ");
        String name = sc.next();
        boolean check = false;
        for (int i = 0; i < Songs.size(); i++) {
            if (Songs.get(i).name.equals(name)){
                check = true;
                System.out.println("Name of song: " + Songs.get(i).name);
                System.out.println("Its Artist: " + Songs.get(i).artist);
                System.out.println("Genre of this song: " + Songs.get(i).genre);
                System.out.println("Date of this songs publication: " + Songs.get(i).date);
            }
        }
        if (check == false){
            System.out.println("Unfortunately, there is no song with such name in the list!");
        }

    }

    private static void listofsongs(){
        System.out.println("List of all songs: ");
        for (int i = 0; i < Songs.size(); i++) {
            System.out.println(Songs.get(i).name);
            System.out.println(Songs.get(i).artist);
            System.out.println(Songs.get(i).date);
            System.out.println(Songs.get(i).genre);
        }
    }
}

