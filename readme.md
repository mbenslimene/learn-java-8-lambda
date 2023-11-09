# Java 8 Lambda

Welcome to the Java 8 Lambda repository. This repository provides a comprehensive guide to understanding and using Java 8 Lambda expressions, a powerful feature introduced in Java 8 for functional programming. By leveraging Lambda expressions, you can write cleaner, more concise, and more expressive code in your Java applications.

## Resources

Before you begin exploring the repository, here are some recommended resources for learning more about Java 8 Lambda:

- [Pluralsight Course: Implementing Design Patterns Using Java 8 Lambda](https://app.pluralsight.com/library/courses/implementing-design-patterns-java-8-lambda-expression/table-of-contents)
- [Pluralsight Course: Using Java Lambda Expressions](https://app.pluralsight.com/library/courses/lambda-expressions-java-code/table-of-contents)
- [Pluralsight Course: Using Java Streams](https://app.pluralsight.com/library/courses/java-streams-process-analyze-data-memory/table-of-contents)

## Contents

This repository covers the following key topics related to Java 8 Lambda:

1. **Functional Interfaces:** Understand essential functional interfaces like Supplier, Consumer, Predicate, and Function.

2. **Lambda Expression Performance:** Learn about the performance benefits of Lambda expressions, how they differ from anonymous classes, and ways to optimize performance.

3. **Chaining and Composing Functions:** Explore the concepts of function chaining and composition for data processing, including practical examples.

4. **Fluent Interface:** Discover the Fluent Interface design pattern for creating expressive and readable code through method chaining.

5. **Collection vs. Stream:** Understand the differences between collections and streams in Java, including mutability, lazy evaluation, and when to use each.


## I. Functional Interfaces

1. **Supplier**
   - A method with no arguments that returns a value of type `T`.

2. **Consumer**
   - A method with one argument of type `T` and returns `void`.

3. **Predicate**
   - A method with one argument of type `T` and returns a `boolean`.
   - Used in filter operations on the Stream.

4. **Function**
   - A method with one argument of type `T` and returns a value of type `R`.
   - Used in map operations on the Stream.

## II. Lambda Expression Performance

1. **Lambda Performance**
   - Lambdas are not instances of anonymous classes.
   - The compiled code is different.
   - Lambdas use invokedynamic compiler.
   - Performances are significantly better, and you can make them even faster.

2. **Performance Autoboxing Lambda Expression**
   - Avoid auto-boxing and use specialized functional interfaces for primitive types like `IntPredicate`, `IntSupplier`, etc.

## III. Chaining and Composing Functions

Chaining Functions is suitable when you have a specific sequence of operations to apply to the data. Composing Functions is more suitable when you want to create reusable, composable functions for various analyses that can be applied independently to the same data.

1. **Example Chaining Functions:**
   - Scenario: Imagine you are developing a banking application. You have a list of bank transactions, and you need to process these transactions in a specific order to calculate the account balance.

2. **Example Composing Functions:**
   - You want to calculate the total withdrawals and the average deposit amount as separate functionalities. Then calculate the balance by composing them into higher-order functions for reusability.

## IV. Fluent Interface

**Fluent interface** is a design pattern that allows method calls to be chained together in a way that creates more readable and expressive code. Fluent interfaces are often used with the builder pattern, where you configure or build complex objects step by step through method chaining. The chaining of methods creates a fluent and expressive way to configure an object.

## V. Collection vs. Stream

1. **Collections**
   - Collections are mutable, and you can add, remove, and modify elements within a collection.
   - Collections use eager evaluation, meaning that they store the entire collection in memory, and you can access and manipulate elements directly.
   - You iterate through a collection using loops, such as the enhanced for loop or Iterator.

2. **Streams**
   - Streams are typically immutable. Once you create a stream, you don't modify its source data. Instead, you create a new stream with the results of operations.
   - Streams use lazy evaluation, meaning they only process elements when necessary, ensuring that only necessary data is processed.
   - You process elements in a stream using higher-order functions and lambda expressions, such as `map`, `filter`, and `reduce`.
   - Streams make it easier to leverage parallel processing.
   - You are not allowed to process the same stream twice, both intermediate and terminal operations. You will get an `IllegalStateException`.


