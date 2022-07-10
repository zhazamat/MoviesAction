package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class FileService {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path PATH = Paths.get("./movies.json");

    public static List<Movie> readFile() {
        Type itemsMapType = new TypeToken<Map<String, List<Movie>>>() {
        }.getType();
        String json;
        try {
            json = Files.readString(PATH);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Map<String, List<Movie>> moviesMap = GSON.fromJson(json, itemsMapType);
        return moviesMap.get("movies");
    }
}
