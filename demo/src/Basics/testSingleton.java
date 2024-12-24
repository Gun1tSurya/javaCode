package Basics;

public class testSingleton {

    testSingleton testSingleton;

    public testSingleton getTestSingleton(){
        testSingleton = this.testSingleton;
        return testSingleton;
    }
}
