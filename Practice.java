import java.util.ArrayList;
import java.util.Scanner;
public class Practice {
    
  static Scanner sc = new Scanner(System.in);
  static String[] names = new String[100];
  static String[] addresses = new String[100];
  static String[] reports = new String[100];
  static int[] ages = new int[100];
  static int count = 0;

  public static void main(String[] args) {
    int option;
    do {
      System.out.println("1. Add Record");
      System.out.println("2. View Record");
      System.out.println("3. Edit Record");
      System.out.println("4. Delete Record");
      System.out.println("5. Report");
      System.out.print("Enter option: ");
      option = sc.nextInt();
   
      switch (option) {
        case 1:
          addRecord();
          break;
        case 2:
          viewRecord();
          break;
        case 3:
          editRecord();
          break;
        case 4:
          deleteRecord();
          break;
        case 5:
          reportRecord();
          break;
      }
    } while (option != 0);
  }

  static void addRecord() {        
    System.out.print("Enter name: ");
    sc.nextLine();
    names[count] = sc.nextLine();
    
    System.out.print("Enter address: ");
    addresses[count] = sc.nextLine();
    
    System.out.print("Enter age: ");
    ages[count] = sc.nextInt();
    
    System.out.print("Enter ID Number: ");
    ages[count] = sc.nextInt();
    
    count++;
  }

  static void viewRecord() {
    int idNumber;
    System.out.print("Enter ID Number: ");
    idNumber = sc.nextInt();
    
    System.out.println("Name: " + names[idNumber]);
    
    System.out.println("Address: " + addresses[idNumber]);
    
    System.out.println("Age: " + ages[idNumber]);
  }

  static void editRecord() {
    int idNumber;
    System.out.print("Enter ID number: ");
    idNumber = sc.nextInt();
    
    System.out.print("Enter name: ");
    sc.nextLine();
    names[idNumber] = sc.nextLine();
    
    System.out.print("Enter address: ");
    addresses[idNumber] = sc.nextLine();
    
    System.out.print("Enter age: ");
    ages[idNumber] = sc.nextInt();
  }

  static void deleteRecord() {
    int idNumber;
    System.out.print("Enter ID number: ");
    idNumber = sc.nextInt();
    for (int i = idNumber; 
            i < count - 1; i++) {
      names[i] = names[i + 1];
      addresses[i] = addresses[i + 1];
      ages[i] = ages[i + 1];
    }
    count--;
  }

    static void reportRecord() {
   
     int availablePeripherals = 0;
     int assignedPeripherals = 0;
     int inputDevices = 0;
     int outputDevices = 0;
     int employeesWithPeripherals = 0;

  
        System.out.print("Enter the number of available peripherals: ");
        availablePeripherals = sc.nextInt();
        System.out.print("Enter the number of assigned peripherals: ");
        assignedPeripherals = sc.nextInt();

        // Input validation
        while (assignedPeripherals > availablePeripherals) {
            System.out.println("Assigned peripherals can't be more than available peripherals. Try again.");
            System.out.print("Enter the number of assigned peripherals: ");
            assignedPeripherals = sc.nextInt();
        }

        // Get the number of input and output devices
        for (int i = 1; i <= assignedPeripherals; i++) {
            System.out.println("Peripheral " + i + " type (input/output): ");
            String type = sc.next();
            if (type.equalsIgnoreCase("input")) {
                inputDevices++;
            } else if (type.equalsIgnoreCase("output")) {
                outputDevices++;
            }
        }

        // Get the number of employees with peripherals assigned
        System.out.print("Enter the number of employees: ");
        int employees = sc.nextInt();
        for (int i = 1; i <= employees; i++) {
            System.out.println("Employee " + i + " has peripheral (yes/no): ");
            String hasPeripheral = sc.next();
            if (hasPeripheral.equalsIgnoreCase("yes")) {
                employeesWithPeripherals++;
            }
        }

        // Print the report
        System.out.println("\nReport");
        System.out.println("-------------------------------------");
        System.out.println("Number of available peripherals: " + availablePeripherals);
        System.out.println("Number of assigned peripherals: " + assignedPeripherals);
        System.out.println("Number of input devices: " + inputDevices);
        System.out.println("Number of output devices: " + outputDevices);
        System.out.println("Number of employees with peripherals assigned: " + employeesWithPeripherals);
    }
}