import java.util.Scanner;

//Joleyne Hernandez CSCI 1660 2/22/24
class intEst{
    public static Scanner input = new Scanner(System.in);

    public int promptInt(String message){
        System.out.println(message);
        String userInput = input.nextLine();

        int userInt = 0;
        boolean isInt = false;
        while(!isInt){
            try{
                userInt = Integer.parseInt(userInput);
                isInt = true;
                System.out.println(userInt);
            }
            catch(NumberFormatException e){
                System.out.println(userInput + " Please enter an actual Integer");
                userInput = input.nextLine();
            }
        }

        return userInt;
    }
}
class doubleTest{
    public static Scanner input = new Scanner(System.in);
    public double promptDouble(String message){
        System.out.println(message);
        String userInput = input.nextLine();
        double userDouble = 0;
        boolean intDouble = false;

        while(!intDouble){
            try{
                userDouble = Double.parseDouble(userInput);
                intDouble = true;
                System.out.println(userDouble);
            }
            catch (NumberFormatException e){
                System.out.println(userInput + " Please enter an actual Double");
                userInput = input.nextLine();
            }
        }


        return userDouble;
    }
}

class stringTest{
    public static Scanner input = new Scanner(System.in);

    public String promptString(String message){
        System.out.println(message);
        String userInput = input.nextLine();
        String userString = "";
        boolean isSt = false;
        while(!isSt){
            try{
                int a = Integer.parseInt(userInput);
                double b = Double.parseDouble(userInput);
                System.out.println(userInput+" Please enter an actual message");
                userInput = input.nextLine();

            }
            catch(NumberFormatException e){
                userString = (userInput);
                isSt = true;
                System.out.println(userString);
            }
        }
        return userString;
    }

}


public class Main {
    public static void main(String[] args) {

        intEst promptInt = new intEst();
        promptInt.promptInt("Please enter an Integer/Number");

        doubleTest promptDouble = new doubleTest();
        promptDouble.promptDouble("Please enter a Double/Number");

        stringTest promptString = new stringTest();
        promptString.promptString("Please enter a message");
    }
}