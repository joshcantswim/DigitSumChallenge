package com.Josh;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sum of digits 125 is "+sumDigits((125)));
        System.out.println("Sum of digits -125 is "+sumDigits((-125)));
        System.out.println("Sum of digits 4 is "+sumDigits((4)));
        System.out.println("Sum of digits 32123 is "+sumDigits((32123)));

    }

    private static int sumDigits(int number){
        if(number<10){
            return -1;
        }

        int sum = 0;

        // 125 -> 125/10 = 12....12*10=120....125-120=5....
        while (number>0){
            //extract least sig digit
            int digit = number % 10;
            sum += digit;
            // drop least sig digit

            number /= 10;
        }

        return sum;
    }
}
