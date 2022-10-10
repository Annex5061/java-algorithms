import java.util.Scanner;

public class Rot13 {

	public static void main(String[] args) {
		Rot13 myRot13 = new Rot13();
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Input string to encrypt/decrypt: ");
		String inputString = myScanner.nextLine();
		String rotifiedString = myRot13.rotify(inputString);
		
        System.out.println();
		System.out.println("Your String Input:");
		System.out.println(">> " + inputString);
		System.out.println();
		System.out.println("Encrypted/Decrypted String:");
		System.out.println(">> " + rotifiedString);
	}

	private String rotify( String inputString) {
		String outputString = "";
		for (int i = 0; i < inputString.length(); i++) {
			char convertedChar = charRot(inputString.charAt(i));
			outputString += convertedChar;
		}
		return outputString;
	}

	public char charRot(char charInput) {
		char[] alphabets = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		char convertedChar = charInput;
		boolean isUppercase = !(convertedChar == (Character.toLowerCase(convertedChar)));

		for (int i = 0; i < 26; i++) {
			if (Character.toLowerCase(charInput) == alphabets[i]) {
				int convertedPositionInArray = i + 13;

				if (convertedPositionInArray >= 26) {
					convertedPositionInArray -= 26;
				}

				if (isUppercase) {
					convertedChar = Character.toUpperCase(alphabets[convertedPositionInArray]);
				} else
					convertedChar = alphabets[convertedPositionInArray];
			}
		}
		return convertedChar;
	}

}