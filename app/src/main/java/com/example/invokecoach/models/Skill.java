package com.example.invokecoach.models;

public class Skill {
    private String castCombo;
    int imageId;

    public Skill(String castCombo,int imageId) {
        this.castCombo = castCombo;
        this.imageId = imageId;
    }

    public String getCastCombo(){
        return castCombo;
    }

    public int getImageId() {
        return imageId;
    }
}
