package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void updateAll() {
        Item[] items = new Item[]{
            new AgedBrie(2, 5),
            new Sulfuras(2, 55),
            new BackStagePasses(2, 10),
            new BackStagePasses(0, 0),
            new BackStagePasses(14, 9),
            new BackStagePasses(-1, 0),
            new AgedBrie( -1, 5),
            new Item("+5 Dexterity Vest", 10, 20),
        };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(6, app.items[0].quality);
        assertEquals(1, app.items[0].sellIn);

        assertEquals(55, app.items[1].quality);
        assertEquals(2, app.items[1].sellIn);

        assertEquals(13, app.items[2].quality);
        assertEquals(1, app.items[2].sellIn);

        assertEquals(0, app.items[3].quality);
        assertEquals(-1, app.items[3].sellIn);

        assertEquals(10, app.items[4].quality);
        assertEquals(13, app.items[4].sellIn);

        assertEquals(0, app.items[5].quality);
        assertEquals(-2, app.items[5].sellIn);

        assertEquals(7, app.items[6].quality);
        assertEquals(-2, app.items[6].sellIn);

        assertEquals(19, app.items[7].quality);
        assertEquals(9, app.items[7].sellIn);

    }

}
