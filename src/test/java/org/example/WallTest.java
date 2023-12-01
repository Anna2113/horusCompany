package org.example;

import org.example.model.SingleBlock;
import org.example.model.Wall;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class WallTest {
    List<Block> blockList = new ArrayList<>(Arrays.asList(
            new Wall("red", "brick"),
            new Wall("grey", "stone"),
            new Wall("silver", "metal"),
            new Wall("white", "plaster"),
            new Wall("green", "stone"),
            new Wall("black", "granit"),
            new Wall("white", "stone")
    ));

    List<Block> newListOfBlock = new ArrayList<>();


    @Test
    void shouldSayThatBlockIsRed() {
        SingleBlock singleBlock = new SingleBlock("red", "brick");
        Assertions.assertEquals("red", singleBlock.getColor());
    }

    @Test
    void shouldSayThatBlockIsStone() {
        SingleBlock singleBlock = new SingleBlock("grey", "stone");
        Assertions.assertEquals("stone", singleBlock.getMaterial());
    }

    @Test
    void shouldSayThatFoundElementWithRedColorOnTheBlockList() {
        Wall wall = new Wall();
        wall.setBlocks(blockList);

        Assertions.assertTrue(true, String.valueOf(wall.findBlockByColor("red")));
    }

    @Test
    void shouldSayThatFoundElementsBuildOfStoneOnTheBlockList() {
        Wall wall = new Wall();
        wall.setBlocks(blockList);

        Assertions.assertTrue(true, String.valueOf(wall.findBlocksByMaterial("stone")));
    }

    @Test
    void shouldSayThatCountOfBlockOnBlockListIsEqual7() {
        Wall wall = new Wall();
        wall.setBlocks(blockList);

        Assertions.assertEquals(7, wall.count());
    }

    @Test
    void shouldSayThatListIsEmpty() {
        Wall wall = new Wall();
        wall.setBlocks(newListOfBlock);

        Assertions.assertTrue(newListOfBlock.isEmpty());
    }
}