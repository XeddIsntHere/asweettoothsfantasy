
package net.mcreator.asweettoothsfantasy.item;

@SweettoothFantasyModElements.ModElement.Tag
public class MarshmallowItem extends SweettoothFantasyModElements.ModElement {

	@ObjectHolder("sweettooth_fantasy:marshmallow")
	public static final Item block = null;

	public MarshmallowItem(SweettoothFantasyModElements instance) {
		super(instance, 83);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ASweetToothsFantasyItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(3).saturation(0.4f)

							.build()));
			setRegistryName("marshmallow");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

	}

}
