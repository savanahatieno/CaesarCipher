package cipher;

public class Decrypted {
    public static String  decrypt(String plainText, int shift) {
        if (shift > 26) {
            shift =  shift%26;
        }
        else if (shift<0){
            shift = (shift%26)+26;
        }

        String cipherText = "";
        //Getting length of plainText
        int length = plainText.length();
        //looping the plainText
        for(int i = 0; i<length; i++){
            char ch = plainText.charAt(i);
            if(Character.isLetter(ch)){
                // check whether its uppercase / lowercase
                if(Character.isLowerCase(ch)){
                    char c = (char)(ch-shift);
                    if(c < 'a'){
                        cipherText += (char)(ch + (26-shift));
                    }
                    else
                        cipherText += c;
                }
                else if(Character.isUpperCase(ch)){
                    char c = (char)(ch-shift);
                    if(c < 'a'){
                        cipherText += (char)(ch +(26-shift));
                    }
                    else
                        cipherText += c;
                }
            }
            else{
                cipherText += ch;
            }
        }
        return cipherText;

    }
    public static void main (String[]  args){
        String text = "I bet you are smiling right now reading this, have a great day stranger!";
        String encrypted = "^ wzo tjp vmz nhdgdib mdbco ijr mzvydib ocdn, cvqz v bmzvo yvt nomvibzm!";
        String decrypted = decrypt(text, 5);
        System.out.println(decrypted);
        System.out.println(encrypted);
    }
}
