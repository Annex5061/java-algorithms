import java.util.LinkedHashSet;

class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> num = new LinkedHashSet<>();

        num.add(9);
        num.add(2);
        num.add(4);
        System.out.println("LinkedHashSet: " + num);

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        
        numbers.addAll(num);
        numbers.add(8);
        System.out.println("New LinkedHashSet: " + numbers);
    }
}
