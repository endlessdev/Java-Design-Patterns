package com.hipercube.singleton;

/**
 * CreateOnDeclarationSingleton
 *
 * In this approach, when class loaded on JVM, it create uniqueInstance.
 *
 * Created by HIPERCUBE on 6/20/15.
 */
public class CreateOnDeclarationSingleton {
    private static CreateOnDeclarationSingleton uniqueInstance = new CreateOnDeclarationSingleton();

    private CreateOnDeclarationSingleton() {
    }

    public static CreateOnDeclarationSingleton getInstance() {
        return uniqueInstance;
    }
}
