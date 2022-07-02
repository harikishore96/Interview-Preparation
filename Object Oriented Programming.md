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