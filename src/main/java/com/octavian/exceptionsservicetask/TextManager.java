package com.octavian.exceptionsservicetask;

public class TextManager {
    public static int getTextLength(String inputString){
        int stringLength = inputString.length();
        return stringLength;
    }
    public static int getTextLengthWithTryCatchFinally(String inputString){
        try{
            return inputString.length();
        } catch (NullPointerException captureExceptionInTryBlock){
            System.out.println("An exception has captured with following message " +  captureExceptionInTryBlock.getMessage());
            return 0;
        }finally {
            System.out.println("Acest cod va fi executat indiferent de faptul daca a fost sau nu o exceptie ");
        }
    }


}
