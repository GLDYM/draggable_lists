package com.mrmelon54.DraggableLists.mixin.packs;

import com.mrmelon54.DraggableLists.duck.ResourcePackOrganizerDuckProvider;
import net.minecraft.client.gui.screens.packs.PackSelectionModel;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(PackSelectionModel.class)
public abstract class MixinPackSelectionModel implements ResourcePackOrganizerDuckProvider {
    @Shadow
    @Final
    Runnable onListChanged;

    @Override
    public void draggable_lists$updateSelectedList() {
        onListChanged.run();
    }
}
