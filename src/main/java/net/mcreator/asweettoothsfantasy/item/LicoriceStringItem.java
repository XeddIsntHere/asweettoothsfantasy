
package net.mcreator.asweettoothsfantasy.item;

@SweettoothFantasyModElements.ModElement.Tag
public class LicoriceStringItem extends SweettoothFantasyModElements.ModElement {

	@ObjectHolder("sweettooth_fantasy:licorice_string")
	public static final Item block = null;

	public LicoriceStringItem(SweettoothFantasyModElements instance) {
		super(instance, 40);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ASweetToothsFantasyItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(5).saturation(0.3f)

							.build()));
			setRegistryName("licorice_string");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

	}

}
