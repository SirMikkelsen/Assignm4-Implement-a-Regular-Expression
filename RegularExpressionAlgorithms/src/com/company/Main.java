package com.company;

import com.company.algorithm.NFA;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // First get some text, then some regex
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = scanner.next();
        System.out.println("Enter regex: ");
        String regex = scanner.next();

        NFA nfa = new NFA(regex);
          if (nfa.recognizes(text)) {
              System.out.println(text);
          }
    }
}
