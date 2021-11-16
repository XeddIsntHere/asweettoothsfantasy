
package net.mcreator.asweettoothsfantasy.item;

@SweettoothFantasyModElements.ModElement.Tag
public class ChocolateEggItem extends SweettoothFantasyModElements.ModElement {

	@ObjectHolder("sweettooth_fantasy:chocolate_egg")
	public static final Item block = null;

	public ChocolateEggItem(SweettoothFantasyModElements instance) {
		super(instance, 67);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ASweetToothsFantasyItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(5).saturation(0.4f)

							.build()));
			setRegistryName("chocolate_egg");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

	}

}
