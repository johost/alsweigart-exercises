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
        /*
         * 0th
         * 1st
         * 2nd
         * 3rd
         * 4th
         * 10th
         * 101st
         * gotcha negative numbers
         * 
         * if (number endet auf 0 ) {
         *  print number + "th"}
         * else if (number endet auf 1) {
         *  print number + "st"}
         * else if (number endet auf 2) {
         *  print number + "nd"}
         * else if (number endet auf 3) {
         *  print number + "rd"}
         * else if (number ende >= 4 && number ende <= 9) {
         *  print number + "th"}
         */
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
}