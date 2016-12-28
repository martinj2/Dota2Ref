package com.example.jenniemartin.dota2ref;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static android.widget.Toast.LENGTH_SHORT;

public class ItemActivity extends AppCompatActivity {

    private ImageView mItemImageView;
    private TextView mItemNameTextView;
    private TextView mItemCostTextView;
    private TextView mItemBoughtTextView;
    private TextView mItemAbilityTextView;
    private TextView mItemBonusTextView;
    private TextView mItemDescriptionTextView;
    private RadioButton mItemDissRadioButton;
    private RadioButton mItemAlliesRadioButton;
    private Button mPreviousItemButton;
    private Button mNextItemButton;
    private ImageButton mQuestionButton;
    private ImageButton mMenuButton;

    private int mCurrentItemIndex = 0;

    public static final String MY_PREFERENCES = "MyPreferences";

    private final Item[] mItems = new Item[]{
            new Item(R.drawable.abyssalblade,R.string.ab_item_name, R.string.ab_cost, R.string.bfrom_weapons_option,R.string.abyssal_ability, R.string.abyssal_bonus,R.string.abyss_desc,true,false),
            new Item(R.drawable.aetherlens,R.string.al_item_name,R.string.al_cost,R.string.brom_caster_option,R.string.aether_ability,R.string.aether_bonus,R.string.aether_desc,false,false),
            new Item(R.drawable.aghanimsscepter,R.string.as_item_name,R.string.as_cost,R.string.brom_caster_option,R.string.ags_ability,R.string.ags_bonus,R.string.ags_desc,false,false),
            new Item(R.drawable.animalcourier,R.string.animcour_item_name,R.string.animcour_cost,R.string.bfrom_consum_option,R.string.courier_ability,R.string.none_bonus,R.string.anim_desc,false,false),
            new Item(R.drawable.arcaneboots,R.string.aboots_item_name,R.string.aboots_cost,R.string.bfrom_supp_option,R.string.arcane_ability,R.string.arcboots_bonus,R.string.arcane_desc,true, true),
            new Item(R.drawable.armletofmordiggian,R.string.am_item_name,R.string.am_cost,R.string.bfrom_weapons_option,R.string.armletmord_ability,R.string.armletmord_bonus,R.string.armlet_desc,false,false),
            new Item(R.drawable.assaultcuirass,R.string.acuirass_item_name,R.string.acuirass_cost,R.string.brom_armor_option,R.string.assaultc_ability,R.string.assaultcuir_bonus,R.string.acuirass_desc,false,false),
            new Item(R.drawable.bandofelvenskin,R.string.be_item_name,R.string.be_cost,R.string.bfrom_att_option,R.string.none_ability,R.string.bandelven_bonus,R.string.belven_desc,false,false),
            new Item(R.drawable.battlefury,R.string.bfury_item_name,R.string.bfury_cost,R.string.bfrom_weapons_option,R.string.bfury_ability,R.string.bfury_bonus,R.string.bfury_desc,false,false),
            new Item(R.drawable.beltofstrength,R.string.bstrength_item_name,R.string.bstrength_cost,R.string.bfrom_att_option,R.string.none_ability,R.string.beltstren_bonus,R.string.bstrength_desc,false,false),
            new Item(R.drawable.blackkingbar,R.string.bkb_item_name,R.string.bkb_cost,R.string.brom_armor_option,R.string.bkb_ability,R.string.bkb_bonus,R.string.bkb_desc,false,false),
            new Item(R.drawable.blademail,R.string.bmail_item_name,R.string.bmail_cost,R.string.brom_armor_option,R.string.bmail_ability,R.string.blademail_bonus,R.string.bmail_desc,false,false),
            new Item(R.drawable.bladeofalacrity,R.string.balacrity_item_name,R.string.balacrity_cost,R.string.bfrom_att_option,R.string.none_ability,R.string.bladealac_bonus,R.string.alacr_desc,false,false),
            new Item(R.drawable.bladesofattack,R.string.battack_item_name,R.string.battack_cost,R.string.bfrom_arm_option,R.string.none_ability,R.string.bladesattack_bonus,R.string.battack_desc,false,false),
            new Item(R.drawable.blightstone,R.string.bstone_item_name,R.string.bstone_cost,R.string.bfrom_arm_option,R.string.bstone_ability,R.string.none_bonus,R.string.bstone_desc,false,false),
            new Item(R.drawable.blinkdagger,R.string.blink_item_name,R.string.blink_cost,R.string.bfrom_arc_option,R.string.bdagger_ability,R.string.none_bonus,R.string.blink_desc,false,false),
            new Item(R.drawable.bloodstone,R.string.bloodstone_item_name,R.string.bloodstone_cost,R.string.brom_armor_option,R.string.bloodstone_ability,R.string.bloodstone_bonus,R.string.blood_desc,false,false),
            new Item(R.drawable.bloodthorn,R.string.bloodthorn_item_name,R.string.bloodthorn_cost,R.string.bfrom_weapons_option,R.string.bloodthorn_ability,R.string.bloodthorn_bonus,R.string.bthorn_desc,false,false),
            new Item(R.drawable.bootsofspeed,R.string.bootsspeed_item_name,R.string.bootsspeed_cost,R.string.bfrom_arc_option,R.string.none_ability,R.string.bootsspeed_bonus,R.string.bspeed_desc,false,false),
            new Item(R.drawable.bootsoftravel,R.string.bootstravel_item_name,R.string.bootstravel_cost,R.string.bfrom_com_option,R.string.bootstrav_ability,R.string.bootstrav_bonus,R.string.btravel_desc,false,false),
            new Item(R.drawable.bottle,R.string.bottle_item_name,R.string.bottle_cost,R.string.bfrom_consum_option,R.string.bottle_ability,R.string.none_bonus,R.string.bottle_desc,false,false),
            new Item(R.drawable.bracer,R.string.bracer_item_name,R.string.bracer_cost,R.string.bfrom_com_option,R.string.none_ability,R.string.bracer_bonus,R.string.bracer_desc,false,false),
            new Item(R.drawable.broadsword,R.string.broadsw_item_name,R.string.broadsw_cost,R.string.bfrom_arm_option,R.string.none_ability,R.string.broadsw_bonus,R.string.broads_desc,false,false),
            new Item(R.drawable.buckler,R.string.buckler_item_name,R.string.buckler_cost,R.string.bfrom_supp_option,R.string.buckler_ability,R.string.buckler_bonus,R.string.buckler_desc,false,false),
            new Item(R.drawable.butterfly,R.string.butterfly_item_name,R.string.butterfly_cost,R.string.bfrom_weapons_option,R.string.bfly_ability,R.string.butterfly_bonus,R.string.bfly_desc,false,false),
            new Item(R.drawable.chainmail,R.string.chainmail_item_name,R.string.chainmail_cost,R.string.bfrom_arm_option,R.string.none_ability,R.string.chainmail_bonus,R.string.chain_desc,false,false),
            new Item(R.drawable.circlet,R.string.circlet_item_name,R.string.circlet_cost,R.string.bfrom_att_option,R.string.none_ability,R.string.circlet_bonus,R.string.circle_desc,false,false),
            new Item(R.drawable.clarity,R.string.clarity_item_name,R.string.clarity_cost,R.string.bfrom_consum_option,R.string.clarity_ability,R.string.none_bonus,R.string.clarity_desc,false,false),
            new Item(R.drawable.claymore,R.string.claym_item_name,R.string.claym_cost,R.string.bfrom_arm_option,R.string.none_ability,R.string.claymore_bonus,R.string.clay_desc,false,false),
            new Item(R.drawable.cloak,R.string.cloak_item_name,R.string.cloak_cost,R.string.bfrom_arc_option,R.string.none_ability,R.string.cloak_bonus,R.string.cloak_desc,false,false),
            new Item(R.drawable.crimsonguard,R.string.cguard_item_name,R.string.cguard_cost,R.string.brom_armor_option,R.string.crimsong_ability,R.string.crimsguard_bonus,R.string.crimson_desc,false,true),
            new Item(R.drawable.crystalys,R.string.crystaly_item_name,R.string.crystaly_cost,R.string.bfrom_weapons_option,R.string.crystal_ability,R.string.crystal_bonus,R.string.crystal_desc,false,false),
            new Item(R.drawable.daedalus,R.string.daed_item_name,R.string.daed_cost,R.string.bfrom_weapons_option,R.string.daed_ability,R.string.daed_bonus,R.string.daed_desc,false,false),
            new Item(R.drawable.dagon,R.string.dagon_item_name,R.string.dagon_cost,R.string.brom_caster_option,R.string.dagon_ability,R.string.dagon_bonus,R.string.dagon_desc,false,false),
            new Item(R.drawable.demonedge,R.string.dedge_item_name,R.string.dedge_cost,R.string.bfrom_sshop_option,R.string.none_ability,R.string.demonedge_bonus,R.string.dedge_desc,false,false),
            new Item(R.drawable.desolator,R.string.deso_item_name,R.string.deso_cost,R.string.bfrom_art_option,R.string.deso_ability,R.string.deso_bonus,R.string.deso_desc,false,false),
            new Item(R.drawable.diffusalblade,R.string.diffblade_item_name,R.string.diffblade_cost,R.string.bfrom_art_option,R.string.diffblade_ability,R.string.diffblade_bonus,R.string.diff_desc,false,false),
            new Item(R.drawable.divinerapier,R.string.rapier_item_name,R.string.rapier_cost,R.string.bfrom_weapons_option,R.string.none_ability,R.string.divine_bonus,R.string.divine_desc,false,false),
            new Item(R.drawable.dragonlance,R.string.dlance_item_name,R.string.dlance_cost,R.string.bfrom_art_option,R.string.dragonla_ability,R.string.dragonlance_bonus,R.string.dlance_desc,true,false),
            new Item(R.drawable.drumofendurance,R.string.drum_item_name,R.string.drum_cost,R.string.bfrom_supp_option,R.string.drum_ability,R.string.drum_bonus,R.string.drum_desc,false,false),
            new Item(R.drawable.dust,R.string.dust_item_name,R.string.dust_cost,R.string.bfrom_consum_option,R.string.dust_ability,R.string.none_bonus,R.string.dust_desc,false,false),
            new Item(R.drawable.eaglesong,R.string.eagle_item_name,R.string.eagle_cost,R.string.bfrom_sshop_option,R.string.none_ability,R.string.eaglesong_bonus,R.string.eagle_desc,false,false),
            new Item(R.drawable.echosabre,R.string.echo_item_name,R.string.echo_cost,R.string.bfrom_art_option,R.string.echosabre_ability,R.string.echosabre_bonus,R.string.echo_desc,false,false),
            new Item(R.drawable.enchantedmango,R.string.enchmango_item_name,R.string.enchmango_cost,R.string.bfrom_consum_option,R.string.mango_ability,R.string.mango_bonus,R.string.emango_desc,false,false),
            new Item(R.drawable.energybooster,R.string.ebooster_item_name,R.string.ebooster_cost,R.string.bfrom_sshop_option,R.string.none_ability,R.string.ebooster_bonus,R.string.ebooster_desc,false,false),
            new Item(R.drawable.etherealblade,R.string.ethereal_item_name,R.string.ethereal_cost,R.string.bfrom_weapons_option,R.string.etherealbla_ability,R.string.ethereal_bonus,R.string.ethereal_desc,true,false),
            new Item(R.drawable.eulsscepter,R.string.euls_item_name,R.string.euls_cost,R.string.brom_caster_option,R.string.euls_ability,R.string.euls_bonus,R.string.euls_desc,false,false),
            new Item(R.drawable.eyeofskadi,R.string.eye_item_name,R.string.eye_cost,R.string.bfrom_art_option,R.string.eyeskadi_ability,R.string.eyeskadi_bonus,R.string.eye_desc,false,false),
            new Item(R.drawable.faeriefire,R.string.faerie_item_name,R.string.faerie_cost,R.string.bfrom_consum_option,R.string.faerie_ability,R.string.faerie_bonus,R.string.faerie_desc,false,false),
            new Item(R.drawable.flyingcourier,R.string.fcourier_item_name,R.string.fcourier_cost,R.string.bfrom_consum_option,R.string.fcourier_ability,R.string.none_bonus,R.string.fcourier_desc,false,false),
            new Item(R.drawable.forcestaff,R.string.fstaff_item_name,R.string.fstaff_cost,R.string.brom_caster_option,R.string.forcestaff_ability,R.string.forcestaff_bonus,R.string.fstaff_desc,false,false),
            new Item(R.drawable.gauntletsofs,R.string.gstrength_item_name,R.string.gstrength_cost,R.string.bfrom_att_option,R.string.none_ability,R.string.gauntlets_bonus,R.string.gauntlet_desc,false,false),
            new Item(R.drawable.gemoftruesight,R.string.gem_item_name,R.string.gem_cost,R.string.bfrom_arc_option,R.string.gem_ability,R.string.none_bonus,R.string.gem_desc,false,false),
            new Item(R.drawable.ghostscepter,R.string.ghost_item_name,R.string.ghost_cost,R.string.bfrom_arc_option,R.string.ghostscept_ability,R.string.ghostscep_bonus,R.string.ghost_desc,false,false),
            new Item(R.drawable.glimmercape,R.string.glimmer_item_name,R.string.glimmer_cost,R.string.brom_caster_option,R.string.glimmerc_ability,R.string.glimmer_bonus,R.string.glimmer_desc,true,false),
            new Item(R.drawable.glovesofhaste,R.string.ghaste_item_name,R.string.ghaste_cost,R.string.bfrom_arc_option,R.string.none_ability,R.string.glovesha_bonus,R.string.gloves_desc,false,false),
            new Item(R.drawable.guardiangreaves,R.string.ggreaves_item_name,R.string.ggreaves_cost,R.string.bfrom_supp_option,R.string.guardiangreav_ability,R.string.guardiangrea_bonus,R.string.greaves_desc,false,false),
            new Item(R.drawable.handofmidas,R.string.midas_item_name,R.string.midas_cost,R.string.bfrom_com_option,R.string.midas_ability,R.string.midas_bonus,R.string.midas_desc,false,false),
            new Item(R.drawable.headdress,R.string.headdress_item_name,R.string.headdress_cost,R.string.bfrom_supp_option,R.string.headdress_ability,R.string.headdress_bonus,R.string.head_desc,false,false),
            new Item(R.drawable.healingsalve,R.string.salve_item_name,R.string.salve_cost,R.string.bfrom_consum_option,R.string.healingsalve_ability,R.string.none_bonus,R.string.salve_desc,false,false),
            new Item(R.drawable.heart,R.string.heart_item_name,R.string.heart_cost,R.string.brom_armor_option,R.string.heart_ability,R.string.heart_bonus,R.string.heart_desc,false,false),
            new Item(R.drawable.heavenshalberd,R.string.hallberd_item_name,R.string.hallberd_cost,R.string.bfrom_art_option,R.string.heavens_ability,R.string.heavens_bonus,R.string.heaven_desc,true,false),
            new Item(R.drawable.helmofironwill,R.string.helm_item_name,R.string.helm_cost,R.string.bfrom_arm_option,R.string.none_ability,R.string.helmiron_bonus,R.string.helmiron_desc,false,false),
            new Item(R.drawable.helmofthedom,R.string.helmdom_item_name,R.string.helmdom_cost,R.string.bfrom_art_option,R.string.helmdom_ability,R.string.helmdom_bonus,R.string.helmdom_desc,true,false),
            new Item(R.drawable.hoodofdefiance,R.string.hooddef_item_name,R.string.hooddef_cost,R.string.brom_armor_option,R.string.hooddef_ability,R.string.hooddef_bonus,R.string.hooddef_desc,false,false),
            new Item(R.drawable.hurricanepike,R.string.hurricane_item_name,R.string.hurricane_cost,R.string.brom_armor_option,R.string.hurricane_ability,R.string.hurrican_bonus,R.string.hurricane_desc,false,false),
            new Item(R.drawable.hyperstone,R.string.hyperstone_item_name,R.string.hyperstone_cost,R.string.bfrom_sshop_option,R.string.none_ability,R.string.hyperstone_bonus,R.string.hyperstone_desc,false,false),
            new Item(R.drawable.infusedraindrop,R.string.raindrop_item_name,R.string.raindrop_cost,R.string.bfrom_arm_option,R.string.raindrop_ability,R.string.raindrop_bonus,R.string.raindrop_desc,false,false),
            new Item(R.drawable.ironbranch,R.string.ironbranch_item_name,R.string.ironbranch_cost,R.string.bfrom_att_option,R.string.ironbranch_ability,R.string.ironbranch_bonus,R.string.ironb_desc,false,false),
            new Item(R.drawable.irontalon,R.string.irontalon_item_name,R.string.irontalon_cost,R.string.bfrom_supp_option,R.string.irontalon_ability,R.string.irontalon_bonus,R.string.italon_desc,false,false),
            new Item(R.drawable.javelin,R.string.javelin_item_name,R.string.javelin_cost,R.string.bfrom_arm_option,R.string.javelin_ability,R.string.javelin_bonus,R.string.javelin_desc,false,false),
            new Item(R.drawable.linkenssphere,R.string.linkens_item_name,R.string.linkens_cost,R.string.brom_armor_option,R.string.linkens_ability,R.string.linkens_bonus,R.string.linkens_desc,false,false),
            new Item(R.drawable.lotusorb,R.string.lotus_item_name,R.string.lotus_cost,R.string.brom_armor_option,R.string.lotusorb_ability,R.string.lotusorb_bonus,R.string.lotus_desc,true,false),
            new Item(R.drawable.maelstrom,R.string.mael_item_name,R.string.mael_cost,R.string.bfrom_art_option,R.string.maelstrom_ability,R.string.maelstrom_bonus,R.string.maelstrom_desc,false,false),
            new Item(R.drawable.magicstick,R.string.magicstick_item_name,R.string.magicstick_cost,R.string.bfrom_arc_option,R.string.magicstick_ability,R.string.none_bonus,R.string.magic_desc,false,false),
            new Item(R.drawable.magicwand,R.string.wand_item_name,R.string.wand_cost,R.string.bfrom_com_option,R.string.magicwand_ability,R.string.magicwand_bonus,R.string.magic_desc,false,false),
            new Item(R.drawable.mantastyle,R.string.manta_item_name,R.string.manta_cost,R.string.brom_armor_option,R.string.mantastyle_ability,R.string.mantas_bonus,R.string.manta_desc,true,false),
            new Item(R.drawable.mantleofintel,R.string.mantleintell_item_name,R.string.mantleintell_cost,R.string.bfrom_att_option,R.string.none_ability,R.string.mantleintel_bonus,R.string.mantleintel_desc,false,false),
            new Item(R.drawable.maskofmadness,R.string.maskmad_item_name,R.string.maskmad_cost,R.string.bfrom_art_option,R.string.maskmad_ability,R.string.none_bonus,R.string.maskmad_desc,false,false),
            new Item(R.drawable.medallionofcourage,R.string.medalcour_item_name,R.string.medalcour_cost,R.string.bfrom_supp_option,R.string.medalcour_ability,R.string.medalcour_bonus,R.string.medal_desc,false,false),
            new Item(R.drawable.mekansm,R.string.mek_item_name,R.string.mek_cost,R.string.bfrom_supp_option,R.string.mek_ability,R.string.meks_bonus,R.string.mekansm_desc,false,true),
            new Item(R.drawable.mithrilhammer,R.string.mithril_item_name,R.string.mithril_cost,R.string.bfrom_arm_option,R.string.none_ability,R.string.mithril_bonus,R.string.mithril_desc,false,false),
            new Item(R.drawable.mjollnir,R.string.mjoll_item_name,R.string.mjoll_cost,R.string.bfrom_art_option,R.string.mjoll_ability,R.string.mjoll_bonus,R.string.mjoll_desc,true,false),
            new Item(R.drawable.monkeykingbar,R.string.mkb_item_name,R.string.mkb_cost,R.string.bfrom_weapons_option,R.string.mkb_ability,R.string.mkb_bonus,R.string.mkb_desc,false,false),
            new Item(R.drawable.moonshard,R.string.moon_item_name,R.string.moon_cost,R.string.bfrom_com_option,R.string.moon_ability,R.string.moon_bonus,R.string.moon_desc,false,false),
            new Item(R.drawable.morbidmask,R.string.morbidmask_item_name,R.string.morbidmask_cost,R.string.bfrom_arc_option,R.string.morbidmask_ability,R.string.none_bonus,R.string.morbid_desc,false,false),
            new Item(R.drawable.mysticstaff,R.string.mysticstaff_item_name,R.string.mysticstaff_cost,R.string.bfrom_sshop_option,R.string.none_ability,R.string.mysticstaff_bonus,R.string.mystic_desc,false,false),
            new Item(R.drawable.necronomicon,R.string.necronom_item_name,R.string.necronom_cost,R.string.brom_caster_option,R.string.necronom_ability,R.string.necro_bonus,R.string.necro_desc,false,false),
            new Item(R.drawable.nulltalisman,R.string.nulltal_item_name,R.string.nulltal_cost,R.string.bfrom_com_option,R.string.none_ability,R.string.nulltal_bonus,R.string.nulltal_desc,false,false),
            new Item(R.drawable.oblivionstaff,R.string.oblistaff_item_name,R.string.oblistaff_cost,R.string.bfrom_com_option,R.string.none_ability,R.string.oblistaff_bonus,R.string.oblstaff_desc,false,false),
            new Item(R.drawable.observerward,R.string.obsward_item_name,R.string.obsward_cost,R.string.bfrom_consum_option,R.string.obsward_ability,R.string.none_bonus,R.string.obsward_desc,false,false),
            new Item(R.drawable.octarinecore,R.string.octcore_item_name,R.string.octcore_cost,R.string.brom_caster_option,R.string.octarine_ability,R.string.octarine_bonus,R.string.octcore_desc,true,true),
            new Item(R.drawable.ogreclub,R.string.ogreclub_item_name,R.string.ogreclub_cost,R.string.bfrom_att_option,R.string.none_ability,R.string.ogreclub_bonus,R.string.ogre_desc,false,false),
            new Item(R.drawable.orbofvenom,R.string.orbvenom_item_name,R.string.orbvenom_cost,R.string.bfrom_arm_option,R.string.orbven_ability,R.string.none_bonus,R.string.orbven_desc,false,false),
            new Item(R.drawable.orchidmalevolence,R.string.orchid_item_name,R.string.orchid_cost,R.string.brom_caster_option,R.string.orchidmal_ability,R.string.orchidmal_bonus,R.string.orchid_desc,false,false),
            new Item(R.drawable.perseverance,R.string.pers_item_name,R.string.pers_cost,R.string.bfrom_com_option,R.string.none_ability,R.string.perserv_bonus,R.string.pers_desc,true,false),
            new Item(R.drawable.phaseboots,R.string.phaseboots_item_name,R.string.phaseboots_cost,R.string.bfrom_com_option,R.string.phaseboots_ability,R.string.phaseboot_bonus,R.string.phaseb_desc,false,false),
            new Item(R.drawable.pipeofinsight,R.string.pipe_item_name,R.string.pipe_cost,R.string.bfrom_supp_option,R.string.pipeinsight_ability,R.string.pipe_bonus,R.string.pipe_desc,false,false),
            new Item(R.drawable.platemail,R.string.platemail_item_name,R.string.platemail_cost,R.string.bfrom_sshop_option,R.string.none_ability,R.string.platemail_bonus,R.string.plate_desc,false,false),
            new Item(R.drawable.pointbooster,R.string.pointboost_item_name,R.string.pointboost_cost,R.string.bfrom_sshop_option,R.string.none_ability,R.string.pointboost_bonus,R.string.pointb_desc,false,false),
            new Item(R.drawable.poormansshield,R.string.poorshield_item_name,R.string.poorshield_cost,R.string.bfrom_com_option,R.string.poorman_ability,R.string.poorman_bonus,R.string.poorshield_desc,false,false),
            new Item(R.drawable.powertreads,R.string.powertread_item_name,R.string.powertread_cost,R.string.bfrom_com_option,R.string.powertread_ability,R.string.powertread_bonus,R.string.powert_desc,false,false),
            new Item(R.drawable.quarterstaff,R.string.quarter_item_name,R.string.quarter_cost,R.string.bfrom_arm_option,R.string.none_ability,R.string.quarter_bonus,R.string.quarterstaff_desc,false,false),
            new Item(R.drawable.quellingblade,R.string.quell_item_name,R.string.quell_cost,R.string.bfrom_arm_option,R.string.quelblade_ability,R.string.none_bonus,R.string.quellblade_desc,false,false),
            new Item(R.drawable.radiance,R.string.radiance_item_name,R.string.radiance_cost,R.string.bfrom_weapons_option,R.string.radiance_ability,R.string.radiance_bonus,R.string.radiance_desc,false,false),
            new Item(R.drawable.reaver,R.string.reaver_item_name,R.string.reaver_cost,R.string.bfrom_sshop_option,R.string.none_ability,R.string.reaver_bonus,R.string.reaver_desc,false,false),
            new Item(R.drawable.refresherorb,R.string.refresher_item_name,R.string.refresher_cost,R.string.brom_caster_option,R.string.refresher_ability,R.string.refresher_bonus,R.string.refresh_desc,false,false),
            new Item(R.drawable.ringofaquila,R.string.aquila_item_name,R.string.aquila_cost,R.string.bfrom_supp_option,R.string.ringaquil_ability,R.string.ringaquila_bonus,R.string.ringaquila_desc,true,false),
            new Item(R.drawable.ringofbasilius,R.string.basilius_item_name,R.string.basilius_cost,R.string.bfrom_supp_option,R.string.ringbasil_ability,R.string.ringbasil_bonus,R.string.ringbasil_desc,true,false),
            new Item(R.drawable.ringofhealth,R.string.rhealth_item_name,R.string.rhealth_cost,R.string.bfrom_arc_option,R.string.none_ability,R.string.ringhealth_bonus,R.string.ringhealth_desc,false,false),
            new Item(R.drawable.ringofprotection,R.string.rprotect_item_name,R.string.rprotect_cost,R.string.bfrom_arm_option,R.string.none_ability,R.string.ringprotect_bonus,R.string.ringprotect_desc,false,false),
            new Item(R.drawable.ringofregen,R.string.rregen_item_name,R.string.rregen_cost,R.string.bfrom_arc_option,R.string.none_ability,R.string.ringregen_bonus,R.string.ringregen_desc,false,false),
            new Item(R.drawable.robeofthemagi,R.string.robemagi_item_name,R.string.robemagi_cost,R.string.bfrom_att_option,R.string.none_ability,R.string.robemagi_bonus,R.string.robemagi_desc,false,false),
            new Item(R.drawable.rodofatos,R.string.ratos_item_name,R.string.ratos_cost,R.string.brom_caster_option,R.string.rodatos_ability,R.string.rodatos_bonus,R.string.rodatos_desc,false,false),
            new Item(R.drawable.sacredrelic,R.string.sacred_item_name,R.string.sacred_cost,R.string.bfrom_sshop_option,R.string.none_ability,R.string.sacredrelic_bonus,R.string.sacredrel_desc,false,false),
            new Item(R.drawable.sagesmask,R.string.sagemask_item_name,R.string.sagemask_cost,R.string.bfrom_arc_option,R.string.none_ability,R.string.sage_bonus,R.string.sage_desc,false,false),
            new Item(R.drawable.sange,R.string.sange_item_name,R.string.sange_cost,R.string.bfrom_art_option,R.string.sange_ability,R.string.sange_bonus,R.string.sange_desc,false,false),
            new Item(R.drawable.sangeandyasha,R.string.sy_item_name,R.string.sy_cost,R.string.bfrom_art_option,R.string.sangeyasha_ability,R.string.sangeyasha_bonus,R.string.sandy_desc,true,false),
            new Item(R.drawable.satanic,R.string.satanic_item_name,R.string.satanic_cost,R.string.bfrom_art_option,R.string.satanic_ability,R.string.satanic_bonus,R.string.satanic_desc,false,false),
            new Item(R.drawable.scytheofvyse,R.string.vyse_item_name,R.string.vyse_cost,R.string.brom_caster_option,R.string.scythevyse_ability,R.string.scythevyse_bonus,R.string.vyse_desc,false,false),
            new Item(R.drawable.sentryward,R.string.sentry_item_name,R.string.sentry_cost,R.string.bfrom_consum_option,R.string.sentry_ability,R.string.none_bonus,R.string.sentry_desc,false,false),
            new Item(R.drawable.shadowamulet,R.string.shadowam_item_name,R.string.shadowam_cost,R.string.bfrom_arc_option,R.string.shadowam_ability,R.string.shadowam_bonus,R.string.shadowam_desc,false,false),
            new Item(R.drawable.shadowblade,R.string.sblade_item_name,R.string.sblade_cost,R.string.bfrom_weapons_option,R.string.shadowbl_ability,R.string.shadowbl_bonus,R.string.shadowbl_desc,false,false),
            new Item(R.drawable.shivasguard,R.string.shivas_item_name,R.string.shivas_cost,R.string.brom_armor_option,R.string.shivas_ability,R.string.shivas_bonus,R.string.shivas_desc,true,false),
            new Item(R.drawable.silveredge,R.string.silver_item_name,R.string.silver_cost,R.string.bfrom_weapons_option,R.string.silveredge_ability,R.string.silveredge_bonus,R.string.silver_desc,true,false),
            new Item(R.drawable.skullbasher,R.string.skullbash_item_name,R.string.skullbash_cost,R.string.bfrom_weapons_option,R.string.skullbash_ability,R.string.skullbash_bonus,R.string.skullbash_desc,false,false),
            new Item(R.drawable.slippersofagility,R.string.slippers_item_name,R.string.slippers_cost,R.string.bfrom_att_option,R.string.none_ability,R.string.slippersagi_bonus,R.string.slippersagi_desc,false,false),
            new Item(R.drawable.smokeofdeceit,R.string.smoke_item_name,R.string.smoke_cost,R.string.bfrom_consum_option,R.string.smoke_ability,R.string.none_bonus,R.string.smoke_desc,false,true),
            new Item(R.drawable.solarcrest,R.string.solar_item_name,R.string.solar_cost,R.string.brom_caster_option,R.string.solarcrest_ability,R.string.solarcrest_bonus,R.string.solar_desc,true,false),
            new Item(R.drawable.soulbooster,R.string.soulboost_item_name,R.string.soulboost_cost,R.string.brom_armor_option,R.string.none_ability,R.string.none_bonus,R.string.soulboost_desc,false,false),
            new Item(R.drawable.soulring,R.string.soulring_item_name,R.string.soulring_cost,R.string.bfrom_com_option,R.string.soulring_ability,R.string.soulring_bonus,R.string.soulring_desc,false,false),
            new Item(R.drawable.staffofwizardry,R.string.staffwiz_item_name,R.string.staffwiz_cost,R.string.bfrom_att_option,R.string.none_ability,R.string.staff_bonus,R.string.staffwiz_desc,false,false),
            new Item(R.drawable.stoutshield,R.string.stout_item_name,R.string.stout_cost,R.string.bfrom_arm_option,R.string.stoutshield_ability,R.string.none_bonus,R.string.stout_desc,false,false),
            new Item(R.drawable.talismanofevasion,R.string.talisman_item_name,R.string.talisman_cost,R.string.bfrom_sshop_option,R.string.none_ability,R.string.talismanev_bonus,R.string.taliseva_desc,false,false),
            new Item(R.drawable.tango,R.string.tango_item_name,R.string.tango_cost,R.string.bfrom_consum_option,R.string.tango_ability,R.string.none_bonus,R.string.tango_desc,false,false),
            new Item(R.drawable.tomeofknowledge,R.string.tome_item_name,R.string.tome_cost,R.string.bfrom_consum_option,R.string.tomeknow_ability,R.string.none_bonus,R.string.tomeknow_desc,false,false),
            new Item(R.drawable.townportalscroll,R.string.tps_item_name,R.string.tps_cost,R.string.bfrom_consum_option,R.string.tps_ability,R.string.none_bonus,R.string.tps_desc,false,false),
            new Item(R.drawable.tranquilboots,R.string.tranboots_item_name,R.string.tranboots_cost,R.string.bfrom_supp_option,R.string.tranquilboots_ability,R.string.tranquilbo_bonus,R.string.tranquilb_desc,false,false),
            new Item(R.drawable.ultimateorb,R.string.uorb_item_name,R.string.uorb_cost,R.string.bfrom_sshop_option,R.string.none_ability,R.string.ultimateor_bonus,R.string.ultimate_desc,false,false),
            new Item(R.drawable.urnofshadows,R.string.urn_item_name,R.string.urn_cost,R.string.bfrom_supp_option,R.string.urn_ability,R.string.urn_bonus,R.string.urn_desc,false,false),
            new Item(R.drawable.vanguard,R.string.vanguard_item_name,R.string.vanguard_cost,R.string.brom_armor_option,R.string.vanguard_ability,R.string.vanguard_bonus,R.string.vanguard_desc,false,false),
            new Item(R.drawable.veilofdiscord,R.string.veil_item_name,R.string.veil_cost,R.string.brom_caster_option,R.string.veildiscord_ability,R.string.veildisc_bonus,R.string.veil_desc,false,false),
            new Item(R.drawable.vitalitybooster,R.string.vitality_item_name,R.string.vitality_cost,R.string.bfrom_sshop_option,R.string.none_ability,R.string.vital_bonus,R.string.vitality_desc,false,false),
            new Item(R.drawable.vladmiroffering,R.string.vladmir_item_name,R.string.vladmir_cost,R.string.bfrom_supp_option,R.string.vlad_ability,R.string.vladmir_bonus,R.string.vladmir_desc,false,false),
            new Item(R.drawable.voidstone,R.string.void_item_name,R.string.void_cost,R.string.bfrom_arc_option,R.string.none_ability,R.string.void_bonus,R.string.voidstone_desc,false,false),
            new Item(R.drawable.windlace,R.string.wind_item_name,R.string.wind_cost,R.string.bfrom_arc_option,R.string.none_ability,R.string.windlace_bonus,R.string.windlace_desc,false,false),
            new Item(R.drawable.wraithband,R.string.wraith_item_name,R.string.wraith_cost,R.string.bfrom_com_option,R.string.none_ability,R.string.wraith_bonus,R.string.wraith_desc,false,false),
            new Item(R.drawable.yasha,R.string.yasha_item_name,R.string.yasha_cost,R.string.bfrom_art_option,R.string.none_ability,R.string.yasha_bonus,R.string.yasha_desc,false,false)
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        mItemImageView = (ImageView) findViewById(R.id.itemImageView);
        mItemNameTextView = (TextView) findViewById(R.id.itemNameTextView);
        mItemCostTextView = (TextView) findViewById(R.id.costTextView);
        mItemBoughtTextView = (TextView) findViewById(R.id.shopNameLabel);
        mItemAbilityTextView = (TextView) findViewById(R.id.abilityTextView);
        mItemDescriptionTextView = (TextView) findViewById(R.id.descriptionTextView);
        mItemBonusTextView = (TextView) findViewById(R.id.bonusContentTextView);
        mItemDissRadioButton = (RadioButton) findViewById(R.id.itemDissRadioButton);
        mItemAlliesRadioButton = (RadioButton) findViewById(R.id.itemAlliesRadioButton);
        mPreviousItemButton = (Button) findViewById(R.id.itemPreviousButton);
        mNextItemButton = (Button) findViewById(R.id.itemNextButton);
        mQuestionButton = (ImageButton) findViewById(R.id.questionButton);
        mMenuButton = (ImageButton) findViewById(R.id.menuButton);


       final Toast toast = Toast.makeText(getApplicationContext(),R.string.alertall_toast,LENGTH_SHORT);


        Intent itemIntent = getIntent();
        mCurrentItemIndex = itemIntent.getIntExtra("currentitem",0);


        final SharedPreferences sharedPref = this.getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE);
        mCurrentItemIndex = sharedPref.getInt("currentItem", mCurrentItemIndex);

       update();


        //define the behavior of the Next Button (go to next hero)
        mNextItemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //% ensures we wrap back to index 0
                mCurrentItemIndex = (mCurrentItemIndex + 1) % 148;


                //update all text fields and the image view based on current state
                update();

            }
        });

        //define the behavior of the Next Button (go to previous hero)
        mPreviousItemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentItemIndex = (mCurrentItemIndex - 1);

                //ensures we wrap back to index 3 (instead of -1)
                if (mCurrentItemIndex == -1)
                    mCurrentItemIndex = 147;


                //update all text fields and the image view based on current state
                update();
            }
        });

        //define the behavior of the Menu button
        mMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences preferences = getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE);
                preferences.edit().remove("currentItem").apply();

                Intent back = new Intent(ItemActivity.this, ItemLookupActivity.class);
                startActivity(back);
            }
        });

        //define behavior for clicking the allies radio button
        mQuestionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           toast.show();
            }
        });

    }

    private void update() {

        mItemImageView.setImageResource(mItems[mCurrentItemIndex].getmImageResId());
        mItemNameTextView.setText(mItems[mCurrentItemIndex].getmNameResId());
        mItemCostTextView.setText(mItems[mCurrentItemIndex].getmCostResId());
        mItemBoughtTextView.setText(mItems[mCurrentItemIndex].getmBoughtFromResId());
        mItemAbilityTextView.setText(mItems[mCurrentItemIndex].getmAbilityResId());
        mItemDescriptionTextView.setText(mItems[mCurrentItemIndex].getmDescriptionResId());
        mItemBonusTextView.setText(mItems[mCurrentItemIndex].getmBonusResId());
        mItemDissRadioButton.setChecked(mItems[mCurrentItemIndex].getmDisassembleResId());
        mItemAlliesRadioButton.setChecked(mItems[mCurrentItemIndex].getmAlertAllResId());

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();


        SharedPreferences sharedPref = this.getSharedPreferences(MY_PREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("currentItem", mCurrentItemIndex);
        editor.apply();
    }

}
