package structures;

import java.util.Arrays;
import structures_.CustomEntry;

public class HashTable {

    private static final int INITIAL_CAPACITY = 10;
    private static final Double LOAD_FACTOR = 0.75;
    private int currentSize;
    private CustomEntry[] table;

    public HashTable() {
        table = new CustomEntry[INITIAL_CAPACITY];
        currentSize = 0;
    }

    private int hashThis(String key) {
        return key.hashCode() % table.length;
    }

    public void put(String key, Integer data) {
        int hash = hashThis(key);
        while (table[hash] != null && table[hash].getKey() != key) {
            hash = (hash + 1) % table.length;
        }
        table[hash] = new CustomEntry(key, data);
    }

    public Integer get(String key) {
        int hash = hashThis(key);
        while (table[hash] != null && table[hash].getKey() != key) {
            hash = (hash + 1) % table.length;
        }
        if (table[hash] == null) {
            return -1;
        } else {
            return table[hash].getData();
        }
    }

    @Override
    public String toString() {
        return "HashTable{table=" + Arrays.toString(table) + '}';
    }
}
