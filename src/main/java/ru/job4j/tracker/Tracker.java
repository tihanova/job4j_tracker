package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
private final List<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> rls = new ArrayList<>();
        for (Item item: items) {
            if (item.getName().equals(key)) {
                rls.add(item);
            }
        }
        return rls;
    }

    private int indexOf(int id) {
        int rsl = -1;
        int index = 0;
        for (Item item: items) {
            if (item.getId() == id) {
                rsl = index;
            }
            index++;
        }
        return rsl;
    }

    public Item findById(int id) {
        for (Item item: items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return  null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            items.set(index, item);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items.remove(index);
        }
        return rsl;
    }
}