package models;

import cipher.Encrypted;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class encryptedtest {
    @Test
    void shouldShowSimpleAssertion() {
        assertEquals(1,1);
    }

    @Test
    void encrypted_String() {
        Encrypted testString = new Encrypted();
        assertEquals (3, testString.getShift());
    }
}

