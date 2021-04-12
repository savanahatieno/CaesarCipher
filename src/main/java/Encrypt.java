public class Encrypt {
    public static void main (String[] args){
        //store key as an interger
        int key = 6;

        //created a string for encryption
        String text = "Hey, how's it hanging?";

        System.out.println(text);

        char[] chars = text.toCharArray();

        for(char a : chars){
            a += key;
            System.out.print(a);
        }


    }
}
