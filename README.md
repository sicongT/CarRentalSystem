# Car Rental System

The Car Rental System is a Java-based program that provides a convenient and easy way for users to rent cars from a rental company. Users can register on the platform and select available cars to rent. When renting a car, users have the option to purchase insurance or decline it. They are required to provide their credit card information or insurance company. 

Users can rent one car at a time and return it after their rental period is over. The platform also allows users to view their rental information. 

Overall, the Car Rental System provides a user-friendly and efficient way for customers to rent cars from a reputable rental company. 

The system includes the following classes:

- Mian_login Class
- Findpasswords Class
- Main_signup Class
- Main_welcome Class
- Car Class (abstract class)
- Insurance Class
- Rental Class
- Main_History Class
- Mian_payment Class

## Main_login Class

The Mian_login Class is responsible for allowing users to login to the system. It includes instance variables for username and passwords. The constructor takes in the username and password as parameters.  And it should check if the username and password match the registered user's informations. The Login Class is connected with the Welcome, Findpasswords and Register classes.

## Findpasswords Class

The Findpasswords class is designed to allow users who have forgotten their password to reset or change it by matching their username and telephone number. This class provides an easy-to-use interface that enables users to quickly reset to default passwords or change their passwords without requiring administrator intervention.

## Main_signup Class

The Main_signup Class is responsible for registering new users in the system. It includes instance variables for username, telephone numbers, email address, driverLicense, and passwords. The constructor takes in these instance variables as parameters. A "FileWriter" method writes the instance variables to a .csv file. The Register Class includes some requirements for passwords and telephone numbers, which are displayed in a GUI window.

## Main_welcome Class

The Main_welcome class is a graphical user interface (GUI) that allows users to interact with a car rental system. This class displays four buttons that users can select from: "rental a car", "return a car", "rental information" and "log out" by their needs.

## Car Class (abstract class)

The Vehicle Class is an abstract class that includes instance variables for model, location, days, capacity, and price. The SUV Class, van Class and standard Class extend the Car Class.

## Insurance Class

The Insurance Class is responsible for managing the insurance. It includes company, coverage and pricedaily. Users may need to choose whether to purchase insurance.

## Rental Class

The Rental Class is responsible for managing car rentals. It includes instance variables for rentalStartDate, rentalEndDate, rentalPrice, insuranceOption, creditCardInfo, insuranceCompany, and policyNumber. The constructor takes in the rental start and end dates as parameters. A "calculateRentalPrice" method calculates the rental price based on the rental start and end dates. The Rental Class also includes methods for adding insurance, credit card information, insurance company information, and policy number information to the rental. The Rental Class includes different prices and other details.

## Main_History Class

The Main_History Class is responsible for managing rental information. It includes instance variables for username, car style, total days and price. 

## Main_payment Class

The Main_payment Class is a graphical user interface (GUI) that allows users to input their credit card information for payment processing. The informations include owner name, card number, CVC and expiration date.

## Installation

To run the Car Rental System, you will need to install an IDE such as NetBeans and Java SE on your computer. You can download Java NetBeans [here](https://netbeans.apache.org/download/) and Development kit [here](https://www.oracle.com/java/technologies/downloads/).

## Usage

After installation, you have two options to access the Car Rental System: download the system files from GitHub or run the .jar file directly. Upon opening the system, a login screen will appear.

## Contributing

If you would like to contribute to the Car Rental System, please fork the repository and submit a pull request with your changes.

