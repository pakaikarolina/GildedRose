package com.gildedrose;

public class ConjuredDecorator implements Item {
    public Item item;

    public ConjuredDecorator(Item item) {
        this.item = item;
    }

    @Override
    public void updateItem() {
        int qualityBefore = item.getQuality();
        item.updateItem();
        int qualityAfter = item.getQuality();
        int diff = qualityBefore - qualityAfter;
        setQuality(qualityAfter - diff);
    }

    @Override
    public int getQuality() {
        return item.getQuality();
    }

    @Override
    public void setQuality(int quality) {
        item.setQuality(quality);
    }

    @Override
    public int getSellIn() {
        return item.getSellIn();
    }
}
