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
VALUES (1,'Babu',
        TO_DATE('1985-05-15','YYYY-MM-DD'),
        1000,SYSDATE,NULL);

INSERT INTO Customers
VALUES (2,'Sivabala',
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
VALUES (1,'Aruni',
        'Manager',70000,'HR',
        TO_DATE('2015-06-15','YYYY-MM-DD'));

INSERT INTO Employees
VALUES (2,'Ramya',
        'Developer',60000,'IT',
        TO_DATE('2017-03-20','YYYY-MM-DD'));

COMMIT;

-- Scenario 1
-- Apply 1% discount to loan interest rates for
-- customers above 60 years old
SET SERVEROUTPUT ON;

DECLARE
    v_age NUMBER;
BEGIN
    FOR cust IN (
        SELECT CustomerID,DOB
        FROM Customers
    )
    LOOP
        v_age := FLOOR(MONTHS_BETWEEN(SYSDATE,cust.DOB)/12);

        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Discount applied to Customer ID: '
                || cust.CustomerID
            );
        END IF;
    END LOOP;

    COMMIT;
END;
/

-- Scenario 2
-- Promote customers with balance greater than 10000
-- to VIP status
BEGIN
    FOR cust IN (
        SELECT CustomerID,Balance
        FROM Customers
    )
    LOOP
        IF cust.Balance > 10000 THEN

            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'VIP Status Granted to Customer ID: '
                || cust.CustomerID
            );
        END IF;
    END LOOP;

    COMMIT;
END;
/

-- Scenario 3
-- Print reminders for loans due within next 30 days
BEGIN
    FOR loan_rec IN (
        SELECT c.Name,
               l.LoanID,
               l.EndDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE
                            AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Dear '
            || loan_rec.Name
            || ', Loan ID '
            || loan_rec.LoanID
            || ' is due on '
            || TO_CHAR(
                   loan_rec.EndDate,
                   'DD-MON-YYYY'
               )
        );
    END LOOP;
END;
/