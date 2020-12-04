package com.company.services;

public class EncryptServices {
    private final int salt;
    private final int encryptRounds;

    /**
     * @param sentence  the string to encrypt
     * @return String - return the encrypted sentence
     * */

    public String encrypt(String sentence) {

        char[] letters = sentence.toCharArray();

        for (int e = 0; e < encryptRounds; e++){
            for (int i = 0;
                 i < letters.length;
                 i++) {
                letters[i] = (char) (letters[i] + (char) (this.salt + this.salt));
            }
        }

        return String.valueOf(letters);
    }

    /**
     * @param encrypted  the string to encrypt
     * @return String - return the encrypted decrypted
     * */

    public String decrypt(String encrypted) {

        char[] letters = encrypted.toCharArray();

        for (int e = 0; e < encryptRounds; e++) {
            for (int i = 0;
                 i < letters.length;
                 i++) {
                letters[i] = (char) (letters[i] - (char) (this.salt + this.salt));
            }
        }

        return String.valueOf(letters);
    }

    /**
     * @param salt how much times will be letters salted
     * @param encryptRounds how much times will be repeated the encryptation procces*/
    public EncryptServices(int salt, int encryptRounds) {
        this.salt = salt;
        this.encryptRounds = encryptRounds;
    }
}
