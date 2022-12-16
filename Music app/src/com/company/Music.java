package com.company;

public class Music {
    String title;
    double duration;

    public Music(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }
    public Music(){

    }
    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}