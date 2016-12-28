package com.example.jenniemartin.dota2ref;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.RippleDrawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static java.sql.Types.NULL;

public class AbilityActivity extends AppCompatActivity {


    private Button mNAbilityButton;
    private Button mPAbilityButton;
    private ImageView mAbilityImageView;

    private int mCurrentIndex = 0;
    private int mAbilityCount = 0;
    private int mClickCount = 0;

    private int previousHero = 0;


    public static final String MY_PREFERENCES = "MyPreferences";


//creates the array of Abilities objects with index matching the Dota 2 heroes in alphabetical order
    private final Abilities[] mAbilities = new Abilities[]{
            new Abilities(R.drawable.abaddon_q, R.drawable.abaddon_w, R.drawable.abaddon_e, R.drawable.abaddon_r, 4),
            new Abilities(R.drawable.alchemist_q,R.drawable.alchemist_w,R.drawable.alchemist_e,R.drawable.alchemist_r,4),
            new Abilities(R.drawable.ancientapp_q,R.drawable.ancientapp_w,R.drawable.ancientapp_e,R.drawable.ancientapp_r,4),
            new Abilities(R.drawable.antimage_q,R.drawable.antimage_w,R.drawable.antimage_e,R.drawable.antimage_r,4),
            new Abilities(R.drawable.arcward_q,R.drawable.arcward_w,R.drawable.arcward_e,R.drawable.arcward_r,4),
            new Abilities(R.drawable.axe_q,R.drawable.axe_w,R.drawable.axe_e,R.drawable.axe_r,4),
            new Abilities(R.drawable.bane_q,R.drawable.bane_w,R.drawable.bane_e,R.drawable.bane_r,4),
            new Abilities(R.drawable.batrider_q,R.drawable.batrider_w,R.drawable.batrider_e,R.drawable.batrider_r,4),
            new Abilities(R.drawable.beastmaster_q,R.drawable.beastmaster_w,R.drawable.beastmaster_e,R.drawable.beastmaster_r,5),
            new Abilities(R.drawable.bloodseeker_q,R.drawable.bloodseeker_w,R.drawable.bloodseeker_e,R.drawable.bloodseeker_r,4),
            new Abilities(R.drawable.bounty_q,R.drawable.bounty_w,R.drawable.bounty_e,R.drawable.bounty_r,4),
            new Abilities(R.drawable.brewmaster_q,R.drawable.brewmaster_w,R.drawable.brewmaster_e,R.drawable.brewmaster_r,4),
            new Abilities(R.drawable.bristleback_q,R.drawable.bristleback_w,R.drawable.bristleback_e,R.drawable.bristleback_r,4),
            new Abilities(R.drawable.broodmother_q,R.drawable.broodmother_w,R.drawable.broodmother_e,R.drawable.broodmother_r,4),
            new Abilities(R.drawable.centaurwar_q,R.drawable.centaurwar_w,R.drawable.centaurwar_e,R.drawable.centaurwar_r,4),
            new Abilities(R.drawable.chaosknight_q,R.drawable.chaosknight_w,R.drawable.chaosknight_e,R.drawable.chaosknight_r,4),
            new Abilities(R.drawable.chen_q,R.drawable.chen_w,R.drawable.chen_e,R.drawable.chen_r,5),
            new Abilities(R.drawable.clinkz_q,R.drawable.clinkz_w,R.drawable.clinkz_e,R.drawable.clinkz_r,4),
            new Abilities(R.drawable.clockwerk_q,R.drawable.clockwerk_w,R.drawable.clockwerk_e,R.drawable.clockwerk_r,4),
            new Abilities(R.drawable.crystalmaiden_q,R.drawable.crystalmaiden_w,R.drawable.crystalmaiden_e,R.drawable.crystalmaiden_r,4),
            new Abilities(R.drawable.darkseer_q,R.drawable.darkseer_w,R.drawable.darkseer_e,R.drawable.darkseer_r,4),
            new Abilities(R.drawable.dazzle_q,R.drawable.dazzle_w,R.drawable.dazzle_e,R.drawable.dazzle_r,4),
            new Abilities(R.drawable.dp_q,R.drawable.dp_w,R.drawable.dp_e,R.drawable.dp_r,4),
            new Abilities(R.drawable.disruptor_q,R.drawable.disruptor_w,R.drawable.disruptor_e,R.drawable.disruptor_r,4),
            new Abilities(R.drawable.doom_q,R.drawable.doom_w,R.drawable.doom_e,R.drawable.doom_r,4),
            new Abilities(R.drawable.dragonknight_q,R.drawable.dragonknight_w,R.drawable.dragonknight_e,R.drawable.dragonknight_r,4),
            new Abilities(R.drawable.drow_q,R.drawable.drow_w,R.drawable.drow_e,R.drawable.drow_r,4),
            new Abilities(R.drawable.earthspirit_q,R.drawable.earthspirit_w,R.drawable.earthspirit_e,R.drawable.earthspirit_r,5),
            new Abilities(R.drawable.earthshaker_q,R.drawable.earthshaker_w,R.drawable.earthshaker_e,R.drawable.earthshaker_r,4),
            new Abilities(R.drawable.eldertitan_q,R.drawable.eldertitan_w,R.drawable.eldertitan_e,R.drawable.eldertitan_r,4),
            new Abilities(R.drawable.emberspirit_q,R.drawable.emberspirit_w,R.drawable.emberspirit_e,R.drawable.emberspirit_r,5),
            new Abilities(R.drawable.enchantress_q,R.drawable.enchantress_w,R.drawable.enchantress_e,R.drawable.enchantress_r,4),
            new Abilities(R.drawable.enigma_q,R.drawable.enigma_w,R.drawable.enigma_e,R.drawable.enigma_r,4),
            new Abilities(R.drawable.faceless_q,R.drawable.faceless_w,R.drawable.faceless_e,R.drawable.faceless_r,4),
            new Abilities(R.drawable.gyrocopter_q,R.drawable.gyrocopter_w,R.drawable.gyrocopter_e,R.drawable.gyrocopter_r,4),
            new Abilities(R.drawable.huskar_q,R.drawable.huskar_w,R.drawable.huskar_e,R.drawable.huskar_r,4),
            new Abilities(R.drawable.invoker_q,R.drawable.invoker_w,R.drawable.invoker_e,R.drawable.invoker_r,4),
            new Abilities(R.drawable.io_q,R.drawable.io_w,R.drawable.io_e,R.drawable.io_r,6),
            new Abilities(R.drawable.jakiro_q,R.drawable.jakiro_w,R.drawable.jakiro_e,R.drawable.jakiro_r,4),
            new Abilities(R.drawable.juggernaut_q,R.drawable.juggernaut_w,R.drawable.juggernaut_e,R.drawable.juggernaut_r,4),
            new Abilities(R.drawable.keeperoflight_q,R.drawable.keeperoflight_w,R.drawable.keeperoflight_e,R.drawable.keeperoflight_r,6),
            new Abilities(R.drawable.kunkka_q,R.drawable.kunkka_w,R.drawable.kunkka_e,R.drawable.kunkka_r,4),
            new Abilities(R.drawable.legion_q,R.drawable.legion_w,R.drawable.legion_e,R.drawable.legion_r,4),
            new Abilities(R.drawable.leshrac_q,R.drawable.leshrac_w,R.drawable.leshrac_e,R.drawable.leshrac_r,4),
            new Abilities(R.drawable.lich_q,R.drawable.lich_w,R.drawable.lich_e,R.drawable.lich_r,4),
            new Abilities(R.drawable.lifestealer_q,R.drawable.lifestealer_w,R.drawable.lifestealer_e,R.drawable.lifestealer_r,5),
            new Abilities(R.drawable.lina_q,R.drawable.lina_w,R.drawable.lina_e,R.drawable.lina_r,4),
            new Abilities(R.drawable.lion_q,R.drawable.lion_w,R.drawable.lion_e,R.drawable.lion_r,4),
            new Abilities(R.drawable.lonedruid_q,R.drawable.lonedruid_w,R.drawable.lonedruid_e,R.drawable.lonedruid_r,5),
            new Abilities(R.drawable.luna_q,R.drawable.luna_w,R.drawable.luna_e,R.drawable.luna_r,4),
            new Abilities(R.drawable.lycan_q,R.drawable.lycan_w,R.drawable.lycan_e,R.drawable.lycan_r,4),
            new Abilities(R.drawable.magnus_q,R.drawable.magnus_w,R.drawable.magnus_e,R.drawable.magnus_r,4),
            new Abilities(R.drawable.medusa_q,R.drawable.medusa_w,R.drawable.medusa_e,R.drawable.medusa_r,4),
            new Abilities(R.drawable.meepo_q,R.drawable.meepo_w,R.drawable.meepo_e,R.drawable.meepo_r,4),
            new Abilities(R.drawable.mirana_q,R.drawable.mirana_w,R.drawable.mirana_e,R.drawable.mirana_r,4),
            new Abilities(R.drawable.morphling_q,R.drawable.morphling_w,R.drawable.morphling_e,R.drawable.morphling_r,6),
            new Abilities(R.drawable.nagasiren_q,R.drawable.nagasiren_w,R.drawable.nagasiren_e,R.drawable.nagasiren_r,4),
            new Abilities(R.drawable.naturesprophet_q,R.drawable.naturesprophet_w,R.drawable.naturesprophet_e,R.drawable.naturesprophet_r,4),
            new Abilities(R.drawable.necrophos_q,R.drawable.necrophos_w,R.drawable.necrophos_e,R.drawable.necrophos_r,4),
            new Abilities(R.drawable.nightstalker_q,R.drawable.nightstalker_w,R.drawable.nightstalker_e,R.drawable.nightstalker_r,4),
            new Abilities(R.drawable.nyxassassin_q,R.drawable.nyxassassin_w,R.drawable.nyxassassin_e,R.drawable.nyxassassin_r,5),
            new Abilities(R.drawable.ogremagi_q,R.drawable.ogremagi_w,R.drawable.ogremagi_e,R.drawable.ogremagi_r,5),
            new Abilities(R.drawable.omniknight_q,R.drawable.omniknight_w,R.drawable.omniknight_e,R.drawable.omniknight_r,4),
            new Abilities(R.drawable.oracle_q,R.drawable.oracle_w,R.drawable.oracle_e,R.drawable.oracle_r,4),
            new Abilities(R.drawable.outworlddevourer_q,R.drawable.outworlddevourer_w,R.drawable.outworlddevourer_e,R.drawable.outworlddevourer_r,4),
            new Abilities(R.drawable.phantomassassin_q,R.drawable.phantomassassin_w,R.drawable.phantomassassin_e,R.drawable.phantomassassin_r,4),
            new Abilities(R.drawable.phantomlancer_q,R.drawable.phantomlancer_w,R.drawable.phantomlancer_e,R.drawable.phantomlancer_r,4),
            new Abilities(R.drawable.phoenix_q,R.drawable.phoenix_w,R.drawable.phoenix_e,R.drawable.phoenix_r,5),
            new Abilities(R.drawable.puck_q,R.drawable.puck_w,R.drawable.puck_e,R.drawable.puck_r,5),
            new Abilities(R.drawable.pudge_q,R.drawable.pudge_w,R.drawable.pudge_e,R.drawable.pudge_r,4),
            new Abilities(R.drawable.pugna_q,R.drawable.pugna_w,R.drawable.pugna_e,R.drawable.pugna_r,4),
            new Abilities(R.drawable.queenofpain_q,R.drawable.queenofpain_w,R.drawable.queenofpain_e,R.drawable.queenofpain_r,4),
            new Abilities(R.drawable.razor_q,R.drawable.razor_w,R.drawable.razor_e,R.drawable.razor_r,4),
            new Abilities(R.drawable.riki_q,R.drawable.riki_w,R.drawable.riki_e,R.drawable.riki_r,4),
            new Abilities(R.drawable.rubick_q,R.drawable.rubick_w,R.drawable.rubick_e,R.drawable.rubick_r,4),
            new Abilities(R.drawable.sandking_q,R.drawable.sandking_w,R.drawable.sandking_e,R.drawable.sandking_r,4),
            new Abilities(R.drawable.shadowdemon_q,R.drawable.shadowdemon_w,R.drawable.shadowdemon_e,R.drawable.shadowdemon_r,5),
            new Abilities(R.drawable.shadowfiend_q,R.drawable.shadowfiend_w,R.drawable.shadowfiend_e,R.drawable.shadowfiend_r,6),
            new Abilities(R.drawable.shadowshaman_q,R.drawable.shadowshaman_w,R.drawable.shadowshaman_e,R.drawable.shadowshaman_r,4),
            new Abilities(R.drawable.silencer_q,R.drawable.silencer_w,R.drawable.silencer_e,R.drawable.silencer_r,4),
            new Abilities(R.drawable.skywrathmage_q,R.drawable.skywrathmage_w,R.drawable.skywrathmage_e,R.drawable.skywrathmage_r,4),
            new Abilities(R.drawable.slardar_q,R.drawable.slardar_w,R.drawable.slardar_e,R.drawable.slardar_r,4),
            new Abilities(R.drawable.slark_q,R.drawable.slark_w,R.drawable.slark_e,R.drawable.slark_r,4),
            new Abilities(R.drawable.sniper_q,R.drawable.sniper_w,R.drawable.sniper_e,R.drawable.sniper_r,4),
            new Abilities(R.drawable.spectre_q,R.drawable.spectre_w,R.drawable.spectre_e,R.drawable.spectre_r,5),
            new Abilities(R.drawable.spiritbreaker_q,R.drawable.spiritbreaker_w,R.drawable.spiritbreaker_e,R.drawable.spiritbreaker_r,4),
            new Abilities(R.drawable.stormspirit_q,R.drawable.stormspirit_w,R.drawable.stormspirit_e,R.drawable.stormspirit_r,4),
            new Abilities(R.drawable.sven_q,R.drawable.sven_w,R.drawable.sven_e,R.drawable.sven_r,4),
            new Abilities(R.drawable.techies_q,R.drawable.techies_w,R.drawable.techies_e,R.drawable.techies_r,5),
            new Abilities(R.drawable.templarassassin_q,R.drawable.templarassassin_w,R.drawable.templarassassin_e,R.drawable.templarassassin_r,4),
            new Abilities(R.drawable.terrorblade_q,R.drawable.terrorblade_w,R.drawable.terrorblade_e,R.drawable.terrorblade_r,4),
            new Abilities(R.drawable.tidehunter_q,R.drawable.tidehunter_w,R.drawable.tidehunter_e,R.drawable.tidehunter_r,4),
            new Abilities(R.drawable.timbersaw_q,R.drawable.timbersaw_w,R.drawable.timbersaw_e,R.drawable.timbersaw_r,4),
            new Abilities(R.drawable.tinker_q,R.drawable.tinker_w, R.drawable.tinker_e,R.drawable.tinker_r,4),
            new Abilities(R.drawable.tiny_q,R.drawable.tiny_w,R.drawable.tiny_e,R.drawable.tiny_r,4),
            new Abilities(R.drawable.treantprotector_q,R.drawable.treantprotector_w,R.drawable.treantprotector_e,R.drawable.treantprotector_r,5),
            new Abilities(R.drawable.trollwarlord_q,R.drawable.trollwarlord_w,R.drawable.trollwarlord_e,R.drawable.trollwarlord_r,5),
            new Abilities(R.drawable.tusk_q,R.drawable.tusk_w,R.drawable.tusk_e,R.drawable.tusk_r,5),
            new Abilities(R.drawable.underlord_q,R.drawable.underlord_w,R.drawable.underlord_e,R.drawable.underlord_r,4),
            new Abilities(R.drawable.undying_q,R.drawable.undying_w,R.drawable.undying_e,R.drawable.undying_r,4),
            new Abilities(R.drawable.ursa_q,R.drawable.ursa_w,R.drawable.ursa_e,R.drawable.ursa_r,4),
            new Abilities(R.drawable.vengefulsp_q,R.drawable.vengefulsp_w,R.drawable.vengefulsp_e,R.drawable.vengefulsp_r,4),
            new Abilities(R.drawable.venomancer_q,R.drawable.venomancer_w,R.drawable.venomancer_e,R.drawable.venomancer_r,4),
            new Abilities(R.drawable.viper_q,R.drawable.viper_w,R.drawable.viper_e,R.drawable.viper_r,4),
            new Abilities(R.drawable.visage_q,R.drawable.visage_w,R.drawable.visage_e,R.drawable.visage_r,4),
            new Abilities(R.drawable.warlock_q,R.drawable.warlock_w,R.drawable.warlock_e,R.drawable.warlock_r,4),
            new Abilities(R.drawable.weaver_q,R.drawable.weaver_w, R.drawable.weaver_e,R.drawable.weaver_r,4),
            new Abilities(R.drawable.windranger_q,R.drawable.windranger_w,R.drawable.windranger_e,R.drawable.windranger_r,4),
            new Abilities(R.drawable.winterwyv_q,R.drawable.winterwyv_w,R.drawable.winterwyv_e,R.drawable.winterwyv_r,4),
            new Abilities(R.drawable.witchdoctor_q,R.drawable.witchdoctor_w,R.drawable.witchdoctor_e,R.drawable.witchdoctor_r,4),
            new Abilities(R.drawable.wraithking_q,R.drawable.wraithking_w,R.drawable.wraithking_e,R.drawable.wraithking_r,4),
            new Abilities(R.drawable.zeus_q,R.drawable.zeus_w,R.drawable.zeus_e,R.drawable.zeus_r,4)
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ability);

        //gets the intent from HeroActivity and pulls the information for what hero we are on
        Intent abilityIntent = getIntent();
        mCurrentIndex = abilityIntent.getIntExtra("theCurrent",0);


        mAbilities[8].setmDImageResId(R.drawable.beastmaster_d); //set Beastmaster extra move
        mAbilities[16].setmDImageResId(R.drawable.chen_d); //set Chen extra move
        mAbilities[27].setmDImageResId(R.drawable.earthspirit_d); //set Earth Spirit extra move
        mAbilities[30].setmDImageResId(R.drawable.emberspirit_d); //set Ember Spirit extra move
        mAbilities[37].setmDImageResId(R.drawable.io_d); //set Io extra move
        mAbilities[37].setmFImageResId(R.drawable.io_f); //set Io extra move 2
        mAbilities[40].setmDImageResId(R.drawable.keeperoflight_d); //set KOL extra move
        mAbilities[40].setmFImageResId(R.drawable.keeperoflight_f); //set KOL extra move 2
        mAbilities[45].setmDImageResId(R.drawable.lifestealer_d); //set Lifestealer extra move
        mAbilities[48].setmDImageResId(R.drawable.lonedruid_d); //set Lone Druid extra move
        mAbilities[55].setmDImageResId(R.drawable.morphling_d); //set Morphling extra move
        mAbilities[55].setmFImageResId(R.drawable.morphling_f); //set Morphling extra move 2
        mAbilities[60].setmDImageResId(R.drawable.nyxassassin_d); //set Nyx extra move
        mAbilities[61].setmDImageResId(R.drawable.ogremagi_d); //set Ogre Magi extra move
        mAbilities[67].setmDImageResId(R.drawable.phoenix_d); //set Phoenix extra move
        mAbilities[68].setmDImageResId(R.drawable.puck_d); //set Puck extra move
        mAbilities[76].setmDImageResId(R.drawable.shadowdemon_d); //set Shadow Demon extra move
        mAbilities[77].setmDImageResId(R.drawable.shadowfiend_d); //set Shadow Fiend extra move
        mAbilities[77].setmFImageResId(R.drawable.shadowfiend_f); //set Shadow Fiend extra move 2
        mAbilities[84].setmDImageResId(R.drawable.spectre_d); //set Spectre extra move
        mAbilities[88].setmFImageResId(R.drawable.techies_f); //set Techies extra move
        mAbilities[95].setmDImageResId(R.drawable.treantprotector_d); //set Treant extra move
        mAbilities[96].setmW2ImageResId(R.drawable.trollwarlord_w2); //set Troll Warlord extra move
        mAbilities[97].setmDImageResId(R.drawable.tusk_d); //set Tusk extra move


        mNAbilityButton = (Button) findViewById(R.id.buttonNA);
        mPAbilityButton = (Button) findViewById(R.id.buttonPA);
        mAbilityImageView = (ImageView) findViewById(R.id.abilityImageView);


        mAbilityCount = mAbilities[mCurrentIndex].getmNumberOfMovesResId();
        mAbilityImageView.setImageResource(mAbilities[mCurrentIndex].getmQImageResId());

        final SharedPreferences sharedPref = this.getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE);
        mClickCount = sharedPref.getInt("currentAb", mClickCount);
        previousHero = sharedPref.getInt("prevHero", previousHero);

        if (previousHero != mCurrentIndex) {
        mClickCount = 0;
        }

        update(mClickCount);

        mNAbilityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mClickCount = (mClickCount + 1) % mAbilityCount;

                update(mClickCount);
            }
        });

        mPAbilityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mClickCount = (mClickCount - 1);


                if (mClickCount == -1)
                    mClickCount = (mAbilityCount - 1);

                //update all text fields and the image view based on current state
                update(mClickCount);
            }
        });

    }

    private void update(int n) {
        //set the ImageView with the current image
        //recall: we are saving resource IDs in the Heroes class
        int temp1, temp2, temp3;

        if (n == 0)
            mAbilityImageView.setImageResource(mAbilities[mCurrentIndex].getmQImageResId());
        if (n == 1)
            mAbilityImageView.setImageResource(mAbilities[mCurrentIndex].getmWImageResId());
        if (n == 2)
            mAbilityImageView.setImageResource(mAbilities[mCurrentIndex].getmEImageResId());
        if (n == 3)
            mAbilityImageView.setImageResource(mAbilities[mCurrentIndex].getmRImageResId());
        if (n == 4) {
            temp1 = mAbilities[mCurrentIndex].getmDImageResId();
            temp2 = mAbilities[mCurrentIndex].getmFImageResId();
            temp3 = mAbilities[mCurrentIndex].getmW2ImageResId();
            if (temp1 != 0) mAbilityImageView.setImageResource(temp1);
            else if (temp2 !=0) mAbilityImageView.setImageResource(temp2);
            else if(temp3 != 0) mAbilityImageView.setImageResource(temp3);
        }
        if (n == 5) {
            temp1 = mAbilities[mCurrentIndex].getmDImageResId();
            temp2 = mAbilities[mCurrentIndex].getmFImageResId();
            temp3 = mAbilities[mCurrentIndex].getmW2ImageResId();
            if (temp1 != 0) mAbilityImageView.setImageResource(temp2);
            else if (temp2 !=0) mAbilityImageView.setImageResource(temp3);
            else if(temp3 != 0) mAbilityImageView.setImageResource(temp1);
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();


        previousHero = mCurrentIndex;
        SharedPreferences sharedPref = this.getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("currentAb", mClickCount);
        editor.putInt("prevHero", previousHero);
        editor.apply();
    }

}
