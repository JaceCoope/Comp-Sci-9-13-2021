# Comp-Sci-9-13-2021
Notes for Comp Sci Class 9/13/2021

## Code From the Class
```java
int loops = 4;

for(int index = 0; index < loops; ++index)
{
  System.out.println(index);
}
```

```java
for(int index = 0; index < loops; ++index)
{
  System.out.println(index);
}
```

```java
int[] arr = new int[1_000_000];
int lastIndex = 10;
for (int index; index <= lastIndex; ++index)
{
  arr[index] = 1;
}
```
```java
for(int index = 0; index < arr.length() - 2; ++index)
{
  
}
```
```java
int lastIndex = arr.length - 1;
int lastIndex = arr.length;

for(int index = 0; index < lastIndex - 1; ++index)
{
  if (index == 4)
    break;
}


for(int index = 0; index < lastIndex - 1; ++index)
{
  if (index == 4)
    break;
  System.out.println(index);
}
```



## Notes

### Relationship Between Classes

So far: we have looked at class aggregation
* Class A has-a instance of class B
* This allows A to make use of what has already been done in class B

### Sharing Data Between Classes
Aggregation (Has-A) is one way to share data between classes
* Can only use public parts of the class
* Is this a limitation or an advantage

Another way to share data is inheritance
* New class keyword: extends
  * Defines the inheritance relationship
  * UML: Arrow with open head
* Class A extends class B
  * Inherits everything from class B AND allows us to add to it
* New method/data visibility keyword: **protected**
  * This data/item method is visible both inside the class and to classes that extend this class
  * Also visible to other classes in the same package
  * (#) in UML (as opposed to + || -)

Terminology
* Subclass can be called:
  * Child class
* Superclass can also be called:
  * Parent class
  * Base class
* **Subclasses** get **direct access** to all of the **public** and **protected** data and methods from **superclass**
