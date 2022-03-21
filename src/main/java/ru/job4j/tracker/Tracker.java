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

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        /* Находим индекс */
        int index = indexOf(id);
        item.setId(items[index].getId());
        items[index] = item;
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1;
    }
}