package com.done.easy;

import com.done.easy.data.VersionControl;

/**
 * Problem explanation
 *
 * Find first bad version (the first 'true' occurrence).
 * Version list example : [false, false, true, true, true] .
 *
 * Algorithm explanation
 *
 * Binary search.
 */
public class FirstBadVersion {

    public int findFirstBadVersion(int versionsCount, VersionControl versionControl) {
        int low = 0;
        int mid = 0;
        int high = versionsCount;

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
}
