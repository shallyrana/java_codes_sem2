class Main {
  public static void main(String[] args) {
    int octal = 67;
    long binary = convertOctalToBinary(octal);
    System.out.println(octal + " in octal = " + binary + " in binary");
  }

  public static long convertOctalToBinary(int octalNumber) {
    int decimalNumber = 0, i = 0;
    long binaryNumber = 0;

    while (octalNumber != 0) {
      decimalNumber += (octalNumber % 10) * Math.pow(8, i);
      ++i;
      octalNumber /= 10;
    }

    i = 1;

    while (decimalNumber != 0) {
      binaryNumber += (decimalNumber % 2) * i;
      decimalNumber /= 2;
      i *= 10;
    }

    return binaryNumber;
  }
}
Output

67 in octal = 110111 in binary
This conversion takes place as:

Octal To Decimal
6 * 81 + 7 * 80 = 55

Decimal to Binary
2 | 55
2 | 27 -- 1
2 | 13 -- 1
2 | 6  -- 1
2 | 3  -- 0
2 | 1  -- 1
2 | 0  -- 1
(110111)
Share on:
Did you find this article helpful?

Related Examples
Java Example

Convert Octal Number to Decimal and vice-versa

Java Example

Convert Binary Number to Decimal and vice-versa

Java Example

Implement Binary Tree Data Structure

Java Example

Implement Binary Search Algorithm


Join our newsletter for the latest updates.
Enter Email Address
Join


Tutorials
Python 3 Tutorial
JavaScript Tutorial
SQL Tutorial
HTML Tutorial
R Tutorial
C Tutorial
C++ Tutorial
Java Tutorial
Rust Tutorial
Go Tutorial
Kotlin Tutorial
Swift Tutorial
C# Tutorial
DSA Tutorial
Examples
Python Examples
JavaScript Examples
C Examples
Java Examples
Kotlin Examples
C++ Examples
Company
About
Advertising
Privacy Policy
Terms & Conditions
Contact
Blog
Careers
Youtube
Apps
Learn Python
Learn C Programming
Learn Java
© Parewa Labs Pvt. Ltd. All rights reserved.

   
