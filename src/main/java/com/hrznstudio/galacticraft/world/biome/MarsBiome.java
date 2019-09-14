/*
 * Copyright (c) 2019 HRZN LTD
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

package com.hrznstudio.galacticraft.world.biome;

import com.hrznstudio.galacticraft.world.gen.surfacebuilder.GalacticraftSurfaceBuilders;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;

/**
 * @author <a href="https://github.com/StellarHorizons">StellarHorizons</a>
 */
public final class MarsBiome extends Biome {

    public MarsBiome() {
        super((new Settings())
                .configureSurfaceBuilder(SurfaceBuilder.DEFAULT, GalacticraftSurfaceBuilders.MARS_CONFIG)
                .precipitation(Precipitation.NONE)
                .category(Category.NONE)
                .depth(0.075F)
                .scale(0.075F)
                .temperature(0.0F)
                .downfall(0.003F)
                .waterColor(9937330)
                .waterFogColor(11253183)
                .parent(null));
        this.flowerFeatures.clear();
        this.addSpawn(EntityCategory.MONSTER, new SpawnEntry(EntityType.ZOMBIE, 1, 1, 1));
    }

    @Override
    public String getTranslationKey() {
        return "biome.galacticraft-rewoven.moon";
    }

    @Override
    public int getSkyColor(float float_1) {
        return 16747622;
    }

    @Override
    public int getFoliageColorAt(BlockPos blockPos_1) {
        return waterFogColor;
    }

    @Override
    public int getGrassColorAt(BlockPos blockPos_1) {
        return waterColor;
    }
}
