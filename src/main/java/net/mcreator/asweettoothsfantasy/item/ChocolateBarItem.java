
package net.mcreator.asweettoothsfantasy.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.asweettoothsfantasy.itemgroup.ASweetToothsFantasyItemGroup;
import net.mcreator.asweettoothsfantasy.SweettoothFantasyModElements;

@SweettoothFantasyModElements.ModElement.Tag
public class ChocolateBarItem extends SweettoothFantasyModElements.ModElement {
	@ObjectHolder("sweettooth_fantasy:chocolate_bar")
	public static final Item block = null;
	public ChocolateBarItem(SweettoothFantasyModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ASweetToothsFantasyItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(7).saturation(0.3f).build()));
			setRegistryName("chocolate_bar");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
