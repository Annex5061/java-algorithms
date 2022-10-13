import java.util.Scanner;
public class TowersofHanoi {
    public static final String SOURCE_PEG = "Source";
    public static final String TARGET_PEG = "Target";
    public static final String SPARE_PEG = "Spare";
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of discs:");
        int numberOfDiscs = scanner.nextInt();
        solveTowersOfHanoi(numberOfDiscs, SOURCE_PEG, TARGET_PEG, SPARE_PEG);
        scanner.close();
    }
 
    
    private static void solveTowersOfHanoi(int numberOfDiscs, String sourcePeg, String targetPeg, String sparePeg) {
        if (numberOfDiscs == 1) {
            System.out.println(sourcePeg + " => " + targetPeg);
        } else {
            solveTowersOfHanoi(numberOfDiscs - 1, sourcePeg, sparePeg, targetPeg);
            System.out.println(sourcePeg + " => " + targetPeg);
            solveTowersOfHanoi(numberOfDiscs - 1, sparePeg, targetPeg, sourcePeg);
        }
 
    }
}