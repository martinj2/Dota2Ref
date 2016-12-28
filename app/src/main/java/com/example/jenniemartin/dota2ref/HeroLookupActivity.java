package com.example.jenniemartin.dota2ref;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.Spinner;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

public class HeroLookupActivity extends AppCompatActivity {

    public static final String MY_PREFERENCES = "MyPreferences";

    Boolean pic = true;
    Boolean name=false;

    //Views that we will update in this controller
    private RadioButton mHeroPicRadioButton;
    private RadioButton mHeroNameRadioButton;
    private Spinner mHeroNameSpinner;
    private ImageButton mAbbadonImageButton;
    private ImageButton mAlchemistImageButton;
    private ImageButton mAAImageButton;
    private ImageButton mAntiMageImageButton;
    private ImageButton mArcWardenImageButton;
    private ImageButton mAxeImageButton;
    private ImageButton mBaneImageButton;
    private ImageButton mBatriderImageButton;
    private ImageButton mBeastmasterImageButton;
    private ImageButton mBloodImageButton;
    private ImageButton mBountyImageButton;
    private ImageButton mBrewmasterImageButton;
    private ImageButton mBristlebackImageButton;
    private ImageButton mBroodImageButton;
    private ImageButton mCWImageButton;
    private ImageButton mCKImageButton;
    private ImageButton mChenImageButton;
    private ImageButton mClinkzImageButton;
    private ImageButton mClockwerkImageButton;
    private ImageButton mCrystalImageButton;
    private ImageButton mDarkSeerImageButton;
    private ImageButton mDazzleImageButton;
    private ImageButton mDPImageButton;
    private ImageButton mDisruptorImageButton;
    private ImageButton mDoomImageButton;
    private ImageButton mDKImageButton;
    private ImageButton mDRImageButton;
    private ImageButton mESImageButton;
    private ImageButton mEarthshakerImageButton;
    private ImageButton mETImageButton;
    private ImageButton mEmberImageButton;
    private ImageButton mEnchantImageButton;
    private ImageButton mEnigmaImageButton;
    private ImageButton mFacelessImageButton;
    private ImageButton mGyroImageButton;
    private ImageButton mHuskarImageButton;
    private ImageButton mInvokerImageButton;
    private ImageButton mIoImageButton;
    private ImageButton mJakImageButton;
    private ImageButton mJuggImageButton;
    private ImageButton mKOLImageButton;
    private ImageButton mKunkImageButton;
    private ImageButton mLegionImageButton;
    private ImageButton mLeshracImageButton;
    private ImageButton mLichImageButton;
    private ImageButton mLifestealerImageButton;
    private ImageButton mLinaImageButton;
    private ImageButton mLionImageButton;
    private ImageButton mLoneImageButton;
    private ImageButton mLunaImageButton;
    private ImageButton mLycanImageButton;
    private ImageButton mMagImageButton;
    private ImageButton mMedusaImageButton;
    private ImageButton mMeepoImageButton;
    private ImageButton mMiranImageButton;
    private ImageButton mMorphImageButton;
    private ImageButton mNagaImageButton;
    private ImageButton mNatureImageButton;
    private ImageButton mNecroImageButton;
    private ImageButton mNightstalkerImageButton;
    private ImageButton mNyxImageButton;
    private ImageButton mOgreImageButton;
    private ImageButton mOmniImageButton;
    private ImageButton mOracleImageButton;
    private ImageButton mOutworldImageButton;
    private ImageButton mPAImageButton;
    private ImageButton mPLImageButton;
    private ImageButton mPhoenixImageButton;
    private ImageButton mPuckImageButton;
    private ImageButton mPudgeImageButton;
    private ImageButton mPugnaImageButton;
    private ImageButton mQPImageButton;
    private ImageButton mRazorImageButton;
    private ImageButton mRikiImageButton;
    private ImageButton mRubickImageButton;
    private ImageButton mSandImageButton;
    private ImageButton mSDImageButton;
    private ImageButton mSFImageButton;
    private ImageButton mSSImageButton;
    private ImageButton mSilencerImageButton;
    private ImageButton mSkywrathImageButton;
    private ImageButton mSlardarImageButton;
    private ImageButton mSlarkImageButton;
    private ImageButton mSniperImageButton;
    private ImageButton mSpectreImageButton;
    private ImageButton mSpiritBImageButton;
    private ImageButton mStormImageButton;
    private ImageButton mSvenImageButton;
    private ImageButton mTechiesImageButton;
    private ImageButton mTemplarImageButton;
    private ImageButton mTerrorbladeImageButton;
    private ImageButton mTidehunterImageButton;
    private ImageButton mTimberImageButton;
    private ImageButton mTinkerImageButton;
    private ImageButton mTinyImageButton;
    private ImageButton mTreantImageButton;
    private ImageButton mTrollWarImageButton;
    private ImageButton mTuskImageButton;
    private ImageButton mUnderlordImageButton;
    private ImageButton mUndyingImageButton;
    private ImageButton mUrsaImageButton;
    private ImageButton mVengefulImageButton;
    private ImageButton mVenomImageButton;
    private ImageButton mViperImageButton;
    private ImageButton mVisageImageButton;
    private ImageButton mWarlockImageButton;
    private ImageButton mWeaverImageButton;
    private ImageButton mWindImageButton;
    private ImageButton mWinterWyvImageButton;
    private ImageButton mWitchDImageButton;
    private ImageButton mWraithImageButton;
    private ImageButton mZeusImageButton;
    private LinearLayout mSpinnerLinearLayout;
    private LinearLayout mImagesLinearLayout;
    private ScrollView mImageScrollView;
    private Button mMainMenuButton;

    public static final String EXTRA_MAIN_CURRENT_HERO =
            "com.example.jenniemartin.dota2ref.main_current_hero";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_lookup);


        //lookup each View by ID so we can set their attributes/behaviors
        mSpinnerLinearLayout = (LinearLayout) findViewById(R.id.linearLayout1);
        mImagesLinearLayout = (LinearLayout) findViewById(R.id.linearLayout2);
        mImageScrollView = (ScrollView) findViewById(R.id.scrollview);
        mHeroPicRadioButton = (RadioButton) findViewById(R.id.heroPicRadioButton);
        mHeroNameRadioButton = (RadioButton) findViewById(R.id.heroNameRadioButton);
        mHeroNameSpinner = (Spinner) findViewById(R.id.heroSpinner);
        mAbbadonImageButton = (ImageButton) findViewById(R.id.abaddonImageButton);
        mAlchemistImageButton = (ImageButton) findViewById(R.id.alchemistImageButton);
        mAAImageButton = (ImageButton) findViewById(R.id.ancientAppImageButton);
        mAntiMageImageButton = (ImageButton) findViewById(R.id.antiMageImageButton);
        mArcWardenImageButton = (ImageButton) findViewById(R.id.arcWardImageButton);
        mAxeImageButton = (ImageButton) findViewById(R.id.axeImageButton);
        mBaneImageButton = (ImageButton) findViewById(R.id.baneImageButton);
        mBatriderImageButton = (ImageButton) findViewById(R.id.batriderImageButton);
        mBeastmasterImageButton = (ImageButton) findViewById(R.id.beastmastImageButton);
        mBloodImageButton = (ImageButton) findViewById(R.id.bloodImageButton);
        mBountyImageButton = (ImageButton) findViewById(R.id.bountyImageButton);
        mBrewmasterImageButton = (ImageButton) findViewById(R.id.brewImageButton);
        mBristlebackImageButton = (ImageButton) findViewById(R.id.bristleImageButton);
        mBroodImageButton = (ImageButton) findViewById(R.id.broodImageButton);
        mCWImageButton = (ImageButton) findViewById(R.id.centwarImageButton);
        mCKImageButton = (ImageButton) findViewById(R.id.ckImageButton);
        mChenImageButton = (ImageButton) findViewById(R.id.chenImageButton);
        mClinkzImageButton = (ImageButton) findViewById(R.id.clinkzImageButton);
        mClockwerkImageButton = (ImageButton) findViewById(R.id.clockImageButton);
        mCrystalImageButton = (ImageButton) findViewById(R.id.crystalImageButton);
        mDarkSeerImageButton = (ImageButton) findViewById(R.id.darkseerImageButton);
        mDazzleImageButton = (ImageButton) findViewById(R.id.dazzleImageButton);
        mDPImageButton = (ImageButton) findViewById(R.id.dpImageButton);
        mDisruptorImageButton = (ImageButton) findViewById(R.id.disruptImageButton);
        mDoomImageButton = (ImageButton) findViewById(R.id.doomImageButton);
        mDKImageButton = (ImageButton) findViewById(R.id.dragonknImageButton);
        mDRImageButton = (ImageButton) findViewById(R.id.drowImageButton);
        mESImageButton = (ImageButton) findViewById(R.id.earthspImageButton);
        mEarthshakerImageButton = (ImageButton) findViewById(R.id.earthshakeImageButton);
        mETImageButton = (ImageButton) findViewById(R.id.eldertitanImageButton);
        mEmberImageButton = (ImageButton) findViewById(R.id.emberImageButton);
        mEnchantImageButton = (ImageButton) findViewById(R.id.enchantImageButton);
        mEnigmaImageButton = (ImageButton) findViewById(R.id.enigmaImageButton);
        mFacelessImageButton = (ImageButton) findViewById(R.id.facelessImageButton);
        mGyroImageButton = (ImageButton) findViewById(R.id.gyroImageButton);
        mHuskarImageButton = (ImageButton) findViewById(R.id.huskarImageButton);
        mInvokerImageButton = (ImageButton) findViewById(R.id.invokerImageButton);
        mIoImageButton = (ImageButton) findViewById(R.id.ioImageButton);
        mJakImageButton = (ImageButton) findViewById(R.id.jakiroImageButton);
        mJuggImageButton = (ImageButton) findViewById(R.id.juggImageButton);
        mKOLImageButton = (ImageButton) findViewById(R.id.keeperImageButton);
        mKunkImageButton = (ImageButton) findViewById(R.id.kunkkaImageButton);
        mLegionImageButton = (ImageButton) findViewById(R.id.legionImageButton);
        mLeshracImageButton = (ImageButton) findViewById(R.id.leshracImageButton);
        mLichImageButton = (ImageButton) findViewById(R.id.lichImageButton);
        mLifestealerImageButton = (ImageButton) findViewById(R.id.lifestealerImageButton);
        mLinaImageButton = (ImageButton) findViewById(R.id.linaImageButton);
        mLionImageButton = (ImageButton) findViewById(R.id.lionImageButton);
        mLoneImageButton = (ImageButton) findViewById(R.id.lonedruidImageButton);
        mLunaImageButton = (ImageButton) findViewById(R.id.lunaImageButton);
        mLycanImageButton = (ImageButton) findViewById(R.id.lycanImageButton);
        mMagImageButton = (ImageButton) findViewById(R.id.magnusImageButton);
        mMedusaImageButton = (ImageButton) findViewById(R.id.medusaImageButton);
        mMeepoImageButton = (ImageButton) findViewById(R.id.meepoImageButton);
        mMiranImageButton = (ImageButton) findViewById(R.id.miranaImageButton);
        mMorphImageButton = (ImageButton) findViewById(R.id.morphlingImageButton);
        mNagaImageButton = (ImageButton) findViewById(R.id.nagasirenImageButton);
        mNatureImageButton = (ImageButton) findViewById(R.id.naturesprophetImageButton);
        mNecroImageButton = (ImageButton) findViewById(R.id.necrophosImageButton);
        mNightstalkerImageButton = (ImageButton) findViewById(R.id.nightstalkerImageButton);
        mNyxImageButton = (ImageButton) findViewById(R.id.nyxImageButton);
        mOgreImageButton = (ImageButton) findViewById(R.id.ogreImageButton);
        mOmniImageButton = (ImageButton) findViewById(R.id.omniImageButton);
        mOracleImageButton = (ImageButton) findViewById(R.id.oracleImageButton);
        mOutworldImageButton =  (ImageButton) findViewById(R.id.outworldImageButton);
        mPAImageButton = (ImageButton) findViewById(R.id.paImageButton);
        mPLImageButton = (ImageButton) findViewById(R.id.plImageButton);
        mPhoenixImageButton = (ImageButton) findViewById(R.id.phoenixImageButton);
        mPuckImageButton = (ImageButton) findViewById(R.id.puckImageButton);
        mPudgeImageButton = (ImageButton) findViewById(R.id.pudgeImageButton);
        mPugnaImageButton = (ImageButton) findViewById(R.id.pugnaImageButton);
        mQPImageButton = (ImageButton) findViewById(R.id.qpImageButton);
        mRazorImageButton = (ImageButton) findViewById(R.id.razorImageButton);
        mRikiImageButton = (ImageButton) findViewById(R.id.rikiImageButton);
        mRubickImageButton = (ImageButton) findViewById(R.id.rubickImageButton);
        mSandImageButton = (ImageButton) findViewById(R.id.sandImageButton);
        mSDImageButton = (ImageButton) findViewById(R.id.demonImageButton);
        mSFImageButton = (ImageButton) findViewById(R.id.fiendImageButton);
        mSSImageButton = (ImageButton) findViewById(R.id.shamanImageButton);
        mSilencerImageButton = (ImageButton) findViewById(R.id.silencerImageButton);
        mSkywrathImageButton = (ImageButton) findViewById(R.id.skywrathImageButton);
        mSlardarImageButton = (ImageButton) findViewById(R.id.slardarImageButton);
        mSlarkImageButton = (ImageButton) findViewById(R.id.slarkImageButton);
        mSniperImageButton = (ImageButton) findViewById(R.id.sniperImageButton);
        mSpectreImageButton = (ImageButton) findViewById(R.id.spectreImageButton);
        mSpiritBImageButton = (ImageButton) findViewById(R.id.spiritbImageButton);
        mStormImageButton = (ImageButton) findViewById(R.id.stormImageButton);
        mSvenImageButton = (ImageButton) findViewById(R.id.svenImageButton);
        mTechiesImageButton = (ImageButton) findViewById(R.id.techiesImageButton);
        mTemplarImageButton = (ImageButton) findViewById(R.id.templarImageButton);
        mTerrorbladeImageButton = (ImageButton) findViewById(R.id.terrorbladeImageButton) ;
        mTidehunterImageButton = (ImageButton) findViewById(R.id.tideImageButton);
        mTimberImageButton = (ImageButton) findViewById(R.id.timbersawImageButton);
        mTinkerImageButton = (ImageButton) findViewById(R.id.tinkerImageButton);
        mTinyImageButton = (ImageButton) findViewById(R.id.tinyImageButton);
        mTreantImageButton = (ImageButton) findViewById(R.id.treantImageButton);
        mTrollWarImageButton = (ImageButton) findViewById(R.id.trollwarImageButton);
        mTuskImageButton = (ImageButton) findViewById(R.id.tuskImageButton);
        mUnderlordImageButton = (ImageButton) findViewById(R.id.underlordImageButton);
        mUndyingImageButton = (ImageButton) findViewById(R.id.undyingImageButton);
        mUrsaImageButton = (ImageButton) findViewById(R.id.ursaImageButton);
        mVengefulImageButton = (ImageButton) findViewById(R.id.vengefulImageButton);
        mVenomImageButton = (ImageButton) findViewById(R.id.venomImageButton);
        mViperImageButton = (ImageButton) findViewById(R.id.viperImageButton);
        mVisageImageButton = (ImageButton) findViewById(R.id.visageImageButton);
        mWarlockImageButton = (ImageButton) findViewById(R.id.warlockImageButton);
        mWeaverImageButton = (ImageButton) findViewById(R.id.weaverImageButton);
        mWindImageButton = (ImageButton) findViewById(R.id.windImageButton);
        mWinterWyvImageButton = (ImageButton) findViewById(R.id.winterwyvImageButton);
        mWitchDImageButton = (ImageButton) findViewById(R.id.witchdoctorImageButton);
        mWraithImageButton = (ImageButton) findViewById(R.id.wraithImageButton);
        mZeusImageButton = (ImageButton) findViewById(R.id.zeusImageButton);
        mMainMenuButton = (Button) findViewById(R.id.mainHeroMenuButton);


        final SharedPreferences sharedPref = this.getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE);
        mHeroNameRadioButton.setChecked(sharedPref.getBoolean("currentNameChecked",name));
        mHeroPicRadioButton.setChecked(sharedPref.getBoolean("currentPicChecked", pic));

        update();

        mMainMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences preferences = getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE);
                preferences.edit().remove("currentNameChecked").apply();
                preferences.edit().remove("currentPicChecked").apply();
                Intent back = new Intent(HeroLookupActivity.this, MainActivity.class);
                startActivity(back);}

        });

        mHeroNameRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mHeroPicRadioButton.setChecked(false);
                update();
            }
        });


        mHeroPicRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mHeroNameRadioButton.setChecked(false);
                update();
            }
        });


        // Spinner click listener
        mHeroNameSpinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {

            int current = 0;

            @Override
            public void onItemSelected(AdapterView<?> parent, View v, int position,
                                       long id) {
                // TODO Auto-generated method stub
                current = position;
                if (current > 0){
                Intent i0 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i0.putExtra("currenthero", (current-1));
                startActivity(i0);}


            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }

        });

        mAbbadonImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i.putExtra("currenthero", 0);
                startActivity(i);

            }
        });

        mAlchemistImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i1.putExtra("currenthero", 1);
                startActivity(i1);

            }
        });

        mAAImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i2 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i2.putExtra("currenthero", 2);
                startActivity(i2);

            }
        });

        mAntiMageImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i3.putExtra("currenthero", 3);
                startActivity(i3);

            }
        });

        mArcWardenImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i4 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i4.putExtra("currenthero", 4);
                startActivity(i4);

            }
        });


        mAxeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i5 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i5.putExtra("currenthero", 5);
                startActivity(i5);

            }
        });

        mBaneImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i6 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i6.putExtra("currenthero", 6);
                startActivity(i6);

            }
        });

        mBatriderImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i7 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i7.putExtra("currenthero", 7);
                startActivity(i7);

            }
        });

        mBeastmasterImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i8 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i8.putExtra("currenthero", 8);
                startActivity(i8);

            }
        });

        mBloodImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i9 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i9.putExtra("currenthero", 9);
                startActivity(i9);

            }
        });

        mBountyImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i10 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i10.putExtra("currenthero", 10);
                startActivity(i10);

            }
        });

        mBrewmasterImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i11 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i11.putExtra("currenthero", 11);
                startActivity(i11);

            }
        });

        mBristlebackImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i12 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i12.putExtra("currenthero", 12);
                startActivity(i12);

            }
        });

        mBroodImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i13 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i13.putExtra("currenthero", 13);
                startActivity(i13);

            }
        });

        mCWImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i14 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i14.putExtra("currenthero", 14);
                startActivity(i14);

            }
        });

        mCKImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i15 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i15.putExtra("currenthero", 15);
                startActivity(i15);

            }
        });

        mChenImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i16 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i16.putExtra("currenthero", 16);
                startActivity(i16);

            }
        });

        mClinkzImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i17 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i17.putExtra("currenthero", 17);
                startActivity(i17);

            }
        });

        mClockwerkImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i18 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i18.putExtra("currenthero", 18);
                startActivity(i18);

            }
        });

        mCrystalImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i19 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i19.putExtra("currenthero", 19);
                startActivity(i19);

            }
        });

        mDarkSeerImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i20 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i20.putExtra("currenthero", 20);
                startActivity(i20);

            }
        });

        mDazzleImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i21 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i21.putExtra("currenthero", 21);
                startActivity(i21);

            }
        });

        mDPImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i22 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i22.putExtra("currenthero", 22);
                startActivity(i22);

            }
        });

        mDisruptorImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i23 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i23.putExtra("currenthero", 23);
                startActivity(i23);

            }
        });

        mDoomImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i24 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i24.putExtra("currenthero", 24);
                startActivity(i24);

            }
        });

        mDKImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i25 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i25.putExtra("currenthero", 25);
                startActivity(i25);

            }
        });

        mDRImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i26 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i26.putExtra("currenthero", 26);
                startActivity(i26);

            }
        });

        mESImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i27 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i27.putExtra("currenthero", 27);
                startActivity(i27);

            }
        });

        mEarthshakerImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i28 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i28.putExtra("currenthero", 28);
                startActivity(i28);

            }
        });

        mETImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i29 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i29.putExtra("currenthero", 29);
                startActivity(i29);

            }
        });

        mEmberImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i30 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i30.putExtra("currenthero", 30);
                startActivity(i30);

            }
        });

        mEnchantImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i31 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i31.putExtra("currenthero", 31);
                startActivity(i31);

            }
        });

        mEnigmaImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i32 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i32.putExtra("currenthero", 32);
                startActivity(i32);

            }
        });

        mFacelessImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i33 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i33.putExtra("currenthero", 33);
                startActivity(i33);

            }
        });

        mGyroImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i34 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i34.putExtra("currenthero", 34);
                startActivity(i34);

            }
        });

        mHuskarImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i35 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i35.putExtra("currenthero", 35);
                startActivity(i35);

            }
        });

        mInvokerImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i36 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i36.putExtra("currenthero", 36);
                startActivity(i36);

            }
        });

        mIoImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i37 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i37.putExtra("currenthero", 37);
                startActivity(i37);

            }
        });

        mJakImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i38 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i38.putExtra("currenthero", 38);
                startActivity(i38);

            }
        });

        mJuggImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i39 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i39.putExtra("currenthero", 39);
                startActivity(i39);

            }
        });

        mKOLImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i40 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i40.putExtra("currenthero", 40);
                startActivity(i40);

            }
        });

        mKunkImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i41 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i41.putExtra("currenthero", 41);
                startActivity(i41);

            }
        });

        mLegionImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i42 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i42.putExtra("currenthero", 42);
                startActivity(i42);

            }
        });

        mLeshracImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i43 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i43.putExtra("currenthero", 43);
                startActivity(i43);

            }
        });

        mLichImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i44 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i44.putExtra("currenthero", 44);
                startActivity(i44);

            }
        });

        mLifestealerImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i45 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i45.putExtra("currenthero", 45);
                startActivity(i45);

            }
        });

        mLinaImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i46 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i46.putExtra("currenthero", 46);
                startActivity(i46);

            }
        });

        mLionImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i47 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i47.putExtra("currenthero", 47);
                startActivity(i47);

            }
        });

        mLoneImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i48 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i48.putExtra("currenthero", 48);
                startActivity(i48);

            }
        });

        mLunaImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i49 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i49.putExtra("currenthero", 49);
                startActivity(i49);

            }
        });

        mLycanImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i50 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i50.putExtra("currenthero", 50);
                startActivity(i50);

            }
        });

        mMagImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i51 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i51.putExtra("currenthero", 51);
                startActivity(i51);

            }
        });

        mMedusaImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i52 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i52.putExtra("currenthero", 52);
                startActivity(i52);

            }
        });

        mMeepoImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i53 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i53.putExtra("currenthero", 53);
                startActivity(i53);

            }
        });

        mMiranImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i54 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i54.putExtra("currenthero", 54);
                startActivity(i54);

            }
        });

        mMorphImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i55 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i55.putExtra("currenthero", 55);
                startActivity(i55);

            }
        });

        mNagaImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i56 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i56.putExtra("currenthero", 56);
                startActivity(i56);

            }
        });

        mNatureImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i57 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i57.putExtra("currenthero", 57);
                startActivity(i57);

            }
        });

        mNecroImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i58 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i58.putExtra("currenthero", 58);
                startActivity(i58);

            }
        });

        mNightstalkerImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i59 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i59.putExtra("currenthero", 59);
                startActivity(i59);

            }
        });

        mNyxImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i60 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i60.putExtra("currenthero", 60);
                startActivity(i60);

            }
        });

        mOgreImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i61 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i61.putExtra("currenthero", 61);
                startActivity(i61);

            }
        });

        mOmniImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i62 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i62.putExtra("currenthero", 62);
                startActivity(i62);

            }
        });

        mOracleImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i63 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i63.putExtra("currenthero", 63);
                startActivity(i63);

            }
        });

        mOutworldImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i64 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i64.putExtra("currenthero", 64);
                startActivity(i64);

            }
        });

        mPAImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i65 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i65.putExtra("currenthero", 65);
                startActivity(i65);

            }
        });

        mPLImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i66 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i66.putExtra("currenthero", 66);
                startActivity(i66);

            }
        });

        mPhoenixImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i67 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i67.putExtra("currenthero", 67);
                startActivity(i67);

            }
        });

        mPuckImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i68 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i68.putExtra("currenthero", 68);
                startActivity(i68);

            }
        });

        mPudgeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i69 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i69.putExtra("currenthero", 69);
                startActivity(i69);

            }
        });

        mPugnaImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i70 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i70.putExtra("currenthero", 70);
                startActivity(i70);

            }
        });

        mQPImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i71 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i71.putExtra("currenthero", 71);
                startActivity(i71);

            }
        });

        mRazorImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i72 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i72.putExtra("currenthero", 72);
                startActivity(i72);

            }
        });

        mRikiImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i73 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i73.putExtra("currenthero", 73);
                startActivity(i73);

            }
        });

        mRubickImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i74 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i74.putExtra("currenthero", 74);
                startActivity(i74);

            }
        });

        mSandImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i75 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i75.putExtra("currenthero", 75);
                startActivity(i75);

            }
        });

        mSDImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i76 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i76.putExtra("currenthero", 76);
                startActivity(i76);

            }
        });

        mSFImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i77 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i77.putExtra("currenthero", 77);
                startActivity(i77);

            }
        });

        mSSImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i78 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i78.putExtra("currenthero", 78);
                startActivity(i78);

            }
        });

        mSilencerImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i79 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i79.putExtra("currenthero", 79);
                startActivity(i79);

            }
        });

        mSkywrathImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i80 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i80.putExtra("currenthero", 80);
                startActivity(i80);

            }
        });

        mSlardarImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i81 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i81.putExtra("currenthero", 81);
                startActivity(i81);

            }
        });

        mSlarkImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i82 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i82.putExtra("currenthero", 82);
                startActivity(i82);

            }
        });

        mSniperImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i83 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i83.putExtra("currenthero", 83);
                startActivity(i83);

            }
        });

        mSpectreImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i84 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i84.putExtra("currenthero", 84);
                startActivity(i84);

            }
        });

        mSpiritBImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i85 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i85.putExtra("currenthero", 85);
                startActivity(i85);

            }
        });

        mStormImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i86 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i86.putExtra("currenthero", 86);
                startActivity(i86);

            }
        });

        mSvenImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i87 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i87.putExtra("currenthero", 87);
                startActivity(i87);
            }
        });

        mTechiesImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i88 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i88.putExtra("currenthero", 88);
                startActivity(i88);

            }
        });

        mTemplarImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i89 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i89.putExtra("currenthero", 89);
                startActivity(i89);

            }
        });

        mTerrorbladeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i90 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i90.putExtra("currenthero", 90);
                startActivity(i90);

            }
        });

        mTidehunterImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i91 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i91.putExtra("currenthero", 91);
                startActivity(i91);

            }
        });

        mTimberImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i92 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i92.putExtra("currenthero", 92);
                startActivity(i92);

            }
        });

        mTinkerImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i93 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i93.putExtra("currenthero", 93);
                startActivity(i93);

            }
        });

        mTinyImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i94 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i94.putExtra("currenthero", 94);
                startActivity(i94);

            }
        });

        mTreantImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i95 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i95.putExtra("currenthero", 95);
                startActivity(i95);

            }
        });

        mTrollWarImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i96 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i96.putExtra("currenthero", 96);
                startActivity(i96);

            }
        });

        mTuskImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i97 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i97.putExtra("currenthero", 97);
                startActivity(i97);

            }
        });

        mUnderlordImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i98 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i98.putExtra("currenthero", 98);
                startActivity(i98);

            }
        });

        mUndyingImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i99 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i99.putExtra("currenthero", 99);
                startActivity(i99);

            }
        });

        mUrsaImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i100 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i100.putExtra("currenthero", 100);
                startActivity(i100);

            }
        });

        mVengefulImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i101 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i101.putExtra("currenthero", 101);
                startActivity(i101);

            }
        });

        mVenomImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i102 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i102.putExtra("currenthero", 102);
                startActivity(i102);

            }
        });

        mViperImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i103 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i103.putExtra("currenthero", 103);
                startActivity(i103);

            }
        });

        mVisageImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i104 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i104.putExtra("currenthero", 104);
                startActivity(i104);

            }
        });

        mWarlockImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i105 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i105.putExtra("currenthero", 105);
                startActivity(i105);

            }
        });

        mWeaverImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i106 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i106.putExtra("currenthero", 106);
                startActivity(i106);

            }
        });

        mWindImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i107 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i107.putExtra("currenthero", 107);
                startActivity(i107);

            }
        });

        mWinterWyvImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i108 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i108.putExtra("currenthero", 108);
                startActivity(i108);

            }
        });

        mWitchDImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i109 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i109.putExtra("currenthero", 109);
                startActivity(i109);

            }
        });

        mWraithImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i110 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i110.putExtra("currenthero", 110);
                startActivity(i110);

            }
        });

        mZeusImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i111 = new Intent(HeroLookupActivity.this, HeroActivity.class);
                i111.putExtra("currenthero", 111);
                startActivity(i111);

            }
        });
    }

    private void update() {


        if (mHeroNameRadioButton.isChecked()){
            mImageScrollView.setVisibility(INVISIBLE);
            mImagesLinearLayout.setVisibility(INVISIBLE);
            mSpinnerLinearLayout.setVisibility(VISIBLE);
        }
        if (mHeroPicRadioButton.isChecked()){
            mSpinnerLinearLayout.setVisibility(INVISIBLE);
            mImageScrollView.setVisibility(VISIBLE);
            mImagesLinearLayout.setVisibility(VISIBLE);
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        pic = mHeroPicRadioButton.isChecked();
        name = mHeroNameRadioButton.isChecked();

        SharedPreferences sharedPref = this.getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean("currentPicChecked", pic);
        editor.putBoolean("currentNameChecked", name);
        editor.apply();
    }

}
