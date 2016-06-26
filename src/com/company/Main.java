package com.company;

public class Main {

    public static void main(String[] args) {

    }
//problem 1
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation){
            return true;
        }
        else{
            return false;
        }
    }

//problem 2
    public int sumDouble(int a, int b) {
        int sum = a + b;

        if(a == b){
            return (sum * 2);
          }
        else{
            return sum;
         }
    }

//problem 3
    public int close10(int a, int b) {

       int aAbs = Math.abs(a - 10);
       int bAbs = Math.abs(b - 10);

       if(aAbs > bAbs){
           return b;
       }
       else if(bAbs > aAbs){
           return a;
       }
       else{
           return 0;
       }
    }

//bonus 1

    public String frontBack(String str) {

        if (str.length() > 0) {
            char[] charArray = str.toCharArray();

            char firstChar = charArray[0];
            charArray[0] = charArray[charArray.length - 1];
            charArray[charArray.length - 1] = firstChar;

            String newString = new String(charArray);

            return newString;
        } else {
            String emptyString = "";
            return emptyString;
        }
    }

//bonus 2
    public String notString(String str) {

        String notStr = "not " + str;

        if (str.startsWith("not")) {
            return str;
        } else {
            return notStr;
        }
    }

}
