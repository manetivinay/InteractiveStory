package com.example.vinaymaneti.interactivestory.modal;

/**
 * Created by vinaymaneti on 8/2/16.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public Choice(String text, int nextPage) {
        mText = text;
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int nextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
