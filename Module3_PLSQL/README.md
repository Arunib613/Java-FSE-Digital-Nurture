# Exercise 1: Control Structures in PL/SQL

## Overview

This exercise demonstrates the use of PL/SQL control structures such as loops, conditional statements, and cursor-based iteration in a banking management system.

The solution includes:

* Database schema creation
* Sample data insertion
* PL/SQL programs for the given scenarios

## Database Tables

The following tables are created:

* Customers
* Accounts
* Transactions
* Loans
* Employees

These tables simulate a simple banking system used for performing customer, account, transaction, and loan-related operations.

## Scenario 1: Loan Interest Rate Discount

### Objective

Apply a 1% discount to the loan interest rate for customers who are above 60 years of age.

### Implementation

* Iterates through all customers using a FOR LOOP.
* Calculates customer age using the Date of Birth (DOB).
* Updates the InterestRate in the Loans table for eligible customers.

## Scenario 2: VIP Customer Promotion

### Objective

Promote customers to VIP status if their account balance exceeds 10,000.

### Implementation

* Iterates through all customers.
* Checks the account balance using an IF condition.
* Updates the IsVIP flag for eligible customers.

## Scenario 3: Loan Due Reminder

### Objective

Generate reminders for customers whose loans are due within the next 30 days.

### Implementation

* Retrieves loan records due within the next 30 days.
* Uses a cursor FOR LOOP to process each record.
* Displays reminder messages using DBMS_OUTPUT.PUT_LINE.

# Exercise 3: Stored Procedures in PL/SQL

## Overview

This exercise demonstrates the implementation of Stored Procedures in PL/SQL using a Banking Management System database.

Stored Procedures are named PL/SQL blocks that are stored in the database and can be executed multiple times whenever required. They improve code reusability, maintainability, and performance.

The exercise includes:

* Database schema creation
* Sample data insertion
* Implementation of stored procedures for banking operations

## Scenario 1: Process Monthly Interest

### Objective

Apply a monthly interest rate of 1% to all savings accounts.

### Procedure

**ProcessMonthlyInterest**

### Implementation

* Identifies all accounts with AccountType = 'Savings'.
* Calculates 1% interest on the current balance.
* Updates the account balance with the calculated interest.
* Commits the changes to the database.

## Scenario 2: Update Employee Bonus

### Objective

Update employee salaries by adding a bonus percentage for a specified department.

### Procedure

**UpdateEmployeeBonus**

### Parameters

* Department Name
* Bonus Percentage

### Implementation

* Accepts department name and bonus percentage as input parameters.
* Updates the salary of employees belonging to the specified department.
* Calculates and adds the bonus amount to the existing salary.
* Commits the updated salary information.

## Scenario 3: Transfer Funds Between Accounts

### Objective

Transfer funds from one account to another while ensuring sufficient balance is available.

### Procedure

**TransferFunds**

### Parameters

* Source Account ID
* Destination Account ID
* Transfer Amount

### Implementation

* Retrieves the balance of the source account.
* Checks whether sufficient funds are available.
* Deducts the specified amount from the source account.
* Credits the same amount to the destination account.
* Commits the transaction upon successful transfer.
* Displays an appropriate message for successful or failed transfers.
