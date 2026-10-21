package com.example.tekstoskaiciuokle;

public class TextAnalyzer {
    public int wordCounter(String text){
        int countWords = text.split("[\\s,.]+").length;
        return countWords;
    }

}
