public class PasswordGenerator19 {
    public static void main(String[] args) {
        System.out.println(generatePassword(10));

    }

    public static String generatePassword(int length) {
        String password = "";
        for (int i = 1; i <= length; i++) {
            password = password + randomLetter();
        }
        return password;
        
        /*
         * if less than 12 set to 12
         * one lowercase, uppercase, one number, one special
         * ~!@#$%^&*()_+
         * 1) genpw nur strings anhand length
         * 2) min 12 max 20
         * 3) wenn unter 12 setz auf 12
         * 4) min 1 lowercase
         * 5) min 1 uppercase
         * 6) min 1 number
         * 7) min 1 special case nämlich folgende
         */
    }

    public static char randomLetter() {
        //use printable ASCII letters between 33 and 126
        char letter = (char) ((Math.random() * 93) + 33);
        return letter;
    }
    
}