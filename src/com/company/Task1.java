package com.company;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        run();
    }

    private static void run() {
//       System.out.print("Enter the name: ");
//       String name = new Scanner(System.in).nextLine();
//        MovieActionService.findMoviesFromName(name).forEach(System.out::println);
//       MovieActionService.sortFromYear(true).forEach(System.out::println);
//       MovieActionService.sortFromDirector(true).forEach(System.out::println);
//       MovieActionService.sortFromName(true).forEach(System.out::println);
//
//       System.out.print("Enter actor`s name: ");
//        String name = new Scanner(System.in).nextLine();
//        Map<String, String> movies = MovieActionService.searchMoviesByActor(name);
//        for (Map.Entry<String, String> entry : movies.entrySet()) {
//           System.out.printf("Movie: %s%nRole: %s%n%n", entry.getKey(), entry.getValue());
//      }

        // Actor: [Roles]
//        Map<String, List<String>> movies = MovieActionService.findActorsAndRoles();
//        for (Map.Entry<String, List<String>> entry : movies.entrySet()) {
//            System.out.println("Movie: " + entry.getKey() + entry.getValue());
//        }

//        List<Movie> movieList=MovieActionService.findMoviesByName("");
//       for (Movie m : movieList)
//        System.out.println(m);
//
        List<Movie> movieList=MovieActionService.findActorsAndRoles();
        for (Movie m : movieList)
            System.out.println(m);
    }


}


