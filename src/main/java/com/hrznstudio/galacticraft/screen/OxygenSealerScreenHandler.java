/*
 * Copyright (c) 2019-2021 HRZN LTD
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.hrznstudio.galacticraft.screen;

import com.hrznstudio.galacticraft.block.entity.OxygenSealerBlockEntity;
import com.hrznstudio.galacticraft.screen.slot.ChargeSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.Property;
import net.minecraft.screen.slot.Slot;

/**
 * @author <a href="https://github.com/StellarHorizons">StellarHorizons</a>
 */
public class OxygenSealerScreenHandler extends MachineScreenHandler<OxygenSealerBlockEntity> {

    public OxygenSealerScreenHandler(int syncId, PlayerEntity player, OxygenSealerBlockEntity machine) {
        super(syncId, player, machine, GalacticraftScreenHandlerTypes.OXYGEN_SEALER_HANDLER);
        this.addSlot(new ChargeSlot(machine.getWrappedInventory(), 0, 8, 62));

        this.addPlayerInventorySlots(0, 84);
    }

    public OxygenSealerScreenHandler(int syncId, PlayerInventory inv, PacketByteBuf buf) {
        this(syncId, inv.player, (OxygenSealerBlockEntity) inv.player.world.getBlockEntity(buf.readBlockPos()));
    }
}