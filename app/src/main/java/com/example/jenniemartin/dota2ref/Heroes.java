package com.example.jenniemartin.dota2ref;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by jennie on 11/20/2016.
 */

public class Heroes implements Parcelable {

    public boolean getmWinResId() {return mWinResId;}
    public boolean getmLossResId() {return mLossResId;}
    public boolean getmDireResId() {return mDireResId;}
    public boolean getmRadiantResId() {return mRadiantResId;}
    public int getmGPMSeekResId() {return mGPMSeekResId;}
    public int getmXPPMSeekResId() {return mXPPMSeekResId;}
    public int getmLanedWithResId() {return mLanedWithResId;}
    public int getmLanedInResId() {return mLanedInResId;}
    public String getmDateResId() {return mDateResId;}
    public String getmKillsResId() {return mKillsResId;}
    public String getmDeathsResId() {return mDeathsResId;}
    public String getmAssistsResId() {return mAssistsResId;}

    public void setmWinResId(boolean mWinResId) {this.mWinResId=mWinResId;}
    public void setmLossResId(boolean mLossResId) {this.mLossResId=mLossResId;}
    public void setmDireResId(boolean mDireResId) {this.mDireResId=mDireResId;}
    public void setmRadiantResId(boolean mRadiantResId) {this.mRadiantResId=mRadiantResId;}
    public void setmGPMSeekResId(int mGPMSeekResId) {this.mGPMSeekResId=mGPMSeekResId;}
    public void setmXPPMSeekResId(int mXPPMSeekResId) {this.mXPPMSeekResId=mXPPMSeekResId;}
    public void setmLanedWithResId(int mLanedWithResId) {this.mLanedWithResId=mLanedWithResId;}
    public void setmLanedInResId(int mLanedInResId) {this.mLanedInResId=mLanedInResId;}
    public void setmDateResId(String mDateResId) {this.mDateResId=mDateResId;}
    public void setmKillsResId(String mKillsResId) {this.mKillsResId=mKillsResId;}
    public void setmDeathsResId(String mDeathsResId) {this.mDeathsResId=mDeathsResId;}
    public void setmAssistsResId(String mAssistsResId) {this.mAssistsResId=mAssistsResId;}

    private boolean mWinResId;
    private boolean mLossResId;
    private boolean mDireResId;
    private boolean mRadiantResId;

    private int mGPMSeekResId;
    private int mXPPMSeekResId;
    private int mLanedWithResId;
    private int mLanedInResId;

    private String mDateResId;
    private String mKillsResId;
    private String mDeathsResId;
    private String mAssistsResId;

    //Return the resource ID representing the hero
    public int getmNameResId() {
        return mNameResId;
    }
    public int getmImageResId() {
        return mImageResId;
    }
    public int getmRoleResId() {return mRoleResId;}
    public int getmPAResId() {return mPAResId;}
    public int getmAKAResId() {return mAKAResId;}
    public int getmNumberOfMovesResId() {return mNumberOfMovesResId;}
    public int getmQuoteResId() {return mQuoteResId;}
    public int getmLoreResId() {return mLoreResId;}
    public int getmSoundResId() {return mSoundResId;}


    //Set the resource IDs representing the hero
    public void setmNameResId(int mNameResId) {
        this.mNameResId = mNameResId;
    }
    public void setmImageResId(int mImageResId) {
        this.mImageResId = mImageResId;
    }
    public void setmRoleResId(int mRoleResId) {this.mRoleResId=mRoleResId;}
    public void setmPAResId(int mPAResId) {this.mPAResId=mPAResId;}
    public void setmAKAResId(int mAKAResId) {this.mAKAResId=mAKAResId;}
    public void setmQuoteResId(int mQuoteResId) {this.mQuoteResId=mQuoteResId;}
    public void setmLoreResId(int mLoreResId) {this.mLoreResId=mLoreResId;}
    public void setmNumberOfMovesResId(int mNumberOfMovesResId) {this.mNumberOfMovesResId=mNumberOfMovesResId;}
    public void setmSoundResId(int mSoundResId) {this.mSoundResId = mSoundResId;}



    //class definitions
    private int mNameResId; //not storing actual text here!
    private int mImageResId; //not storing actual images here!
    private int mRoleResId;
    private int mPAResId;
    private int mAKAResId;
    private int mQuoteResId;
    private int mLoreResId;
    private int mNumberOfMovesResId;
    private int mSoundResId;








    //Constructor for a hero sets its name and image resources by parameter,
    // but sets default values for fields that change
    public Heroes(int imageResId, int nameResId, int AKAResId, int quoteResId, int roleResId, int PAResId, int loreResId, int soundResId) {

        mImageResId = imageResId;
        mNameResId = nameResId;
        mAKAResId = AKAResId;
        mQuoteResId = quoteResId;

        mRoleResId = roleResId;
        mPAResId = PAResId;
        mLoreResId = loreResId;
        mNumberOfMovesResId= 0;
        mSoundResId = soundResId;

        mWinResId = false;
        mLossResId = false;
        mDireResId = false;
        mRadiantResId=false;
        mLanedWithResId =0;
        mLanedInResId=0;
        mGPMSeekResId = 0;
        mXPPMSeekResId=0;
        mDateResId= "11/27/2016";
        mKillsResId="0";
        mDeathsResId="0";
        mAssistsResId="0";


    }

    @Override
    public int describeContents() {
        return 0;
    }

    // write your object's data to the passed-in Parcel
    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeInt(mNameResId);
        out.writeInt(mImageResId);
        out.writeInt(mRoleResId);
        out.writeInt(mPAResId);
        out.writeInt(mAKAResId);
        out.writeInt(mQuoteResId);
        out.writeInt(mLoreResId);
        out.writeInt(mNumberOfMovesResId);
    }

    // this is used to regenerate your object. All Parcelables must have a CREATOR that implements these two methods
    public static final Parcelable.Creator<Heroes> CREATOR = new Parcelable.Creator<Heroes>() {
        public Heroes createFromParcel(Parcel in) {
            return new Heroes(in);
        }

        public Heroes[] newArray(int size) {
            return new Heroes[size];
        }
    };

    // example constructor that takes a Parcel and gives you an object populated with it's values
    private Heroes(Parcel in) {
        mNameResId = in.readInt();
        mImageResId = in.readInt();
        mRoleResId = in.readInt();
        mPAResId = in.readInt();
        mAKAResId = in.readInt();
        mQuoteResId =  in.readInt();
        mLoreResId = in.readInt();
        mNumberOfMovesResId = in.readInt();
    }

}



