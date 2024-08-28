# WaterParkSystem
This project involves creating a Java application that simulates different types of carnival rides. The primary focus is on designing a class hierarchy with an abstract base class (CarnivalRide) and two subclasses (Rollercoaster and WaterRide). The project includes the following key components:

Class Hierarchy:

CarnivalRide: An abstract class that includes common properties like type, duration, and name. It also has abstract methods like aboutRide() and fearFactor(), which are implemented by the subclasses.
Rollercoaster: A subclass of CarnivalRide with additional properties like loops. It provides specific implementations for fearFactor() and aboutRide(), describing the ride based on its duration and the number of loops.
WaterRide: Another subclass of CarnivalRide with a unique property called waterdrop. It implements fearFactor() and aboutRide(), focusing on the ride's duration and the water drop's height.
Method Implementations:

The minutes() method in CarnivalRide converts the duration from milliseconds to minutes.
Each subclass provides a unique description of the ride's intensity and characteristics through the fearFactor() and aboutRide() methods.
The toString() method is overridden in each subclass to include all relevant details of the ride.
Testing:

A CarnivalRideTester.java file is used to test the functionality of the class hierarchy. It creates instances of the rides, tests all methods, and stores the rides in an ArrayList.
This project is an exercise in object-oriented programming, focusing on inheritance, polymorphism, and abstract classes in Java.
