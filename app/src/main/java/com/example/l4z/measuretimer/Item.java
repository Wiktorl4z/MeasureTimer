package com.example.l4z.measuretimer;

/**
 * Created by l4z on 25.09.2017.
 */

public class Item {

    private String name;
    private int mImageView;

    public Item(int mImageView) {
        this.mImageView = mImageView;
    }

    public int getmImageView() {
        return mImageView;
    }

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
