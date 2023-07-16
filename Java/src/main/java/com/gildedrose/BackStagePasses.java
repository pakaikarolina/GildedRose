package com.gildedrose;

public class BackStagePasses extends RegularItem {

    public static final int MAX_QUALITY = 50;

    public BackStagePasses(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void updateItem() {
        if (this.quality < MAX_QUALITY) {
            if (this.sellIn <= 0) {
                this.quality = 0;
            } else if (this.sellIn <= 5) {
                this.quality += 3;
            } else if (this.sellIn <= 10) {
                this.quality += 2;
            } else
                this.quality++;
        }
        sellIn--;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
