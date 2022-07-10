package com.company;

import java.util.*;

public class MovieActionService {
    private static final List<Movie> MOVIES = FileService.readFile();

    public static List<Movie> findMoviesByName(String name) {
        List<Movie> moviesFromName = new ArrayList<>();
        for (Movie m : MOVIES) {
            if (m.getName().toLowerCase().contains(name.toLowerCase())) {
                moviesFromName.add(m);
            }
        }
        return moviesFromName;
    }

    public static List<Movie> sortByName(boolean asc) {
        List<Movie> movieList = MOVIES;
        movieList.sort(Comparator.comparing(Movie::getName));
        if (!asc) {
            Collections.reverse(movieList);
        }
        return movieList;
    }

    public static List<Movie> sortByDirector(boolean asc) {
        List<Movie> movieList = MOVIES;
        movieList.sort(Comparator.comparing(Movie::getDirector));
        if (!asc) {
            Collections.reverse(movieList);
        }
        return movieList;
    }

    public static List<Movie> sortByYear(boolean asc) {
        List<Movie> movieList = MOVIES;
        movieList.sort(Comparator.comparing(Movie::getYear));
        if (!asc) {
            Collections.reverse(movieList);
        }
        return movieList;
    }

    public static Map<String, String> searchMoviesByActor(String name) {
        Map<String, String> moviesAndRoles = new HashMap<>();
        for (Movie m : MOVIES) {
            for (Cast c : m.getCast()) {
                if (c.getFullName().toLowerCase().contains(name.toLowerCase())) {
                    moviesAndRoles.put(m.getName(), c.getRole());

                }
            }
        }
        return moviesAndRoles;
    }

    public static Map<String, List<String>> findActorsAndRoles() {
        Map<String, List<String>> actorsAndRoles = new HashMap<>();
        TreeSet<String> actors = findSortedActors();
        for (String actor : actors) {
            actorsAndRoles.put(actor, new ArrayList<>());
        }

        for (Movie m : MOVIES) {
            for (Cast c : m.getCast()) {
                actorsAndRoles.get(c.getFullName()).add(c.getRole());
            }
        }
        return actorsAndRoles;
    }

    private static TreeSet<String> findSortedActors() {
        TreeSet<String> actors = new TreeSet<>();
        for (Movie m : MOVIES) {
            for (Cast c : m.getCast()) {
                actors.add(c.getFullName());
            }
        }
        return actors;
    }

}
