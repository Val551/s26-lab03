import { SortedIntList } from './hidden/SortedIntListLibrary.js'
import { IntegerList } from './IntegerList.js'

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Fabio Campos
 *
 */

class InheritanceSortedIntList extends SortedIntList {
  private totalAdded = 0;

  getTotalAdded(): number {
    return this.totalAdded;
  }

  add (num: number): boolean {
    this.totalAdded += 1;
    return super.add(num);
  }

  addAll (otherList: IntegerList): boolean {
    let success = false
    for (let i = 0; i < otherList.size(); i++) {
      this.totalAdded += 1;
      success ||= super.add(otherList.get(i))
    }
    return success
  }
}

export { InheritanceSortedIntList }


