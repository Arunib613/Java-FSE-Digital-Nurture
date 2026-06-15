# Design Patterns in Java

This repository contains Java implementations of two commonly used GoF (Gang of Four) Creational Design Patterns:

* Singleton Pattern
* Factory Method Pattern

The purpose of this repository is to demonstrate how design patterns can be used to create maintainable, reusable, and scalable software solutions.

# Singleton Pattern

The Singleton Pattern ensures that a class has only one instance throughout the application's lifecycle and provides a global access point to that instance.

## Implementation

A `Logger` class is implemented as a Singleton. The class contains:

* A private constructor to prevent external instantiation.
* A private static instance variable.
* A public static `getInstance()` method to access the single object.

## Benefits

* Prevents multiple object creation.
* Reduces memory usage.
* Provides centralized access to shared resources.
* Useful for logging, configuration management, and caching.

# Factory Method Pattern

The Factory Method Pattern provides an interface for creating objects while allowing subclasses to decide which object to instantiate.

## Implementation

A document management system is implemented that supports multiple document types:

* Word Document
* PDF Document
* Excel Document

Each document type has its own factory class responsible for creating the corresponding document object.

## Benefits

* Promotes loose coupling between client code and concrete classes.
* Simplifies object creation.
* Supports easy extension of new document types.
* Follows the Open-Closed Principle.
