
import cipher.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;



public class App {
    public static void main (String[] args) throws Exception{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            boolean runApp = true;
            while (runApp) {
                System.out.println("Welcome to the Caesar-Cipher Program!");
                System.out.println("Enter one option: Encrypt, Decrypt, Exit.");
                System.out.println("Option: ");

                String chosenOption = reader.readLine();
                if (chosenOption.equals("Encrypted")||chosenOption.equals("Decrypted")) {
                    System.out.println("Enter Sentence : ");
                    String plainText = reader.readLine();
                    System.out.println(plainText);
                    int shift;
                    do {
                        System.out.println("Enter Desired Key. Choose a number between 1 and 25 ");
                        String stringKey = reader.readLine();
                        shift = Integer.parseInt(stringKey);
                    } while ((shift<1||shift>25));

                    System.out.println(shift);
                    if (chosenOption.equals("Encrypt")){
                        Encrypted encryption = new Encrypted(plainText,shift);
                        String outputSentence = encryption.encrypt(plainText,shift);



                } else if (chosenOption.equals("Exit")) {
                    System.out.println("Goodbye!");
                    runApp=false;

                } else {
                    System.out.println("Kindly choose one of the options!");
                }
            }

    }
