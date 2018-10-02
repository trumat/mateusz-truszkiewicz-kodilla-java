package com.kodilla.stream.array;

import java.util.stream.IntStream;

public class ArrayOperations {
    public static double getAverage(int[] numbers){
        IntStream.range(0, numbers.length)
                .forEach(number -> System.out.println(numbers[number]));

        return IntStream.range(0, numbers.length)
                .map(number -> numbers[number])
                .average()
                .getAsDouble();

    }
}
