package com.example.jenniemartin.dota2ref;

/**
 * Created by jenni on 11/23/2016.
 */

public class Abilities {

    //Return the resource ID representing the ability
    public int getmQImageResId() {
        return mQImageResId;
    }
    public int getmWImageResId() {
        return mWImageResId;
    }
    public int getmEImageResId() {
        return mEImageResId;
    }
    public int getmRImageResId() {
        return mRImageResId;
    }
    public int getmDImageResId() {
        return mDImageResId;
    }
    public int getmFImageResId() {
        return mFImageResId;
    }
    public int getmNumberOfMovesResId() {return mNumberOfMovesResId;}
    public int getmW2ImageResId() {return mW2ImageResId;}


    //Set the resource IDs representing the ability
    public void setmQImageResId(int mQImageResId) {
        this.mQImageResId = mQImageResId;
    }
    public void setmWImageResId(int mWImageResId) {
        this.mWImageResId = mWImageResId;
    }
    public void setmEImageResId(int mEImageResId) {
        this.mEImageResId = mEImageResId;
    }
    public void setmRImageResId(int mRImageResId) {
        this.mRImageResId = mRImageResId;
    }
    public void setmDImageResId(int mDImageResId) {
        this.mDImageResId = mDImageResId;
    }
    public void setmFImageResId(int mFImageResId) {
        this.mFImageResId = mFImageResId;
    }
    public void setmNumberOfMovesResId(int mNumberOfMovesResId) {this.mNumberOfMovesResId = mNumberOfMovesResId;}
    public void setmW2ImageResId(int mW2ImageResId) {this.mW2ImageResId = mW2ImageResId;}


    private int mQImageResId;
    private int mWImageResId;
    private int mW2ImageResId;
    private int mEImageResId;
    private int mRImageResId;
    private int mDImageResId;
    private int mFImageResId;
    private int mNumberOfMovesResId;

    public Abilities(int imageQResId, int imageWResId, int imageEResId, int imageRResId, int numberOfMovesResId) {

        mQImageResId = imageQResId;
        mWImageResId = imageWResId;
        mEImageResId = imageEResId;
        mRImageResId = imageRResId;
        mNumberOfMovesResId = numberOfMovesResId;

        mDImageResId = 0;
        mFImageResId = 0;
        mW2ImageResId = 0;



    }

}
