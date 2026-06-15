# E-commerce Platform Search Function

## Overview

This project implements Linear Search and Binary Search to find products in an e-commerce platform based on Product ID.

## Big O Notation

Big O notation describes how an algorithm's execution time grows as the input size increases.

### Search Scenarios

* Best Case: Element found immediately → O(1)
* Average Case: Element found after several comparisons
* Worst Case: Element found at the end or not present

## Product Class

The Product class contains:

* productId
* productName
* category

## Algorithms Implemented

### Linear Search

Checks each product one by one until the target is found.

Time Complexity:

* Best Case: O(1)
* Average Case: O(n)
* Worst Case: O(n)

### Binary Search

Searches a sorted array by repeatedly dividing it into halves.

Time Complexity:

* Best Case: O(1)
* Average Case: O(log n)
* Worst Case: O(log n)

## Conclusion

Binary Search is more suitable for large e-commerce platforms because it provides faster search performance, provided the data is sorted.



# Financial Forecasting

## Overview

This project uses a recursive algorithm to predict the future value of an investment based on a fixed annual growth rate.

## Recursion

Recursion is a technique where a method calls itself to solve a smaller version of the same problem.

Components:

* Base Case: Stops recursion
* Recursive Case: Calls the method again with reduced input

## Implementation

The forecast method recursively calculates the future value by applying the growth rate each year until the number of years becomes zero.

Formula:

Future Value = Present Value × (1 + Growth Rate)^Years

## Time Complexity

### Recursive Solution

* Time Complexity: O(n)
* Space Complexity: O(n)

where n is the number of years.

## Conclusion

Recursion provides a simple approach for financial forecasting. However, for larger inputs, mathematical formulas or iterative solutions are more efficient and scalable.
