package day03.guessthenumber;

import java.util.Scanner;

public class GameMain {

    public static void main(String[] args) {
        // Mivel lehet direkt volt így: 1 és 100 között, a lehetséges elemek: 2 - 99
        GuessTheNumber game = new GuessTheNumber();
        System.out.println("A program kitalál egy véletlenszerű számot " +
                game.LOWERBOUND + " és " +
                game.UPPERBOUND + " között.");
        System.out.println("Ki kell találnod, 6 lépésben melyik számra gondolt.");

        System.out.println("Enter-re indul a játék!");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String wantToPlay = "i";

        while("i".equals(wantToPlay.strip().toLowerCase())) {
            game.theGame();
            System.out.println("Akarsz még játszani? I/i-re új játék, minden másra kilépés.");
            wantToPlay = sc.nextLine();
        }
    }
}
