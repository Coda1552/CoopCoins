package codyhuh.coopcoins;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.lang.reflect.Modifier;

@Mod(CoopCoins.MOD_ID)
public class CoopCoins {
    public static final String MOD_ID = "coopcoins";

    public CoopCoins() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(bus);
    }
}
