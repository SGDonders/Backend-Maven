package org.example;

public class StringTool {

    public static String reverse(String str){
        String result = "";
        for (char c : str.toCharArray()) {
            result = c + result;
        }

    return result;

    }
}
