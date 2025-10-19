
# Design-patterns in Java

This repository contains examples of commonly used design patterns implemented in Java. Each design pattern is demonstrated with clear and concise code to help developers understand and apply these patterns in their projects.

## Table of Contents

- [Introduction](#introduction)
- [Design Patterns](#design-patterns)
  - [Builder Pattern](#builder-pattern)
  - [Strategy Pattern](#strategy-pattern)
- [How to Run](#how-to-run)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Design patterns are proven solutions to common software design problems. They provide a standard way to structure code, making it more reusable, maintainable, and scalable. This repository showcases examples of design patterns implemented in Java.

## Design Patterns

### Factory Pattern
The Factory Pattern is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.
- **File**: `Factory/FactoryPattern.java`
- Example**: Creating different types of `Shape` objects (e.g., Circle, Square) using a `ShapeFactory`.


### Decorator Pattern
The Decorator Pattern is a structural design pattern that allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class.

- **File**: `Decorator/DecoratorPattern.java`
- Example**: Adding additional features to a `Coffee` object (e.g., Milk, Sugar) using decorators.


### Builder Pattern

The Builder Pattern is used to construct complex objects step by step. It allows you to create different representations of an object using the same construction process.

- **File**: `Builder/BuilderPattern.java`
- **Example**: Creating `Computer` objects with different configurations.

### Strategy Pattern

The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. It allows the algorithm to vary independently from the clients that use it.

- **File**: `Strategy/StrategyPattern.java`
- **Example**: Implementing different payment strategies (e.g., Credit Card, PayPal) in a shopping cart.

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/saurabh1515/design-patterns-in-java.git
   cd design-patterns-in-java
   ```

2. Open the project in your favorite IDE (e.g., IntelliJ IDEA).

3. Navigate to the desired design pattern file (e.g., `Builder/BuilderPattern.java`).

4. Run the `main` method to see the pattern in action.

## Contributing

Contributions are welcome! If you have examples of other design patterns or improvements to the existing code, feel free to open a pull request.

1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add your message here"
   ```
4. Push to your branch:
   ```bash
   git push origin feature/your-feature-name
   ```
5. Open a pull request.

## License

This project is licensed under the MIT License. 

