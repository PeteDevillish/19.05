package pl.sdacademy.arrays;

import java.util.Arrays;

public class Exercises {
    public static void main(String[] args) {
//        int[] input = {1, 1, 7, 5, 4};
        int[] input = {1, 1, 7};

        System.out.println(Arrays.toString(getDistinct(input)));
    }

    static void print(int[] input) {
        System.out.println(Arrays.toString(input));
    }

    static int getMax(int[] input) {
        int box = input[0];

        for (int el : input) {
            if (el > box) {
                box = el;
            }
        }
        return box;
    }

    static int getSum(int[] input) {
        int sum = 0;
        for (int el : input) {
            sum += el;
        }
        return sum;
    }

    static int getMin(int[] input) {
        int box = input[0];

        for (int el : input) {
            if (el < box) {
                box = el;
            }
        }
        return box;
    }

    static int[] getMaxMinSum(int[] input) {
        int[] output = new int[3];
        output[0] = getMax(input);
        output[1] = getMin(input);
        output[2] = getSum(input);
        return output;
    }

    static int[] getMaxMinSum2(int[] input) {
        return new int[] {getMax(input), getMin(input), getSum(input)};
    }


    static int[] getLarger(int[] input1, int[] input2) {
        int sum1 = getSum(input1);
        if (getSum(input1) > getSum(input2)) return input1;
        else return input2;
    }

    //    7. Napisz metodę merge, która za parametry dwie tablice intów, a która zwróci tablicę, która zawierać będzie wszystkie elementy z jednej i drugiej tablicy.
    static int[] merge(int[] input1, int[] input2) {
        int[] output = new int[input1.length + input2.length];
        for (int i = 0; i < input1.length; i++) {
            output[i] = input1[i];
        }

        for (int i = input1.length - 1; i < output.length; i++) {
            output[i] = input2[i - input1.length - 1];
        }
        return output;
    }

    //            8. Napisz metodę getDistinct, która za parametr przyjmie tablicę, a która zwróci tablicę, w której będą elementy bez powtórzeń z tablicy przekazanej w parametrze.
    static int[] getDistinct(int[] input) {
        int length = input.length;
        for (int i = 1; i < input.length; i++) {
            if (input[i] == input[i - 1]) length--;
        }
        int[] output = new int[length];
        int indexOfOutput = 0;
        for (int i = 0; i < output.length; i++) {
            boolean isNumberAlreadyInArray = false;
            for (int el : output) {
                if (el == input[i]) {
                    isNumberAlreadyInArray = true;
                }
//                if (isNumberAlreadyInArray) break;
            }
            if (!isNumberAlreadyInArray) {
                output[indexOfOutput] = input[i];
                indexOfOutput++;
            }
        }
        System.out.println(indexOfOutput);
        return output;
    }


}
