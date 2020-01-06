import java.util.Scanner;

public class CalculatorApp {

    static int x;
    static int y;
    static int z;

    public static void main(String[] args) {
        System.out.println("$ java CLICalculator");


        while (true)  // A menu loop to select arithmetic operation
        {
            System.out.println("CLICALC > ");
            // create a scanner so we can read the command-line input
            Scanner scanner = new Scanner(System.in);
            // get their input as a String
            String command = scanner.nextLine();

            /* delimiter */
            String delimiter = " ";
            /* given string will be split by the argument delimiter provided. */
            String[] splitCommand = command.split(delimiter);


            String op = splitCommand[0];




            if(splitCommand.length==1){

                if (op.equalsIgnoreCase("HELP")) {
                    System.out.println("Hello user!!!welcome to the calculator manuel");
                    System.out.println("for numbers 12 and 13 following are the commands");
                    System.out.println("addition>>>ADD 13 12");
                    System.out.println("subtraction>>>SUB 13 12");
                    System.out.println("division>>>DIV 13 12");
                    System.out.println("multiplication>>>MUL 13 12");
                }else{

                    System.out.println("invalid input");

                }


            }else if(splitCommand.length==3){
                x = Integer.parseInt(splitCommand[1]);

                y = Integer.parseInt(splitCommand[2]);


                if (op.equalsIgnoreCase("ADD")) {

                    z = x + y;
                    System.out.println(x + " ADD " + y + " = " + z);
                } else if (op.equalsIgnoreCase("SUB")) {
                    z = x - y;
                    System.out.println(x + " SUB " + y + "=" + z);
                } else if (op.equalsIgnoreCase("MUL")) {
                    z = x * y;
                    System.out.println(x + " MUL " + y + "=" + z);
                } else if (op.equalsIgnoreCase("DIV")) {
                    z = x / y;
                    System.out.println(x + " DIV " + y + "=" + z);
                } else {
                    throw new java.lang.Error("Operator not recognized!!Try again");
                }


            }



        }


    }


//    public int add(int a, int b) {
//        return 0;
//    }
//
//    public int subtract(int a, int b) {
//        return 0;
//    }
//
//    public int multiply(int a, int b) {
//        return 0;
//    }
//
//    public int divide(int a, int b) {
//        return 0;
//    }

}
