# NumberSystemsConverter

A Java program that converts numbers between binary, octal, decimal, and hexadecimal.  
You pick the original base from a menu, enter the number, and the program prints the equivalent values in the other bases.

## Features
- Binary → Octal, Decimal, Hex
- Octal → Binary, Decimal, Hex
- Decimal → Binary, Octal, Hex
- Hexadecimal → Binary, Octal, Decimal


## How to use
When you run the program you’ll see:

Choose an option: 
1. Convert Binary to Other Bases
2. Convert Octal to Other Bases
3. Convert Decimal to Other Bases
4. Convert Hexadecimal to Other Bases

Enter `1–4`, press 'Enter', then type the number in that base.

### Examples

```
Choice: 1
Enter the number
101101
101101 in octal is: 55
101101 in decimal is: 45
101101 in hexadecimal is: 2D
```

```
Choice: 2
Enter the number
157
157 in binary is: 1101111
157 in decimal is: 111
157 in hexadecimal is: 6F
```

```
Choice: 3
Enter the number
255
255 in binary is: 11111111
255 in octal is: 377
255 in hexadecimal is: FF
```

```
Choice: 4
Enter the number
7B
7B in binary is: 1111011
7B in octal is: 173
7B in decimal is: 123
```

## Input rules & tips
- **Binary**: only `0` and `1`.   
- **Octal**: digits `0–7` only.   
- **Decimal**: digits `0–9`.   
- **Hex**: digits `0–9` and letters `A–F` or `a–f`. 

