
package net.mcreator.asweettoothsfantasy.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.asweettoothsfantasy.block.CinnamonLeavesBlock;
import net.mcreator.asweettoothsfantasy.SweettoothFantasyModElements;

@SweettoothFantasyModElements.ModElement.Tag
public class ASweetToothsFantasyBlocksItemGroup extends SweettoothFantasyModElements.ModElement {
	public ASweetToothsFantasyBlocksItemGroup(SweettoothFantasyModElements instance) {
		super(instance, 97);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("taba_sweet_tooths_fantasy_blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CinnamonLeavesBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
