package cipher;

public class Encrypted {
    private String mplainText;
    private int mshift;

    public Encrypted(String plainText, int shift) {
        mshift = shift;
        mplainText = plainText;
    }


    public int getShift() {
        return mshift;
    }

    public String getPlainText() {
        return mplainText;
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

    public boolean isNotEmpty()
    {
        return !mplainText.trim().isEmpty();
    }
    public boolean isValidShift()
    {
        return mshift >1 && mshift < 26;

    }



    public String encrypt()
    {
        String encrypted = "";
        String encryptedArray[] = mplainText.split("");
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i<encryptedArray.length;i++)
        {
            if (mplainText.charAt(i) == ' ')
            {
                encrypted += " ";
            }
            else
            {
                int charPosition = alphabet.indexOf(mplainText.charAt(i));
                int shift = (mshift + charPosition) % 26;
                encrypted += alphabet.charAt(shift);
            }
        }
        return encrypted.toLowerCase();
    }


}
