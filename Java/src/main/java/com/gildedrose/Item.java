package com.gildedrose;

public interface Item {

    void updateItem();

    int getQuality();

    void setQuality(int quality);

    int getSellIn();
    @Override
    String toString();
}
