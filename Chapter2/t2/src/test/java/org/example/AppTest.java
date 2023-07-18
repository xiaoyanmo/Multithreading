package org.example;

import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void givenPassword_whenHashing_thenVerifying()
            throws NoSuchAlgorithmException {
        String hash = "35454B055CC325EA1AF2126E27707052";
        String password = "ILoveJava";

        MessageDigest md = MessageDigest.getInstance("MD5");
//        md.update(password.getBytes());
        byte[] digest = md.digest(password.getBytes(StandardCharsets.UTF_8));
        System.out.println(new String(digest, StandardCharsets.UTF_8).toUpperCase());
//        String myHash = DatatypeConverter.printHexBinary(digest).toUpperCase();
//
//        assertThat(myHash.equals(hash)).isTrue();
    }
}
