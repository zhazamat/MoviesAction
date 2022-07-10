package com.company;

import java.util.List;

public class Movie {
    private String name;
    private Integer year;
    private String description;
    private Director director;
    private List<Cast> cast;

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public String getDirector() {
        return director.getFullName();
    }

    public List<Cast> getCast() {
        return cast;
    }
    @Override
    public String toString() {
        return "Movie{" +
                "\n\tname='" + name + '\'' +
                ", \n\tyear=" + year +
                ", \n\tdescription='" + description + '\'' +
                ", \n\tdirector=" + director +
                ", \n\tcast=" + cast +
                "\n}";
    }
}
