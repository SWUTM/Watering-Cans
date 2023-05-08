
package net.swutm.wateringcans.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;
import net.swutm.wateringcans.item.DiamondWateringCansItem;
import net.swutm.wateringcans.item.EmeraldWateringCansItem;
import net.swutm.wateringcans.item.GoldWateringCansItem;
import net.swutm.wateringcans.item.IronWateringCansItem;
import net.swutm.wateringcans.wateringcans;


public class WateringCansModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, wateringcans.MOD_ID);
	public static final RegistryObject<Item> IRON_WATERING_CANS = REGISTRY.register("iron_watering_cans", () -> new IronWateringCansItem());
	public static final RegistryObject<Item> DIAMOND_WATERING_CANS = REGISTRY.register("diamond_watering_cans", () -> new DiamondWateringCansItem());
	public static final RegistryObject<Item> EMERALD_WATERING_CANS = REGISTRY.register("emerald_watering_cans", () -> new EmeraldWateringCansItem());
	public static final RegistryObject<Item> GOLD_WATERING_CANS = REGISTRY.register("gold_watering_cans", () -> new GoldWateringCansItem());
}
