package org.ncmao.training;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class PrimeFactorExercises {


    @Test
    public void Test(){
        List<Integer> generate = generate(30);
        for (Integer integer : generate) {
            System.out.println(integer);
        }

    }

    public List<Integer> generate(int input) {
        List<Integer> primeFactors = new LinkedList<Integer>();
        generatePrimeFactor(input, 2, primeFactors);
        return primeFactors;
    }

    private void generatePrimeFactor(int input, int startIndex, List<Integer> primeFactors) {
        int res;
        for (int i = startIndex; i <= input; ++i) {
            if(input % i == 0) {
                primeFactors.add(i);
                res = input / i;
                if(res == 1) {
                    return;
                } else {
                    generatePrimeFactor(res, i, primeFactors);
                    break;
                }
            }
        }
    }

}
