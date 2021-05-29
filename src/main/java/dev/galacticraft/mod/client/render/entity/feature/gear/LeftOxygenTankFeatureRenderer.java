/*
 * Copyright (c) 2019-2021 Team Galacticraft
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

package dev.galacticraft.mod.client.render.entity.feature.gear;

import dev.galacticraft.mod.client.render.entity.feature.ModelTransformer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

/**
 * @author <a href="https://github.com/TeamGalacticraft">TeamGalacticraft</a>
 */
@Environment(EnvType.CLIENT)
public class LeftOxygenTankFeatureRenderer<T extends Entity, M extends EntityModel<T>> extends OxygenTankFeatureRenderer<T, M> {

    public LeftOxygenTankFeatureRenderer(FeatureRendererContext<T, M> context, float extra, ModelTransformer<T> leftTankTransforms, @NotNull OxygenTankTextureOffset textureType) {
        super(context, extra, leftTankTransforms, textureType);
        this.oxygenTankLight.setPivot(0.0F, 2.0F, 0.0F);
        this.oxygenTankLight.addCuboid(-3.0F, 1.0F, 2.0F, 3, 6, 4, extra);
        this.oxygenTankMedium.setPivot(0.0F, 2.0F, 0.0F);
        this.oxygenTankMedium.addCuboid(-3.0F, 1.0F, 2.0F, 3, 6, 4, extra);
        this.oxygenTankHeavy.setPivot(0.0F, 2.0F, 0.0F);
        this.oxygenTankHeavy.addCuboid(-3.0F, 1.0F, 2.0F, 3, 6, 4, extra);
        this.oxygenTankInfinite.setPivot(0.0F, 2.0F, 0.0F);
        this.oxygenTankInfinite.addCuboid(-3.0F, 1.0F, 2.0F, 3, 6, 4, extra);
    }
}