# Leap Year Checker

## Description

This is a simple Java console application that checks whether a given year is a **leap year** or not.

It uses standard leap year rules based on divisibility by 4, 100, and 400.

---

## Leap Year Rules

A year is a leap year if:

- It is divisible by 4 **and not divisible by 100**,  
  **OR**
- It is divisible by 400

| Year     | Result        | Reason                               |
|----------|---------------|--------------------------------------|
| 2020     | Leap Year     | Divisible by 4, not by 100           |
| 1900     | Not Leap Year | Divisible by 100, not by 400         |
| 2000     | Leap Year     | Divisible by 400                     |
| 2023     | Not Leap Year | Not divisible by 4                   |

---

## How It Works

1. The user enters a year.
2. The program checks whether the year meets leap year conditions.
3. It prints the result as:
    - `2020 is a leap year!`
    - `2021 is not a leap year.`

---


## Technologies Used

- Java 17+
- Scanner class
- Conditional statements (if-else)

---

## Author

Halil Can Akgül


