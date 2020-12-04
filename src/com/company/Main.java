package com.company;

import com.company.services.EncryptServices;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EncryptServices encryptServices = new EncryptServices(25, 1);
        Scanner sc = new Scanner(System.in);

        System.out.print("which string you want to encrypt: ");
        String Sentence = sc.nextLine();

        String encrypted = encryptServices.encrypt(Sentence);
        System.out.println( encrypted );
        System.out.println(encryptServices.decrypt(encrypted));
    }
}
