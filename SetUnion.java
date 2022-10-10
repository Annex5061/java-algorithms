import java.util.LinkedHashSet;

class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> nums = new LinkedHashSet<>();
        nums.add(9);
        nums.add(3);
        System.out.println("LinkedHashSet1: " + nums);

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(7);
        numbers.add(4);
        System.out.println("LinkedHashSet2: " + numbers);

        // Union of two set
        numbers.addAll(nums);
        System.out.println("Union of set is: " + numbers);
    }
}
