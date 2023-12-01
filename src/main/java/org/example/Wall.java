package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure, CompositeBlock {

    private List<Block> blocks;

    public String color;

    public String material;

    public Wall() {}

    public Wall(String color, String material) {
        this.color = color;
        this.material = material;
    }
    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        return Optional.of(blocks.stream()
                .filter(block -> color.equals(block.getColor()))
                .findAny()
                .orElseThrow());
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        List<Block> newList = new ArrayList<>();
        if (blocks.isEmpty()) {
            throw new BlocksNotFoundException("The list is empty.");
        }
        for (Block block : blocks) {
            if (material.equals(block.getMaterial())) {
                newList.add(block);
            }
        }
        if (newList.isEmpty()) {
            throw new BlocksNotFoundException("The list is empty");
        }
        return newList;
    }

    @Override
    public int count() {
        return blocks.size();
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
