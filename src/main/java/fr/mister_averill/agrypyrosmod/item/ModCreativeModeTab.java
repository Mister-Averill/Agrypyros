package fr.mister_averill.agrypyrosmod.item;

import fr.mister_averill.agrypyrosmod.AgrypyrosMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AgrypyrosMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab {
    public static CreativeModeTab AGRYPYROS_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        AGRYPYROS_TAB = event.registerCreativeModeTab(new ResourceLocation(AgrypyrosMod.MOD_ID, "agrypyros_tab"),
            builder -> builder.icon(() -> new ItemStack(ModItems.SILVER_INGOT.get())).title(Component.literal("Agrypyros")).build());
    }
}
