package com.hipercube.singleton;

/**
 * EnumSingleton
 *
 * Created by HIPERCUBE on 6/20/15.
 */
public enum EnumSingleton {

    UNIQUE_INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
