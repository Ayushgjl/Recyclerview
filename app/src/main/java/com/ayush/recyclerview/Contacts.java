package com.ayush.recyclerview;

public class Contacts {
    private String name;
    private String phoneno;
    private int imageId;

    public Contacts(String name, String phoneno, int imageId) {
        this.name = name;
        this.phoneno = phoneno;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }



}
