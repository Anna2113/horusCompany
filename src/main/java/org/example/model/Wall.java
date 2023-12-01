package org.example.model;

import org.example.Block;
import org.example.Structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall extends SingleBlock implements Structure{

    private List<Block> blocks;

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
}
