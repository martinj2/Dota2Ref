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

public class ItemLookupActivity extends AppCompatActivity {

    public static final String MY_PREFERENCES = "MyPreferences";

    Boolean pic = true;
    Boolean name=false;

    //Views that we will update in this controller
    private RadioButton mItemPicRadioButton;
    private RadioButton mItemNameRadioButton;
    private Spinner mItemNameSpinner;
    private LinearLayout mItemPicLinearLayout;
    private ScrollView mItemPicScrollView;
    private LinearLayout mItemNameLinearLayout;

    private ImageButton mAbyssalImageButton;
    private ImageButton mAetherImageButton;
    private ImageButton mAgsImageButton;
    private ImageButton mAnimalImageButton;
    private ImageButton mArcaneImageButton;
    private ImageButton mArmletImageButton;
    private ImageButton mAssaultImageButton;
    private ImageButton mBandElvImageButton;
    private ImageButton mBFuryImageButton;
    private ImageButton mBeltStrImageButton;
    private ImageButton mBKBImageButton;
    private ImageButton mBlademailImageButton;
    private ImageButton mBladeAlacImageButton;
    private ImageButton mBladesAttImageButton;
    private ImageButton mBlightStoneImageButton;
    private ImageButton mBlinkImageButton;
    private ImageButton mBloodstoneImageButton;
    private ImageButton mBloodthornImageButton;
    private ImageButton mBootsSpeedImageButton;
    private ImageButton mBootsTravelImageButton;
    private ImageButton mBottleImageButton;
    private ImageButton mBracerImageButton;
    private ImageButton mBroadswordImageButton;
    private ImageButton mBucklerImageButton;
    private ImageButton mButterflyImageButton;
    private ImageButton mChainmailImageButton;
    private ImageButton mCircletImageButton;
    private ImageButton mClarityImageButton;
    private ImageButton mClaymoreImageButton;
    private ImageButton mCloakImageButton;
    private ImageButton mCrimsonImageButton;
    private ImageButton mCrystalImageButton;
    private ImageButton mDaedImageButton;
    private ImageButton mDagonImageButton;
    private ImageButton mDemonImageButton;
    private ImageButton mDesolatorImageButton;
    private ImageButton mDiffusalImageButton;
    private ImageButton mDivineImageButton;
    private ImageButton mDragonLanceImageButton;
    private ImageButton mDrumImageButton;
    private ImageButton mDustImageButton;
    private ImageButton mEagleImageButton;
    private ImageButton mEchoImageButton;
    private ImageButton mMangoImageButton;
    private ImageButton mEnergyBoosterImageButton;
    private ImageButton mEtherealImageButton;
    private ImageButton mEulsImageButton;
    private ImageButton mEyeImageButton;
    private ImageButton mFaerieImageButton;
    private ImageButton mFlyingCourImageButton;
    private ImageButton mForceImageButton;
    private ImageButton mGauntletsStrImageButton;
    private ImageButton mGemImageButton;
    private ImageButton mGhostImageButton;
    private ImageButton mGlimmerImageButton;
    private ImageButton mGlovesImageButton;
    private ImageButton mGuardianGImageButton;
    private ImageButton mHandofMidImageButton;
    private ImageButton mHeadImageButton;
    private ImageButton mHealingImageButton;
    private ImageButton mHeartImageButton;
    private ImageButton mHeavenImageButton;
    private ImageButton mHelmIronImageButton;
    private ImageButton mHelmDomImageButton;
    private ImageButton mHoodDefImageButton;
    private ImageButton mHurricaneImageButton;
    private ImageButton mHyperImageButton;
    private ImageButton mRaindropImageButton;
    private ImageButton mIronBImageButton;
    private ImageButton mIronTalImageButton;
    private ImageButton mJaveImageButton;
    private ImageButton mLinkensImageButton;
    private ImageButton mLotusImageButton;
    private ImageButton mMaelImageButton;
    private ImageButton mMagicStickImageButton;
    private ImageButton mMagicWandImageButton;
    private ImageButton mMantaImageButton;
    private ImageButton mMantleImageButton;
    private ImageButton mMaskMadImageButton;
    private ImageButton mMedallImageButton;
    private ImageButton mMekImageButton;
    private ImageButton mMithrilImageButton;
    private ImageButton mMjollImageButton;
    private ImageButton mMKBImageButton;
    private ImageButton mMoonShardImageButton;
    private ImageButton mMorbidImageButton;
    private ImageButton mMysticImageButton;
    private ImageButton mNecroImageButton;
    private ImageButton mNullTallImageButton;
    private ImageButton mOblivImageButton;
    private ImageButton mObsWardImageButton;
    private ImageButton mOctCoreImageButton;
    private ImageButton mOgreImageButton;
    private ImageButton mOrbVenImageButton;
    private ImageButton mOrchidMalImageButton;
    private ImageButton mPersImageButton;
    private ImageButton mPhaseBootImageButton;
    private ImageButton mPipeImageButton;
    private ImageButton mPlatemailImageButton;
    private ImageButton mPointBoostImageButton;
    private ImageButton mPoorManImageButton;
    private ImageButton mPowerTreadImageButton;
    private ImageButton mQuarterImageButton;
    private ImageButton mQuellBladeImageButton;
    private ImageButton mRadianceImageButton;
    private ImageButton mReaverImageButton;
    private ImageButton mRefreshImageButton;
    private ImageButton mRingAquilaImageButton;
    private ImageButton mRingBasilImageButton;
    private ImageButton mRingHealthImageButton;
    private ImageButton mRingProtectImageButton;
    private ImageButton mRingRegenImageButton;
    private ImageButton mRobeMagiImageButton;
    private ImageButton mRodAtosImageButton;
    private ImageButton mSacredImageButton;
    private ImageButton mSageImageButton;
    private ImageButton mSangeImageButton;
    private ImageButton mSangeYashImageButton;
    private ImageButton mSatanicImageButton;
    private ImageButton mScytheImageButton;
    private ImageButton mSentryImageButton;
    private ImageButton mShadowAmImageButton;
    private ImageButton mShadowBlImageButton;
    private ImageButton mShivasImageButton;
    private ImageButton mSilverEdImageButton;
    private ImageButton mSkullBashImageButton;
    private ImageButton mSlippersImageButton;
    private ImageButton mSmokeImageButton;
    private ImageButton mSolarImageButton;
    private ImageButton mSoulBoostImageButton;
    private ImageButton mSoulRingImageButton;
    private ImageButton mStaffImageButton;
    private ImageButton mStoutImageButton;
    private ImageButton mTalismanImageButton;
    private ImageButton mTangoImageButton;
    private ImageButton mTomeImageButton;
    private ImageButton mTPSImageButton;
    private ImageButton mTranquilImageButton;
    private ImageButton mUltimateImageButton;
    private ImageButton mUrnImageButton;
    private ImageButton mVanguardImageButton;
    private ImageButton mVeilImageButton;
    private ImageButton mVitalityImageButton;
    private ImageButton mVladImageButton;
    private ImageButton mVoidImageButton;
    private ImageButton mWindLaceImageButton;
    private ImageButton mWraithImageButton;
    private ImageButton mYashaImageButton;
    private Button mMainMenuButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_lookup);

        mItemPicRadioButton = (RadioButton) findViewById(R.id.itemPicRadioButton);
        mItemNameRadioButton = (RadioButton) findViewById(R.id.itemNameRadioButton);
        mItemNameSpinner = (Spinner) findViewById(R.id.itemSpinner);
        mItemPicLinearLayout = (LinearLayout) findViewById(R.id.itemPictureLayout);
        mItemPicScrollView = (ScrollView) findViewById(R.id.itemPicScroll);
        mItemNameLinearLayout = (LinearLayout) findViewById(R.id.itemNameLayout);

        mAbyssalImageButton = (ImageButton) findViewById(R.id.abyssalImageButton);
        mAetherImageButton = (ImageButton) findViewById(R.id.aetherImageButton);
        mAgsImageButton = (ImageButton) findViewById(R.id.agsImageButton);
        mAnimalImageButton = (ImageButton) findViewById(R.id.courierImageButton);
        mArcaneImageButton = (ImageButton) findViewById(R.id.arcaneImageButton);
        mArmletImageButton = (ImageButton) findViewById(R.id.armletImageButton);
        mAssaultImageButton = (ImageButton) findViewById(R.id.assaultImageButton);
        mBandElvImageButton = (ImageButton) findViewById(R.id.bandImageButton);
        mBFuryImageButton = (ImageButton) findViewById(R.id.bfuryImageButton);
        mBeltStrImageButton = (ImageButton) findViewById(R.id.bStrengthImageButton);
        mBKBImageButton = (ImageButton) findViewById(R.id.bkbImageButton);
        mBlademailImageButton = (ImageButton) findViewById(R.id.blademailImageButton);
        mBladeAlacImageButton = (ImageButton) findViewById(R.id.alacImageButton);
        mBladesAttImageButton = (ImageButton) findViewById(R.id.bladesAttImageButton);
        mBlightStoneImageButton = (ImageButton) findViewById(R.id.blightImageButton);
        mBlinkImageButton = (ImageButton) findViewById(R.id.blinkImageButton);
        mBloodstoneImageButton = (ImageButton) findViewById(R.id.bloodstoneImageButton);
        mBloodthornImageButton = (ImageButton) findViewById(R.id.bloodthornImageButton);
        mBootsSpeedImageButton = (ImageButton) findViewById(R.id.bSpeedImageButton);
        mBootsTravelImageButton = (ImageButton) findViewById(R.id.bTravImageButton);
        mBottleImageButton = (ImageButton) findViewById(R.id.bottleImageButton);
        mBracerImageButton = (ImageButton) findViewById(R.id.bracerImageButton);
        mBroadswordImageButton = (ImageButton) findViewById(R.id.broadImageButton);
        mBucklerImageButton = (ImageButton) findViewById(R.id.bucklerImageButton);
        mButterflyImageButton = (ImageButton) findViewById(R.id.butterflyImageButton);
        mChainmailImageButton = (ImageButton) findViewById(R.id.chainmailImageButton);
        mCircletImageButton = (ImageButton) findViewById(R.id.circletImageButton);
        mClarityImageButton = (ImageButton) findViewById(R.id.clarityImageButton);
        mClaymoreImageButton = (ImageButton) findViewById(R.id.claymoreImageButton);
        mCloakImageButton = (ImageButton) findViewById(R.id.cloakImageButton);
        mCrimsonImageButton = (ImageButton) findViewById(R.id.crimsonImageButton);
        mCrystalImageButton = (ImageButton) findViewById(R.id.crystalImageButton);
        mDaedImageButton = (ImageButton) findViewById(R.id.daedImageButton);
        mDagonImageButton = (ImageButton) findViewById(R.id.dagonImageButton);
        mDemonImageButton = (ImageButton) findViewById(R.id.demonImageButton);
        mDesolatorImageButton = (ImageButton) findViewById(R.id.desoImageButton);
        mDiffusalImageButton = (ImageButton) findViewById(R.id.diffusalImageButton);
        mDivineImageButton = (ImageButton) findViewById(R.id.rapierImageButton);
        mDragonLanceImageButton = (ImageButton) findViewById(R.id.dragonImageButton);
        mDrumImageButton = (ImageButton) findViewById(R.id.drumImageButton);
        mDustImageButton = (ImageButton) findViewById(R.id.dustImageButton);
        mEagleImageButton = (ImageButton) findViewById(R.id.eagleImageButton);
        mEchoImageButton = (ImageButton) findViewById(R.id.echoImageButton);
        mMangoImageButton = (ImageButton) findViewById(R.id.mangoImageButton);
        mEnergyBoosterImageButton = (ImageButton) findViewById(R.id.energyboosterImageButton);
        mEtherealImageButton = (ImageButton) findViewById(R.id.etherealImageButton);
        mEulsImageButton = (ImageButton) findViewById(R.id.eulsImageButton);
        mEyeImageButton = (ImageButton) findViewById(R.id.eyeImageButton);
        mFaerieImageButton = (ImageButton) findViewById(R.id.faerieImageButton);
        mFlyingCourImageButton = (ImageButton) findViewById(R.id.fcourierImageButton);
        mForceImageButton = (ImageButton) findViewById(R.id.forceImageButton);
        mGauntletsStrImageButton = (ImageButton) findViewById(R.id.gauntletsImageButton);
        mGemImageButton = (ImageButton) findViewById(R.id.gemImageButton);
        mGhostImageButton = (ImageButton) findViewById(R.id.ghostImageButton);
        mGlimmerImageButton= (ImageButton) findViewById(R.id.glimmerImageButton);
        mGlovesImageButton= (ImageButton) findViewById(R.id.glovesImageButton);
        mGuardianGImageButton= (ImageButton) findViewById(R.id.guardianImageButton);
        mHandofMidImageButton= (ImageButton) findViewById(R.id.midasImageButton);
        mHeadImageButton= (ImageButton) findViewById(R.id.headdressImageButton);
        mHealingImageButton= (ImageButton) findViewById(R.id.salveImageButton);
        mHeartImageButton= (ImageButton) findViewById(R.id.heartImageButton);
        mHeavenImageButton= (ImageButton) findViewById(R.id.heavenImageButton);
        mHelmIronImageButton= (ImageButton) findViewById(R.id.helmIronImageButton);
        mHelmDomImageButton= (ImageButton) findViewById(R.id.helmDomImageButton);
        mHoodDefImageButton= (ImageButton) findViewById(R.id.hoodDefImageButton);
        mHurricaneImageButton= (ImageButton) findViewById(R.id.hurricaneImageButton);
        mHyperImageButton= (ImageButton) findViewById(R.id.hyperstoneImageButton);
        mRaindropImageButton= (ImageButton) findViewById(R.id.raindropImageButton);
        mIronBImageButton= (ImageButton) findViewById(R.id.ironBranchImageButton);
        mIronTalImageButton= (ImageButton) findViewById(R.id.ironTalonImageButton);
        mJaveImageButton= (ImageButton) findViewById(R.id.javelinImageButton);
        mLinkensImageButton= (ImageButton) findViewById(R.id.linkensImageButton);
        mLotusImageButton= (ImageButton) findViewById(R.id.lotusImageButton);
        mMaelImageButton= (ImageButton) findViewById(R.id.maelImageButton);
        mMagicStickImageButton= (ImageButton) findViewById(R.id.magicStickImageButton);
        mMagicWandImageButton= (ImageButton) findViewById(R.id.magicWandImageButton);
        mMantaImageButton= (ImageButton) findViewById(R.id.mantaImageButton);
        mMantleImageButton= (ImageButton) findViewById(R.id.mantleImageButton);
        mMaskMadImageButton= (ImageButton) findViewById(R.id.maskMadImageButton);
        mMedallImageButton= (ImageButton) findViewById(R.id.medalcourImageButton);
        mMekImageButton= (ImageButton) findViewById(R.id.mekImageButton);
        mMithrilImageButton= (ImageButton) findViewById(R.id.mithrilImageButton);
        mMjollImageButton= (ImageButton) findViewById(R.id.mjollImageButton);
        mMKBImageButton= (ImageButton) findViewById(R.id.mkbImageButton);
        mMoonShardImageButton= (ImageButton) findViewById(R.id.moonImageButton);
        mMorbidImageButton= (ImageButton) findViewById(R.id.morbidImageButton);
        mMysticImageButton= (ImageButton) findViewById(R.id.mysticImageButton);
        mNecroImageButton= (ImageButton) findViewById(R.id.necronomImageButton);
        mNullTallImageButton= (ImageButton) findViewById(R.id.nullTalImageButton);
        mOblivImageButton= (ImageButton) findViewById(R.id.oblivionImageButton);
        mObsWardImageButton= (ImageButton) findViewById(R.id.obsWardImageButton);
        mOctCoreImageButton= (ImageButton) findViewById(R.id.octarineImageButton);
        mOgreImageButton= (ImageButton) findViewById(R.id.ogreImageButton);
        mOrbVenImageButton= (ImageButton) findViewById(R.id.venomImageButton);
        mOrchidMalImageButton= (ImageButton) findViewById(R.id.orchidImageButton);
        mPersImageButton= (ImageButton) findViewById(R.id.persImageButton);
        mPhaseBootImageButton= (ImageButton) findViewById(R.id.phaseImageButton);
        mPipeImageButton= (ImageButton) findViewById(R.id.pipeImageButton);
        mPlatemailImageButton= (ImageButton) findViewById(R.id.platemailImageButton);
        mPointBoostImageButton= (ImageButton) findViewById(R.id.pointImageButton);
        mPoorManImageButton= (ImageButton) findViewById(R.id.poorImageButton);
        mPowerTreadImageButton= (ImageButton) findViewById(R.id.powerImageButton);
        mQuarterImageButton= (ImageButton) findViewById(R.id.quarterImageButton);
        mQuellBladeImageButton= (ImageButton) findViewById(R.id.quellImageButton);
        mRadianceImageButton= (ImageButton) findViewById(R.id.radianceImageButton);
        mReaverImageButton= (ImageButton) findViewById(R.id.reaverImageButton);
        mRefreshImageButton= (ImageButton) findViewById(R.id.refresherImageButton);
        mRingAquilaImageButton= (ImageButton) findViewById(R.id.aquilaImageButton);
        mRingBasilImageButton= (ImageButton) findViewById(R.id.basiliusImageButton);
        mRingHealthImageButton= (ImageButton) findViewById(R.id.healthImageButton);
        mRingProtectImageButton= (ImageButton) findViewById(R.id.protectionImageButton);
        mRingRegenImageButton= (ImageButton) findViewById(R.id.regenImageButton);
        mRobeMagiImageButton= (ImageButton) findViewById(R.id.robeImageButton);
        mRodAtosImageButton= (ImageButton) findViewById(R.id.atosImageButton);
        mSacredImageButton= (ImageButton) findViewById(R.id.sacredRelicImageButton);
        mSageImageButton= (ImageButton) findViewById(R.id.sageImageButton);
        mSangeImageButton= (ImageButton) findViewById(R.id.sangeImageButton);
        mSangeYashImageButton= (ImageButton) findViewById(R.id.sangeYashaImageButton);
        mSatanicImageButton= (ImageButton) findViewById(R.id.satanicImageButton);
        mScytheImageButton= (ImageButton) findViewById(R.id.scytheImageButton);
        mSentryImageButton= (ImageButton) findViewById(R.id.sentryImageButton);
        mShadowAmImageButton= (ImageButton) findViewById(R.id.shadowAmuletImageButton);
        mShadowBlImageButton= (ImageButton) findViewById(R.id.shadowBladeImageButton);
        mShivasImageButton= (ImageButton) findViewById(R.id.shivasImageButton);
        mSilverEdImageButton= (ImageButton) findViewById(R.id.silverImageButton);
        mSkullBashImageButton= (ImageButton) findViewById(R.id.skullImageButton);
        mSlippersImageButton= (ImageButton) findViewById(R.id.slippersImageButton);
        mSmokeImageButton= (ImageButton) findViewById(R.id.smokeImageButton);
        mSolarImageButton= (ImageButton) findViewById(R.id.solarImageButton);
        mSoulBoostImageButton= (ImageButton) findViewById(R.id.soulBoostImageButton);
        mSoulRingImageButton= (ImageButton) findViewById(R.id.soulRingImageButton);
        mStaffImageButton= (ImageButton) findViewById(R.id.staffImageButton);
        mStoutImageButton= (ImageButton) findViewById(R.id.stoutImageButton);
        mTalismanImageButton= (ImageButton) findViewById(R.id.talismanImageButton);
        mTangoImageButton= (ImageButton) findViewById(R.id.tangoImageButton);
        mTomeImageButton= (ImageButton) findViewById(R.id.tomeImageButton);
        mTPSImageButton= (ImageButton) findViewById(R.id.tpsImageButton);
        mTranquilImageButton= (ImageButton) findViewById(R.id.tranquilImageButton);
        mUltimateImageButton= (ImageButton) findViewById(R.id.ultimateImageButton);
        mUrnImageButton= (ImageButton) findViewById(R.id.urnImageButton);
        mVanguardImageButton= (ImageButton) findViewById(R.id.vanguardImageButton);
        mVeilImageButton= (ImageButton) findViewById(R.id.veilImageButton);
        mVitalityImageButton= (ImageButton) findViewById(R.id.vitalityImageButton);
        mVladImageButton= (ImageButton) findViewById(R.id.vladmirImageButton);
        mVoidImageButton= (ImageButton) findViewById(R.id.voidImageButton);
        mWindLaceImageButton= (ImageButton) findViewById(R.id.windLaceImageButton);
        mWraithImageButton= (ImageButton) findViewById(R.id.wraithImageButton);
        mYashaImageButton= (ImageButton) findViewById(R.id.yashaImageButton);
        mMainMenuButton = (Button) findViewById(R.id.mainMenuButton);


        final SharedPreferences sharedPref = this.getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE);
        mItemNameRadioButton.setChecked(sharedPref.getBoolean("currentNameChecked",name));
        mItemPicRadioButton.setChecked(sharedPref.getBoolean("currentPicChecked", pic));

        update();

        mMainMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences preferences = getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE);
                preferences.edit().remove("currentNameChecked").apply();
                preferences.edit().remove("currentPicChecked").apply();
                Intent back = new Intent(ItemLookupActivity.this, MainActivity.class);
                startActivity(back);}

        });


        mItemNameRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mItemPicRadioButton.setChecked(false);
               update();
            }
        });


        mItemPicRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mItemNameRadioButton.setChecked(false);
               update();
            }
        });


        // Spinner click listener
        mItemNameSpinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {

            int current = 0;

            @Override
            public void onItemSelected(AdapterView<?> parent, View v, int position,
                                       long id) {
                // TODO Auto-generated method stub
                current = position;
                if (current > 0){
                    Intent i = new Intent(ItemLookupActivity.this, ItemActivity.class);
                    i.putExtra("currentitem", (current-1));
                    i.putExtra("state", true);
                    startActivity(i);}


            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }

        });

        mAbyssalImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i.putExtra("currentitem", 0);
                startActivity(i);

            }
        });

        mAetherImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i1.putExtra("currentitem", 1);
                startActivity(i1);

            }
        });

        mAgsImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i2 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i2.putExtra("currentitem", 2);
                startActivity(i2);

            }
        });

        mAnimalImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i3.putExtra("currentitem", 3);
                startActivity(i3);

            }
        });

        mArcaneImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i4 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i4.putExtra("currentitem", 4);
                startActivity(i4);

            }
        });

        mArmletImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i5 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i5.putExtra("currentitem", 5);
                startActivity(i5);

            }
        });

        mAssaultImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i6 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i6.putExtra("currentitem", 6);
                startActivity(i6);

            }
        });

        mBandElvImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i7 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i7.putExtra("currentitem", 7);
                startActivity(i7);

            }
        });

        mBFuryImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i8 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i8.putExtra("currentitem", 8);
                startActivity(i8);

            }
        });

        mBeltStrImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i9 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i9.putExtra("currentitem", 9);
                startActivity(i9);

            }
        });

        mBKBImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i10 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i10.putExtra("currentitem", 10);
                startActivity(i10);

            }
        });

        mBlademailImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i11 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i11.putExtra("currentitem", 11);
                startActivity(i11);

            }
        });

        mBladeAlacImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i12 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i12.putExtra("currentitem", 12);
                startActivity(i12);

            }
        });

        mBladesAttImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i13 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i13.putExtra("currentitem", 13);
                startActivity(i13);

            }
        });

        mBlightStoneImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i14 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i14.putExtra("currentitem", 14);
                startActivity(i14);

            }
        });

        mBlinkImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i15 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i15.putExtra("currentitem", 15);
                startActivity(i15);

            }
        });

        mBloodstoneImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i16 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i16.putExtra("currentitem", 16);
                startActivity(i16);

            }
        });

        mBloodthornImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i17 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i17.putExtra("currentitem", 17);
                startActivity(i17);

            }
        });

        mBootsSpeedImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i18 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i18.putExtra("currentitem", 18);
                startActivity(i18);

            }
        });

        mBootsTravelImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i19 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i19.putExtra("currentitem", 19);
                startActivity(i19);

            }
        });

        mBottleImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i20 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i20.putExtra("currentitem", 20);
                startActivity(i20);

            }
        });

        mBracerImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i21 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i21.putExtra("currentitem", 21);
                startActivity(i21);

            }
        });

        mBroadswordImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i22 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i22.putExtra("currentitem", 22);
                startActivity(i22);

            }
        });

        mBucklerImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i23 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i23.putExtra("currentitem", 23);
                startActivity(i23);

            }
        });

        mButterflyImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i24 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i24.putExtra("currentitem", 24);
                startActivity(i24);

            }
        });

        mChainmailImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i25 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i25.putExtra("currentitem", 25);
                startActivity(i25);

            }
        });

        mCircletImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i26 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i26.putExtra("currentitem", 26);
                startActivity(i26);

            }
        });

        mClarityImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i27 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i27.putExtra("currentitem", 27);
                startActivity(i27);

            }
        });

        mClaymoreImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i28 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i28.putExtra("currentitem", 28);
                startActivity(i28);

            }
        });

        mCloakImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i29 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i29.putExtra("currentitem", 29);
                startActivity(i29);

            }
        });

        mCrimsonImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i30 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i30.putExtra("currentitem", 30);
                startActivity(i30);

            }
        });

        mCrystalImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i31 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i31.putExtra("currentitem", 31);
                startActivity(i31);

            }
        });


        mDaedImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i32 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i32.putExtra("currentitem", 32);
                startActivity(i32);

            }
        });

        mDagonImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i33 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i33.putExtra("currentitem", 33);
                startActivity(i33);

            }
        });

        mDemonImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i34 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i34.putExtra("currentitem", 34);
                startActivity(i34);

            }
        });


        mDesolatorImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i35 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i35.putExtra("currentitem", 35);
                startActivity(i35);

            }
        });

        mDiffusalImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i36 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i36.putExtra("currentitem", 36);
                startActivity(i36);

            }
        });

        mDivineImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i37 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i37.putExtra("currentitem", 37);
                startActivity(i37);

            }
        });

        mDragonLanceImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i38 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i38.putExtra("currentitem", 38);
                startActivity(i38);

            }
        });

        mDrumImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i39 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i39.putExtra("currentitem", 39);
                startActivity(i39);

            }
        });

        mDustImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i40 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i40.putExtra("currentitem", 40);
                startActivity(i40);

            }
        });

        mEagleImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i41 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i41.putExtra("currentitem", 41);
                startActivity(i41);

            }
        });

        mEchoImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i42 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i42.putExtra("currentitem", 42);
                startActivity(i42);

            }
        });

        mMangoImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i43 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i43.putExtra("currentitem", 43);
                startActivity(i43);

            }
        });

        mEnergyBoosterImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i44 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i44.putExtra("currentitem", 44);
                startActivity(i44);

            }
        });

        mEtherealImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i45 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i45.putExtra("currentitem", 45);
                startActivity(i45);

            }
        });

        mEulsImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i46 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i46.putExtra("currentitem", 46);
                startActivity(i46);

            }
        });

        mEyeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i47 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i47.putExtra("currentitem", 47);
                startActivity(i47);

            }
        });
        mFaerieImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i48 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i48.putExtra("currentitem", 48);
                startActivity(i48);

            }
        });

        mFlyingCourImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i49 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i49.putExtra("currentitem", 49);
                startActivity(i49);

            }
        });

        mForceImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i50 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i50.putExtra("currentitem", 50);
                startActivity(i50);

            }
        });

        mGauntletsStrImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i51 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i51.putExtra("currentitem", 51);
                startActivity(i51);

            }
        });

        mGemImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i52 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i52.putExtra("currentitem", 52);
                startActivity(i52);

            }
        });

        mGhostImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i53 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i53.putExtra("currentitem", 53);
                startActivity(i53);

            }
        });

        mGlimmerImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i54 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i54.putExtra("currentitem", 54);
                startActivity(i54);
            }
        });

        mGlovesImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i55 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i55.putExtra("currentitem", 55);
                startActivity(i55);
            }
        });

        mGuardianGImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i56 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i56.putExtra("currentitem", 56);
                startActivity(i56);
            }
        });

        mHandofMidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i57 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i57.putExtra("currentitem", 57);
                startActivity(i57);
            }
        });

        mHeadImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i58 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i58.putExtra("currentitem", 58);
                startActivity(i58);
            }
        });

        mHealingImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i59 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i59.putExtra("currentitem", 59);
                startActivity(i59);
            }
        });

        mHeartImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i60 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i60.putExtra("currentitem", 60);
                startActivity(i60);
            }
        });

        mHeavenImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i61 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i61.putExtra("currentitem", 61);
                startActivity(i61);
            }
        });

        mHelmIronImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i62 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i62.putExtra("currentitem", 62);
                startActivity(i62);
            }
        });

        mHelmDomImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i63 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i63.putExtra("currentitem", 63);
                startActivity(i63);
            }
        });


        mHoodDefImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i64 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i64.putExtra("currentitem", 64);
                startActivity(i64);
            }
        });

        mHurricaneImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i65 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i65.putExtra("currentitem", 65);
                startActivity(i65);
            }
        });

        mHyperImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i66 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i66.putExtra("currentitem", 66);
                startActivity(i66);
            }
        });

        mRaindropImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i67 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i67.putExtra("currentitem", 67);
                startActivity(i67);
            }
        });

        mIronBImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i68 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i68.putExtra("currentitem", 68);
                startActivity(i68);
            }
        });

        mIronTalImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i69 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i69.putExtra("currentitem", 69);
                startActivity(i69);
            }
        });

        mJaveImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i70 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i70.putExtra("currentitem", 70);
                startActivity(i70);
            }
        });

        mLinkensImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i71 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i71.putExtra("currentitem", 71);
                startActivity(i71);
            }
        });

        mLotusImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i72 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i72.putExtra("currentitem", 72);
                startActivity(i72);
            }
        });

        mMaelImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i73 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i73.putExtra("currentitem", 73);
                startActivity(i73);
            }
        });

        mMagicStickImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i74 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i74.putExtra("currentitem", 74);
                startActivity(i74);
            }
        });

        mMagicWandImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i75 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i75.putExtra("currentitem", 75);
                startActivity(i75);
            }
        });

        mMantaImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i76 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i76.putExtra("currentitem", 76);
                startActivity(i76);
            }
        });

        mMantleImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i77 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i77.putExtra("currentitem", 77);
                startActivity(i77);
            }
        });

        mMaskMadImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i78 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i78.putExtra("currentitem", 78);
                startActivity(i78);
            }
        });

        mMedallImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i79 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i79.putExtra("currentitem", 79);
                startActivity(i79);
            }
        });

        mMekImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i80 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i80.putExtra("currentitem", 80);
                startActivity(i80);
            }
        });

        mMithrilImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i81 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i81.putExtra("currentitem", 81);
                startActivity(i81);
            }
        });

        mMjollImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i82 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i82.putExtra("currentitem", 82);
                startActivity(i82);
            }
        });

        mMKBImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i83 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i83.putExtra("currentitem", 83);
                startActivity(i83);
            }
        });

        mMoonShardImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i84 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i84.putExtra("currentitem", 84);
                startActivity(i84);
            }
        });

        mMorbidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i85 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i85.putExtra("currentitem", 85);
                startActivity(i85);
            }
        });


        mMysticImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i86 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i86.putExtra("currentitem", 86);
                startActivity(i86);
            }
        });

        mNecroImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i87 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i87.putExtra("currentitem", 87);
                startActivity(i87);
            }
        });

        mNullTallImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i88 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i88.putExtra("currentitem", 88);
                startActivity(i88);
            }
        });

        mOblivImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i89 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i89.putExtra("currentitem", 89);
                startActivity(i89);
            }
        });

        mObsWardImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i90 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i90.putExtra("currentitem", 90);
                startActivity(i90);
            }
        });

        mOctCoreImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i91 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i91.putExtra("currentitem", 91);
                startActivity(i91);
            }
        });

        mOgreImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i92 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i92.putExtra("currentitem", 92);
                startActivity(i92);
            }
        });


        mOrbVenImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i93 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i93.putExtra("currentitem", 93);
                startActivity(i93);
            }
        });

        mOrchidMalImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i94 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i94.putExtra("currentitem", 94);
                startActivity(i94);
            }
        });

        mPersImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i95 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i95.putExtra("currentitem", 95);
                startActivity(i95);
            }
        });


        mPhaseBootImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i96 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i96.putExtra("currentitem", 96);
                startActivity(i96);
            }
        });

        mPipeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i97 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i97.putExtra("currentitem", 97);
                startActivity(i97);
            }
        });

        mPlatemailImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i98 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i98.putExtra("currentitem", 98);
                startActivity(i98);
            }
        });

        mPointBoostImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i99 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i99.putExtra("currentitem", 99);
                startActivity(i99);
            }
        });

        mPoorManImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i100 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i100.putExtra("currentitem", 100);
                startActivity(i100);
            }
        });

        mPowerTreadImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i101 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i101.putExtra("currentitem", 101);
                startActivity(i101);
            }
        });

        mQuarterImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i102 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i102.putExtra("currentitem", 102);
                startActivity(i102);
            }
        });

        mQuellBladeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i103 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i103.putExtra("currentitem", 103);
                startActivity(i103);
            }
        });

        mRadianceImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i104 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i104.putExtra("currentitem", 104);
                startActivity(i104);
            }
        });

        mReaverImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i105 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i105.putExtra("currentitem", 105);
                startActivity(i105);
            }
        });

        mRefreshImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i106 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i106.putExtra("currentitem", 106);
                startActivity(i106);
            }
        });

        mRingAquilaImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i107 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i107.putExtra("currentitem", 107);
                startActivity(i107);
            }
        });


        mRingBasilImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i108 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i108.putExtra("currentitem", 108);
                startActivity(i108);
            }
        });

        mRingHealthImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i109 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i109.putExtra("currentitem", 109);
                startActivity(i109);
            }
        });

        mRingProtectImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i110 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i110.putExtra("currentitem", 110);
                startActivity(i110);
            }
        });

        mRingRegenImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i111 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i111.putExtra("currentitem", 111);
                startActivity(i111);
            }
        });

        mRobeMagiImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i112 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i112.putExtra("currentitem", 112);
                startActivity(i112);
            }
        });

        mRodAtosImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i113 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i113.putExtra("currentitem", 113);
                startActivity(i113);
            }
        });

        mSacredImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i114 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i114.putExtra("currentitem", 114);
                startActivity(i114);
            }
        });

        mSageImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i115 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i115.putExtra("currentitem", 115);
                startActivity(i115);
            }
        });

        mSangeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i116 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i116.putExtra("currentitem", 116);
                startActivity(i116);
            }
        });

        mSangeYashImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i117 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i117.putExtra("currentitem", 117);
                startActivity(i117);
            }
        });

        mSatanicImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i118 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i118.putExtra("currentitem", 118);
                startActivity(i118);
            }
        });

        mScytheImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i119 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i119.putExtra("currentitem", 119);
                startActivity(i119);
            }
        });

        mSentryImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i120 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i120.putExtra("currentitem", 120);
                startActivity(i120);
            }
        });

        mShadowAmImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i121 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i121.putExtra("currentitem", 121);
                startActivity(i121);
            }
        });


        mShadowBlImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i122 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i122.putExtra("currentitem", 122);
                startActivity(i122);
            }
        });

        mShivasImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i123 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i123.putExtra("currentitem", 123);
                startActivity(i123);
            }
        });

        mSilverEdImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i124 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i124.putExtra("currentitem", 124);
                startActivity(i124);
            }
        });

        mSkullBashImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i125 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i125.putExtra("currentitem", 125);
                startActivity(i125);
            }
        });

        mSlippersImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i126 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i126.putExtra("currentitem", 126);
                startActivity(i126);
            }
        });

        mSmokeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i127 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i127.putExtra("currentitem", 127);
                startActivity(i127);
            }
        });

        mSolarImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i128 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i128.putExtra("currentitem", 128);
                startActivity(i128);
            }
        });

        mSoulBoostImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i129 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i129.putExtra("currentitem", 129);
                startActivity(i129);
            }
        });

        mSoulRingImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i130 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i130.putExtra("currentitem", 130);
                startActivity(i130);
            }
        });

        mStaffImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i131 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i131.putExtra("currentitem", 131);
                startActivity(i131);
            }
        });

        mStoutImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i132 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i132.putExtra("currentitem", 132);
                startActivity(i132);
            }
        });

        mTalismanImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i133 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i133.putExtra("currentitem", 133);
                startActivity(i133);
            }
        });

        mTangoImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i134 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i134.putExtra("currentitem", 134);
                startActivity(i134);
            }
        });

        mTomeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i135 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i135.putExtra("currentitem", 135);
                startActivity(i135);
            }
        });

        mTPSImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i136 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i136.putExtra("currentitem", 136);
                startActivity(i136);
            }
        });

        mTranquilImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i137 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i137.putExtra("currentitem", 137);
                startActivity(i137);
            }
        });

        mUltimateImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i138 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i138.putExtra("currentitem", 138);
                startActivity(i138);
            }
        });

        mUrnImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i139 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i139.putExtra("currentitem", 139);
                startActivity(i139);
            }
        });

        mVanguardImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i140 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i140.putExtra("currentitem", 140);
                startActivity(i140);
            }
        });

        mVeilImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i141 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i141.putExtra("currentitem", 141);
                startActivity(i141);
            }
        });


        mVitalityImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i142 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i142.putExtra("currentitem", 142);
                startActivity(i142);
            }
        });

        mVladImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i143 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i143.putExtra("currentitem", 143);
                startActivity(i143);
            }
        });

        mVoidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i144 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i144.putExtra("currentitem", 144);
                startActivity(i144);
            }
        });

        mWindLaceImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i145 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i145.putExtra("currentitem", 145);
                startActivity(i145);
            }
        });

        mWraithImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i146 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i146.putExtra("currentitem", 146);
                startActivity(i146);
            }
        });

        mYashaImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i147 = new Intent(ItemLookupActivity.this, ItemActivity.class);
                i147.putExtra("currentitem", 147);
                startActivity(i147);
            }
        });

    }

    private void update() {


        if (mItemNameRadioButton.isChecked()){
            mItemPicScrollView.setVisibility(INVISIBLE);
            mItemPicLinearLayout.setVisibility(INVISIBLE);
            mItemNameLinearLayout.setVisibility(VISIBLE);
        }
        if (mItemPicRadioButton.isChecked()){
            mItemNameLinearLayout.setVisibility(INVISIBLE);
            mItemPicScrollView.setVisibility(VISIBLE);
            mItemPicLinearLayout.setVisibility(VISIBLE);
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        pic = mItemPicRadioButton.isChecked();
        name = mItemNameRadioButton.isChecked();

        SharedPreferences sharedPref = this.getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean("currentPicChecked", pic);
        editor.putBoolean("currentNameChecked", name);
        editor.apply();
    }
}
