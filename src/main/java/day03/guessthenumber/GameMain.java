package day03.guessthenumber;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class GameMain {

    public static void main(String[] args) {
        // Mivel lehet direkt volt így: 1 és 100 között, a lehetséges elemek: 2 - 99
        int lowerBound = 1;
        int upperBound = 100;

        System.out.println("A program kitalál egy véletlenszerű számot " + lowerBound + " és " + upperBound + " között.");
        System.out.println("Ki kell találnod, 6 lépésben melyik számra gondolt.");

        System.out.println("Enter-re indul a játék!");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        GuessTheNumber game;
        String wantToPlay = "i";
        game = new GuessTheNumber(lowerBound, upperBound);
        while("i".equals(wantToPlay.strip().toLowerCase())) {
            game.theGame();
            System.out.println("Akarsz még játszani? I/i-re új játék, minden másra kilépés.");
            wantToPlay = sc.nextLine();
        }
    }
}
