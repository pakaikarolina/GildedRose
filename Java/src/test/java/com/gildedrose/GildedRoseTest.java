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
            new AgedBrie(-1, 5),
            new RegularItem("+5 Dexterity Vest", 10, 20),
            new ConjuredDecorator(new RegularItem("Mana cake", 5, 13)),
            new ConjuredDecorator(new AgedBrie(2, 5)),
            new ConjuredDecorator(new Sulfuras(2, 55)),
            new ConjuredDecorator(new BackStagePasses(2, 10))
        };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(6, app.items[0].getQuality());
        assertEquals(1, app.items[0].getSellIn());

        assertEquals(55, app.items[1].getQuality());
        assertEquals(2, app.items[1].getSellIn());

        assertEquals(13, app.items[2].getQuality());
        assertEquals(1, app.items[2].getSellIn());

        assertEquals(0, app.items[3].getQuality());
        assertEquals(-1, app.items[3].getSellIn());

        assertEquals(10, app.items[4].getQuality());
        assertEquals(13, app.items[4].getSellIn());

        assertEquals(0, app.items[5].getQuality());
        assertEquals(-2, app.items[5].getSellIn());

        assertEquals(7, app.items[6].getQuality());
        assertEquals(-2, app.items[6].getSellIn());

        assertEquals(19, app.items[7].getQuality());
        assertEquals(9, app.items[7].getSellIn());

        assertEquals(11, app.items[8].getQuality());
        assertEquals(4, app.items[8].getSellIn());

        assertEquals(7, app.items[9].getQuality());
        assertEquals(1, app.items[9].getSellIn());

        assertEquals(55, app.items[10].getQuality());
        assertEquals(2, app.items[10].getSellIn());

        assertEquals(16, app.items[11].getQuality());
        assertEquals(1, app.items[11].getSellIn());
    }
}
