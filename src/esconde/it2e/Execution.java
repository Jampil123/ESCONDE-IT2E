
package esconde.it2e;

import java.util.Scanner;

public class Execution {
    public void getApplicaton(){
        Implementor[] im = new Implementor[100];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of applications:");
        int numApp = sc.nextInt();

        for (int i = 0; i < numApp; i++) {
            System.out.println("Enter details of Application " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("BMI: ");
            double bmi = sc.nextDouble();
            System.out.print("Fitness Goals: ");
            String fitnessGoals = sc.next();
            
            im[i] = new Implementor();
            im[i].addRecords(id, age, name, bmi);
        }
        System.out.println("");
        
        System.out.printf("%-10s %-10s %-10s -10s -10s -10s",
                "ID", "Name", "Age", "BMI","Fitness Goals" , "Eligibility Status");
         for(Implementor im1: im){
             im1.viewRecords();
        }
    }
}
