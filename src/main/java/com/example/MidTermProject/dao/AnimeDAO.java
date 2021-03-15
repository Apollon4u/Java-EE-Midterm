package com.example.MidTermProject.dao;

import com.example.MidTermProject.models.Anime;

import java.util.ArrayList;

public class AnimeDAO {

    private static AnimeDAO instance;
    private ArrayList<Anime> anime_list;

    private AnimeDAO() {
        this.anime_list = new ArrayList<>();
    }

    public static AnimeDAO getInstance() {
        if (instance == null) {
            instance = new AnimeDAO();
        }
        return instance;
    }

    public void addAnime(Anime anime) {
        anime_list.add(anime);
    }

    public void deleteAnime(Anime anime) {
        anime_list.remove(anime);
    }

    public ArrayList<Anime> getAnimeList() {
        return anime_list;
    }
}
