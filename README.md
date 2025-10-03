# java_problems

Question 1: HashMap 
Create a Java program that uses a HashMap to store employee IDs (Integer) as keys and their 
names (String) as values. Write methods to: 
1. Add an employee to the map. 
2. Retrieve an employee's name by ID. 
3. Throw a custom exception if the ID is not found. 
4. Display all employees in the format "ID: Name". 
Expected Output Example: 
Adding employees... 
Employee Map: {101=John, 102=Jane, 103=Mike} 
Name for ID 102: Jane 
Name for ID 999: Error: Employee ID not found!

Question 2: HashMap and Exception Handling 
Write a Java program that uses a HashMap to store product IDs (String) and their prices 
(Double). Implement a method to apply a discount to a product's price based on a percentage 
input. Handle the following cases: 
1. Throw a custom exception if the product ID doesn't exist. 
2. Throw an IllegalArgumentException if the discount percentage is negative or greater 
than 100. 
3. Update the price in the HashMap after applying the discount. 
Expected Output Example: 
Adding products: P001=$50.0, P002=$100.0 
Applying 20% discount to P001... 
New price for P001: $40.0 
Applying 150% discount to P002... 
Error: Discount percentage must be between 0 and 100! 
Applying discount to P999... 
Error: Product ID not found! 
