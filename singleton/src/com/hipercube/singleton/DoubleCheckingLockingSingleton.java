package com.hipercube.singleton;

/**
 * DoubleCheckingLockingSingleton
 *
 * This DoubleCheckingLockingSingleton is multi thread safe.
 *
 * Created by HIPERCUBE on 6/20/15.
 */
public class DoubleCheckingLockingSingleton {
    private volatile static DoubleCheckingLockingSingleton uniqueInstance;

    /**
     * private constructor to prevent client from instantiating.
     */
    private DoubleCheckingLockingSingleton() {
    }

    public static DoubleCheckingLockingSingleton getInstance() {
        if (uniqueInstance == null) {// check if instance is created
            synchronized (DoubleCheckingLockingSingleton.class) {//synchronize when instance doesn't created
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckingLockingSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
