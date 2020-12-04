package com.company.services;

public class EncryptServices {
    private final int salt;

    public String encrypt(String word) {

        char[] letters = word.toCharArray();

        for (int i = 0;
             i < letters.length;
             i++) {
            letters[i] = (char) (letters[i] + (char) (this.salt + this.salt));
        }

        return String.valueOf(letters);
    }

    public String decrypt(String word) {

        char[] letters = word.toCharArray();

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
