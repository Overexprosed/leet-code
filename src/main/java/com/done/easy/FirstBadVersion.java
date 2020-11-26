package com.done.easy;

/**
 * Найти первую плохую версию (первое вхождение true).
 * Пример списка версий : [false, false, true, true, true] .
 *
 * Бинарный поиск. Для хорошего теста используй Integer.MAX_VALUE .
 */
public class FirstBadVersion {

    private static VersionControl versionControl = new VersionControl(Integer.MAX_VALUE);

    public static void main(String[] args) {
        test(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    private static void test(int total, int badVersion) {
        versionControl = new VersionControl(badVersion);

        long startTime = System.nanoTime();
        int result = firstBadVersionV2(total, versionControl);
        long finishTime = System.nanoTime();

        System.out.println("###############################");
        System.out.println("  Total = " + total);
        System.out.println("  BadVersion = " + badVersion);
        System.out.println("  Result = " + result);

        long executeDurationNanoSec = (finishTime - startTime);
        long executeDurationSec = executeDurationNanoSec / 1_000;

        System.out.println("  Execute duration = " + executeDurationSec + " micro sec");
        System.out.println("###############################");
    }

    /**
     * Only for tests
     */
    public static int firstBadVersionV2(int n, VersionControl versionControl) {
        int low = 0;
        int mid = 0;
        int high = n;

        while (low <= high) {
            mid = low + ((high - low) / 2);

            if (!versionControl.isBadVersion(mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (versionControl.isBadVersion(mid)) {
            return mid;
        } else {
            return mid + 1;
        }
    }

    public static class VersionControl {

        public final long badVersion;

        public VersionControl(int badVersion) {
            this.badVersion = badVersion;
        }

        public boolean isBadVersion(int badVersion) {
            return  badVersion >= this.badVersion;
        }
    }
}
