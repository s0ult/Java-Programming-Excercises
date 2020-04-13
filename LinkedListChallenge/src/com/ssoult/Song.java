package com.ssoult;

public class Song {
    private String Title;
    private double Duration;

    public Song(String title, double duration) {
        this.Title = title;
        this.Duration = duration;
    }

    public String getTitle() {
        return this.Title;
    }

    public double getDuration() {
        return this.Duration;
    }

    @Override
    public String toString() {

        return this.Title+" : "+this.Duration;
    }
}
