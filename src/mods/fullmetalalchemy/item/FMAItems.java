package mods.fullmetalalchemy.item;

import mods.fullmetalalchemy.api.CoreApi;
import mods.fullmetalalchemy.api.module.Module;
import mods.fullmetalalchemy.api.module.Module.Load;
import mods.fullmetalalchemy.core.config.ConfigSettings;
import mods.fullmetalalchemy.core.enums.EnumState;
import mods.fullmetalalchemy.core.enums.TattooEnumState;
import mods.fullmetalalchemy.core.util.Resources;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import apexapi.common.utils.ApexUtils;

/**
 * @author viper283
 * 
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
@Module(id = "items", name = "FMA Items", version = "%VERSION%")
public class FMAItems {

	public static Item metaTest;
	public static Item pStone;
	public static Item redStone;
	public static Item alchemicCrystal;
	public static Item Stone;
	public static Item stone0;
	public static Item stone1;
	public static Item stone2;
	public static Item ash;
	public static Item eash;
	public static Item gash;
	public static Item ChalkStick;
	public static Item FireGlove;
	public static Item AlchSilk;
	public static Item FireCircle;
	public static Item ChalkCircle;
	public static Item ChalkPyramid;
	public static Item IceGauntlet;
	public static Item ReconstructionCircle;
	public static Item AlchNotebook;
	public static Item AlchNotes;
	public static Item Kunai;
	public static Item KunaiFire;
	public static Item KunaiEnder;


	public static String[] meta_names = new String[] {
		"chalkDust", 
		"flacon", 
		"flask", 
		"bloodDrop",
		"alchemicalWool", 
		"alchemicalSilk"
	};
	public static String[] meta_textures = new String[] {
		Resources.index.getIconFromIndex(meta_names[0]),
		Resources.index.getIconFromIndex(meta_names[1]),
		Resources.index.getIconFromIndex(meta_names[2]),
		Resources.index.getIconFromIndex(meta_names[3]),
		Resources.index.getIconFromIndex(meta_names[4]),
		Resources.index.getIconFromIndex(meta_names[5]),
	};
	public static String[] meta_localized_names = new String[] {
		"Chalk Dust", 
		"Flacon", 
		"Flask", 
		"Blood Drop",
		"Alchemical Wool", 
		"Alchemical Silk"
	};

	@Load
	public static void initialize() {

		metaTest = new ItemMeta(ConfigSettings.metaID, meta_names,
				meta_textures)
		.setUnlocalizedName("fmaMetaItem")
		.setCreativeTab(
				CoreApi.getInstance().fmaTab(CreativeTabs.tabMaterials));
		pStone = new ItemPStone(ConfigSettings.pStoneID, EnumState.OFF)
		.setUnlocalizedName("pStone")
		.setCreativeTab(
				CoreApi.getInstance().fmaTab(CreativeTabs.tabTools));
		alchemicCrystal = new ItemAlchemicCrystal(ConfigSettings.alchemicCrystal).setUnlocalizedName("alchemicCrystal");
		redStone = new ItemRedStone(ConfigSettings.redStone, EnumState.OFF).setUnlocalizedName("redStone").setCreativeTab(CoreApi.getInstance().fmaTab(CreativeTabs.tabTools));
		stone0 = new Itemstone0(ConfigSettings.stone0).setUnlocalizedName("stone0").setCreativeTab(CoreApi.getInstance().fmaTab(CreativeTabs.tabMisc));
		stone1 = new Itemstone1(ConfigSettings.stone1).setUnlocalizedName("EStone").setCreativeTab(CoreApi.getInstance().fmaTab(CreativeTabs.tabMisc));
		stone2 = new Itemstone2(ConfigSettings.stone2).setUnlocalizedName("GStone").setCreativeTab(CoreApi.getInstance().fmaTab(CreativeTabs.tabMisc));
		ash = new ItemAsh(ConfigSettings.ash).setUnlocalizedName("ash").setCreativeTab(CoreApi.getInstance().fmaTab(CreativeTabs.tabMisc));
		eash = new ItemEash(ConfigSettings.eash).setUnlocalizedName("eash").setCreativeTab(CoreApi.getInstance().fmaTab(CreativeTabs.tabMisc));
		gash = new ItemGash(ConfigSettings.gash).setUnlocalizedName("gash").setCreativeTab(CoreApi.getInstance().fmaTab(CreativeTabs.tabMisc));
		ChalkStick = new ItemChalkStick(ConfigSettings.ChalkStick).setUnlocalizedName("ChalkStick").setCreativeTab(CoreApi.getInstance().fmaTab(CreativeTabs.tabMisc));
		FireGlove = new ItemFireGlove(ConfigSettings.FireGlove).setUnlocalizedName("FireGlove").setCreativeTab(CoreApi.getInstance().fmaTab(CreativeTabs.tabCombat));
		FireCircle = new ItemFireCircle(ConfigSettings.FireCircle).setUnlocalizedName("FireCircle").setCreativeTab(CoreApi.getInstance().fmaTab(CreativeTabs.tabMisc));
		ChalkCircle = new ItemChalkCircle(ConfigSettings.ChalkCircle).setUnlocalizedName("ChalkCircle").setCreativeTab(CoreApi.getInstance().fmaTab(CreativeTabs.tabMisc));
		ChalkPyramid = new ItemChalkPyramid(ConfigSettings.ChalkPyramid).setUnlocalizedName("ChalkPyramid").setCreativeTab(CoreApi.getInstance().fmaTab(CreativeTabs.tabMisc));
		IceGauntlet = new ItemIceGauntlet(ConfigSettings.IceGauntlet).setUnlocalizedName("IceGauntlet").setCreativeTab(CoreApi.getInstance().fmaTab(CreativeTabs.tabCombat));
		ReconstructionCircle = new ItemReconstructionCircle(ConfigSettings.ReconstructionCircle, TattooEnumState.OFF).setUnlocalizedName("ReconstructionCircle").setCreativeTab(CoreApi.getInstance().fmaTab(CreativeTabs.tabMisc));
		AlchNotebook = new ItemAlchNotebook(ConfigSettings.AlchNotebook).setUnlocalizedName("AlchNotebook").setCreativeTab(CoreApi.getInstance().fmaTab(CreativeTabs.tabMisc));
		AlchNotes = new ItemAlchNotes(ConfigSettings.AlchNotes).setUnlocalizedName("AlchNotes").setCreativeTab(CoreApi.getInstance().fmaTab(CreativeTabs.tabMisc));
		Kunai = new ItemKunai(ConfigSettings.Kunai).setUnlocalizedName("Kunai").setCreativeTab(CoreApi.getInstance().fmaTab(CreativeTabs.tabTools));
		KunaiFire = new ItemKunaiFire(ConfigSettings.KunaiFire).setUnlocalizedName("KunaiFire").setCreativeTab(CoreApi.getInstance().fmaTab(CreativeTabs.tabTools));
		KunaiEnder = new ItemKunaiEnder(ConfigSettings.KunaiEnder).setUnlocalizedName("KunaiEnder").setCreativeTab(CoreApi.getInstance().fmaTab(CreativeTabs.tabTools));


		pStone.setContainerItem(pStone);

		localize();
	}

	private static void localize() {

		ApexUtils.addLocalizedNamesToStacksFromMap(ApexUtils
				.fillAndLocalizeItemStackToMap(metaTest, meta_localized_names));
	}
}