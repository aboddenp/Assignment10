# Assignment10
CS/SWE 332 Assignment 10 
Due Wednesday, November 7, 2018

Goal: Contracts for Object Methods 

Submit via Blackboard. 
Assignment: Consider a simple, introductory Java inheritance example: Box and MatchBox.

Override the equals() method in both classes. Use the "standard recipe" given in Bloch.
As Bloch explains, you are doomed, since Box is instantiable. Demonstrate this with an appropriate JUnit test. Which property is violated? 

Note: pay special attention to make sure that your equals() method isn't more broken than necessary. Specifically, make sure that your implementation satisfies the other properties of the equals() contract. 
Override hashCode(), also using Bloch's "standard recipe". Since equals() is broken, hashCode() will also be broken. No JUnit test is required here. 

Note: Again, make sure your hashCode() isn't more broken than necessary.
Deliverables: implementations of equals() and hashCode along with failing JUnit test and description of the problem. You should also point out where you took special care with equals() and hashCode() to avoid additional contract problems. 

Bonus point: Explain clearly what is tricky about writing a test for the hashCode() problem. 

Grading Criteria:
Adherence to instructions.
Java
JUnit
Clear description.
