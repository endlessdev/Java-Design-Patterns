package com.hipercube.singleton;

import java.io.Serializable;

/**
 * InitializeOnDemandHolderSingleton
 *
 * The Initialize-on-demand-holder is a secure way of
 * creating lazy initialize singleton Object in Java.
 * refer to "The CERT Oracle Secure Coding Standard for Java"
 * By Dhruv Mohindra, Robert C. Seacord p.378
 *
 * Singleton objects usually are heavy to create and sometimes need to serialize them.
 * This class also shows how to preserve singleton in Serialized version of singleton.
 *
 * Created by HIPERCUBE on 6/20/15.
 */
public class InitializeOnDemandHolderSingleton implements Serializable {

    private static final long serialVersionUID = 1L;

    private static class HelperHolder {
        public static final InitializeOnDemandHolderSingleton uniqueInstance = new InitializeOnDemandHolderSingleton();
    }

    public static InitializeOnDemandHolderSingleton getInstance() {
        return HelperHolder.uniqueInstance;
    }

    private InitializeOnDemandHolderSingleton() {
    }

    protected Object readResolve() {
        return getInstance();
    }
}