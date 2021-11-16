
package net.mcreator.asweettoothsfantasy.item;

@SweettoothFantasyModElements.ModElement.Tag
public class CinnamonBarkItem extends SweettoothFantasyModElements.ModElement {

	@ObjectHolder("sweettooth_fantasy:cinnamon_bark")
	public static final Item block = null;

	public CinnamonBarkItem(SweettoothFantasyModElements instance) {
		super(instance, 91);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ASweetToothsFantasyItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("cinnamon_bark");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
