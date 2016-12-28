package com.example.jenniemartin.dota2ref;

/**
 * Created by JAM on 12/8/2016.
 */

public class BestGames {


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

    public BestGames() {
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


}
