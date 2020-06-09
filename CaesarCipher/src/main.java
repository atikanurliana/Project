import java.util.Scanner;

public class main {
	public static void main(String[] args) {
        System.out.println("ENKRIPSI DEKRIPSI ALGORITMA CAESAR");
        while (true) {
            System.out.println("Masukkan pilihan: \n1. Enkripsi \n2. Dekripsi");
            Scanner input = new Scanner(System.in);
            String choice = input.nextLine().toLowerCase();
            if (choice.equals("1")) {
                System.out.println("Teks Terang: ");
                String plainText = input.nextLine().toLowerCase();
                System.out.println("Kunci: ");
                int shiftValue = input.nextInt();
                caesar message = new caesar(plainText, shiftValue);
                System.out.println("Teks Terang: " + message.getTextMessage() + "\nKunci: " + message.getShiftBy());
                System.out.println("Teks Sandi: " + message.encryption());
                break;
            } else if (choice.equals("2")) {
                System.out.println("Teks Sandi: ");
                String encryptedText = input.nextLine().toLowerCase();
                System.out.println("Kunci: ");
                int reverseShiftValue = input.nextInt();
                caesar encryptText = new caesar(encryptedText, reverseShiftValue);
                System.out.println("Teks Terang: " + encryptText.decryption());
                break;
            } else {
                System.out.println("Masukkan pilihan 1 atau 2.");
            	}

        	}
	}
}