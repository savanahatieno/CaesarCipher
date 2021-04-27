import cipher.Decrypted;
import cipher.Encrypted;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EncryptDecryptTests {
    Encrypted testEncrypted = new Encrypted("Anah", 2);

    Decrypted testDecrypted = new Decrypted( "1bdsjf vdjsvsf", 2);

    @Test
    public void checkIfInstances() {
        assertEquals(true , testEncrypted instanceof Encrypted);
    }

    //Ecrypted test
    @Test
    public void isValidPlainText()
    {
        assertEquals(true, testEncrypted.isValidPlainText());
    }
    //Shift test
    @Test
    public void isValidKey()
    {
        assertEquals(true, testEncrypted.isValidShift());
    }

    @Test
    public void isValidShift()
    {
        assertEquals(true, testDecrypted.isValidShift());
    }
}
