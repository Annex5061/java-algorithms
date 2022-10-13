public class LinearSearch {

    public static final int unorderedLinearSearch(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            int iValue = array[i];
            if (value == iValue)
                return i;
        }
        return Integer.MAX_VALUE;
    }
    
    public static void main(String[] args) {
      int[] integers = {1,2,3,4,5,6,7,8,8,8,9,9,9,0};
         //the element that should be found
         int shouldBeFound = 9;

         int atIndex = LinearSearch.unorderedLinearSearch(shouldBeFound, integers);

         System.out.println(String.format("Should be found: %d. Found %d at index %d. An array length %d"
                 , shouldBeFound, integers[atIndex], atIndex, integers.length));
         
 }
}
