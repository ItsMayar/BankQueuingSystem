<h1>The Bank Queuing System</h1>

 ### [YouTube Demonstration](https://youtu.be/7eJexJVCqJo)

<h2>Description</h2>
The Bank Queuing System consists of queue (which has an ID), description, state, district, address, date, time, name, identification card number, contact number, and lastly email. All the elements are PCDATA, while ID is data type ID and email href is CDATA. The system has two attributes, the ID and the email. The email element is an empty element. While other elements are not empty and consist of content.  Hence, there are total of 11 elements. The following list out the purpose of each element. 
<br />
<br />

- Queue Id: Here is to check the customer’s appointment/queue number.
- Description: The reason of why a customer decided to go to the bank includes complaints, issues, or requests.
- State, District, Address: The location of the bank branch.
- Date and Time: The schedule.
- Name: The name of the customer.
- IC (Identification Card): The IC number of the customer.
- Contact number: Customer’s contact number
- Email: Customer’s email address.
<br />

<h2>Languages and Utilities Used</h2>

- <b>PowerShell</b> 
- <b>Diskpart</b>

<h2>Environments Used </h2>

- <b>Windows 10</b> (21H2)

<h2>Program walk-through:</h2>

<p align="center">
Logical View Diagram: <br/>
<img src="https://i.imgur.com/ZXPQ6Vq.png" height="100%" width="100%" alt="FlowChart"/>
<br />
<br />
HTML Output: <br/>
<img src="https://i.imgur.com/Z9oAhDO.png" height="90%" width="90%" alt="FlowChart"/>
<br />
<br />
XML output in Command Prompt: <br/>
<img src="https://i.imgur.com/TNscBho.png" height="60%" width="60%" alt="FlowChart"/>
<br />
<br />
XML output file: <br/>
<img src="https://i.imgur.com/DjqujKP.png" height="60%" width="60%" alt="FlowChart"/>
</p>

<!--
 ```diff
- text in red
+ text in green
! text in orange
# text in gray
@@ text in purple (and bold)@@
```
--!>
