package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Fabio Campos
 *
 */

public class DelegationSortedIntList implements IntegerList {
    private SortedIntList sortedList = new SortedIntList();
    private int totalAdded = 0;

    public int getTotalAdded() {
       return totalAdded;
    }

    public boolean add(int i) {
        totalAdded++;
        return sortedList.add(i);
    }

    public boolean addAll(IntegerList otherList) {
        totalAdded += otherList.size();
        return sortedList.addAll(otherList);
    }

    public int get(int index) {
        return sortedList.get(index);
    }

    public boolean remove(int num) {
        return sortedList.remove(num);
    }

    public boolean removeAll(IntegerList list) {
        return sortedList.removeAll(list);
    }

    public int size() {
        return sortedList.size();
    }
}