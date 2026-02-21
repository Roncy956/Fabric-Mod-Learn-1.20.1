package com.roncy956.learn.item;

import com.roncy956.learn.LearnMod;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> LEARN_GROUP = register("learn_group");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(Registries.ITEM_GROUP.getKey(), new Identifier(LearnMod.MOD_ID, id));
    }

    public static final ItemGroup Learn_Group2 = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(LearnMod.MOD_ID, "learn_group2"),
            ItemGroup.create(null, -1)
                    .displayName(Text.translatable("itemGroup.learn_group2"))
                    .icon(() -> new ItemStack(ModItems.CARDBOARD))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CARDBOARD);
                        entries.add(Items.DIAMOND);
                        entries.add(Blocks.STONE);
                    }).build()
    );


    public static void registerGroups() {
        Registry.register(
                Registries.ITEM_GROUP,
                LEARN_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, 7)
                        .displayName(Text.translatable("itemGroup.learn_group"))
                        .icon(() -> new ItemStack(ModItems.ICE_ETHER))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.ICE_ETHER);
                            entries.add(ModItems.RAW_ICE_ETHER);
                        }).build()
        );

    }
}
