package com.gildedrose;

public class AgedBrie extends RegularItem {

    public static final int MAX_QUALITY = 50;

    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void updateItem() {
        if (this.sellIn >= 0 && this.quality < MAX_QUALITY) {
            this.quality++;
        }
        if (this.sellIn < 0 ) {
            this.quality += 2;
        }
        this.sellIn--;
    }

}
