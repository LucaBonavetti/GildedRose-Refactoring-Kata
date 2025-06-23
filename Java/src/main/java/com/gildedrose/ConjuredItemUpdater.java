package com.gildedrose;

public class ConjuredItemUpdater implements ItemUpdater {
    @Override
    public void update(Item item) {
        item.sellIn--;

        int degrade = (item.sellIn < 0) ? 4 : 2;
        item.quality -= degrade;

        if (item.quality < 0) {
            item.quality = 0;
        }
    }
}
