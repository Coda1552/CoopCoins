package codyhuh.coopcoins;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CoopCoins.MOD_ID);

    public static final RegistryObject<Item> COPPER_COIN = ITEMS.register("copper_coin", () -> new Item(new Item.Properties().rarity(Rarity.create("copper", e -> e.withColor(0xe77c56)))));
    public static final RegistryObject<Item> IRON_COIN = ITEMS.register("iron_coin", () -> new Item(new Item.Properties().rarity(Rarity.create("iron", e -> e.withColor(0xd8d8d8)))));
    public static final RegistryObject<Item> GOLD_COIN = ITEMS.register("gold_coin", () -> new Item(new Item.Properties().rarity(Rarity.create("gold", e -> e.withColor(0xfffa98)))));
    public static final RegistryObject<Item> NETHERITE_COIN = ITEMS.register("netherite_coin", () -> new Item(new Item.Properties().rarity(Rarity.create("netherite", e -> e.withColor(0x54414c)))));
}
