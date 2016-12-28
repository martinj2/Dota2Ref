package com.example.jenniemartin.dota2ref;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import static com.example.jenniemartin.dota2ref.SettingsActivity.wasSettingsResetClicked;

public class BestGameActivity extends AppCompatActivity {

    private static final int REQUEST_CODE_SETTINGS = 0;


    //public static final int NUM_HEROES = 112;
    public static final String MY_PREFERENCES = "MyPreferences";

    int mCurrentIndex = 0;
    int spin = 0;

    private Spinner mHeroPromptSpinner;
    private EditText mKillsEditText;
    private EditText mDeathsEditText;
    private EditText mAssistsEditText;
    private TextView mGPMValueTextView;
    private TextView mXPPMValueTextView;
    private SeekBar mGPMSeekBar;
    private SeekBar mXPPMSeekBar;
    private Spinner mLanedInSpinner;
    private Spinner mLanedWSpinner;
    private EditText mDateEditText;
    private Button mSaveButton;
    private RadioButton mWinRadioButton;
    private RadioButton mLossRadioButton;
    private RadioButton mDireRadioButton;
    private RadioButton mRadiantRadioButton;
    private Button mSelectButton;
    private TextView mHeroSelectionTextView;
    private Button mMainMenuButton;
    private ImageButton mSettingsButton;


    //fixed array with the all heroes from DOTA 2 in alphabetical order
    private final Heroes[] mHeroes = new Heroes[]{
            new Heroes(R.drawable.abaddon, R.string.abad_name, R.string.abad_aka, R.string.abad_quote, R.string.role_c, R.string.str_type, R.string.abad_lore,R.raw.abad_begin_02),
            new Heroes(R.drawable.alchemist, R.string.alch_name,R.string.alch_aka, R.string.alch_quote, R.string.role_c, R.string.str_type,R.string.alch_lore,R.raw.alch_respawn_06),
            new Heroes(R.drawable.ancientapparition,R.string.aa_name,R.string.aa_aka,R.string.ancientapp_quote,R.string.role_s, R.string.int_type,R.string.aa_lore,R.raw.appa_rare_01),
            new Heroes(R.drawable.antimage,R.string.am_name,R.string.none_aka,R.string.antimage_quote,R.string.role_c,R.string.agi_type,R.string.antimage_lore,R.raw.anti_kill_12),
            new Heroes(R.drawable.arcwarden,R.string.aw_name,R.string.aw_aka,R.string.arcward_quote,R.string.role_c, R.string.agi_type,R.string.arcward_lore,R.raw.arcwar_rare_02),
            new Heroes(R.drawable.axe,R.string.axe_name,R.string.axe_aka,R.string.axe_quote,R.string.role_c,R.string.str_type,R.string.axe_lore,R.raw.axe_respawn_06),
            new Heroes(R.drawable.bane,R.string.bane_name,R.string.bane_aka,R.string.bane_quote,R.string.role_s,R.string.int_type,R.string.bane_lore,R.raw.bane_respawn_10),
            new Heroes(R.drawable.batrider,R.string.br_name,R.string.none_aka,R.string.bat_quote,R.string.role_s,R.string.int_type,R.string.batrider_lore,R.raw.bat_kill_15),
            new Heroes(R.drawable.beastmaster,R.string.bm_name,R.string.bm_aka,R.string.beast_quote,R.string.role_s, R.string.str_type,R.string.beast_lore,R.raw.beas_rare_02),
            new Heroes(R.drawable.bloodseeker,R.string.bs_name,R.string.bs_aka,R.string.bloodseek_quote,R.string.role_c, R.string.agi_type,R.string.bloodseeker_lore,R.raw.blod_rare_02),
            new Heroes(R.drawable.bountyhunter,R.string.bh_name,R.string.bh_aka,R.string.bounty_quote,R.string.role_s, R.string.agi_type,R.string.bounty_lore,R.raw.bount_battlebegins_01),
            new Heroes(R.drawable.brewmaster,R.string.brew_name,R.string.brew_aka,R.string.brew_quote,R.string.role_c,R.string.str_type,R.string.brewmaster_lore,R.raw.brew_firstblood_01),
            new Heroes(R.drawable.bristleback,R.string.brist_name,R.string.brist_aka,R.string.bristle_quote,R.string.role_c,R.string.str_type,R.string.bristle_lore,R.raw.bristle_rare_01),
            new Heroes(R.drawable.broodmother,R.string.brood_name,R.string.brood_aka,R.string.brood_quote,R.string.role_c, R.string.agi_type,R.string.brood_lore, R.raw.broo_ability_spawn_02),
            new Heroes(R.drawable.centaurwarrunner,R.string.centwar_name,R.string.centwar_aka,R.string.centwar_quote,R.string.role_c,R.string.str_type,R.string.centaurwar_lore,R.raw.cent_ally_19),
            new Heroes(R.drawable.chaosknight,R.string.ck_name,R.string.none_aka,R.string.chaoskn_quote,R.string.role_c,R.string.str_type,R.string.chaos_lore,R.raw.chaknight_rare_03),
            new Heroes(R.drawable.chen,R.string.chen_name,R.string.chen_aka,R.string.chen_quote,R.string.role_s,R.string.int_type,R.string.chen_lore,R.raw.chen_rare_02),
            new Heroes(R.drawable.clinkz,R.string.clin_name,R.string.clin_aka,R.string.clinkz_quote,R.string.role_c, R.string.agi_type,R.string.clinkz_lore,R.raw.clinkz_move_12),
            new Heroes(R.drawable.clockwerk,R.string.cw_name,R.string.cw_aka,R.string.clock_quote,R.string.role_s, R.string.str_type,R.string.clock_lore,R.raw.ratt_rare_02),
            new Heroes(R.drawable.crystalmaiden,R.string.cm_name,R.string.cm_aka,R.string.crystal_quote,R.string.role_s, R.string.int_type,R.string.crystal_lore,R.raw.cm_rare_01),
            new Heroes(R.drawable.darkseer,R.string.ds_name,R.string.ds_aka,R.string.darkseer_quote,R.string.role_s, R.string.int_type,R.string.darkseer_lore,R.raw.dkseer_spawn_03),
            new Heroes(R.drawable.dazzle,R.string.daz_name,R.string.daz_aka,R.string.dazzle_quote,R.string.role_s, R.string.int_type, R.string.dazzle_lore,R.raw.dazz_ability_shadowave_03),
            new Heroes(R.drawable.deathprophet, R.string.dp_name, R.string.dp_aka, R.string.dp_quote, R.string.role_c, R.string.int_type,R.string.dp_lore,R.raw.dpro_spawn_02),
            new Heroes(R.drawable.disruptor,R.string.dis_name,R.string.dis_aka,R.string.disrupt_quote,R.string.role_s, R.string.int_type,R.string.disruptor_lore,R.raw.dis_rare_01),
            new Heroes(R.drawable.doom,R.string.doom_name,R.string.doom_aka,R.string.doom_quote,R.string.role_c,R.string.str_type,R.string.doom_lore,R.raw.doom_rare_01),
            new Heroes(R.drawable.dragonknight,R.string.dk_name,R.string.dk_aka,R.string.dragonkn_quote,R.string.role_c,R.string.str_type,R.string.dragonknight_lore,R.raw.dk_drag_respawn_04),
            new Heroes(R.drawable.drowranger,R.string.drow_name,R.string.drow_aka,R.string.drow_quote,R.string.role_c, R.string.agi_type,R.string.drow_lore,R.raw.dro_rare_02),
            new Heroes(R.drawable.earthspirit,R.string.es_name,R.string.es_aka,R.string.earthsp_quote,R.string.role_s,R.string.str_type,R.string.earthspirit_lore,R.raw.earthspi_battlebegins_01),
            new Heroes(R.drawable.earthshaker,R.string.earth_name,R.string.earth_aka,R.string.earthshake_quote,R.string.role_s, R.string.str_type,R.string.earthshake_lore,R.raw.erth_rare_05),
            new Heroes(R.drawable.eldertitan,R.string.et_name,R.string.et_aka,R.string.eldertit_quote,R.string.role_s, R.string.str_type,R.string.eldertitan_lore,R.raw.elder_battlebegins_03),
            new Heroes(R.drawable.emberspirit,R.string.emb_name,R.string.emb_aka,R.string.ember_quote,R.string.role_c, R.string.agi_type,R.string.ember_lore,R.raw.embr_move_02),
            new Heroes(R.drawable.enchantress,R.string.ench_name,R.string.ench_aka,R.string.enchant_quote,R.string.role_s, R.string.int_type,R.string.enchantress_lore,R.raw.ench_rare_01),
            new Heroes(R.drawable.enigma,R.string.enig_name,R.string.none_aka,R.string.enigma_quote,R.string.role_s, R.string.int_type,R.string.enigma_lore,R.raw.enig_rare_05),
            new Heroes(R.drawable.facelessvoid,R.string.faceless_name,R.string.faceless_aka,R.string.faceless_quote,R.string.role_c,R.string.agi_type,R.string.faceless_lore,R.raw.face_spawn_04),
            new Heroes(R.drawable.gyrocopter,R.string.gyro_name,R.string.gyro_aka,R.string.gyro_quote,R.string.role_c, R.string.agi_type,R.string.gyro_lore,R.raw.gyro_begins_02),
            new Heroes(R.drawable.huskar,R.string.huskar_name,R.string.huskar_aka,R.string.huskar_quote,R.string.role_c, R.string.str_type,R.string.huskar_lore,R.raw.husk_rare_03),
            new Heroes(R.drawable.invoker,R.string.inv_name,R.string.none_aka,R.string.invoker_quote,R.string.role_c, R.string.int_type,R.string.invoker_lore,R.raw.invo_level_05),
            new Heroes(R.drawable.io,R.string.io_name,R.string.io_aka,R.string.io_quote,R.string.role_s, R.string.str_type,R.string.io_lore,R.raw.wisp_ally),
            new Heroes(R.drawable.jakiro,R.string.jak_name,R.string.jak_aka,R.string.jak_quote, R.string.role_s,R.string.int_type,R.string.jakiro_lore,R.raw.jak_spawn_05),
            new Heroes(R.drawable.juggernaut,R.string.jug_name,R.string.jug_aka,R.string.jugg_quote,R.string.role_c, R.string.agi_type,R.string.jugg_lore,R.raw.jug_rare_09),
            new Heroes(R.drawable.keeperofthelight,R.string.kol_name,R.string.kol_aka,R.string.keeper_quote,R.string.role_s,R.string.int_type,R.string.keeper_lore,R.raw.keep_rare_04),
            new Heroes(R.drawable.kunkka,R.string.kun_name,R.string.kun_aka,R.string.kunkka_quote,R.string.role_c, R.string.str_type,R.string.kunkka_lore,R.raw.kunk_spawn_05),
            new Heroes(R.drawable.legioncommander,R.string.lc_name, R.string.lc_aka,R.string.lc_quote,  R.string.role_c, R.string.agi_type, R.string.lc_lore,R.raw.legcom_begin_01),
            new Heroes(R.drawable.leshrac, R.string.lesh_name,R.string.lesh_aka,R.string.leshrac_quote,R.string.role_c, R.string.int_type,R.string.leshrac_lore,R.raw.lesh_attack_09),
            new Heroes(R.drawable.lich,R.string.lich_name,R.string.lich_aka,R.string.lich_quote,R.string.role_s, R.string.int_type, R.string.lich_lore,R.raw.lich_rare_01),
            new Heroes(R.drawable.lifestealer,R.string.ls_name,R.string.ls_aka,R.string.lifesteal_quote,R.string.role_c, R.string.str_type,R.string.lifestealer_lore,R.raw.lifest_begin_01),
            new Heroes(R.drawable.lina,R.string.lina_name,R.string.lina_aka,R.string.lina_quote,R.string.role_c, R.string.int_type, R.string.lina_lore,R.raw.lina_rare_04),
            new Heroes(R.drawable.lion,R.string.lion_name,R.string.lion_aka,R.string.lion_quote,R.string.role_s, R.string.int_type,R.string.lion_lore,R.raw.lion_spawn_06),
            new Heroes(R.drawable.lonedruid,R.string.ldruid_name,R.string.ldruid_aka,R.string.lonedruid_quote,R.string.role_c, R.string.agi_type,R.string.lonedruid_lore,R.raw.lone_druid_rare_03),
            new Heroes(R.drawable.luna,R.string.luna_name,R.string.luna_aka,R.string.luna_quote,R.string.role_c, R.string.agi_type,R.string.luna_lore,R.raw.luna_rare_03),
            new Heroes(R.drawable.lycan,R.string.lycan_name,R.string.lycan_aka,R.string.lycan_quote,R.string.role_c, R.string.str_type,R.string.lycan_lore,R.raw.lycan_attack_05),
            new Heroes(R.drawable.magnus,R.string.mag_name,R.string.mag_aka,R.string.magnus_quote,R.string.role_c, R.string.str_type,R.string.magnus_lore,R.raw.magn_rare_04),
            new Heroes(R.drawable.medusa,R.string.med_name,R.string.med_aka,R.string.medusa_quote,R.string.role_c, R.string.agi_type,R.string.medusa_lore,R.raw.medus_rare_07),
            new Heroes(R.drawable.meepo,R.string.meepo_name,R.string.meepo_aka,R.string.meepo_quote,R.string.role_c, R.string.agi_type,R.string.meepo_lore,R.raw.meepo_rare_03),
            new Heroes(R.drawable.mirana,R.string.mirana_name,R.string.mirana_aka,R.string.mirana_quote,R.string.role_c, R.string.agi_type,R.string.mirana_lore,R.raw.mir_rare_10),
            new Heroes(R.drawable.morphling,R.string.morp_name,R.string.none_aka,R.string.morph_quote,R.string.role_c, R.string.agi_type,R.string.morph_lore,R.raw.mrph_rare_02),
            new Heroes(R.drawable.nagasiren,R.string.naga_name,R.string.naga_aka,R.string.naga_quote,R.string.role_c, R.string.agi_type,R.string.naga_lore,R.raw.naga_spawn_05),
            new Heroes(R.drawable.naturesprophet,R.string.np_name,R.string.none_aka,R.string.naturep_quote,R.string.role_c, R.string.int_type,R.string.natureprop_lore,R.raw.furi_rare_02),
            new Heroes(R.drawable.necrophos,R.string.necro_name,R.string.necro_aka,R.string.necro_quote,R.string.role_c, R.string.int_type,R.string.necro_lore,R.raw.necr_spawn_04),
            new Heroes(R.drawable.nightstalker,R.string.night_name, R.string.night_aka,R.string.night_quote, R.string.role_c, R.string.str_type, R.string.night_lore,R.raw.nstalk_move_08),
            new Heroes(R.drawable.nyxassassin,R.string.nyx_name,R.string.none_aka,R.string.nyx_quote,R.string.role_s, R.string.agi_type,R.string.nyx_lore,R.raw.nyx_rare_04),
            new Heroes(R.drawable.ogremagi,R.string.ogre_name,R.string.ogre_aka,R.string.ogremag_quote,R.string.role_s, R.string.int_type,R.string.ogremagi_lore,R.raw.ogmag_ability_multi_09),
            new Heroes(R.drawable.omniknight,R.string.omni_name,R.string.omni_aka,R.string.omni_quote,R.string.role_s,R.string.str_type,R.string.omni_lore,R.raw.omni_respawn_10),
            new Heroes(R.drawable.oracle,R.string.oracle_name,R.string.oracle_aka,R.string.oracle_quote,R.string.role_s, R.string.int_type,R.string.oracle_lore,R.raw.orac_cast_02),
            new Heroes(R.drawable.outworlddevourer,R.string.od_name,R.string.od_aka,R.string.outworld_quote,R.string.role_c, R.string.int_type,R.string.outworld_lore,R.raw.odest_begin_01),
            new Heroes(R.drawable.phantomassassin,R.string.pa_name,R.string.pa_aka,R.string.pa_quote,R.string.role_c, R.string.agi_type,R.string.pa_lore,R.raw.phass_spawn_05),
            new Heroes(R.drawable.phantomlancer,R.string.pl_name,R.string.pl_aka,R.string.pl_quote,R.string.role_c, R.string.agi_type,R.string.pl_lore,R.raw.plance_kill_10),
            new Heroes(R.drawable.phoenix,R.string.pho_name,R.string.none_aka,R.string.phoenix_quote,R.string.role_s, R.string.str_type,R.string.phoenix_lore,R.raw.phoenix_bird_victory),
            new Heroes(R.drawable.puck,R.string.puck_name,R.string.puck_aka,R.string.puck_quote,R.string.role_s, R.string.int_type,R.string.puck_lore,R.raw.puck_rare_01),
            new Heroes(R.drawable.pudge,R.string.pudge_name,R.string.pudge_aka,R.string.pudge_quote,R.string.role_s, R.string.str_type,R.string.pudge_lore,R.raw.pud_rare_02),
            new Heroes(R.drawable.pugna,R.string.pugna_name,R.string.none_aka,R.string.pugna_quote,R.string.role_s, R.string.int_type,R.string.pugna_lore,R.raw.pugna_level_03),
            new Heroes(R.drawable.queenofpain,R.string.qp_name,R.string.qp_aka,R.string.qp_quote,R.string.role_c, R.string.int_type,R.string.qp_lore,R.raw.pain_rare_03),
            new Heroes(R.drawable.razor,R.string.razor_name,R.string.razor_aka,R.string.razor_quote,R.string.role_c, R.string.agi_type,R.string.razor_lore,R.raw.raz_rare_01),
            new Heroes(R.drawable.riki,R.string.riki_name,R.string.riki_aka,R.string.riki_quote,R.string.role_c, R.string.agi_type,R.string.riki_lore,R.raw.riki_rare_03),
            new Heroes(R.drawable.rubick,R.string.rubick_name,R.string.rubick_aka,R.string.rubick_quote,R.string.role_s, R.string.int_type,R.string.rubick_lore,R.raw.rubick_move_21),
            new Heroes(R.drawable.sandking,R.string.sk_name,R.string.sk_aka,R.string.sand_quote,R.string.role_s, R.string.str_type,R.string.sand_lore,R.raw.skg_rare_02),
            new Heroes(R.drawable.shadowdemon,R.string.sd_name,R.string.none_aka,R.string.shadowdem_quote,R.string.role_s, R.string.int_type,R.string.shadowd_lore,R.raw.shadow_demon_respawn_08),
            new Heroes(R.drawable.shadowfiend,R.string.sf_name,R.string.sf_aka,R.string.shadowfiend_quote,R.string.role_c, R.string.agi_type,R.string.shadowf_lore,R.raw.nev_rare_05),
            new Heroes(R.drawable.shadowshaman,R.string.ss_name,R.string.ss_aka,R.string.shadowsha_quote,R.string.role_s, R.string.int_type,R.string.shadows_lore,R.raw.shad_rare_02),
            new Heroes(R.drawable.silencer,R.string.silencer_name,R.string.silencer_aka,R.string.silencer_quote,R.string.role_c, R.string.int_type,R.string.silencer_lore,R.raw.silen_kill_07),
            new Heroes(R.drawable.skywrathmage,R.string.sky_name,R.string.sky_aka,R.string.skywrath_quote,R.string.role_s, R.string.int_type,R.string.skywrath_lore,R.raw.drag_kill_02),
            new Heroes(R.drawable.slardar,R.string.slardar_name,R.string.slardar_aka,R.string.slardar_quote,R.string.role_c, R.string.str_type,R.string.slardar_lore,R.raw.slar_rare_01),
            new Heroes(R.drawable.slark,R.string.slark_name,R.string.slark_aka,R.string.slark_quote,R.string.role_c, R.string.agi_type,R.string.slark_lore,R.raw.slark_spawn_04),
            new Heroes(R.drawable.sniper,R.string.sniper_name,R.string.sniper_aka,R.string.sniper_quote,R.string.role_c, R.string.agi_type,R.string.sniper_lore,R.raw.snip_kill_08),
            new Heroes(R.drawable.spectre,R.string.spectre_name,R.string.spectre_aka,R.string.spectre_quote,R.string.role_c, R.string.agi_type,R.string.spectre_lore,R.raw.spec_rare_01),
            new Heroes(R.drawable.spiritbreaker,R.string.sb_name,R.string.sb_aka,R.string.spiritbreak_quote,R.string.role_c, R.string.str_type,R.string.spiritbreak_lore,R.raw.spir_kill_05),
            new Heroes(R.drawable.stormspirit,R.string.storm_name, R.string.storm_aka,R.string.storm_quote, R.string.role_c, R.string.int_type, R.string.storm_lore,R.raw.ss_rare_03),
            new Heroes(R.drawable.sven,R.string.sven_name,R.string.sven_aka,R.string.sven_quote,R.string.role_c, R.string.str_type,R.string.sven_lore,R.raw.sven_rare_01),
            new Heroes(R.drawable.techies,R.string.techies_name,R.string.techies_aka,R.string.techies_quote,R.string.role_s, R.string.int_type,R.string.techies_lore,R.raw.tech_begin_01),
            new Heroes(R.drawable.templarassassin,R.string.templar_name,R.string.templar_aka,R.string.templar_quote,R.string.role_c,R.string.agi_type,R.string.templar_lore,R.raw.temp_rare_01),
            new Heroes(R.drawable.terrorblade,R.string.tb_name,R.string.tb_aka,R.string.terrorblade_quote,R.string.role_c, R.string.agi_type,R.string.terrorblade_lore,R.raw.terr_spawn_03),
            new Heroes(R.drawable.tidehunter,R.string.tideh_name,R.string.tideh_aka,R.string.tidehunter_quote,R.string.role_s, R.string.str_type,R.string.tidehunter_lore,R.raw.tide_attack_09),
            new Heroes(R.drawable.timbersaw,R.string.tsaw_name,R.string.tsaw_aka,R.string.timbersaw_quote,R.string.role_c, R.string.str_type,R.string.timbersaw_lore,R.raw.timb_spawn_05),
            new Heroes(R.drawable.tinker,R.string.tinker_name,R.string.tinker_aka,R.string.tinker_quote,R.string.role_c, R.string.int_type,R.string.tinker_lore,R.raw.tink_kill_05),
            new Heroes(R.drawable.tiny,R.string.tiny_name,R.string.tiny_aka,R.string.tiny_quote,R.string.role_c, R.string.str_type,R.string.tiny_lore,R.raw.tiny_rare_03),
            new Heroes(R.drawable.treantprotector,R.string.tp_name,R.string.tp_aka,R.string.treant_quote,R.string.role_s, R.string.str_type,R.string.treant_lore,R.raw.treant_rare_01),
            new Heroes(R.drawable.trollwarlord,R.string.tw_name,R.string.tw_aka,R.string.trollwar_quote,R.string.role_c, R.string.agi_type,R.string.trollwar_lore,R.raw.troll_ally_09),
            new Heroes(R.drawable.tusk,R.string.tusk_name,R.string.tusk_aka,R.string.tusk_quote,R.string.role_c, R.string.str_type,R.string.tusk_lore,R.raw.tusk_rare_03),
            new Heroes(R.drawable.underlord,R.string.under_name,R.string.under_aka,R.string.underlord_quote,R.string.role_s, R.string.str_type,R.string.underlord_lore,R.raw.abys_rare_02),
            new Heroes(R.drawable.undying,R.string.undying_name,R.string.undying_aka,R.string.undying_quote,R.string.role_s, R.string.str_type,R.string.undying_lore,R.raw.undying_rare_02),
            new Heroes(R.drawable.ursa,R.string.ursa_name,R.string.ursa_aka,R.string.ursa_quote,R.string.role_c, R.string.agi_type,R.string.ursa_lore,R.raw.ursa_spawn_04),
            new Heroes(R.drawable.vengefulspirit,R.string.vs_name,R.string.vs_aka,R.string.vengeful_quote,R.string.role_s, R.string.agi_type,R.string.vengeful_lore,R.raw.vng_cast_04),
            new Heroes(R.drawable.venomancer,R.string.ven_name, R.string.ven_aka,R.string.venom_quote, R.string.role_s, R.string.agi_type, R.string.venomancer_lore,R.raw.venm_kill_07),
            new Heroes(R.drawable.viper,R.string.viper_name,R.string.viper_aka,R.string.viper_quote,R.string.role_c, R.string.agi_type,R.string.viper_lore,R.raw.vipe_kill_11),
            new Heroes(R.drawable.visage,R.string.visage_name,R.string.visage_aka,R.string.visage_quote,R.string.role_s, R.string.int_type,R.string.visage_lore,R.raw.visa_rare_04),
            new Heroes(R.drawable.warlock,R.string.warlock_name,R.string.warlock_aka,R.string.warlock_quote,R.string.role_s, R.string.int_type,R.string.warlock_lore,R.raw.warl_ability_reign_03),
            new Heroes(R.drawable.weaver,R.string.weaver_name,R.string.weaver_aka,R.string.weaver_quote,R.string.role_c, R.string.agi_type,R.string.weaver_lore,R.raw.weav_rare_02),
            new Heroes(R.drawable.windranger,R.string.wr_name,R.string.wr_aka,R.string.windranger_quote,R.string.role_c, R.string.int_type,R.string.windranger_lore,R.raw.wind_rare_02),
            new Heroes(R.drawable.winterwyvern,R.string.ww_name,R.string.ww_aka,R.string.winterwyv_quote,R.string.role_s, R.string.int_type,R.string.winterwyv_lore,R.raw.winwyv_spawn_05),
            new Heroes(R.drawable.witchdoctor,R.string.wd_name,R.string.wd_aka,R.string.witchdoc_quote,R.string.role_s, R.string.int_type,R.string.witchdoc_lore,R.raw.wdoc_attack_07),
            new Heroes(R.drawable.wraithking,R.string.wk_name,R.string.wk_aka,R.string.wraith_quote,R.string.role_c, R.string.str_type,R.string.wraith_lore,R.raw.wraith_rare_02),
            new Heroes(R.drawable.zeus,R.string.zeus_name,R.string.zeus_aka,R.string.zeus_quote,R.string.role_c, R.string.int_type,R.string.zeus_lore,R.raw.zeus_rare_02)
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_game);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        mHeroPromptSpinner = (Spinner) findViewById(R.id.heroPromptSpinner);
        mKillsEditText = (EditText) findViewById(R.id.editKillText);
        mDeathsEditText = (EditText) findViewById(R.id.editDeathText);
        mAssistsEditText = (EditText) findViewById(R.id.editAssistText);
        mGPMValueTextView = (TextView) findViewById(R.id.GPMValue);
        mXPPMValueTextView = (TextView) findViewById(R.id.XPPMValue);
        mGPMSeekBar = (SeekBar) findViewById(R.id.seekBarGPM);
        mXPPMSeekBar = (SeekBar) findViewById(R.id.seekBarXPPM);
        mLanedInSpinner = (Spinner) findViewById(R.id.laneSpinner);
        mLanedWSpinner = (Spinner) findViewById(R.id.laneHeroSpinner);
        mDateEditText = (EditText) findViewById(R.id.editDateText);
        mSaveButton = (Button) findViewById(R.id.saveButton);
        mWinRadioButton = (RadioButton) findViewById(R.id.radioButtonWin);
        mLossRadioButton = (RadioButton) findViewById(R.id.radioButtonLoss);
        mDireRadioButton = (RadioButton) findViewById(R.id.radioButtonDire);
        mRadiantRadioButton = (RadioButton) findViewById(R.id.radioButtonRadiant);
        mSelectButton = (Button) findViewById(R.id.selectButton);
        mHeroSelectionTextView = (TextView) findViewById(R.id.heroNameTextView);
        mMainMenuButton = (Button) findViewById(R.id.mainBestMenuButton);








        final SharedPreferences sharedPref = this.getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE);
        mCurrentIndex = sharedPref.getInt("currentChar", mCurrentIndex) - 1;

        if (mCurrentIndex <  0)
        {
            mCurrentIndex = 0;
            update();
        }
        else {

            for (int i = 0; i < 111; i++) {
                mHeroes[i].setmWinResId(sharedPref.getBoolean("winButton" + i, false));
                mHeroes[i].setmLossResId(sharedPref.getBoolean("lossButton" + i, false));
                mHeroes[i].setmDireResId(sharedPref.getBoolean("dire" + i, false));
                mHeroes[i].setmRadiantResId(sharedPref.getBoolean("radiant" + i, false));
                mHeroes[i].setmLanedWithResId(sharedPref.getInt("hero" + i, 0));
                mHeroes[i].setmGPMSeekResId(sharedPref.getInt("GPM" + i, 0));
                mHeroes[i].setmXPPMSeekResId(sharedPref.getInt("XP" + i, 0));
                mHeroes[i].setmLanedInResId(sharedPref.getInt("laned" + i, 0));
                mHeroes[i].setmDateResId(sharedPref.getString("date" + i, null));
                mHeroes[i].setmKillsResId(sharedPref.getString("kills" + i, null));
                mHeroes[i].setmDeathsResId(sharedPref.getString("deaths" + i, null));
                mHeroes[i].setmAssistsResId(sharedPref.getString("assists" + i, null));
            }
            //update all text fields and the image view based on current state
            update();
        }

        // Spinner click listener
        mHeroPromptSpinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View v, int position,
                                       long id) {
                // TODO Auto-generated method stub
                spin = position;
                if (spin > 0)
                    mHeroSelectionTextView.setText(mHeroes[(spin - 1)].getmNameResId());


            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }

        });


        //Selects the hero that the hero spinner is currently on to start saving data
        mSelectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentIndex = spin;
                update();


            }
        });

        //define the behavior of the Menu button
        mMainMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent back = new Intent(BestGameActivity.this, MainActivity.class);
                startActivity(back);
            }
        });

        //Sets the hero that the user laned with during their best game
        mLanedWSpinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {

            int current = 0;

            @Override
            public void onItemSelected(AdapterView<?> parent, View v, int position,
                                       long id) {
                // TODO Auto-generated method stub
                current = position;

                mHeroes[mCurrentIndex].setmLanedWithResId(current);


            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }

        });

        //Sets the lane that the user laned in during their best game
        mLanedInSpinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {

            int current = 0;

            @Override
            public void onItemSelected(AdapterView<?> parent, View v, int position,
                                       long id) {
                // TODO Auto-generated method stub
                current = position;

                mHeroes[mCurrentIndex].setmLanedInResId(current);



            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }

        });

        //Sets what happens upon Save Button click
        mSaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mHeroes[mCurrentIndex].setmDireResId(mDireRadioButton.isChecked());
                mHeroes[mCurrentIndex].setmRadiantResId(mRadiantRadioButton.isChecked());
                mHeroes[mCurrentIndex].setmWinResId(mWinRadioButton.isChecked());
                mHeroes[mCurrentIndex].setmLossResId(mLossRadioButton.isChecked());
                mHeroes[mCurrentIndex].setmAssistsResId((mAssistsEditText.getText()).toString());
                mHeroes[mCurrentIndex].setmKillsResId((mKillsEditText.getText()).toString());
                mHeroes[mCurrentIndex].setmDeathsResId((mDeathsEditText.getText()).toString());
                mHeroes[mCurrentIndex].setmDateResId((mDateEditText.getText()).toString());
                mHeroes[mCurrentIndex].setmGPMSeekResId(mGPMSeekBar.getProgress());
                mHeroes[mCurrentIndex].setmXPPMSeekResId(mXPPMSeekBar.getProgress());


            }
        });

        //GPM Listener that sets the progress of the textview
        mGPMSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progresValue, boolean fromUser) {
                progress = progresValue;
                // mHeroes[mCurrentIndex].setmGPMSeekResId(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                mGPMValueTextView.setText(progress + "/" + seekBar.getMax());
            }
        });

        //XPPM Listener that sets the progress of the textview
        mXPPMSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progresValue, boolean fromUser) {
                progress = progresValue;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                mXPPMValueTextView.setText(progress + "/" + seekBar.getMax());
            }
        });


    }

    private void update() {

        //updates all of the input fields

        mWinRadioButton.setChecked(mHeroes[mCurrentIndex].getmWinResId());
        mLossRadioButton.setChecked(mHeroes[mCurrentIndex].getmLossResId());

        mDireRadioButton.setChecked(mHeroes[mCurrentIndex].getmDireResId());
        mRadiantRadioButton.setChecked(mHeroes[mCurrentIndex].getmRadiantResId());

        mGPMSeekBar.setProgress(mHeroes[mCurrentIndex].getmGPMSeekResId());
        mXPPMSeekBar.setProgress(mHeroes[mCurrentIndex].getmXPPMSeekResId());

        String placeholder, placeholder1;
        placeholder = (mHeroes[mCurrentIndex].getmGPMSeekResId() + "/1000");
        mGPMValueTextView.setText(placeholder);

        placeholder1 = (mHeroes[mCurrentIndex].getmXPPMSeekResId() + "/1000");
        mXPPMValueTextView.setText(placeholder1);

        mLanedInSpinner.setSelection(mHeroes[mCurrentIndex].getmLanedInResId());
        mLanedWSpinner.setSelection(mHeroes[mCurrentIndex].getmLanedWithResId());

        mKillsEditText.setText(mHeroes[mCurrentIndex].getmKillsResId());
        mDeathsEditText.setText(mHeroes[mCurrentIndex].getmDeathsResId());
        mAssistsEditText.setText(mHeroes[mCurrentIndex].getmAssistsResId());
        mDateEditText.setText(mHeroes[mCurrentIndex].getmDateResId());
    }

    //Win and Loss Radio Buttons - checking for click activity
    public void onRadioButtonClicked(View MainActivity) {
        // Is the button now checked?
        boolean checked = ((RadioButton) MainActivity).isChecked();

        // Check which radio button was clicked
        switch (MainActivity.getId()) {
            case R.id.radioButtonWin:
                if (checked) {
                    mHeroes[mCurrentIndex].setmWinResId(true);
                    mHeroes[mCurrentIndex].setmLossResId(false);
                }

                break;
            case R.id.radioButtonLoss:
                if (checked) {
                    mHeroes[mCurrentIndex].setmWinResId(false);
                    mHeroes[mCurrentIndex].setmLossResId(true);
                }
                break;
        }
    }

    //Dire and Radiant Radio Buttons - checking for click activity
    public void onRadioButtonClicked1(View MainActivity) {
        // Is the button now checked?
        boolean checked = ((RadioButton) MainActivity).isChecked();

        // Check which radio button was clicked
        switch (MainActivity.getId()) {
            case R.id.radioButtonDire:
                if (checked) {
                    mHeroes[mCurrentIndex].setmDireResId(true);
                    mHeroes[mCurrentIndex].setmRadiantResId(false);
                }

                break;
            case R.id.radioButtonRadiant:
                if (checked) {
                    mHeroes[mCurrentIndex].setmDireResId(false);
                    mHeroes[mCurrentIndex].setmRadiantResId(true);
                }
                break;
        }
    }

    private void reset() {
        //clear all the user input fields back to the default

        mWinRadioButton.setChecked(false);
        mLossRadioButton.setChecked(false);
        mDireRadioButton.setChecked(false);
        mRadiantRadioButton.setChecked(false);
        mGPMSeekBar.setProgress(0);
        mXPPMSeekBar.setProgress(0);
        mHeroPromptSpinner.setSelection(0);
        mLanedWSpinner.setSelection(0);
        mLanedInSpinner.setSelection(0);
        mGPMValueTextView.setText("0/1000");
        mXPPMValueTextView.setText("0/1000");
        mKillsEditText.setText(0);
        mAssistsEditText.setText(0);
        mDeathsEditText.setText(0);
        mDateEditText.setText("11/27/2016");
        mHeroSelectionTextView.setText("");


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        update();


        //save all of the current inputted data upon activity destroy
        SharedPreferences sharedPref = this.getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("currentChar", mCurrentIndex);

        for (int i = 0; i < 111; i++) {
            editor.putBoolean("winButton" + i, mHeroes[i].getmWinResId());
            editor.putBoolean("lossButton" + i, mHeroes[i].getmLossResId());
            editor.putBoolean("radiant" + i, mHeroes[i].getmRadiantResId());
            editor.putBoolean("dire" + i, mHeroes[i].getmDireResId());
            editor.putInt("hero" + i, mHeroes[i].getmLanedWithResId());
            editor.putInt("XP" + i, mHeroes[i].getmXPPMSeekResId());
            editor.putInt("GPM" + i, mHeroes[i].getmGPMSeekResId());
            editor.putInt("laned" + i, mHeroes[i].getmLanedInResId());
            editor.putString("date" + i, mHeroes[i].getmDateResId());
            editor.putString("kills" +i, mHeroes[i].getmKillsResId());
            editor.putString("deaths" +i, mHeroes[i].getmDeathsResId());
            editor.putString("assists" +i, mHeroes[i].getmAssistsResId());
        }
        editor.apply();
    }



}


