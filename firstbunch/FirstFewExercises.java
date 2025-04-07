import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FirstFewExercises {
    public static void main(String[] args) {
        System.out.println("Hi, welcome!\nThe following lines show the output of the exercises.");
        double fahrenheit = convertToFahrenheit(25.0);
        System.out.println("25°C is: "+ fahrenheit);
        double celsius = convertToCelsius(77.0);
        System.out.println("77°F is: " + celsius);
        int number = 5;
        System.out.println("Is " + number + " odd? " + isOdd(number));
        System.out.println("Is " + number + " even? " + isEven(number));
        int upTo = 35;
        printFizzBuzz(upTo);
        System.out.println("");
        int suffixNumber = 10;
        ordinalSuffix(suffixNumber);
        suffixNumber = 23;
        ordinalSuffix(suffixNumber);
        suffixNumber = 41;
        ordinalSuffix(suffixNumber);
        suffixNumber = 58;
        ordinalSuffix(suffixNumber);
        suffixNumber = -23;
        ordinalSuffix(suffixNumber);
        printASCIITable();
        writeToFile("greet.txt", "Hello!\n");
        appendToFile("greet.txt", "Goodbye!");
        readFromFile("greet.txt");
        

    }
    
    public static double convertToFahrenheit(double howWarmCelsius) {
        double fahrenheit = (howWarmCelsius * 9.0 / 5.0) + 32.0;
        return fahrenheit;
    }

    public static double convertToCelsius(double howWarmFahrenheit) {
        double celsius = (howWarmFahrenheit - 32.0) * (5.0 / 9.0);
        return celsius;
    }

    public static boolean isOdd(int number) {
        if (number % 2 == 1) {
            return true;
        } else return false;
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else return false;
    }

    public static void printFizzBuzz(int upTo) {
        /*
         * for i in upTo; i = 1; i++ {
         *  if i % 3 == 0 && i % 5 == 0 then print FizzBuzz i++
         *  if i % 3 == 0 then print Fizz i++
         *  if i % 5 == 0 then print Buzz i++
         * } 
         *  
         */
        for (int i = 1; i < upTo + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz "); 
            } 
            if (i % 3 == 0) {
                System.out.print("Fizz "); 
            }
            if (i % 5 == 0) {
                System.out.print("Buzz "); 
            } else System.out.print(i + " ");
        }
    }

    public static void ordinalSuffix(int suffixNumber) {
        if (Math.abs(suffixNumber) % 10 == 0) {
            System.out.println(suffixNumber + "th");
        }
        
        else if (Math.abs(suffixNumber) % 10 == 1) {
            System.out.println(suffixNumber + "st");
        }

        else if (Math.abs(suffixNumber) % 10 == 2) {
            System.out.println(suffixNumber + "2n");
        }

        else if (Math.abs(suffixNumber) % 10 == 3) {
            System.out.println(suffixNumber + "rd");
        }

        else if (Math.abs(suffixNumber) % 10 >= 4 && Math.abs(suffixNumber) % 10 <= 9) {
            System.out.println(suffixNumber + "th");
        }
    }

    public static void printASCIITable() {
        /*
         * schleife for
         *  konvertiere integer i zu String und zeige als ASCII char an
         */
        for (int i = 32; i <= 126; i++) {
            char ch = (char) i;
            System.out.println(i + " " + ch); 
        }
    }

    public static void writeToFile(String pathName, String text) {
        try {
            File file = new File(pathName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error accoured.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter(pathName);
            myWriter.write(text);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void appendToFile(String pathName, String appendText) {
        try {
            FileWriter myWriter = new FileWriter(pathName,true);
            myWriter.write(appendText);
            myWriter.close();
            System.out.println("Appended to file.");
        } catch (IOException e) {
            System.err.println("IO Exception " + e.getMessage());
        }
    }

    public static void readFromFile(String pathName) {
        try {
            File file = new File(pathName);
            Scanner myReader = new Scanner (file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }

    
}