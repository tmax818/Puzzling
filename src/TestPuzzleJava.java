public class TestPuzzleJava {
    public static void main(String[] args) {

        PuzzleJava pj = new PuzzleJava();
        pj.getTenRolls();
        char letter = pj.getRandomLetter();
        System.out.println(letter);
        pj.generatePassword();
        pj.getNewPasswordSet(12);
    }
}
