package org.example;

public class Main {
    public static void main(String[] args) {
        NumberInput numberInput = new NumberInput(123, 678);
        LastDigitFetcher lastDigitFetcher = new LastDigitFetcher();
        int productOfLastDigit = lastDigitFetcher.getLastDigit(numberInput);
        System.out.println("Product of last two digits "+": "+ productOfLastDigit);
    }

    public static class NumberInput{
        int number1;
        int number2;

        public NumberInput(int number1, int number2){
            this.number1 = number1;
            this.number2 = number2;
        }
        public int getNumber1(){
            return number1;
        }
        public int getNumber2(){
            return number2;
        }

    }
    public static class LastDigitFetcher{
        public int getLastDigit(NumberInput input){
            int lastDigit1 = input.getNumber1() % 10;
            int lastDigit2 = input.getNumber2() % 10;
            return lastDigit1 * lastDigit2;
        }
    }
}


//    Create a class that accepts two numbers. Create another class that fetches the last digit of those two numbers. Create a third class that multiplayer that last two digits.
//        Example: Class A: Accept two numbers.
//        Class B: Fetches the last digits of the numbers
//        Class C: Multiplay the last two digits.