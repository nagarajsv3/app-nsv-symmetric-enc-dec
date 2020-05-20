package com.nsv.jsmbaba;

import static com.nsv.jsmbaba.AESUtils.decrypt;
import static com.nsv.jsmbaba.AESUtils.encrypt;

public class AESEncDecMain {

    public static void main(String[] args) {
        String originalString = "JSMBABA Welcome to AES Enc Dec";
        System.out.println("Original String to encrypt - " + originalString);
        String encryptedString = encrypt(originalString);
        System.out.println("Encrypted String - " + encryptedString);
        String decryptedString = decrypt(encryptedString);
        System.out.println("After decryption - " + decryptedString);
    }
}
