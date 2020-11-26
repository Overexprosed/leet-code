package com.done.easy;

/**
 * Проверить, что все буквы из первой строки присутствуют во второй строке (с учетом регистра).
 *
 * Если входные данные ограниченны не большим объемом, time Complexity = O(1).
 * В таком случае стоит больше внимания обратить на Space Complexity.
 * HashMap скрывает под капотом много кода. Это древовидная структура миссивов. С создание Map.Entry.
 * Хорошим решением будет использовать обычный массив.
 *
 * При ограниченном объеме входных данных массив играет роль Lookup Service.
 */
public class JewelsAndStones {

    public static void main(String[] args) {
        test("aA", "aAAbbbb");
    }

    public static int numJewelsInStones(String J, String S) {
        if (J.length() > 50 || S.length() > 50) return 0;

        // initialization
        boolean[] jewels = new boolean[59];
        for (int i=0; i < J.length(); i++) {
            jewels[123 - J.codePointAt(i)] = true;
        }

        int count = 0;
        for (int i=0; i < S.length(); i++) {
            if (jewels[123 - S.codePointAt(i)]) {
                count++;
            }
        }
        return count;
    }

    private static void test(String j, String s) {
        int result = numJewelsInStones(j, s);

        System.out.println("##########################################");
        System.out.println("   J = " + j);
        System.out.println("   S = " + s);
        System.out.println("   Result = " + result);
        System.out.println("##########################################");
    }
}
