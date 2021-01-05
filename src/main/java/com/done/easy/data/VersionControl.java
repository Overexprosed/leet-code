package com.done.easy.data;

public class VersionControl {

    public final long badVersion;

    public VersionControl(int badVersion) {
        this.badVersion = badVersion;
    }

    public boolean isBadVersion(int badVersion) {
        return  badVersion >= this.badVersion;
    }
}
