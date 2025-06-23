package com.gildedrose;

public class ConjuredItemUpdater implements ItemUpdater {
    @Override
    public void update(Item item) {
        item.sellIn--;

        if (item.quality > 0) {
            item.quality -= 2;
            if (item.sellIn < 0) {
                item.quality -= 2;
            }
        }

        if (item.quality < 0) {
            item.quality = 0;
        }
    }
}
