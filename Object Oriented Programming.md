# Object Oriented Programming

There are the four main principles of the Object-Oriented Programming paradigm. These principles are also known as the pillars of Object-Oriented Programming.

The four main principles of Object-Oriented Programming are:

1. Encapsulation
2. Inheritance
3. Abstraction
4. Polymorphism

## Encapsulation

The idea behind encapsulation is to ensure that "sensitive" data is hidden from users. To achieve this, you must:

1. Declare class variables/attributes as private.
2. Provide public get and set methods to access and update the value of a private variable.

```
public class Student {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
}
```

## Inheritance
Inheritance allows classes to inherit attributes and methods of other classes. This means that parent classes extend attributes and behaviors to child classes. Inheritance supports reusability.

We group the "inheritance concept" into two categories:

1. subclass (child) - the class that inherits from another class.
2. superclass (parent) - the class being inherited from.

To inherit from a class, we use the extends keyword.

```
class Animal {

  // field and method of the parent class
  String name;
  public void eat() {
    System.out.println("I can eat");
  }
}

// inherit from Animal
class JerryTheMouse extends Animal {

  // new method in subclass
  public void display() {
    System.out.println("My name is " + name);
  }
}
```

## Abstraction
Abstraction is a concept in object-oriented programming that lets you show only essential attributes and hides unnecessary information in your code. The main purpose of abstraction is to hide unnecessary details from your users.

You can abstract stuff by using abstract classes or interfaces.

The abstract keyword is a non-access modifier, used for classes and methods:

1. Abstract class: 
    - is a restricted class that cannot be used to create objects. 
    - To access it, it must be inherited from another class.
2. Abstract method: 
    - A method that doesn't have its body is known as an abstract method. 
    - We use the same abstract keyword to create abstract methods.

The body of an abstract method is provided by the subclass (inherited from).

```
// Abstract class
abstract class Animal {

  // Abstract method (does not have a body)
  public abstract void animalSound();

  // Regular method
  public void sleep() {
    System.out.println("Zzzz");
  }
}

// Subclass (inherit from Animal)
class Cow extends Animal {
    
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The cow says: Moo");
  }
}
```