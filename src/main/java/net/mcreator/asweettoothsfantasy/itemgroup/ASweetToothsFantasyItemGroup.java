
package net.mcreator.asweettoothsfantasy.itemgroup;

@SweettoothFantasyModElements.ModElement.Tag
public class ASweetToothsFantasyItemGroup extends SweettoothFantasyModElements.ModElement {

	public ASweetToothsFantasyItemGroup(SweettoothFantasyModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("taba_sweet_tooths_fantasy") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CaramelItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
