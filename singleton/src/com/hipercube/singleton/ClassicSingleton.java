package com.hipercube.singleton;

/**
 * ClassicSingleton
 *
 * Created by HIPERCUBE on 6/20/15.
 */
public class ClassicSingleton {

    // private static variable for storing ClassicSingleton class's unique instance.
    private static ClassicSingleton uniqueInstance;

    // As constructor is private, ClassicSingleton only created in ClassicSingleton class.
    private ClassicSingleton() {
    }

    // return class instance
    public static ClassicSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ClassicSingleton();
        }
        return uniqueInstance;
    }
}
