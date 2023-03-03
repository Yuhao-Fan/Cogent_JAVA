// Java Program to Illustrate MyServiceClass
 
// Importing package module to code module
package com.cogent.springboot.sterotypeAnotation.service;
// Importing required classes
import org.springframework.stereotype.Service;
 
// Annotation
@Service
 
// Class
public class MyServiceClass {
 
    // Method
    // To compute factorial
    public int factorial(int n)
    {
        // Base case
        if (n == 0)
            return 1;
 
        return n * factorial(n - 1);
    }
}

