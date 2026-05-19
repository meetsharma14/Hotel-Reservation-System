# Hotel Reservation System (Java)

A console-based Hotel Reservation System built using Java and File Handling.  
This application allows users to view available rooms, make bookings, cancel bookings, and view booking details.

The system stores data in text files and uses Object-Oriented Programming (OOP) principles.

--------------------------------------------------

FEATURES

• View available rooms by category  
• Book a room  
• Cancel a booking  
• View all bookings  
• File-based data storage  
• Simple console-based interface  

--------------------------------------------------

TECHNOLOGIES USED

• Java  
• Object-Oriented Programming (OOP)  
• File Handling  
• Collections Framework (List, ArrayList)  
• Java I/O (BufferedReader, BufferedWriter)  

--------------------------------------------------

PROJECT STRUCTURE

hotelReservationSystem/

Main.java  
Hotel.java  
Room.java  
Booking.java  
BookingManager.java  

rooms.txt  
bookings.txt  

--------------------------------------------------

CLASS DESCRIPTION

Room.java  
Represents a hotel room.

Attributes  
• Room Number  
• Category (Standard / Deluxe / Suite)  
• Availability Status  

--------------------------------------------------

Booking.java  
Stores booking details.

Attributes  
• Customer Name  
• Room Number  
• Room Category  

--------------------------------------------------

Hotel.java  
Handles hotel operations such as

• Finding available rooms  
• Booking rooms  
• Cancelling bookings  

--------------------------------------------------

BookingManager.java  
Handles file operations.

Functions

• Load rooms  
• Save rooms  
• Load bookings  
• Save bookings  
• Cancel bookings  
• View bookings  

--------------------------------------------------

Main.java  
Entry point of the program.

Provides a menu-driven interface for the user.

Menu Options

1. View Available Rooms  
2. Make a Booking  
3. Cancel a Booking  
4. View Bookings  
5. Exit  

--------------------------------------------------

HOW IT WORKS

1. Rooms are loaded from rooms.txt  
2. User selects an option from the menu  
3. System processes the request  
4. Booking data is saved in bookings.txt  
5. Room availability is updated  

--------------------------------------------------

EXAMPLE rooms.txt

101,Standard,true  
102,Deluxe,true  
103,Suite,true  
104,Standard,true  
105,Deluxe,true  

--------------------------------------------------

EXAMPLE bookings.txt

Rahul,101,Standard  
Aman,103,Suite  

--------------------------------------------------

HOW TO RUN THE PROJECT

1. Clone the repository

git clone https://github.com/your-username/hotel-reservation-system.git

2. Navigate to the project folder

cd hotel-reservation-system

3. Compile the program

javac hotelReservationSystem/*.java

4. Run the program

java hotelReservationSystem.Main

--------------------------------------------------

CONCEPTS USED

• Object-Oriented Programming  
• Encapsulation  
• File Handling  
• Collections  
• Menu-driven programming  

--------------------------------------------------

FUTURE IMPROVEMENTS

• Add GUI using Java Swing  
• Add payment integration  
• Add admin dashboard  
• Add database (MySQL)  
• Online booking system  

--------------------------------------------------

AUTHOR

Meet Sharma  
B.Tech CSE
