CREATE DATABASE HOSTEL;
USE HOSTEL;

-- 1. Admin Table
CREATE TABLE Admin (
    admin_id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    phone BIGINT
);

-- 2. Resident Table
CREATE TABLE Resident (
    resident_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    phone BIGINT,
    gender VARCHAR(10),
    dob DATE,
    address VARCHAR(255),
    password VARCHAR(100) NOT NULL,
    registration_date DATETIME
);

-- 3. Room Table
CREATE TABLE Room (
    room_id INT PRIMARY KEY AUTO_INCREMENT,
    room_number VARCHAR(10) NOT NULL UNIQUE,
    capacity INT NOT NULL,
    current_occupancy INT DEFAULT 0,
    status VARCHAR(20) CHECK (status IN ('Available','Occupied')),
    type VARCHAR(15) CHECK (type IN ('Single','Double','Triple'))
);

-- 4. Room Assignment Table
CREATE TABLE Room_Assignment (
    assignment_id INT PRIMARY KEY AUTO_INCREMENT,
    resident_id INT,
    room_id INT,
    assigned_date DATE,
    end_date DATE,
    FOREIGN KEY (resident_id) REFERENCES Resident(resident_id) ON DELETE CASCADE,
    FOREIGN KEY (room_id) REFERENCES Room(room_id) ON DELETE SET NULL
);

-- 5. Maintenance Request Table
CREATE TABLE Maintenance_Request (
    request_id INT PRIMARY KEY AUTO_INCREMENT,
    resident_id INT,
    room_id INT NULL,
    subject VARCHAR(100),
    description TEXT,
    status VARCHAR(20) CHECK (status IN ('Pending','In Progress','Resolved')),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    resolved_at TIMESTAMP NULL,
    FOREIGN KEY (resident_id) REFERENCES Resident(resident_id) ON DELETE CASCADE,
    FOREIGN KEY (room_id) REFERENCES Room(room_id) ON DELETE SET NULL
);

-- 6. Leave Request Table (Optional)
CREATE TABLE Leave_Request (
    leave_id INT PRIMARY KEY AUTO_INCREMENT,
    resident_id INT,
    start_date DATE,
    end_date DATE,
    status VARCHAR(20) CHECK (status IN ('Pending','Approved','Rejected')),
    reason VARCHAR(255),
    FOREIGN KEY (resident_id) REFERENCES Resident(resident_id) ON DELETE CASCADE
);

-- 7. Hostel Notice Table (Optional)
CREATE TABLE Hostel_Notice (
    notice_id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100),
    body TEXT,
    posted_by INT,
    posted_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (posted_by) REFERENCES Admin(admin_id) ON DELETE CASCADE
);

