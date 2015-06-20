package com.hipercube.singleton;

/**
 * MultiThreadSafeSingleton
 *
 * Created by HIPERCUBE on 6/20/15.
 */
public class MultiThreadSafeSingleton {
    private static MultiThreadSafeSingleton uniqueInstance;

    private MultiThreadSafeSingleton() {
    }

    // synchronized keyword protect to occur that two thread execute this method simultaneously.
    public static synchronized MultiThreadSafeSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MultiThreadSafeSingleton();
        }
        return uniqueInstance;
    }
}