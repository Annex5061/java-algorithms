import java.util.ArrayList;
import java.util.ListIterator;

class Main {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(6);
        nums.add(7);
        System.out.println("ArrayList: " + nums);

        ListIterator<Integer> iterate = nums.listIterator();

        int num1 = iterate.next();
        System.out.println("Next Element: " + num1);

        int index1 = iterate.nextIndex();
        System.out.println("Position of Next Element: " + index1);

        System.out.println("Is there any next element? " + iterate.hasNext());
    }
}
