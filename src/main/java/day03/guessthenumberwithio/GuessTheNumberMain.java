package day03.guessthenumberwithio;

public class GuessTheNumberMain {

//    A nagyképűen elnevezett GuessTheNumberIO-t, amibe kicsákányoztam minden konzol utasítást,
//    kénytelen voltam példányosítani, és erőt véve magamon nem static minősítővel megírni a metódusait :)
//    Úgy gondoltam, ha már megvan a példány, és nem kell több a működéshez, a game-nek inkább
//    átadom paraméterlistán, példányosítás helyett.
//    Könnyebb lenne persze, ha a main példányosítva lenne, de azt meg szerettem volna elkerülni.
//    Szokásommal ellentétben nem pakoltam tele inputellenőrzéssel, meg a hülyeségeimmel, szigorúan csak a feladat :)
//    próbálva betartani minden konvenciót. Egy metódus egy feladatért felelős, nevek (na ez nem az erősségem),
//    üres sorok, behúzás ...
    public static void main(String[] args) {

        GuessTheNumberIO gameIO = new GuessTheNumberIO();
        GuessTheNumber game = new GuessTheNumber(gameIO);

        gameIO.introducingTheGame();
        game.startTheGame();
    }
}
