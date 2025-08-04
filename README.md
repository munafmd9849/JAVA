# JAVA

## ENCAPSULATION


Encapsulation is a process of providing security to most important parts of a class
Most important components of a class are Data Members
Providing security doesn't mean preventing access but providing controlled access
You can prevent access by using "private" and provide controlled access by using "public" (u can also use setters and getters)
Encapsulation is also referred to wrapping of data members and methods associated with those members in same class

#

## Constructor:

1.	What is a constructor - Constructor is a specialized setter that is used to initialize object
2.	Constructor has same name as class
3.	It is invoked during object creation
4.	It does not have any return type
5.	The process of constructor calling another constructor is called constructor chaining
6.	The process of creating multiple constructor having different parameter within same class is called Constructor Overloading

=================================================================================================

## Static Keyword:
1.	Static keywords are applied to variables , methods , blocks and classes
2.	Static members belongs to class itself, This means we can access a static member of a class directly by using class name
3.	Static members are allocated memory only once
4.	Non-Static members are allocated memory separately for each instance



---
---


## INHERITANCE



-------'''''''---------
# 10 Rules of Inheritance
---
 

1) ### Single Inheritance
one child class having only one parent class

2) ### Multilevel Inheritance
one child class having only one parent class , and child class also acts as parent class to some other class

3) ### Hierarchical Inheritance
one parent class having multiple child classes

4) ### Multiple Inheritance
it is not allowed in Java because it causes Ambiguity, One child class having inheritance from multiple parent classes (DIAMOND PROBLEM)

5) ### Hybrid Inheritance
combination of inheritances , but multiple inheritance shouldn't be allowed

6) ### Cyclic Inheritance
One class inheriting from itself or two classing mutually inheriting from each other(it is not allowed)

7) Private members are allowed to participate in Inheritance , but they are hidden to child class! to access them we need to use public getters of parent class

8) Constructors do not get inherited but they are executed (Child doesn't inherit constructor but parent constructor runs first)

9) Static members can also be inherited

10) Whenever we create child class object , parent class object is not created (but parent class members within child class are allocated memory)




# UML

1.	Research Analysis
2.	Feasibility
3.	Design
4.	Code
5.	Test
6.	Deployment
7.	Maintenance



# Design

1.	Class Diagram
2. Object Diagram
3. Use Case Diagram
4. Static Diagram
5. Sequence Diagram
6. Activity Diagram


=============================================================================================


## Access Modifiers in Java:

1.	There is no such thing as Access specifier in Java
2. There are 4 primary modifiers in Java
------{(+)public , (#)protected , (~)default , (-)private}------

# Scope:

Public    - Accessible everywhere
Protected - The protected modifier allows access within the same package (like default) and also to subclasses in different packages
Private   - Members declared as private are only accessible within the same class.
Default   - default or package-private. Members with default access are only accessible to other classes within the same package


=============================================================================================

# Packages:

0. There can only be 1 package statement in a program code

1.	Packages must be defined as first statement in a program code

2. They are used to resolve name conflicts-
You can have two classes with the same name as long as they are in different packages. For instance, Java has both java.util.Date and java.sql.Date. Without packages, this would cause a name collision.

3. NAMING CONVENTION :
If a company's domain is example.com, its packages would start with com.example. A project named "myapp" would have packages like com.example.myapp.ui, com.example.myapp.data, etc.

=============================================================================================

## Method Overriding:

1.	it is a process of child class reimplementing a method that is already defined in its parent class
2.	Method Overriding can only occur if its inherited first
3.	The method signature must be the same as Parent class
4.	Access modifiers can be same or higher level of accessibility
5.	Constructors cannot be overridden but can be overloaded , because constructors are not even inherited so its not possible to override
6.	Covariant Return Types : return type of the overriding method can be a subtype of the return type of the overridden method
7.	(FOR PRIMITIVE TYPES RETURN TYPES SHOULD BE EXACTLY SAME)
8.	Parameters must be same (opposite of overloading)
9.	Static members can not override

==============================================================================================

# Final Keyword:

1.	Final Variable: A final variable is a constant. Once you assign it a value, you can't change it. This is useful for defining constants   {{Initialization: You must initialize a final variable at the time of declaration or within a constructor (for instance variables) or a static initializer block (for static variables). If you don't, the compiler will throw an error }}
{ACCESSING IS ALLOWED , RE-ASSIGNMENT IS NOT ALLOWED}

2.	A Final method can't be overridden by a subclass. This is useful when you have a method which is critical and we don't want to change operation and you want to ensure that no subclass alters its behavior. {INHERITANCE IS ALLOWED , OVERRIDING IS NOT ALLOWED}

3. A Final class can't be extended or inherited {BUT INSTATIATION IS ALLOWED}

