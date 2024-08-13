-- Create a database schema
CREATE DATABASE finance_db;

-- Use the database
USE finance_db;

-- Create the users table
CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    firstName VARCHAR(20) NOT NULL,
    lastName VARCHAR(20) NOT NULL,
    username VARCHAR(20) NOT NULL,
    income INT NOT NULL,
    choiceN TINYINT
);

-- Create the choice table
CREATE TABLE choice (
    choice_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    spending INT NOT NULL, -- Planned spending 
    investing INT NOT NULL, -- Planned investing
    savings INT NOT NULL, -- Planned savings
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

-- Create the progress table
CREATE TABLE progress (
    progress_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    actual_spending INT NOT NULL,   -- Actual spending by the user
    actual_investing INT NOT NULL,  -- Actual investing by the user
    actual_savings INT NOT NULL,    -- Actual savings by the user
    spending_left_percent DECIMAL(5,2),  -- Percentage of spending left
    investing_left_percent DECIMAL(5,2), -- Percentage of investing left
    savings_left_percent DECIMAL(5,2),   -- Percentage of savings left
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);
