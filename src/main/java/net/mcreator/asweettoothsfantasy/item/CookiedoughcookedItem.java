
package net.mcreator.asweettoothsfantasy.item;

@SweettoothFantasyModElements.ModElement.Tag
public class CookiedoughcookedItem extends SweettoothFantasyModElements.ModElement {

	@ObjectHolder("sweettooth_fantasy:cookiedoughcooked")
	public static final Item block = null;

	public CookiedoughcookedItem(SweettoothFantasyModElements instance) {
		super(instance, 61);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ASweetToothsFantasyItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(2).saturation(0.2f)

							.build()));
			setRegistryName("cookiedoughcooked");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Still a little raw in the middle, Maybe you could have made it a little flatter."));
		}

	}

}
