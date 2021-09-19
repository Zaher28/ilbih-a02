package solution;

import java.util.Scanner;

public class Solution23 {
    /*
    Create a program that walks the user
    through troubleshooting issues with a car.
    Use the following decision tree to build the system
     (you can visualize this tree in PlantUML):

        VARIOUS if else statements in order to walk the user
        through the decision tree given
     */

    private void troubleshootCar(){
        String answer;

        System.out.print("Is the car silent when you turn the key? ");
        answer = scan.nextLine();

        if(answer.equals("y")){

            System.out.print("Are the battery terminals corroded? ");
            answer = scan.nextLine();

            if(answer.equals("y")){
                System.out.print("Clean terminals and try starting again.");
            }
            else if(answer.equals("n")){
                System.out.print("Replace cables and try again.");
            }
        }
        else if (answer.equals("n")){

            System.out.print("Does the car make a slicking noise? ");
            answer= scan.nextLine();

            if(answer.equals("y")){

                System.out.print("Replace the battery.");

            }
            else if(answer.equals("n")){

                System.out.print("Does the car crank up but fail to start? ");
                answer = scan.nextLine();

                if(answer.equals("y")){
                    System.out.print("Check spark plug connections.");
                }
                else if(answer.equals("n")){
                    System.out.print("Does the engineer start and then die? ");
                    answer = scan.nextLine();

                    if(answer.equals("y")){

                        System.out.print("Does your car have fuel injection? ");
                        answer = scan.nextLine();

                        if(answer.equals("y")){
                            System.out.print("Get it in for service.");
                        }
                        else if(answer.equals("n")){
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }

                    }
                    else if(answer.equals("n")){
                        System.out.print("This should not be possible.");
                    }
                }
            }
        }


    }

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        Solution23 sol = new Solution23();

        sol.troubleshootCar();





    }
}
