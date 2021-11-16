
package net.mcreator.asweettoothsfantasy.item;

@SweettoothFantasyModElements.ModElement.Tag
public class SweetBerryMuffinItem extends SweettoothFantasyModElements.ModElement {

	@ObjectHolder("sweettooth_fantasy:sweet_berry_muffin")
	public static final Item block = null;

	public SweetBerryMuffinItem(SweettoothFantasyModElements instance) {
		super(instance, 79);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ASweetToothsFantasyItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(5).saturation(0.5f)

							.build()));
			setRegistryName("sweet_berry_muffin");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

	}

}
