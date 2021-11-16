
package net.mcreator.asweettoothsfantasy.item;

@SweettoothFantasyModElements.ModElement.Tag
public class PeppermintItem extends SweettoothFantasyModElements.ModElement {

	@ObjectHolder("sweettooth_fantasy:peppermint")
	public static final Item block = null;

	public PeppermintItem(SweettoothFantasyModElements instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ASweetToothsFantasyItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(0.3f)

							.build()));
			setRegistryName("peppermint");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

	}

}
