package com.company;

public class Song {
    String genre;
    String name;
    String artist;
    String date;

    public Song(String name, String artist, String date, String genre) {
        this.name = name;
        this.artist = artist;
        this.date = date;
        this.genre = genre;
    }



    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
