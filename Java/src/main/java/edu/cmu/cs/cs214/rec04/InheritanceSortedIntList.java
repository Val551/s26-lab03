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
       totalAdded += 1;
       return super.add(num);
   }


   @Override
   public boolean addAll(IntegerList otherList) {
        boolean success = false;
        for (int i = 0; i < otherList.size(); i++)
        {
            totalAdded += 1;   
            success |= super.add(otherList.get(i));
        }

        return success;
   }
  
}

