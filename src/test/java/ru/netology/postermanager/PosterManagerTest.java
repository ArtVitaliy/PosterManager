package ru.netology.postermanager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void addTest() {
        PosterManager manager = new PosterManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");

        String[] expected = {"Movie 1", "Movie 2", "Movie 3", "Movie 4"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {
        PosterManager manager = new PosterManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");

        String[] expected = {"Movie 4", "Movie 3", "Movie 2", "Movie 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void posterManagerLimitTest() {
        PosterManager manager = new PosterManager(6);

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");
        manager.add("Movie 7");
        manager.add("Movie 8");
        manager.add("Movie 9");
        manager.add("Movie 10");

        String[] expected = {"Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}
