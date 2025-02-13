# Java 75 Hard Challenge

Welcome to my Java 75 Hard Challenge! This README file will document my daily progress, including the date and the code I worked on each day.

## Day 1
**Date:** 2025-02-13

**Code:**
```java
// Reverse a String Using Java 8
String reversed =  IntStream.rangeClosed(1, str.length())
                          .mapToObj(j -> str.charAt(str.length() - j))
                          .map(Object::toString)
                          .collect(Collectors.joining());
