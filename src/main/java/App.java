
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
                }