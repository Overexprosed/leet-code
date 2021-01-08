package com.done.easy;

/**
 * Climbing Stairs
 *
 * You are climbing a staircase.
 * It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps.
 * In how many distinct ways can you climb to the top?
 *
 * ---
 * Basically, it's fibonacci
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        if (n <= 0) return 0;
        if (n <= 2) return n;

        int twoStepsBefore = 1;
        int oneStepBefore = 2;
        int allSteps = 0;

        for (int i = 3; i <= n; i++) {
            allSteps = oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = allSteps;
        }
        return allSteps;
    }
}
