package lii.autotextprocessor4dataflow.model;

import java.util.*;

public class DataManager<T> {

    private final Set<T> dataSet;


    public DataManager() {
        this.dataSet = new HashSet<>();
    }

    // Method to add an entry to the dataset for the manager instance
    public boolean addEntry(T entry) {
        return dataSet.add(entry);
    }

    // Method to remove an entry from the dataset for the manager instance
    public boolean removeEntry(T entry) {
        return dataSet.remove(entry);
    }

    // Method to check if an entry exists in the dataset for the manager instance
    public boolean containsEntry(T entry) {
        return dataSet.contains(entry);
    }

    // Method to retrieve all entries as a list for the manager instance
    public List<T> getAllEntries() {
        return new ArrayList<>(dataSet);
    }

    // Method to clear all entries from the dataset for the manager instance
    public void clearAllEntries() {
        dataSet.clear();
    }
}