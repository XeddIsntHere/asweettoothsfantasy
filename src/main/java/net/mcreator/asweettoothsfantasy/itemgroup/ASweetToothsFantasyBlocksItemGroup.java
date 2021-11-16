
package net.mcreator.asweettoothsfantasy.itemgroup;

@SweettoothFantasyModElements.ModElement.Tag
public class ASweetToothsFantasyBlocksItemGroup extends SweettoothFantasyModElements.ModElement {

	public ASweetToothsFantasyBlocksItemGroup(SweettoothFantasyModElements instance) {
		super(instance, 97);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("taba_sweet_tooths_fantasy_blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CinnamonLeavesBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
