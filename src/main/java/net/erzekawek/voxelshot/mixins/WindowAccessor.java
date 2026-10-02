/*
 * MIT License
 *
 * Copyright (c) 2026 Fring (Voxelshot fork)
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

package net.erzekawek.voxelshot.mixins;

import com.mojang.blaze3d.platform.Window;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/**
 * Accessor mixin for {@link Window}'s private fields.
 * <p>
 * Used to set framebufferWidth/framebufferHeight directly during capture and
 * call setGuiScale to recalculate guiScaledWidth/guiScaledHeight.
 */
@Mixin(Window.class)
public interface WindowAccessor {

    @Accessor("framebufferWidth")
    int voxelshot$getFramebufferWidth();

    @Accessor("framebufferWidth")
    void voxelshot$setFramebufferWidth(int value);

    @Accessor("framebufferHeight")
    int voxelshot$getFramebufferHeight();

    @Accessor("framebufferHeight")
    void voxelshot$setFramebufferHeight(int value);

    @Accessor("guiScale")
    int voxelshot$getGuiScale();
}
