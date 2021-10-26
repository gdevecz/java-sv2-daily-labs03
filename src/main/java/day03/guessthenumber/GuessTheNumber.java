package day03.guessthenumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public final static int LOWERBOUND = 1;

    public final static int UPPERBOUND = 100;

    private int number;

    private int possibleTries;


    public GuessTheNumber(){
//        Az istennek sem találtam működő cls-t.
//        System.out.println("\f");
    }

    public void theGame() {
        initializingTheHuessTheNumber();
        boolean result = false;
        int guess;
        while ((possibleTries > 0) && !result) {
            guess = askingAGuess();
            result = compareGuessToNumber(guess);
            possibleTries--;
        }
        if (result) {
            System.out.println("Gratulálok, a szám amire gondoltam: " + number);
        } else {
            System.out.println("Sajnos nem sikerült kitalálni, hogy a szám a mire gondoltam: " + number);
        }
    }

    private void initializingTheHuessTheNumber() {
        Random rnd = new Random();
        number = rnd.nextInt(UPPERBOUND-LOWERBOUND-1) + LOWERBOUND + 1;
        possibleTries = 6;
    }

    private boolean compareGuessToNumber(int guess) {
        if (number - guess > 0) {
            System.out.println("A gondolt szám nagyobb mint " + guess);
            return false;
        }
        if (number - guess < 0) {
            System.out.println("A gondolt szám kisebb mint " + guess);
            return false;
        }
        return true;
    }

    private int askingAGuess() {
        System.out.print("Kérem a " + (6 - possibleTries + 1) + ". tippet: ");
        Scanner sc = new Scanner(System.in);
        String guess;
        while (!isTheGuessValid(guess = sc.nextLine())) {
            System.out.println("Hibás adat! Ez vagy kívül esik a megadott tartományom, vagy nem is szám!");
            System.out.print("Kérem a " + (6 - possibleTries + 1) + ". tippet: ");
        }
        return Integer.parseInt(guess.strip());
    }

    private boolean isTheGuessValid(String guess) {
        // try catch még nem volt, tryParse nincs, szóval kissé balával faragva:
        String numberInString = guess.strip();
        if (guess == "") {
            return false;
        }
        for (int i = 0; i < numberInString.length(); i++) {
            if (numberInString.charAt(i) < '0' || numberInString.charAt(i) > '9') {
                return false;
            }
        }
        int number;
        if ((number = Integer.parseInt(guess.strip())) <= LOWERBOUND || number >= UPPERBOUND) {
            return false;
        }
        return true;
    }
}
