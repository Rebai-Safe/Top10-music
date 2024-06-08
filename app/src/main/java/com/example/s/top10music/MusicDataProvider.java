package com.example.s.top10music;

/**
 * Created by S on 16/08/2017.
 */

public class MusicDataProvider {
    private int music_poster_ressource;
    private String music_title;
    private String music_views;

    public int getMusic_poster_ressource() {
        return music_poster_ressource;
    }

    public void setMusic_poster_ressource(int music_poster_ressource) {
        this.music_poster_ressource = music_poster_ressource;
    }

    public String getMusic_title() {
        return music_title;
    }

    public void setMusic_title(String music_title) {
        this.music_title = music_title;
    }

    public String getMusic_views() {
        return music_views;
    }

    public void setMusic_views(String music_views) {
        this.music_views = music_views;
    }

    public MusicDataProvider(int music_poster_ressource, String music_title, String music_views) {
        this.music_poster_ressource = music_poster_ressource;
        this.music_title = music_title;
        this.music_views = music_views;
    }

}
