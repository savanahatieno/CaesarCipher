package cipher;

public class Encrypted {
    public static String encrypt(String plainText, int shift) {
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
                //
            }
            else{
                cipherText += ch;
            }
        }
        return cipherText;

   }
    public static void main (String[]  args){

    }
}
