package Lesson2.homework;

import java.math.BigInteger;

public class FactorialCalculation {
    public static void main(String[] args) {
        BigInteger factorialRes = factorial(17);
        System.out.println(factorialRes);

    }
    private static BigInteger factorial(int number){
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= number ; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;

    }
}
