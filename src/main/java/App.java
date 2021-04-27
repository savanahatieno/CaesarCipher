import cipher.Decrypted;
import cipher.Encrypted;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Well Hello fellow Human Being (Press Enter)");
        scan.nextLine();

        System.out.println("Yes you! (Press Enter)");
        scan.nextLine();

        System.out.println("Hit enter to begin ");
        scan.nextLine();



        System.out.println("Which one do you choose? \n 1.Encrypted \n 2. Decrypted \n 3. Exit ");
        int choose = scan.nextInt();
        //Able to go to the next line
        scan.nextLine();

        //CHOICES

        if (choose == 1){
            System.out.println("Enter any word");
            String plainText = scan.nextLine();
            System.out.println("Enter key");
            int shift = scan.nextInt();
            Encrypted encrypted = new Encrypted(plainText, shift);
            System.out.println(String.format("Your encrypted code is %s",encrypted.encrypt()));

        }else if (choose == 2){
            System.out.println("Please Enter an encrypted text to decrypt it:");
            String plainText = scan.nextLine().toLowerCase();
            System.out.println("Enter key");
            int shift = scan.nextInt();
            Decrypted decrypted = new Decrypted(plainText, shift);
            System.out.println(String.format("Your decrypted text is:  %s",decrypted.decrypt()));
        }else if (choose == 3){
            System.exit(0);
        }
    }
}