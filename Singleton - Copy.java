////////////////////////////////////////
//
//  Author: Savan Vyas
//
//  File name : Singleton.java
//
//  Date: 10-12-2021
////////////////////////////////////////


/*
 Definition: A class has only one instance and provide a
 global point of access to it.
 */
public class Singleton {
    private static Singleton instance;

    /*making constructor private helps that
    you can't create new instances from outside
    instead use getInstance method.*/
    private Singleton () {}

    public static Singleton getInstance()
    {
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}


/*
NOTE:
Cons:
1.	If globally accessible then any one can do change during execution. Any piece of code can modify it.
2.	Single instance : we never know that an class will have one and only one instance in future. Generally it is very specific to particular use cases.
3.	Singleton may create difficulties in unit level testing too. Sometime need to mock particular instance.

 */