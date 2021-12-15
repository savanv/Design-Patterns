////////////////////////////////////////
//
//  Author: Savan Vyas
//
//  File name : Decorator.java
//
//  Date: 12-12-2021
////////////////////////////////////////


/*
 Definition: If you have an object/method which has some input and giving
 back some output and if I want to change the behaviour of this method then
 I could do at runtime without changing the content of the given method. The
 changes will be done at run time but not compile time.
 */
public class Decorator {
    public static void main(String[] args) {
        System.out.println("This is a decorator example");
        Beverage b = new caramel(new Espresso());
        System.out.println("cost of beverage: " + b.cost());
    }
}

// Step-1: this is an abstract class. It could be an interface also. -abstract end
abstract class Beverage{
    public abstract int cost();
}

/*Step-2: Addon decorator
decorator is component
abstract decorator   - decorator end*/
abstract class AddonBeverage extends Beverage{
    public abstract int cost();
}

// Step-3 Concrete class - abstract end
class Espresso extends Beverage{
    public int cost()
    {
        return 1;
    }
}

/*
Step-4:
this is a concrete decorator class - decorator end
caramel ---> AddonBeverage ---> Beverage
Decorator HAS a component as well IS a component
here caramel constructor extends AddonBeverage and which is extends Beverage
so caramel IS a component of Beverage, whereas in constructor, it is defined as a
Beverage and instantiating a component so, It HAS a component
 */
class caramel extends AddonBeverage{

    // This is to define that is HAS ac component
    Beverage bev;
    public caramel(Beverage b){
        this.bev = b;
    }
    public int cost()
    {
        return this.bev.cost() + 2;
    }
}

/*
NOTE: Above example is taken from Head first design pattern book, but
unfortunately is not a good example and making things complicated. It
is violating solid principles like Interface segregation and liskov
substitution principle. so, explained in easy way here.
decorator is generally used when we actually need to deprecate the usage
when trying to deprecate something but, I don't want to deprecate something
at once in all the places.
one object is refer to many places now all sudden I do want to dereference
in some the places, so I will write a wrapper which will return the response
if request is coming from the place which i want to deference.
 */