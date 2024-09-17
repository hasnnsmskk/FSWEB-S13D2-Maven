package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPerfectNumber(10));
        System.out.println(numberToWords(563));
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        char[] digits = String.valueOf(number).toCharArray();
        String reversed = "";
        for (int i = digits.length -1; i>=0; i--) {
            reversed += digits[i];
        }
        return reversed.equalsIgnoreCase(String.valueOf(number));
    }


    public static boolean isPerfectNumber(int number) {
        if(number < 0)
            return false;

        int total = 0;
        for(int i = 1; i <= number / 2; i++) {
            if(number % i == 0) {
                total += i;
            }
        }
        return number == total;
    }


    public static String numberToWords(int number) {
        if (number < 0)
            return "Invalid Value";

        char[] digits = String.valueOf(number).toCharArray();
        String numToTest = "";
        for(char digit: digits){
            switch (digit) {
                case '0':
                    numToTest += "Zero ";
                    break;
                case '1':
                    numToTest += "One ";
                    break;
                case '2':
                    numToTest += "Two ";
                    break;
                case '3':
                    numToTest += "Three ";
                    break;
                case '4':
                    numToTest += "Four ";
                    break;
                case '5':
                    numToTest += "Five ";
                    break;
                case '6':
                    numToTest += "Six ";
                    break;
                case '7':
                    numToTest += "Seven ";
                    break;
                case '8':
                    numToTest += "Eight ";
                    break;
                case '9':
                    numToTest += "Nine ";
                    break;
            }

        }
        return numToTest.trim();
    }
}

