package dev.andyiscool5463.magicalcrops.init;

import dev.andyiscool5463.magicalcrops.Reference;
import dev.andyiscool5463.magicalcrops.blocks.crops.CropBase;
import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.BlockFurnaceAccio;
import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.BlockFurnaceCrucio;
import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.BlockFurnaceImperio;
import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.BlockFurnaceUltimate;
import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.BlockFurnaceZivicio;
import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.TileEntityFurnaceAccio;
import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.TileEntityFurnaceCrucio;
import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.TileEntityFurnaceImperio;
import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.TileEntityFurnaceUltimate;
import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.TileEntityFurnaceZivicio;
import dev.andyiscool5463.magicalcrops.blocks.ore.BlockOreBase;
import dev.andyiscool5463.magicalcrops.items.seeds.SeedBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

@Mod.EventBusSubscriber(modid=Reference.MOD_ID)
public class ModBlocks {

	
	public static Block BlockCropMinicio;
	public static Block BlockCropAir;
	public static Block BlockCropCoal;
	public static Block BlockCropDiamond;
	public static Block BlockCropDye;
	public static Block BlockCropEarth;
	public static Block BlockCropEmerald;
	public static Block BlockCropExperience;
	public static Block BlockCropFire;
	public static Block BlockCropGlowstone;
	public static Block BlockCropGold;
	public static Block BlockCropIron;
	public static Block BlockCropLapis;
	public static Block BlockCropNature;
	public static Block BlockCropNether;
	public static Block BlockCropObsidian;
	public static Block BlockCropQuartz;
	public static Block BlockCropRedstone;
	public static Block BlockCropWater;
	public static Block BlockCropWither;
	
	public static Block BlockOreMinicio;
	
	public static Block BLOCK_FURNACE        = new BlockFurnaceAccio(ModItems.CreativeTab);
	public static Block blockFurnaceCrucio   = new BlockFurnaceCrucio(ModItems.CreativeTab); 
	public static Block blockFurnaceImperio  = new BlockFurnaceImperio(ModItems.CreativeTab); 
	public static Block blockFurnaceUltimate = new BlockFurnaceUltimate(ModItems.CreativeTab);
	public static Block blockFurnaceZivicio  = new BlockFurnaceZivicio(ModItems.CreativeTab); 
	
	public static void init() {
		BlockCropMinicio = new CropBase("cropminicio", ModItems.ItemSeedMinicio, ModItems.ItemEssenceMinicio);
		BlockCropAir = new CropBase("cropair", ModItems.ItemSeedAir, ModItems.ItemEssenceAir);
		BlockCropCoal = new CropBase("cropcoal", ModItems.ItemSeedAir, ModItems.ItemEssenceCoal);
		BlockCropDiamond = new CropBase("cropdiamond", ModItems.ItemSeedDiamond, ModItems.ItemEssenceDiamond);
		BlockCropDye = new CropBase("cropdye", ModItems.ItemSeedDye, ModItems.ItemEssenceDye);
		BlockCropEarth = new CropBase("cropearth", ModItems.ItemSeedEarth, ModItems.ItemEssenceEarth);
		
		BlockCropEmerald = new CropBase("cropemerald", ModItems.ItemSeedEarth, ModItems.ItemEssenceEmerald);
		BlockCropExperience = new CropBase("cropexperience", ModItems.ItemSeedEarth, ModItems.ItemEssenceExperience);
		BlockCropFire = new CropBase("cropfire", ModItems.ItemSeedEarth, ModItems.ItemEssenceFire);
		BlockCropGlowstone = new CropBase("cropglowstone", ModItems.ItemSeedEarth, ModItems.ItemEssenceGlowstone);
		BlockCropGold = new CropBase("cropgold", ModItems.ItemSeedEarth, ModItems.ItemEssenceGold);
		BlockCropIron = new CropBase("cropiron", ModItems.ItemSeedEarth, ModItems.ItemEssenceIron);
		BlockCropLapis = new CropBase("croplapis", ModItems.ItemSeedEarth, ModItems.ItemEssenceLapis);
		BlockCropNature = new CropBase("cropnature", ModItems.ItemSeedEarth, ModItems.ItemEssenceNature);
		BlockCropNether = new CropBase("cropnether", ModItems.ItemSeedEarth, ModItems.ItemEssenceNether);
		BlockCropQuartz = new CropBase("cropquartz", ModItems.ItemSeedEarth, ModItems.ItemEssenceQuartz);
		BlockCropRedstone = new CropBase("cropredstone", ModItems.ItemSeedEarth, ModItems.ItemEssenceRedstone);
		BlockCropWater = new CropBase("cropwater", ModItems.ItemSeedEarth, ModItems.ItemEssenceWater);
		BlockCropWither = new CropBase("cropwither", ModItems.ItemSeedEarth, ModItems.ItemEssenceAccio); // fix
		
		BlockOreMinicio = new BlockOreBase("essenceore",Material.ROCK, ModItems.ItemEssenceMinicio).setCreativeTab(ModItems.CreativeTab);
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(
				BlockCropMinicio,
				BlockCropAir,
				BlockCropCoal,
				BlockCropDiamond,
				BlockCropDye,
				BlockCropEarth,
				BlockCropEmerald,
				BlockCropExperience,
				BlockCropFire,
				BlockCropGlowstone,
				BlockCropGold,
				BlockCropIron,
				BlockCropLapis,
				BlockCropNature,
				BlockCropNether,
				BlockCropQuartz,
				BlockCropRedstone,
				BlockCropWater,
				BlockCropWither,
				BLOCK_FURNACE,
				blockFurnaceCrucio,
				blockFurnaceImperio,
				blockFurnaceUltimate,
				blockFurnaceZivicio,
				BlockOreMinicio
				);
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
//		event.getRegistry().register(new ItemSeeds(ModBlocks.tutorialCrop, ModBlocks.tutorialBlock).setRegistryName("tutorial_seeds").setUnlocalizedName("tutorial_seeds")); Use this if you want a normal farmland seed.
		
		ModItems.ItemSeedMinicio = new SeedBase(ModBlocks.BlockCropMinicio,Blocks.FARMLAND,"seedminicio").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedAir = new SeedBase(ModBlocks.BlockCropAir, Blocks.FARMLAND, "seedair").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedCoal = new SeedBase(ModBlocks.BlockCropCoal, Blocks.FARMLAND, "seedcoal").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedDiamond = new SeedBase(ModBlocks.BlockCropDiamond, Blocks.FARMLAND, "seeddiamond").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedDye = new SeedBase(ModBlocks.BlockCropDye, Blocks.FARMLAND, "seeddye").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedEarth = new SeedBase(ModBlocks.BlockCropEarth, Blocks.FARMLAND, "seedearth").setCreativeTab(ModItems.CreativeTab);
		
		ModItems.ItemSeedEmerald = new SeedBase(ModBlocks.BlockCropEmerald, Blocks.FARMLAND, "seedemerald").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedExperience = new SeedBase(ModBlocks.BlockCropExperience, Blocks.FARMLAND, "seedexperience").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedFire = new SeedBase(ModBlocks.BlockCropFire, Blocks.FARMLAND, "seedFire").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedGlowstone = new SeedBase(ModBlocks.BlockCropGlowstone, Blocks.FARMLAND, "seedglowstone").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedGold = new SeedBase(ModBlocks.BlockCropGold, Blocks.FARMLAND, "seedgold").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedIron = new SeedBase(ModBlocks.BlockCropIron, Blocks.FARMLAND, "seediron").setCreativeTab(ModItems.CreativeTab); 
		ModItems.ItemSeedLapis= new SeedBase(ModBlocks.BlockCropLapis, Blocks.FARMLAND, "seedlapis").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedNature = new SeedBase(ModBlocks.BlockCropNature, Blocks.FARMLAND, "seednature").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedNether = new SeedBase(ModBlocks.BlockCropNether, Blocks.FARMLAND, "seednether").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedObsidian = new SeedBase(ModBlocks.BlockCropObsidian, Blocks.FARMLAND, "seedobsidian").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedQuartz = new SeedBase(ModBlocks.BlockCropQuartz, Blocks.FARMLAND, "seedquartz").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedRedstone = new SeedBase(ModBlocks.BlockCropRedstone, Blocks.FARMLAND, "seedredstone").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedWater = new SeedBase(ModBlocks.BlockCropWater, Blocks.FARMLAND, "seedwater").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedWither = new SeedBase(ModBlocks.BlockCropWither, Blocks.FARMLAND, "seedwither").setCreativeTab(ModItems.CreativeTab);
		
		ModItems.ItemFurnaceAccio = new ItemBlock(BLOCK_FURNACE).setRegistryName("furnace_flower_accio").setUnlocalizedName("furnace_flower_accio");
		ModItems.ItemFurnaceCrucio = new ItemBlock(blockFurnaceCrucio).setRegistryName("furnace_flower_crucio").setUnlocalizedName("furnace_flower_crucio");
		ModItems.ItemFurnaceImperio = new ItemBlock(blockFurnaceImperio).setRegistryName("furnace_flower_imperio").setUnlocalizedName("furnace_flower_imperio");
		ModItems.ItemFurnaceUltimate = new ItemBlock(blockFurnaceUltimate).setRegistryName("furnace_flower_ultimate").setUnlocalizedName("furnace_flower_ultimate");
		ModItems.ItemFurnaceZivicio = new ItemBlock(blockFurnaceZivicio).setRegistryName("furnace_flower_zivicio").setUnlocalizedName("furnace_flower_zivicio");
		
		ModItems.ItemOreMinicio = new ItemBlock(BlockOreMinicio).setRegistryName("essenceore").setUnlocalizedName("essenceore");
		
		event.getRegistry().registerAll(
				ModItems.ItemSeedMinicio,
				ModItems.ItemSeedAir,
				ModItems.ItemSeedCoal,
				ModItems.ItemSeedDiamond,
				ModItems.ItemSeedDye,
				ModItems.ItemSeedEarth,
				ModItems.ItemSeedEmerald,
				ModItems.ItemSeedExperience, 
				ModItems.ItemSeedFire,
				ModItems.ItemSeedGlowstone,
				ModItems.ItemSeedGold,
				ModItems.ItemSeedIron, 
				ModItems.ItemSeedLapis,
				ModItems.ItemSeedNature,
				ModItems.ItemSeedNether,
				ModItems.ItemSeedObsidian,
				ModItems.ItemSeedQuartz,
				ModItems.ItemSeedRedstone, 
				ModItems.ItemSeedWater,
				ModItems.ItemSeedWither,
				ModItems.ItemFurnaceAccio,
				ModItems.ItemFurnaceCrucio,
				ModItems.ItemFurnaceImperio,
				ModItems.ItemFurnaceUltimate,
				ModItems.ItemFurnaceZivicio,
				ModItems.ItemOreMinicio
				);
		registerTileEntities();
		registerOreDictionary();

	}
	
	public static void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityFurnaceAccio.class, new ResourceLocation("furnace_accio"));
		GameRegistry.registerTileEntity(TileEntityFurnaceCrucio.class, new ResourceLocation("furnace_crucio"));
		GameRegistry.registerTileEntity(TileEntityFurnaceImperio.class, new ResourceLocation("furnace_imperio"));
		GameRegistry.registerTileEntity(TileEntityFurnaceUltimate.class, new ResourceLocation("furnace_ultimate"));
		GameRegistry.registerTileEntity(TileEntityFurnaceZivicio.class, new ResourceLocation("furnace_zivicio"));
	}
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void registerRenders(ModelRegistryEvent event) {

	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
	private static void registerOreDictionary() {
		OreDictionary.registerOre("furnace", Blocks.FURNACE);
		OreDictionary.registerOre("furnace", ModBlocks.BLOCK_FURNACE);
	}
}