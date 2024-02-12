# Simply Tuples
A small open-source project that adds tuples to Java in a simple way.

## Goal and Usage
The goal of this project is to provide a lightweight and easy-to-use Java library that implements tuples.

Tuples are data structures that can hold multiple elements of different types. There is built-in support for tuples in languages such as Python, but not Java.

Simply Tuples adheres strongly to the principle of immutability associated with tuples, providing methods for updating, removing, and transforming tuples without modifying the original instances.

This project offers a straightforward and expressive way to work with tuples in Java, enhancing the readability and maintainability of code through a highly versitile data structure.

Additionally, several tests are provided to ensure the functionality of the code.

## Notes
- This project is a work-in-progress and big changes may be implemented in the future.
- The project supports `Tuple0` - `Tuple5` (0-5 elements per tuple) and will not add support for larger tuples, since we believe that it is better after that to build and use your own custom classes.

## Technologies
This project was written in Java and utilizes TestNG, a testing framework inspired by JUnit and NUnit but with more powerful features.

## Documentation
- src/main/java/com/abukhleif/simplytuples
  - builder
    - `Tuple.java` provides static factory methods for creating tuples containing up to 5 elements.
  - parent
    - 'Parent0.java' to 'Parent5.java' contain a hierarchy of interfaces representing tuples of various sizes with methods for removing and updating specific elements.
  - tuple
    - `Tuple0.java` to `Tuple5.java` implement `ExpandedTuple` and their corresponding Parent interface, follow a singleton pattern, and include methods like `prepend()`, `append()`, and `removeFirst()` to create new tuples with the desired modification.
  - type
    - `ExpandableTuple.java` is an interface that extends `SimplyTuple` and declares methods for appending and prepending elements to a tuple, allowing users to dynamically modify its size.
    - `Helper.java` is a utility class with static methods to assist in converting tuples into maps.
    - `SimplyTuple.java` is an interface that extends `Serializable` and defines methods for various operations on tuples, including reversing, removing elements, and converting to other data structures.
  - value
    - `Value1.java` to `Value5.java` contain interfaces with methods to access individual elements based on their arity, along with alias for flexibility and readability.
- src/test/java/com/abukhleif/simplytuples
  - RandomTests.java
    - Contains TestNG test methods that test various functionalities of the tuple classes from the `com.abukhleif.simplytuples.tuple` package.
  - ToArrayTests.java
    - Contains TestNG test methods that ensure the proper conversion of tuples to arrays.
  - ToListTests.java
    - Contains TestNG test methods that ensure the proper conversion of tuples to lists.
  - ToMapTests.java
    - Contains TestNG test methods that ensure the proper conversion of tuples to maps.
  - ToSetTests.java
    - Contains TestNG test methods that ensure the proper conversion of tuples to sets.

## TODO
- Methods:
  - **from** to builder. Build bigger tuples using smaller ones
  - merge / expand
- Check Apache common, Scala tuples and 'javatuples' implementations.
