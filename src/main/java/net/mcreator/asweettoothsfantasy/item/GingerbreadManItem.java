
package net.mcreator.asweettoothsfantasy.item;

@SweettoothFantasyModElements.ModElement.Tag
public class GingerbreadManItem extends SweettoothFantasyModElements.ModElement {

	@ObjectHolder("sweettooth_fantasy:gingerbread_man")
	public static final Item block = null;

	public GingerbreadManItem(SweettoothFantasyModElements instance) {
		super(instance, 70);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ASweetToothsFantasyItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(7).saturation(0.5f)

							.build()));
			setRegistryName("gingerbread_man");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

	}

}
