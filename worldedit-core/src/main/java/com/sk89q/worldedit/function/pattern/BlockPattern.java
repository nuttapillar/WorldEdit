/*
 * WorldEdit, a Minecraft world manipulation toolkit
 * Copyright (C) sk89q <http://www.sk89q.com>
 * Copyright (C) WorldEdit team and contributors
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.sk89q.worldedit.function.pattern;

import com.sk89q.worldedit.Vector;
import com.sk89q.worldedit.blocks.BaseBlock;
import com.sk89q.worldedit.blocks.type.BlockStateHolder;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * A pattern that returns the same {@link BaseBlock} each time.
 */
public class BlockPattern extends AbstractPattern {

    private BlockStateHolder block;

    /**
     * Create a new pattern with the given block.
     *
     * @param block the block
     */
    public BlockPattern(BlockStateHolder block) {
        setBlock(block);
    }

    /**
     * Get the block.
     *
     * @return the block that is always returned
     */
    public BlockStateHolder getBlock() {
        return block;
    }

    /**
     * Set the block that is returned.
     *
     * @param block the block
     */
    public void setBlock(BlockStateHolder block) {
        checkNotNull(block);
        this.block = block;
    }

    @Override
    public BlockStateHolder apply(Vector position) {
        return block;
    }

}
