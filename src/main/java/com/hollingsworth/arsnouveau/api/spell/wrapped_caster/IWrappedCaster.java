package com.hollingsworth.arsnouveau.api.spell.wrapped_caster;

import com.hollingsworth.arsnouveau.api.item.inv.FilterableItemHandler;
import com.hollingsworth.arsnouveau.api.item.inv.InventoryManager;
import com.hollingsworth.arsnouveau.api.spell.SpellContext;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public interface IWrappedCaster{

    SpellContext.CasterType getCasterType();

    default InventoryManager getInvManager(){
        return new InventoryManager(getInventory());
    }

    @NotNull
    default List<FilterableItemHandler> getInventory() {
        return new ArrayList<>();
    }
}
