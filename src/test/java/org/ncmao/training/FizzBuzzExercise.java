package org.ncmao.training;

import org.junit.Test;

public class FizzBuzzExercise {


    @Test
    public void Test(){
        fizzBuzz(1, 15);
    }

    private static void fizzBuzz(int start, int end) {
        for (int i = start; i <= end; ++i) {
            System.out.println(fizzOrBuzz(i));
        }
    }

    private static String fizzOrBuzz(int n) {
        String result = "";
        if(n % 3 == 0) {
            result += "Fizz";
        }
        if(n % 5 == 0) {
            result += "Buzz";
        }
        return result.isEmpty() ? String.valueOf(n) : result;
    }
}
