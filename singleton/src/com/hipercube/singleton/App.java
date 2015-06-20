package com.hipercube.singleton;

/**
 * App
 *
 * Singleton Pattern
 *  - This pattern ensure the class can have only one existing instance.
 *  - Anywhere to allow access to the instance.
 *  - Make to manage only one existing instance at the class.
 *  - This pattern is used on thread pool, cache, device driver etc...
 *
 * Created by HIPERCUBE on 6/20/15.
 */
public class App {

    public static void main(String[] args) {

        // ClassicSingleton
        ClassicSingleton classicSingleton1 = ClassicSingleton.getInstance();
        ClassicSingleton classicSingleton2 = ClassicSingleton.getInstance();
        System.out.println("classicSingleton1 = " + classicSingleton1);
        System.out.println("classicSingleton2 = " + classicSingleton2);

        // CreateOnDeclarationSingleton
        CreateOnDeclarationSingleton createOnDeclarationSingleton1 = CreateOnDeclarationSingleton.getInstance();
        CreateOnDeclarationSingleton createOnDeclarationSingleton2 = CreateOnDeclarationSingleton.getInstance();
        System.out.println("createOnDeclarationSingleton1 = " + createOnDeclarationSingleton1);
        System.out.println("createOnDeclarationSingleton2 = " + createOnDeclarationSingleton2);

        // DoubleCheckingLockingSingleton
        DoubleCheckingLockingSingleton doubleCheckingLockingSingleton1 = DoubleCheckingLockingSingleton.getInstance();
        DoubleCheckingLockingSingleton doubleCheckingLockingSingleton2 = DoubleCheckingLockingSingleton.getInstance();
        System.out.println("doubleCheckingLockingSingleton1 = " + doubleCheckingLockingSingleton1);
        System.out.println("doubleCheckingLockingSingleton2 = " + doubleCheckingLockingSingleton2);

        // EnumSingleton
        EnumSingleton enumSingleton1 = EnumSingleton.UNIQUE_INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.UNIQUE_INSTANCE;
        System.out.println("enumSingleton1 = " + enumSingleton1);
        System.out.println("enumSingleton2 = " + enumSingleton2);

        // InitializeOnDemandHolderSingleton
        InitializeOnDemandHolderSingleton initializeOnDemandHolderSingleton1 = InitializeOnDemandHolderSingleton.getInstance();
        InitializeOnDemandHolderSingleton initializeOnDemandHolderSingleton2 = InitializeOnDemandHolderSingleton.getInstance();
        System.out.println("initializeOnDemandHolderSingleton1 = " + initializeOnDemandHolderSingleton1);
        System.out.println("initializeOnDemandHolderSingleton2 = " + initializeOnDemandHolderSingleton2);

        // MultiThreadSafeSingleton
        MultiThreadSafeSingleton multiThreadSafeSingleton1 = MultiThreadSafeSingleton.getInstance();
        MultiThreadSafeSingleton multiThreadSafeSingleton2 = MultiThreadSafeSingleton.getInstance();
        System.out.println("multiThreadSafeSingleton1 = " + multiThreadSafeSingleton1);
        System.out.println("multiThreadSafeSingleton2 = " + multiThreadSafeSingleton2);
    }
}
