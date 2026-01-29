import { SortedIntList } from './hidden/SortedIntListLibrary.js'
import { IntegerList } from './IntegerList.js'
/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Fabio Campos
 *
 */

class DelegationSortedIntList {
  private totalAdded = 0;
  private sortedList: SortedIntList = new SortedIntList();

  getTotalAdded(): number {
    return this.totalAdded;
  }

  add (num: number): boolean {
    this.totalAdded += 1;
    return this.sortedList.add(num);
  }

  addAll (otherList: IntegerList): boolean {
    this.totalAdded += otherList.size();
    return this.sortedList.addAll(otherList);
  }

  get (index: number): number {
    return this.sortedList.get(index);
  }

  remove (num: number): boolean {
    return this.sortedList.remove(num);
  }

  removeAll (list: IntegerList): boolean {
    return this.sortedList.removeAll(list);
  }

  size (): number {
    return this.sortedList.size();
  }

}

export { DelegationSortedIntList }
