import cipher.Encrypted;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EncryptDecryptTests {
    Encrypted testEncrypted = new Encrypted("Anah", 2);

    @Test
    public void checkIfInstances() {
        assertEquals(true , testEncrypted instanceof Encrypted);
    }

    //Ecrypted test
    @Test
    public void isValidPlainText()
    {
        assertEquals(true, testEncrypted.isValidInputText());
    }

}
