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


        //*Finding the high  test score
        //?Setting max to the lowest possible value
        int max = Integer.MIN_VALUE;

        //?Looping through all the numbers in the list till highest number is found
        for (int highScore : testScores) {
           if (highScore > max) {
               max = highScore;
            }


        }
        System.out.println("The highest score on the test is " + max);

        //*Finding the lowest test score
        //? Setting min to the highest possible value
        int min = Integer.MAX_VALUE;

        //?Looping through all the numbers in the list till lowest number found
        for (int lowestScore : testScores) {
            if (lowestScore < min) {
                min = lowestScore;
            }


        }
        System.out.println("The lowest score on the test is " + min);




    }


}


