package com.atherys.professions.config;

import com.atherys.professions.api.CraftingType;
import com.atherys.professions.api.CraftingTypes;
import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;
import org.spongepowered.api.item.inventory.ItemStackSnapshot;
import org.spongepowered.api.item.recipe.crafting.Ingredient;

import java.util.ArrayList;
import java.util.List;

@ConfigSerializable
public class BlueprintConfig {

    @Setting("id")
    String id;

    @Setting("permission")
    String permission;

    @Setting("crafting-type")
    CraftingType craftingType = CraftingTypes.CRAFTING_TABLE;

    @Setting("ingredients")
    List<BlueprintIngredientConfig> ingredients = new ArrayList<>();

    @Setting("result")
    ItemStackSnapshot result;

    public BlueprintConfig() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public CraftingType getCraftingType() {
        return craftingType;
    }

    public void setCraftingType(CraftingType craftingType) {
        this.craftingType = craftingType;
    }

    public List<BlueprintIngredientConfig> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<BlueprintIngredientConfig> ingredients) {
        this.ingredients = ingredients;
    }

    public ItemStackSnapshot getResult() {
        return result;
    }

    public void setResult(ItemStackSnapshot result) {
        this.result = result;
    }
}
