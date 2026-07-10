# RailRoad-Games Math Library

A lightweight, modular Java library for mathematical and physical calculations, designed for simplicity and easy extensibility.

## Project Structure

The project is organized into modular packages under `org.rrgames`. Current modules include:
- `math.statistics` (Percentiles, Median, Average)

---

## Math

### Statistics

The statistics module provides essential tools for data analysis, handling datasets dynamically through varargs and utility objects.

#### 1. Average
Calculates the arithmetic mean of a given set of numbers.

```Java
import org.rrgames.math.statistics.Average;

// Calculate the average of multiple values
Double avg = Average.get(10.0, 20.0, 30.0, 40.0);
System.out.println(avg); // Output: 25.0
```
#### 2. Median
Calculates the median (middle value) of a given set of numbers. If the dataset has an even number of elements, it automatically computes the average of the two central values.
```Java

import org.rrgames.math.statistics.Median;

// Calculate the median of an odd dataset
Double medOdd = Median.get(10.0, 20.0, 30.0);
System.out.println(medOdd); // Output: 20.0

// Calculate the median of an even dataset
Double medEven = Median.get(10.0, 20.0, 30.0, 40.0);
System.out.println(medEven); // Output: 25.0
```
#### 3. Percentiles

The `Percentile` class provides utility methods to work with percentages. It allows you to calculate what percentage a fraction represents, find an absolute value based on a percentage, or determine the original total maximum value.

##### Creating a Percentile Instance

Depending on whether your input data is a decimal fraction (e.g., `0.25`) or a whole percentage number (e.g., `25`), you initialize the class differently using the `isInteger` flag:

```Java
import org.rrgames.math.statistics.Percentile;

// Option A: Pass a decimal fraction (0.0 to 1.0) -> Set 'isInteger' to false
Percentile p1 = new Percentile(0.25, false); // Represents 25%

// Option B: Pass a whole percentage number -> Set 'isInteger' to true
Percentile p2 = new Percentile(25.0, true);  // Also represents 25%
```
##### Practical Examples

Once you have your Percentile object, you can use the static ```.get()``` methods to perform three common types of calculations:
````Java

import org.rrgames.math.statistics.Percentile;

Percentile p = new Percentile(0.25, false); // 25%

// 1. Calculate what percentage a partial value is of a maximum total
// Formula: (50.0 / 200.0) * 100
Percentile calculatedP = Percentile.get(200.0, 50.0);
System.out.println(calculatedP); // Output: 25.0 %

// 2. Get the absolute value representing a specific percentage of a maximum total
// Formula: 200.0 * 25%
Double value = Percentile.get(200.0, p);
System.out.println(value); // Output: 50.0

// 3. Find the original maximum total value based on a percentage and its current partial value
// Formula: 50.0 / 25%
Double max = Percentile.get(p, 50.0);
System.out.println(max); // Output: 200.0
````