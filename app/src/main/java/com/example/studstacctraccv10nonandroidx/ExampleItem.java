package com.example.studstacctraccv10nonandroidx;

public class ExampleItem {
    private int mImageResource;
    private String mText;

    public ExampleItem(int imageResource, String text) {
        mImageResource = imageResource;
        mText = text;
    }
    public int getImageResource() {
        return mImageResource;
    }

    public String getText() {
        return mText;
    }

    public void changeText(String text){
        mText=text;
    }
}
