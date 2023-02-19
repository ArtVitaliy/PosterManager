package ru.netology.postermanager;

public class PosterManager {

    private String[] posters = new String[0];
    private int limit;

    public PosterManager() {
        this.limit = 10;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void add(String poster) {                     //Добавление нового фильма
        String[] tmp = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;

    }

    public String[] findAll() {    //Вывод всех фильмов в порядке добавления
        return posters;
    }

    public String[] findLast() {   //Вывод максимального лимита последних добавленных фильмов в обратном от добавления порядке
        int resultLength;
        if (posters.length < limit) {
            resultLength = this.posters.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = posters[this.posters.length - 1 - i];
        }
        return tmp;

    }
}

