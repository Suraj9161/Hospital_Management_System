# Hospital Management System

A comprehensive hospital management system using JPA, Hibernate, and MySQL. This project includes modules for managing patients, doctors, appointments, medical records, billing, inventory items, and staff.

## Project Structure

- **Entities**: Contains the JPA entities such as `Patient`, `Doctor`, `Appointment`, etc.
- **DAO**: Data Access Objects for interacting with the database.
- **Service**: Business logic layer.
- **Controller**: Handles the request and response.

## How to Run

1. Ensure you have Java 8 and MySQL installed.
2. Clone the repository.
3. Update the database configuration in `persistence.xml`.
4. Run the main application.

## Example Usage

```java
public static void main(String[] args) {
    DoctorController controller = new DoctorController();
    controller.createDoctor("Rohit", "Cardiology", "Pune");
    // Add more doctors as needed
}
