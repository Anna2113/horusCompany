package org.example.model;

import org.example.Block;
import org.example.CompositeBlock;

import java.util.List;

public class SingleBlock implements CompositeBlock {

    public String color;

    public String material;

    private List<Block> blocks;

    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }

    public SingleBlock() {}
    public SingleBlock(String color, String material) {
        this.color = color;
        this.material = material;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public List<Block> getBlocks() {
        return blocks;
    }

    @Override
    public String toString() {
        return "Block: " + "{color: " + color + ", material: " + material + "}.";
    }

}
