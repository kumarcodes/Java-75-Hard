package com.java8;

/*
Author: Rohit Sharma
 */


import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {
        String str = "rohit";

        //Using Java
        char[] chArrayRev = new char[str.length()];
        int i = 0;
        for (char ch : str.toCharArray()) {
            chArrayRev[i] = str.charAt(str.length() - i - 1);
            i++;
        }
        System.out.println(new String(chArrayRev));

        //Using Java 8
        String reversed =  IntStream.rangeClosed(1, str.length())
                          .mapToObj(j -> str.charAt(str.length() - j))
                          .map(Object::toString)
                          .collect(Collectors.joining());
    }
}
