Programs :

1. Find duplicate string in string
2. Find second largest number using single for loop

- Write regular expression for password 


//    You may use this regex with multiple lookahead assertions (conditions):
//
//            ^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$
//
//    This regex will enforce these rules:
//
//    At least one upper case English letter, (?=.*?[A-Z])
//    At least one lower case English letter, (?=.*?[a-z])
//    At least one digit, (?=.*?[0-9])
//    At least one special character, (?=.*?[#?!@$%^&*-])
//    Minimum eight in length .{8,} (with the anchors)


- Diff between abstract and interface in java8  (As Java8 supports interface with method definition then whats difference

    https://www.java67.com/2017/08/difference-between-abstract-class-and-interface-in-java8.html

    Prima facia, in Java 8, an interface looks like an abstract class and one can reason about, can we use an interface with default methods in place of an abstract class in Java?

    Well, I believe they are for two different purposes and we will learn more once we start using Java 8 regularly, but following the semantics difference between abstract class and interface with default method will guide you further :

  1) Abstract classes are classes, so they are not restricted to other restrictions of the interface in Java, like abstract class can have the state, but you cannot have the state on the interface in Java.

     1) Another semantic difference between an interface with default methods and an abstract class is that you can define constructors inside an abstract class, but you cannot define constructors inside an interface in Java.

    In reality, default or defender methods are introduced to maintain backward compatibility and the same time making Collection API more suitable to be used inside key Java 8 features like lambda expressions.

    Without adding default methods, it wasn't possible to declare any new method on the existing interface in Java without breaking all classes which implement it, but because of the default method, you can now better evolve your API.

    They defend your code against implementing new methods hence they are also called defender methods. If you want to know more about default methods or new changes in Java 8 in general, I suggest you check out these Java 8 to Java 13 courses from sites like Udemy and Pluralsight.


- Whats the correct way for public static void main 

   1. static void main(String args[])
   2. public void main(String args[])
   3. static public void main(String args[])
   4. public static void main(String args[])

    - https://www.geeksforgeeks.org/understanding-public-static-void-mainstring-args-in-java/
    - 3 rd and 4th are correct

- Can we override private method in java

  Java, methods declared as private can never be overridden, they are in-fact bounded during compile time    

    