
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
public class MarshmallowToastedItem extends SweettoothFantasyModElements.ModElement {
	@ObjectHolder("sweettooth_fantasy:marshmallow_toasted")
	public static final Item block = null;
	public MarshmallowToastedItem(SweettoothFantasyModElements instance) {
		super(instance, 85);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ASweetToothsFantasyItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(0.3f).build()));
			setRegistryName("marshmallow_toasted");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
