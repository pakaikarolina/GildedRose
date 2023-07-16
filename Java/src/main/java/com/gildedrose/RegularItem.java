package com.gildedrose;

public class RegularItem implements Item {

    public String name;

    public int sellIn;

    public int quality;

    public RegularItem(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }

    @Override
    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public int getSellIn() {
        return sellIn;
    }

    @Override
    public void updateItem() {
        this.sellIn--;
        if (this.quality < 50 && this.quality > 1) {
            this.quality--;
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
