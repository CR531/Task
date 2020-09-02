Steps to execute the code:
1) Clone the repository into local system
2) Run the main method in TaskApplication class
3) Open Postman and try GET request API endpoint "http://localhost:8080/currentItems" where you can see the current available items.
4) Now, try POST reuest API endpoint "http://localhost:8080/orderItems" with json body as { "coconuts": 2, "potatoes": 5 } and you can see the response as "You have successfully ordered 2 Coconuts and 5 Potatoes"
5) Once you terminate the aplication you can see that items count goes to normal as 20 and 10.
