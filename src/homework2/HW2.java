package homework2;

import java.util.Scanner;
public class HW2 {


        public static int sumOfDigits(int number) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }

        public static int sumOfWordLengths(String word1, String word2) {
            return word1.length() + word2.length();
        }

        public static boolean isGreaterThanZeroAndPrintMessage(int number) {
            if (number > 0) {
                System.out.println("Digit > 0");
                return true;
            } else {
                System.out.println("Digit no more that 0");
                return false;
            }
        }

        public static void main(String[] args) {
            int number = 123;
            int sum = sumOfDigits(number);
            System.out.println("Sum of digits number " + number + ": " + sum);

            String firstWord = "Home";
            String secondWord = "Work 2";
            int wordLengthSum = sumOfWordLengths(firstWord, secondWord);
            System.out.println("Sum of words lenghts: " + wordLengthSum);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Write a number: ");
            int userInput = scanner.nextInt();
            boolean isGreaterThanZero = isGreaterThanZeroAndPrintMessage(userInput);
        }
    }


