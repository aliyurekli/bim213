package ceng.eskisehir.edu.tr;

import java.util.Random;

class RandomIntArrayGenerator {

    static int[] randomize() {
        Random random = new Random();

        int random_length = random.nextInt(10) + 5;
        int[] numbers = new int[random_length];

        for (int i=0; i<numbers.length; i++) {
            numbers[i] = random.nextInt(50);
        }

        return numbers;
    }
}
