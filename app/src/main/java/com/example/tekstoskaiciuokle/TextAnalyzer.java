package com.example.tekstoskaiciuokle;

public class TextAnalyzer {
    public static int wordCounter(String text){
        int countWords = text.split("[\\s,.]+").length;
        return countWords;
    }

    public static int sentenceCounter(String text){
        int countSentences = text.split("\\.").length;   //yra edge casu kur neveiks, nu bet tipo bus ok jei normaliai rasysi.
        return countSentences;
    }
    public static int  punctuationCounter(String text){
        int count=0;
        for (char c : text.toCharArray()){
            if (c == '.' || c == ',' || c == ' ') {
                count++;
            }
        }
        return count;
    }

    public static int digitCounter(String text){
        int count=0;
        for( char c : text.toCharArray()){
            if(Character.isDigit(c)){
                count++;
            }
        }
        return count;
    }

}
