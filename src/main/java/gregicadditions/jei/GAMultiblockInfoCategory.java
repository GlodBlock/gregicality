package gregicadditions.jei;

import com.google.common.collect.Lists;
import gregicadditions.jei.multi.advance.*;
import gregicadditions.jei.multi.simple.*;
import gregtech.integration.jei.multiblock.MultiblockInfoRecipeWrapper;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.gui.recipes.RecipeLayout;
import net.minecraft.client.resources.I18n;

public class GAMultiblockInfoCategory implements IRecipeCategory<MultiblockInfoRecipeWrapper> {
	private final IDrawable background;

	public GAMultiblockInfoCategory(IJeiHelpers helpers) {
		this.background = helpers.getGuiHelper().createBlankDrawable(176, 166);
	}

	public static void registerRecipes(IModRegistry registry) {
		registry.addRecipes(Lists.newArrayList(
				new MultiblockInfoRecipeWrapper(new AssemblyLineInfo()),
				new MultiblockInfoRecipeWrapper(new FusionReactor1Info()),
				new MultiblockInfoRecipeWrapper(new FusionReactor2Info()),
				new MultiblockInfoRecipeWrapper(new FusionReactor3Info()),
				new MultiblockInfoRecipeWrapper(new ProcessingArrayInfo()),
				new MultiblockInfoRecipeWrapper(new LargeThermalCentrifugeInfo()),
				new MultiblockInfoRecipeWrapper(new LargeElectrolyzerInfo()),
				new MultiblockInfoRecipeWrapper(new LargeCentrifugeInfo()),
				new MultiblockInfoRecipeWrapper(new LargeCuttingInfo()),
				new MultiblockInfoRecipeWrapper(new LargeMixerInfo()),
				new MultiblockInfoRecipeWrapper(new LargeMultiUseInfo()),
				new MultiblockInfoRecipeWrapper(new LargeMaceratorInfo()),
				new MultiblockInfoRecipeWrapper(new LargeSifterInfo()),
				new MultiblockInfoRecipeWrapper(new LargeWashingPlantInfo()),
				new MultiblockInfoRecipeWrapper(new LargeWiremillInfo()),
				new MultiblockInfoRecipeWrapper(new LargeChemicalReactorInfo()),
				new MultiblockInfoRecipeWrapper(new LargeExtruderInfo()),
				new MultiblockInfoRecipeWrapper(new VolcanusInfo()),
				new MultiblockInfoRecipeWrapper(new LargeAssemblerInfo()),
				new MultiblockInfoRecipeWrapper(new LargeBenderAndFormingInfo()),
				new MultiblockInfoRecipeWrapper(new CrackerUnitInfo())
		), "gtadditions:multiblock_info2");
	}

	@Override
	public String getUid() {
		return "gtadditions:multiblock_info2";
	}

	@Override
	public String getTitle() {
		return I18n.format("gregtech.multiblock.title", new Object[0]);
	}

	@Override
	public String getModName() {
		return "gtadditions";
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout, MultiblockInfoRecipeWrapper recipeWrapper, IIngredients ingredients) {
		recipeWrapper.setRecipeLayout((RecipeLayout) recipeLayout);
	}
}