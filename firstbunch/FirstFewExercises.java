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
}