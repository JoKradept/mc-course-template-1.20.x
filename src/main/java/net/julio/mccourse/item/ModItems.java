package net.julio.mccourse.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.julio.mccourse.MCCourseMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item JOJACOLA = registerItem("jojacola",
            new Item(new FabricItemSettings())
    );

    private static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM,new Identifier(MCCourseMod.MOD_ID,name),item);
    }

    private static  void itemGroupIngredients (FabricItemGroupEntries entries){
        entries.add(JOJACOLA);
    }

    public static void registerModUItems(){
        // output to advice something is going to be registered
        MCCourseMod.LOGGER.info("Regitering Mod Items for "+ MCCourseMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }

}
