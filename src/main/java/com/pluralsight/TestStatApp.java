package com.pluralsight;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

public class TestStatApp {

    //!Creating my main method
    public static void main(String[] args) {

        //?Creating an array with 10 numbers
        int[] testScores = {90, 80, 100, 25, 95, 85, 60, 75, 89, 92};

        //*Finding the sum of the test score
        int sum = 0;
        for (int num : testScores) {
            sum += num;

        }

        //*Finding the average of the test scores
        double average = 0;
        average = sum / 10;
        System.out.println("The average test score is " + average);


        //*Finding the high score
        int max = Integer.MIN_VALUE;

        for (int highScore : testScores) {
           if (highScore > max) {
               max = highScore;
            }


        }
        System.out.println("The highest score on the test is " + max);

    }


}


