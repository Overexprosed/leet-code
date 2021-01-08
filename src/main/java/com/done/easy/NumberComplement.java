package com.done.easy;

/**
 * Пример : дано число 121. Его двоичное представление 1111010 .
 * Нужно сделать реверт двоичного представления (0000101) и найти его десятичное представление.
 *
 * ---
 * В условиях задачи сказано, что мы ограничеваемя 32-bit.
 * Т.е. максимальное входное значение Integer.MAX_VALUE ,
 * двоичное представление которого 1111111111111111111111111111111 (length = 31).
 * Создаем массив соответствующего размера.
 */
public class NumberComplement {

    public static void main(String[] args) {
        assert findComplement(5) == 2;
        assert findComplement(1) == 0;
        assert findComplement(0) == 0;
        assert findComplement(122) == 5;

        System.out.println("Everything is great! :)");
    }

    public static int findComplement(int num) {
        int[] reverseBinaryArray = new int[31];
        int arrayLength = 0;

        // calculate reverse binary representation. It's a feature, not a bug :)
        while (num > 0) {
            reverseBinaryArray[arrayLength] = (num % 2 ) == 0 ? 0 : 1;
            num = num / 2;

            arrayLength++;
        }

        // reverse binary representation
        for (int i=0; i < arrayLength; i++) {
            reverseBinaryArray[i] = (reverseBinaryArray[i] == 0) ? 1 : 0;
        }

        // from binary to decimal
        int result = 0;
        while (arrayLength > 0) {
            int n = reverseBinaryArray[arrayLength - 1];
            for (int i=0; i < arrayLength - 1; i++) {
                n = n * 2;
            }
            result = result + n;
            arrayLength--;
        }
        return result;
    }
}
