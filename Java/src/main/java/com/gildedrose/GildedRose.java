package com.gildedrose;

import java.util.HashMap;
import java.util.Map;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            getUpdater(item).update(item);
        }
    }

    private ItemUpdater getUpdater(Item item) {
        String name = item.name;

        if (name.equals("Aged Brie")) {
            return new AgedBrieUpdater();
        } else if (name.equals("Sulfuras, Hand of Ragnaros")) {
            return new SulfurasUpdater();
        } else if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            return new BackstagePassUpdater();
        } else if (name.toLowerCase().contains("conjured")) {
            return new ConjuredItemUpdater();
        } else {
            return new NormalItemUpdater();
        }
    }
}