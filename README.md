# Mortgage Calculator

A simple **Java console program** that calculates monthly mortgage payments for a fixed-rate loan.

The program asks for:

* **Principal** (loan amount)
* **Annual Interest Rate** (as a percentage, e.g., `3.92`)
* **Loan Period** in years

It then calculates the **monthly mortgage payment** using the standard mortgage formula:

[
M = P \times \frac{r(1+r)^n}{(1+r)^n - 1}
]

Where:

* **M** = monthly mortgage payment
* **P** = principal
* **r** = monthly interest rate = annual interest ÷ 12 ÷ 100
* **n** = total number of payments = years × 12

---

## Features

* Handles user input for principal, interest rate, and loan period.
* Formats the output as currency (`$XXX.XX`).
* Compatible with US decimal format (`.` for decimal separator).

---

## How to Run

1. Make sure you have **Java JDK installed** (tested with JDK 25).
2. Compile the program:

```bash
javac Main.java
```

3. Run the program:

```bash
java main.Main
```

4. Enter the requested information:

```
Principal: 100000
Annual Interest rate: 3.92
Period (years): 30
```

5. The program outputs the monthly mortgage payment:

```
Your monthly mortgage is: $476.12
```

---

## Notes

* For **decimal interest rates**, use `.` as the decimal separator (e.g., `3.92`).
* The program uses `Math.pow()` to calculate powers. If Math is unavailable, powers can be calculated using a loop.

