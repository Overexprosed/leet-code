package com.done.easy;

/**
 * Найти первую уникальную букву
 *
 * Один раз пройдем по всей строке и посчитаем вхождения кажой буквы.
 * Сохраним результат в массив размером 26 ячеек : countArray[Unicode] = count
 * Пройдем по строке еще раз, заглядывая в массив и спрашивая сколько раз встречается буква.
 */
public class FirstUniqueCharacter {

    public int firstUniqueChar(String s) {
        if (s.isEmpty()) return -1;

        int[] countArray = new int[26];
        char[] lettersArray = s.toCharArray();

        for (char letter : lettersArray) {
            countArray[letter - 'a']++;
        }

        for (int i=0; i < lettersArray.length; i++) {
            if (countArray[lettersArray[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
