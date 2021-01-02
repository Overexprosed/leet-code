package com.done.easy.data;

/**
 * Return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 */
public class NeedleInHaystack {

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        return haystack.indexOf(needle);
    }
}
