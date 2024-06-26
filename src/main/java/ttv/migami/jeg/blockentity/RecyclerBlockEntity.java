package ttv.migami.jeg.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.block.state.BlockState;
import ttv.migami.jeg.common.container.RecyclerMenu;
import ttv.migami.jeg.init.ModRecipeTypes;
import ttv.migami.jeg.init.ModTileEntities;

public class RecyclerBlockEntity extends AbstractRecyclerBlockEntity {
    public RecyclerBlockEntity(BlockPos p_155545_, BlockState p_155546_) {
        super(ModTileEntities.RECYCLER.get(), p_155545_, p_155546_, ModRecipeTypes.RECYCLING);
    }

    protected Component getDefaultName() {
        return new TranslatableComponent("container.jeg.recycler");
    }

    protected AbstractContainerMenu createMenu(int p_59293_, Inventory p_59294_) {
        return new RecyclerMenu(p_59293_, p_59294_, this, this.dataAccess);
    }
}
