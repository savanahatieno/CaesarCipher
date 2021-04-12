public class Encrypt {
    public static void main (String[] args){
        //start
        String text = "Hey, how's it hanging?";

        System.out.println(text);

        char[] chars = text.toCharArray();

        for(char a : chars){
            a += 5;
            System.out.print(a);
        }


    }
}
