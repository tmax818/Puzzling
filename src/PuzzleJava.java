import java.util.Arrays;
import java.util.Random;

public class PuzzleJava {

    public int[] getTenRolls(){
        Random randInt = new Random();
        int[] intArr;
        intArr = new int[10];
        for(int i = 0; i < 10;i++){
            intArr[i] = Math.abs(randInt.nextInt() % 20 + 1);
        }
        System.out.println(Arrays.toString(intArr));
        return intArr;
    }

    public char getRandomLetter(){
        Random randInt = new Random();
        char letter = (char) (97 + Math.abs(randInt.nextInt() % 25 + 1));
        System.out.println(letter);
        return letter;
    }

    public String generatePassword(){
        char[] strArr = new char[8];
        for(int i = 0; i < 8; i++){
            strArr[i] = getRandomLetter();
        }
        String password = new String(strArr);
        System.out.println(password);
        return password;
    }

    public String[] getNewPasswordSet(int length){
        String[] pwArray = new String[length];
        for(int i = 0; i < length; i++){
            pwArray[i] = generatePassword();
        }
        System.out.println(Arrays.toString(pwArray));
        return null;
    }

}