package com.example.tawhida.herstory;

/**
 * Created by Tawhida on 12/2/2018.
 */

public class Modest {

    private  String Title;
    private  String Category;
    private  String Description;
    private  int Thumbnail;

    public Modest(){
    }

    public Modest(String title, String category, String description, int thumbnail, int thumbnail1) {

        Title = title;
        Category = category;
        Description = description;
        Thumbnail = thumbnail1;

    }

    public Modest(String abaya, String category, String description, int abaya1) {
    }

    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
