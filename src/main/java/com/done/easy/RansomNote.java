package com.done.easy;

/**
 * Проверить, что все буквы из второй строки, присутствуют в первой.
 *
 * Почучение Unicode через char : char - 'a'.
 * Неявно ограниченный объем данных, хранящийся в Lookup массиве.
 * Ограничен кол-вом букв английского алфавита.
 */
public class RansomNote {

    public static void main(String[] args) {
        assert !canConstruct("s", "");
        assert canConstruct("", "");
        assert canConstruct("", "a");
        assert canConstruct("fffbfg", "effjfggbffjdgbjjhhdegh");
        assert canConstruct("gol", "gol");
        assert canConstruct("gol", "gol");
        assert canConstruct("g", "gggggggggggg");
        assert !canConstruct("asd", "qwe");
        assert !canConstruct("aa", "ab");

        System.out.println("Everything is great!");
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] ransomNoteArray = ransomNote.toCharArray();
        char[] magazineArray = magazine.toCharArray();

        int[] countArray = new int[26];
        for (char letter : magazineArray) {
            countArray[letter - 'a']++;
        }

        for (char letter : ransomNoteArray) {
            if (countArray[letter - 'a'] > 0) {
                countArray[letter - 'a']--;
            } else {
                return false;
            }
        }
        return true;
    }
}
