package com.company.services;

public class EncryptServices {
    private final int salt;

    /**
     * @param sentence  the string to encrypt
     * @return String - return the encrypted sentence
     * */

    public String encrypt(String sentence) {

        char[] letters = sentence.toCharArray();

        for (int i = 0;
             i < letters.length;
             i++) {
            letters[i] = (char) (letters[i] + (char) (this.salt + this.salt));
        }

        return String.valueOf(letters);
    }

    /**
     * @param encrypted  the string to encrypt
     * @return String - return the encrypted decrypted
     * */

    public String decrypt(String encrypted) {

        char[] letters = encrypted.toCharArray();

        for (int i = 0;
             i < letters.length;
             i++) {
            letters[i] = (char) (letters[i] - (char) (this.salt + this.salt));
        }

        return String.valueOf(letters);
    }

    public EncryptServices(int salt) {
        this.salt = salt;
    }
}
