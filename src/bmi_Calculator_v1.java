import java.util.Scanner;

public class bmi_Calculator_v1 {

    public static void main (String[] args){
        Scanner myObj = new Scanner(System.in);

        // Declare Variables
        double weight =0.0;
        double height = 0.0;
        double bmi = 0.0;


        // Input weight in pound
        System.out.print("Enter your weight in pound: ");
        weight = myObj.nextDouble();

        // Input height in inches
        System.out.print("Enter yor height in inches: ");
        height = myObj.nextDouble();


        weight = weight * 0.45359237; // Weight covert pound to kg
        height = height * 0.0254; // Height convert inches to meters

        bmi = weight / Math.pow(height,2.0); // BMI formula

        System.out.printf("Your BMI is %.2f \n", bmi); // Display BMI in two decimal places
        bmiInter(bmi); // Call BMI Interpretation check method

    }


    // BMI Interpretation check method
    static void bmiInter(double bmi){

        if (bmi<18.5){              // Underweight Check
            System.out.println("Your BMI interpretation is Underweight.");
        } else if (bmi<25.0){       // Normal check
            System.out.println("Your BMI interpretation is Normal.");
        } else if (bmi < 30.){      // Overweight check
            System.out.println("Your BMI interpretation is Overweight.");
        } else{                     // Obese Category
            System.out.println("Your BMI interpretation is Obese.");
        }
    }
}
