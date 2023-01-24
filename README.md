

To run the Spring boot project successfully, follow the intructions below:

1. Create a folder and save the code files.
2. Install Docker Desktop 
  --> Install the WSL(Windows Subsystem for Linux), the documentation for installation of WSL-{ https://learn.microsoft.com/en-us/windows/wsl/install }
  
  --> Restart PC after WSL intstallation.
  
  --> Run the scripts 
  
3. Now use the code below to create a database 

  --> In the Terminal of IDE:
  
  --> docker exec -it postgres bash(press ENTER)
  
  --> psql -U founticle(press ENTER)
  
  --> CREATE DATABASE customer;  (press ENTER)
  
  --> \l (to get the list of databases)
  
  --> \c customer (press ENTER) , (to connect to database "customer")
  
  --> \d (to check the relations)
  
  --> ctrl + d (to get out of the database)
  
  --> ctrl + d (again to get out of the shell)
  
4. Download and Install Postman for testing.
  --> Try out GET, POST, PUT and DELETE operations.
  
  --> Add the URL to your customer database and send the GET request. (make sure the status is shown as :200 OK)
  
  --> Go back to IDE, connect to database "customer".
  
  --> \d customer to get the information on columns
  
  --> use the Command - INSERT INTO customer(id, name, email, age) (press ENTER)
  
  --> use the Command - VALUES (nextval('customer_id_sequence'), 'John', 'johndoe@xyz.com', 25);
  
  --> Go back to Postman and resend the GET request, you'll find the details of John.
  
  --> In the "customer" database in Terminal, use : select * from customer; you'll get data back from Postman.  
  
  --> Select POST request, Go to Body, select 'raw' and select 'JSON', enter the below code in the script and send request.
  
  
      {
        "name": "Martin",
        "email": "martinjr@gmail.com",
        "age": 42
      }
      
  --> Select GET and send request, you'll get the details of Martin and John.
  
  --> Select DELETE, in the URL add the ID of the customer (localhost:8080/api/v1/customers/1)
      This deletes the info of John
      
  --> Select PUT, in the URL add the ID of the customer (localhost:8080/api/v1/customers/2)
      enter the below code in scriptand Send the request.
      
      {
        "name": "X",
        "age": 42
      }
      
      
  --> Use GET request and get the updated Details.    
  
      
  
  
