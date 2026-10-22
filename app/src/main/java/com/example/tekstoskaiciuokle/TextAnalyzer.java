package com.example.tekstoskaiciuokle;

public class TextAnalyzer {
    public static int wordCounter(String text){
        int countWords = text.split("[\\s,.]+").length;
        return countWords;
    }

}
