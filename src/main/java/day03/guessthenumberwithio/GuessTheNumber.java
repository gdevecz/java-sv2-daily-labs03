package day03.guessthenumberwithio;

import java.util.Random;

public class GuessTheNumber {

    private int theNumber;

    private int maxNumberOfGuesses;

    private GuessTheNumberIO gameIO;

    public GuessTheNumber(GuessTheNumberIO gameIO) {
        this.gameIO = gameIO;
        Random rnd = new Random();
        theNumber = rnd.nextInt(100) + 1;
        maxNumberOfGuesses = 6;
    }

//      Na itt lehet túlzás a numberOfGuesses azonosító, csak azért nem i, mert paraméterként továbbadom
//      Könnyen lehet, felesleges
    public void startTheGame() {
        int guess;
        for (int numberOfGuesses = 1; numberOfGuesses <= maxNumberOfGuesses; numberOfGuesses++) {
            guess = gameIO.askANumber(numberOfGuesses);
            if (checkTheGuess(guess)) {
                return;
            }
        }
        gameIO.informAboutFail(theNumber);
    }

//    Itt elgondolkodtam, hogy nem lenne-e szebb kiszervezni metódusba az aritmetikai kiértékelést, de akkor gykorlatilag
//    nem csinálna semmit csak meghívna egy új metódust :D, lehet inkább a metódusnévre lehetne kitalálni vmi jobbat.
    private boolean checkTheGuess(int guess) {
        int difference = guess - theNumber;
        if (difference == 0) {
            gameIO.informAboutSuccess(theNumber);
            return true;
        }
        gameIO.informAboutUnsuccessfulGuess(guess, difference);
        return false;
    }
}
