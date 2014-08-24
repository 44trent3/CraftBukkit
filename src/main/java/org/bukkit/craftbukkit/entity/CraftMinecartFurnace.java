package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityMinecartFurnace;

import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.PoweredMinecart;
import org.bukkit.entity.VehicleType;

@SuppressWarnings("deprecation")
public class CraftMinecartFurnace extends CraftMinecart implements PoweredMinecart {
    public CraftMinecartFurnace(CraftServer server, EntityMinecartFurnace entity) {
        super(server, entity);
    }

    @Override
    public String toString() {
        return "CraftMinecartFurnace";
    }

    public EntityType getType() {
        return EntityType.MINECART_FURNACE;
    }

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.MINECART_FURNACE;
    }
}
