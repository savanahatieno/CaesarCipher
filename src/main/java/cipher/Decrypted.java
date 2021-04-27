package cipher;


public class Decrypted {

    private String mplainText;
    private int mshift;

    public Decrypted (String plainText, int shift) {
        mshift = shift;
        mplainText = plainText;
    }


    public String getplainText() {
        return mplainText;
    }
    public int getshift() {
        return mshift;
    }
    public boolean isValidPlainText()
    {
        char[] chars = mplainText.toCharArray();

        for (char c : chars) {
            if(!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }
        return true;
    }
    public boolean isValidKey()
    {
        return mshift >1 && mshift < 26;
    }

    public String decrypt()
    {
        String decryptedValue = "";
        String encryptedArray[] = mplainText.split("");
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i<encryptedArray.length;i++)
        {
            if (mplainText.charAt(i) == ' ')
            {
                decryptedValue += " ";
            }
            else
            {
                int charPosition = alphabet.indexOf(mplainText.charAt(i));
                int shiftVal = (charPosition - mshift) % 26;

                if (shiftVal < 0)
                {
                    shiftVal = alphabet.length() + shiftVal;
                }

                char replaceValue = alphabet.charAt(shiftVal);
                decryptedValue += replaceValue;
            }
        }
        return decryptedValue;
    }


}
