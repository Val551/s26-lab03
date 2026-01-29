package edu.cmu.cs.cs214.rec04;




/**
* InheritanceSortedIntList -- a variant of a SortedIntList that keeps
* count of the number of attempted element insertions (not to be confused
* with the current size, which goes down when an element is removed)
* and exports an accessor (totalAdded) for this count.
*
* @author Fabio Campos
*
*/


public class InheritanceSortedIntList extends SortedIntList {
   private int totalAdded = 0;


   public int getTotalAdded() {
       return totalAdded;
   }


   @Override
   public boolean add(int num) {
       totalAdded++;
       return super.add(num);
   }


   @Override
   public boolean addAll(IntegerList otherList) {
       totalAdded += otherList.size();
       return super.addAll(otherList);
   }
  
}






// InheritanceSortedIntList should extend SortedIntList.
// The SortedIntList contains two methods that add elements, add and addAll.
// You should override both of these methods to track how many elements have been added.
// Make sure you check that getTotalAdded works with both add and addAll.


