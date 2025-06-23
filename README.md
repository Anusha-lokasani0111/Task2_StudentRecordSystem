## Java Console Calculator
This is a simple Java-based console calculator that allows users to perform basic arithmetic operations such as addition, subtraction, multiplication, division, and modulus. The program runs in a loop, enabling multiple calculations until the user chooses to exit.

## Features
# Basic Arithmetic Operations :
Addition (+)
Subtraction (-)
Multiplication (*)
Division (/)
Modulus (%)

# Error Handling :
Prevents division by zero with an appropriate error message.

#User-Friendly Interface :
Displays a menu of options for the user to choose from.
Continues running until the user explicitly exits.

## Reusable Methods :
Each operation is implemented as a separate method for modularity and clarity.

## How It Works
The program starts by displaying a welcome message and a menu of operations.
The user is prompted to input two numbers and select an operation from the menu.
Based on the user's choice, the corresponding operation is performed, and the result is displayed.
The program loops back to the menu unless the user chooses to exit.
Code Structure
The program is structured as follows:

## Methods
add(double a, double b): Adds two numbers and displays the result.
sub(double a, double b): Subtracts the second number from the first and displays the result.
mul(double a, double b): Multiplies two numbers and displays the result.
div(double a, double b): Divides the first number by the second. Handles division by zero gracefully.
mod(double a, double b): Computes the modulus of two numbers and displays the result.


## Main Logic
The main method uses a while loop to keep the program running until the user chooses to exit.
A switch statement processes the user's choice and calls the appropriate method.
The program uses the Scanner class to take user input for numbers and operation choices.

## 🖥️ How to Run

### Compile the program:
```bash
javac Calculator.java

## Run the program:

java Calculator



## Sample Output
Here’s an example of how the program works:

Welcome to Simple Calculator
Enter a value
10
Enter b value
5
----------------------------
1.Addition
2.Substraction
3.Multiplication
4.Division
5.Modulus
6.Exit
Enter your choice
1
The addition of two numbers is: 15.0
-------------------------------
Welcome to Simple Calculator
Enter a value
10
Enter b value
0
----------------------------
1.Addition
2.Substraction
3.Multiplication
4.Division
5.Modulus
6.Exit
Enter your choice
4
Error: Division by zero is not allowed.
-------------------------------
Welcome to Simple Calculator
Enter a value
10
Enter b value
3
----------------------------
1.Addition
2.Substraction
3.Multiplication
4.Division
5.Modulus
6.Exit
Enter your choice
6
Thank you, visit again