-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 03, 2025 at 07:28 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotelms`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `document` varchar(30) DEFAULT NULL,
  `number` varchar(30) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `gender` varchar(30) DEFAULT NULL,
  `country` varchar(30) DEFAULT NULL,
  `room` varchar(30) DEFAULT NULL,
  `checkintime` varchar(30) DEFAULT NULL,
  `deposit` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`document`, `number`, `name`, `gender`, `country`, `room`, `checkintime`, `deposit`) VALUES
('Aadhar', '98954478', 'digg', 'Male', 'india', '102', 'Sat Jun 28 15:05:26 IST 2025', '888'),
('Voter Id', '8838933', 'keshav', 'Male', 'India', '102', 'Wed Jul 02 11:34:07 IST 2025', '1200');

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `department` varchar(80) DEFAULT NULL,
  `budget` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`department`, `budget`) VALUES
('Office', '50000'),
('Housekeeping', '40000'),
('Food', '80000'),
('Kitchen', '20000'),
('Security', '60000');

-- --------------------------------------------------------

--
-- Table structure for table `driver`
--

CREATE TABLE `driver` (
  `name` varchar(20) DEFAULT NULL,
  `age` varchar(20) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `company` varchar(20) DEFAULT NULL,
  `carname` varchar(20) DEFAULT NULL,
  `available` varchar(20) DEFAULT NULL,
  `location` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `driver`
--

INSERT INTO `driver` (`name`, `age`, `gender`, `company`, `carname`, `available`, `location`) VALUES
('Rahul', '22', 'Male', 'Suzuki', 'Swift', 'Yes', 'H1 Park'),
('laksh', '32', 'Male', 'Toyota', 'Fortuner', 'Yes', 'Red Cross sec-17'),
('Sangam', '21', 'Male', 'Maruti', '800', 'No', 'H-6 Thanesar'),
('wdwdj', '23', 'Female', 'diwj', 'wdiwd', 'No', 'wdwdj');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `name` varchar(20) DEFAULT NULL,
  `age` varchar(20) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `job` varchar(20) DEFAULT NULL,
  `salary` varchar(20) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `aadhar` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`name`, `age`, `gender`, `job`, `salary`, `phone`, `email`, `aadhar`) VALUES
('laksh', '22', 'Male', 'Manager', '60000', '8903003817', 'lakshh22@gmailcom', '2434232'),
('jasl', '34', 'Male', 'Kitchen Staff', '3432', '232545', 'jasl@gmail.com', '5656585674');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(25) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('ansh', '123456789');

-- --------------------------------------------------------

--
-- Table structure for table `login2`
--

CREATE TABLE `login2` (
  `user_name` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login2`
--

INSERT INTO `login2` (`user_name`, `password`) VALUES
('coder_av', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `roomnumber` varchar(20) DEFAULT NULL,
  `availability` varchar(20) DEFAULT NULL,
  `cleaning_status` varchar(20) DEFAULT NULL,
  `price` varchar(20) DEFAULT NULL,
  `bed_type` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`roomnumber`, `availability`, `cleaning_status`, `price`, `bed_type`) VALUES
('101', 'Occupied', 'Cleaned', '2000', 'Double Bed'),
('102', 'Occupied', 'Dirty', '3000', 'Double Bed'),
('103', 'Available', 'Cleaned', '2500', 'Double Bed'),
('104', 'Available', 'Cleaned', '1500', 'Single Bed'),
('201', 'Available', 'Cleaned', '2300', 'Single Bed');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
