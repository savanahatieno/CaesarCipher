import cipher.Encrypted;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Which one do you choose? \n 1.Encypted \n 2. Decrypted \n 3. Exit ");
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
            System.out.println(String.format("Your encrypted code is :   %s\",encrypted.encrypt()"));

        }
    }
}