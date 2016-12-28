package com.example.jenniemartin.dota2ref;

/**
 * Created by jenni on 11/27/2016.
 */

public class Item {


    //Return the resource ID representing the item
    public int getmNameResId() {
        return mNameResId;
    }
    public int getmImageResId() {
        return mImageResId;
    }
    public int getmCostResId() {return mCostResId;}
    public int getmBoughtFromResId() {return mBoughtFromResId;}
    public int getmAbilityResId() {return mAbilityResId;}
    public int getmBonusResId() {return mBonusResId;}
    public int getmDescriptionResId() {return mDescriptionResId;}
    public boolean getmDisassembleResId() {return mDisassembleResId;}
    public boolean getmAlertAllResId() {return mAlertAllResId;}

    //Set the resource IDs representing the hero
    public void setmNameResId(int mNameResId) {
        this.mNameResId = mNameResId;
    }
    public void setmImageResId(int mImageResId) {
        this.mImageResId = mImageResId;
    }
    public void setmCostResId(int mCostResId) {this.mCostResId = mCostResId;}
    public void setmBoughtFromResId (int mBoughtFromResId) {this.mBoughtFromResId = mBoughtFromResId;}
    public void setmAbilityResId (int mAbilityResId) {this.mAbilityResId = mAbilityResId;}
    public void setmBonusResId (int mBonusResId) {this.mBonusResId = mBonusResId;}
    public void setmDescriptionResId (int mDescriptionResId) {this.mDescriptionResId = mDescriptionResId;}
    public void setmDisassembleResId (boolean mDisassembleResId) {this.mDisassembleResId = mDisassembleResId;}
    public void setmAlertAllResId (boolean mAlertAllResId) {this.mAlertAllResId = mAlertAllResId;}


    //class definitions
    private int mImageResId;
    private int mNameResId;
    private int mCostResId;
    private int mBoughtFromResId;
    private int mAbilityResId;
    private int mBonusResId;
    private int mDescriptionResId;
    private boolean mDisassembleResId;
    private boolean mAlertAllResId;


    //Constructor for a hero sets its name and image resources by parameter,
    // but sets default values for fields that change
    public Item(int imageResId, int nameResId, int costResId, int boughtResId, int abilityResId, int bonusResId, int descResId, boolean disResId, boolean alertResId) {

        mImageResId = imageResId;
        mNameResId = nameResId;
        mCostResId = costResId;
        mBoughtFromResId = boughtResId;
        mAbilityResId = abilityResId;
        mBonusResId = bonusResId;
        mDescriptionResId = descResId;
        mDisassembleResId = disResId;
        mAlertAllResId = alertResId;

    }
}
