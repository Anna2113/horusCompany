package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<Block> blockList = new ArrayList<>(Arrays.asList(
                new Wall("red", "brick"),
                new Wall("white", "plaster"),
                new Wall("silver", "metal"),
                new Wall("grey", "stone"),
                new Wall("silver", "stone"),
                new Wall("black", "metal")

        ));
        System.out.println("----------------------------");

        Wall wall = new Wall();
        wall.setBlocks(blockList);

        Optional<Block> optionalBlock;
        optionalBlock = wall.findBlockByColor("silver");
        System.out.println("The block found is: " + optionalBlock.get().getColor()
                + " and built of " + optionalBlock.get().getMaterial() + ".");

        System.out.println("----------------------------");

        System.out.println("Found blocks built of stone are: ");

        List<Block> blocks = wall.findBlocksByMaterial("stone");
        for (Block block : blocks) {
            System.out.println("Block " + block.getMaterial() + " in color: " + block.getColor());
        }

        System.out.println("----------------------------");

        System.out.println("The list contains " + wall.count() + " blocks.");

        System.out.println("----------------------------");

        System.out.println("blockList elements:");
        for (Block block : wall.getBlocks()) {
            System.out.println(block);
        }
    }
}