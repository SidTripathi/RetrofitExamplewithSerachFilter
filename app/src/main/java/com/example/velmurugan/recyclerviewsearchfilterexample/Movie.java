package com.example.velmurugan.recyclerviewsearchfilterexample;

import com.google.gson.annotations.SerializedName;

public class Movie {
    @SerializedName("alconcode")
    private String title;

    @SerializedName("projectname")
    private String projectname;

    public Movie(String title, String projectname) {
        this.title = title;
        this.projectname = projectname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }
}
