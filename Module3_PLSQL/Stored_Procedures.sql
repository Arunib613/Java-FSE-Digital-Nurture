--CREATION OF TABLES
CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    DOB DATE,
    Balance NUMBER,
    LastModified DATE,
    IsVIP VARCHAR2(5)
);

CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    AccountType VARCHAR2(20),
    Balance NUMBER,
    LastModified DATE,
    FOREIGN KEY (CustomerID)
    REFERENCES Customers(CustomerID)
);

CREATE TABLE Transactions (
    TransactionID NUMBER PRIMARY KEY,
    AccountID NUMBER,
    TransactionDate DATE,
    Amount NUMBER,
    TransactionType VARCHAR2(10),
    FOREIGN KEY (AccountID)
    REFERENCES Accounts(AccountID)
);

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    LoanAmount NUMBER,
    InterestRate NUMBER,
    StartDate DATE,
    EndDate DATE,
    FOREIGN KEY (CustomerID)
    REFERENCES Customers(CustomerID)
);

CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Position VARCHAR2(50),
    Salary NUMBER,
    Department VARCHAR2(50),
    HireDate DATE
);

--INSERTING DATA INTO TABLES
INSERT INTO Customers
VALUES (1,'Aruni',
        TO_DATE('1985-05-15','YYYY-MM-DD'),
        1000,SYSDATE,NULL);

INSERT INTO Customers
VALUES (2,'Ramya',
        TO_DATE('1990-07-20','YYYY-MM-DD'),
        15000,SYSDATE,NULL);

INSERT INTO Accounts
VALUES (1,1,'Savings',1000,SYSDATE);

INSERT INTO Accounts
VALUES (2,2,'Checking',15000,SYSDATE);

INSERT INTO Transactions
VALUES (1,1,SYSDATE,200,'Deposit');

INSERT INTO Transactions
VALUES (2,2,SYSDATE,300,'Withdrawal');

INSERT INTO Loans
VALUES (1,1,5000,5,SYSDATE,SYSDATE+20);

INSERT INTO Loans
VALUES (2,2,10000,6,SYSDATE,SYSDATE+25);

INSERT INTO Employees
VALUES (1,'Babu',
        'Manager',70000,'HR',
        TO_DATE('2015-06-15','YYYY-MM-DD'));

INSERT INTO Employees
VALUES (2,'Sivabala',
        'Developer',60000,'IT',
        TO_DATE('2017-03-20','YYYY-MM-DD'));

COMMIT;

--STORED PROCEDURE 1 
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
AS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'Savings';

    COMMIT;

    DBMS_OUTPUT.PUT_LINE(
        'Monthly interest applied to all savings accounts.'
    );
END;
/

--STORED PROCEDURE 2
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus
(
    p_department IN VARCHAR2,
    p_bonus_percent IN NUMBER
)
AS
BEGIN
    UPDATE Employees
    SET Salary = Salary +
                 (Salary * p_bonus_percent / 100)
    WHERE Department = p_department;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE(
        'Bonus updated for department: '
        || p_department
    );
END;
/

--STORED PROCEDURE 3
CREATE OR REPLACE PROCEDURE TransferFunds
(
    p_from_account IN NUMBER,
    p_to_account IN NUMBER,
    p_amount IN NUMBER
)
AS
    v_balance NUMBER;
BEGIN

    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_from_account;

    IF v_balance >= p_amount THEN

        UPDATE Accounts
        SET Balance = Balance - p_amount
        WHERE AccountID = p_from_account;

        UPDATE Accounts
        SET Balance = Balance + p_amount
        WHERE AccountID = p_to_account;

        COMMIT;

        DBMS_OUTPUT.PUT_LINE(
            'Transfer successful.'
        );

    ELSE

        DBMS_OUTPUT.PUT_LINE(
            'Insufficient balance.'
        );

    END IF;

END;
/