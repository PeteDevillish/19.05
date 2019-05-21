package pl.sdacademy.arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] intArray = {4, 1, 5, 10};
        System.out.println("Liczba elemntów tablicy: " + intArray.length);
        System.out.println("Wartość pierwszego elementu: " + intArray[0]);
        intArray[2] = 123;
        System.out.println("Nowa wartość trzeciego elemntu: " + intArray[2]);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Wartość elementu o indeksie " + i + ": " + intArray[i]);
        }
        for (int element : intArray) {
            System.out.println("Wartość" +
                    element
            );
        }
        int[] intArray2 = intArray;
        intArray2[3] = 999;
        System.out.println("Ostatni element tablicy intArray" +
                "zmiennej intArray " +
                intArray2[3]);
        String[] stringArray = new String[5];
        System.out.println("Liczba elemntów tablicy przypisanej do zmiennej" +
                "stringArray to:" +
                stringArray.length);
        System.out.println(java.util.Arrays.toString(stringArray));
    }
}
