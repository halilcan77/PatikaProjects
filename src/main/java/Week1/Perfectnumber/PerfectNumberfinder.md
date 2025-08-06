# Perfect Number Checker

## 📖 Description
This is a simple **Java console program** that checks whether a given number is a **perfect number**.

A **perfect number** is a positive integer that is equal to the sum of all its **proper divisors** (divisors excluding the number itself).  
For example:
- **6** → divisors: 1, 2, 3 → 1 + 2 + 3 = 6 ✅
- **28** → divisors: 1, 2, 4, 7, 14 → 1 + 2 + 4 + 7 + 14 = 28 ✅
- **12** → divisors: 1, 2, 3, 4, 6 → 1 + 2 + 3 + 4 + 6 = 16 ❌

These numbers are rare and have been studied since ancient times (the first four perfect numbers are 6, 28, 496, and 8128).

---

## 🛠 Technologies
- **Java 17+**
- **Scanner class** (for user input)

---

## ⚙️ How the Program Works
1. The program asks the user to enter a number.
2. It finds all divisors of that number (except itself).
3. It calculates the sum of these divisors.
4. If the sum equals the original number, the program outputs that it is a **perfect number**.
5. Otherwise, it states that the number is **not perfect**.


