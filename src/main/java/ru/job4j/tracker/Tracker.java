package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        int sizeNew = 0;
        Item[] rls = new Item[100];
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item != null) {
                rls[sizeNew] = item;
                sizeNew++;
            }
        }
        rls = Arrays.copyOf(rls, sizeNew);
        return rls;
    }

    public Item[] findByName(String key) {
        int sizeNew = 0;
        Item[] rls = new Item[100];
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (key.equals(item.getName())) {
                rls[sizeNew] = item;
                sizeNew++;
            }
        }
        rls = Arrays.copyOf(rls, sizeNew);
        return rls;
    }
}