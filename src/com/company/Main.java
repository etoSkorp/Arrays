package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int total = 0, maxSpending = arr[0], minSpending = arr[0];
        for (int i : arr) {
            total += i;
            if (i > maxSpending) {
                maxSpending = i;
            } else if (i < minSpending) {
                minSpending = i;
            }
        }
        float avgSpending = (float) total / arr.length;
        System.out.printf("""
                             —умма трат за мес€ц составила %d рублей.
                             ћаксимальна€ сумма трат за день составила %d рублей.
                             ћинимальна€ сумма трат за день составила %d рублей.
                             —редн€€ сумма трат за мес€ц составила %.2f рублей.
                             """, total, maxSpending, minSpending, avgSpending);


        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int j = reverseFullName.length - 1; j >= 0; j--) {
            System.out.print(reverseFullName[j]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
