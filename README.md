# ScreenMatch APP

## 1. Aim of Project
Learn about application development and the advantages of using the object-oriented paradigm. Develop functionalities for a movie and series streaming application, learning about concepts that are essential for a career as a Java developer.

## 2. Problem Statement
Imagine that you are working at a company that manages a library of digital content like Netflix or Hulu.
Your task is to create a simple tool that allows employees to register new movies in the system and consult their technical sheets. The program should be easy to use and capable of handling basic user input through an interactive menu.

Develop a Java program that functions as an interactive menu for a multimedia content management system. The program should allow the user to register new movies, showing details such as name, year of release and duration.
Additionally, the program must allow the user to exit whenever they want.

## 3. Problem Solution
To solve the problem, OOP (Object Oriented Programming) will be applied. What is object-oriented programming?

![POOquees](https://github.com/s2023/ScreenMatchApp/assets/118579549/45dc4361-be9c-49e0-9a68-0cc0dfd4a917)


Object-oriented programming (OOP) is a programming paradigm that uses "objects" to design applications and programs.
Objects are entities that combine state (data) and behavior (functions or methods).
OOP facilitates the development and maintenance of complex software by allowing developers to focus on the high level of data abstraction.

### 3.1. Key OOP Concepts

1. **Class**
 - A class is a "blueprint" or template for creating objects. Defines a data type through attributes (data) and methods (functions associated with that data).
 - **Example**: A `Dog` class could have attributes like `name`, `age` and methods like `bark()` or `walk()`.

2. **Object**
 - An instance of a class. An object in OOP encapsulates state and behavior that are defined by its class.
 - **Example**: If `Dog` is a class, then an object could be `myDog` which represents a specific dog such as a Labrador named "Max".

3. **Inheritance**
 - Inheritance allows one class to inherit characteristics (attributes and methods) from another class. The class that it inherits is known as a subclass or derived class, and the class from which it inherits is known as a superclass or base class.
 - **Example**: The `Labrador` class could inherit from the `Dog` class, thus obtaining all its methods and attributes.

4. **Polymorphism**
 - Polymorphism means "many forms" and allows a method to behave differently depending on the instance of the class that is using it. This can be achieved through method overloading (same method, different parameters) or method overriding (redefining a method in a subclass).
 - **Example**: `myDog.bark()` could produce a different sound if `myDog` is a `Labrador` and another if it is a `Chihuahua`.

5. **Encapsulation**
 - Encapsulation is the principle of hiding the internal details of the operation of a class and exposing only those components that are safe for external use. This is achieved using access modifiers such as `public`, `private` and `protected`.
 - **Example**: The attributes of the `Dog` class could be private (`private`), meaning that they can only be modified through public methods (`public`) such as `setAge(int age)` .

6. **Abstraction**
 - Abstraction involves identifying what characteristics are common and essential between objects, defining them in a class that can be extended or implemented. On many occasions, it is used in conjunction with interfaces and abstract classes.
 - **Example**: An abstract class `Animal` could define an abstract method `move()` that must be implemented by all derived subclasses such as `Dog`, `Cat`, etc.

### 3.2. Composition on Inheritance
Composition and inheritance are two techniques that allow developers to define new classes in OOP, but composition is often preferred over inheritance for several reasons:

![POOHerencia](https://github.com/s2023/ScreenMatchApp/assets/118579549/ff2afdc3-2082-4509-bfcb-ca0d4cc15ba5)

- **Minor Coupling**: Composition allows creating more flexible systems with objects that use functionalities of other objects through their interfaces without needing to inherit from them. This reduces coupling between classes.

- **Greater Flexibility**: With composition, it is easy to change behavior at runtime by adding and removing components, while inheritance is static and does not allow changing the inheritance of an object once created.

- **Avoid Fragility of the Class Base**: In inheritance, changes in the superclass can have unforeseen effects on subclasses, which can lead to errors. The composition minimizes this risk by encapsulating the behaviors.

- **Single Responsibility Principle**: Composition makes it easier to adhere to the single responsibility principle, where a class should have one, and only one, reason to change. Inheritance, on the other hand, can lead to situations where a base class has multiple responsibilities across its subs.

## 4. Problem statement
Efficiently organize and manage information about movies and series within a streaming platform, including registration, visualization of total times and management of an accessible database.

## 5. Proposed solution
Develop a Java application that allows the registration, storage and management of specific details of movies and series, such as name, director, year of release, duration, etc., and that offers the possibility of calculating the total viewing time for marathons of content.

## 6. Solution Design
The solution uses an inheritance model to represent general and specialized multimedia titles (`Title`, `Movie`, `Series`). It incorporates utilities for user data entry and structures an interactive menu to manage the functionality.

### 6.1.  Class Structure
- `Title`: Base class that defines common attributes and methods for all titles.
- `Movie`: Subclass of `Title`, adds specific movie attributes.
- `Serie`: Subclass of `Title`, handles specific characteristics of television series.
- `Principal`: Contains the main business logic and the interactive menu.
- `Main`: Entry point of the application that starts the menu.

## 7. Design Implementation
The application is developed in Java, using encapsulation to protect and organize data, inheritance to reduce redundancies and improve maintainability, and exception handling to handle invalid user input.

### 7.1. Code Details
- **Classes `Movie` and `Series`**: They extend `Title` Class and add particularities such as director or duration per episode.
- **Class `Principal`**: Manages interaction with the user and coordinates the functionality of the application.
    - **Method `ShowMenu`**: Facilitates the creation of forms for registering movies and series, using static methods and an internal class to handle basic media information. Encapsulates the form logic for registering movies and series, reading and validating different types of data.
        - **Method `JOptionPane`**: Utility method to handle data input from the window dialog, encapsulating the form logic for registering movies and series.
- **Class `Main`**: Starts the execution of the program.

## 8. Good Practices and Applied Methodologies
- **Encapsulation**: Use of access modifiers to protect data.
- **Inheritance**: To avoid duplication and encourage code reuse.
- **Principle of single responsibility**: Each class has a clear responsibility and purpose.
- **Exception Handling**: Robust error handling to avoid runtime failures.
- **Use of static methods when appropriate**: For utilities that do not maintain state.

## 9. Instructions for use
1. Clone the repository to your local machine.
2. Compile and run the `Main` class.
3. Follow the instructions on the windows to interact with the program.

## 10. Author
Juan Sebastian Rivas Agudelo.
