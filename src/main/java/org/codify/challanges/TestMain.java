package org.codify.challanges;

import org.codify.challanges.functionalinterface.TestInteface;

public class TestMain {
    public static void main(String[] args) {
        int z = 0;
        TestInteface test = (int a, int b) -> {
            return  a+b;
        };

        System.out.println(test.sum(5,4));
    }
}
