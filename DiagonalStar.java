//creat an app to get a number from user and then creat a star shape in range of that number.
//for example -> if the number is 3 the output should be :
// *   *
//  * *
//   *
//  * *
// *   *
//but you need to put some validation in your input value.
// 1. it should be a whole number -> not decimal number.
// 2. it should not be bigger than 10 -> because it would be large.
// 3. it should be positive
// 4. it should be handle possible error for not int entered value.

import java.util.InputMismatchException;
import java.util.Scanner;
public class DiagonalStar {

    public static void main(String[] args) {
        starPrinter(getInput());
    }

    public static int getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a whole number for star size (1 to 10) : ");
        try {
            int starSize = scanner.nextInt();
            if (starSize < 11 && starSize > 0){
                return starSize;
            }else {
                return -1;
            }

        }catch (InputMismatchException e){
            System.out.println("Please just enter a integer!");
        }
        return -1;

    }

    public static void starPrinter (int size){

        if (size == -1){
            System.out.println("Invalid value");
        }else {
            for (int x = 0 ; x < size ; x++){
                for (int y = 0 ; y < size ; y++){
                    if ( (x == y) || (x + y == size -1)){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
