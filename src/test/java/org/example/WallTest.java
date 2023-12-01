package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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
        Wall element = new Wall("red", "brick");
        Assertions.assertEquals("red", element.getColor());
    }

    @Test
    void shouldSayThatBlockIsStone() {
        Wall element = new Wall("grey", "stone");
        Assertions.assertEquals("stone", element.getMaterial());
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