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
                // check whether its uppercase / lowercase
                if(Character.isLowerCase(ch)){
                    char c = (char)(ch+shift);
                    if(c > 'z'){
                        cipherText += (char)(ch - (26-shift));
                    }
                    else
                        cipherText += c;
                }
                else if(Character.isUpperCase(ch)){
                    char c = (char)(ch+shift);
                    if(c > 'Z'){
                        cipherText += (char)(ch - (26-shift));
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
        String encrypt = encrypt(text, 5);
        System.out.println(text);
        System.out.println(encrypt);
    }


}
