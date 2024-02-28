import java.util.Scanner;

public class PasswordAuth{
    static int criteria = 0;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String pass;
        
        System.out.println("Please enter a password:");
        pass = sc.nextLine();
        if(checkLength(pass) > 0){
            checkLower(pass);
            checkHigher(pass);
            checkNum(pass);
            checkSymbol(pass);   
            if(criteria >= 3){
                System.out.println("Password meets requirements");
            }
            else
            System.out.println("Password does not meet reqiurements");
        }
        sc.close();
    }

    public static int checkLength(String pass){
        if(pass.length() >= 8 && pass.length() <= 16){
            return 1;
        }
        else
        return -1;
    }
    public static void checkLower(String pass){
        boolean foundLower;
        for(int i = 0; i < pass.length(); i++){
            char letter = pass.charAt(i);
            foundLower = Character.isLowerCase(letter);
            if(foundLower == true){
                criteria++;
                break;
            }
        }
    }
    public static void checkHigher(String pass){
        boolean foundHigher;
        for(int i = 0; i < pass.length(); i++){
            char letter = pass.charAt(i);
            foundHigher = Character.isUpperCase(letter);
            if(foundHigher == true){
                criteria++;
                break;
            }
        }
    }
    public static void checkNum(String pass){
        boolean foundNum;
        for(int i = 0; i < pass.length(); i++){
            char letter = pass.charAt(i);
            foundNum = Character.isDigit(letter);
            if(foundNum == true){
                criteria++;
                break;
            }
        }
    }
    public static void checkSymbol(String pass){
        boolean foundSymbol = false;
        for(int i = 0; i < pass.length(); i++){
            char letter = pass.charAt(i);
            if(Character.isLowerCase(letter) != true && Character.isUpperCase(letter) != true && Character.isDigit(letter) && true){
                foundSymbol = true;
            }
            if(foundSymbol == true){
                criteria++;
                break;
            }
        }
    }
}