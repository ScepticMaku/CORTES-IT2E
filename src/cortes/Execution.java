package cortes;
import java.util.*;

public class Execution {
    Scanner sc = new Scanner(System.in);
    Implementor[] implement = new Implementor[100];
    
    String status;
    
    public void inputRecord(){
        
        System.out.println("Fitness Program Eligibility\n");
        System.out.print("Enter number of applicants: ");
        int num = sc.nextInt();
        
        for(int i = 0; i < num; i++){
            System.out.printf("\nEnter details of application %d: \n",(i+1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("BMI: ");
            double bmi = sc.nextDouble();
            System.out.print("Fitness Goals: ");
            sc.nextLine();
            String goal = sc.nextLine();
            
            implement[i] = new Implementor();
            
//            if(!((age > 18 && age < 65) && (bmi > 18.5 && bmi < 30.0) && (goal.equals("Weight Loss") || goal.equals("Muscle Gain") || goal.equals("General Fitness")))){
//            }

            
            
            implement[i].addRecord(id, name, age, bmi, goal, criteria(age, bmi, goal));
        }
        
        System.out.printf("\n%-5s %-10s %-5s %-5s %-20s %-20s\n", "ID", "Name", "Age", "BMI", "Fitness Goals", "Eligibility Status");
        
        for(int i = 0; i < num; i++){
            implement[i].viewRecord();
        }
    }
    
    public String criteria(int cage, double cbmi, String cgoal){
        if(cage < 18){
                status = "Not Eligible (Age too low)";
            } else if(cage > 65){
                status = "Not Eligible (Age too high)";
            } else if(cbmi < 18.5){
                status = "Not eligible (BMI too low)";
            } else if(cbmi > 30.0){
                status = "Not eligible (BMI too high)";
            } else if(!(cgoal.equals("Weight Loss") || cgoal.equals("Muscle Gain") || cgoal.equals("General Fitness"))){
                status = "Not eligible (Not a valid goal)";
            } else{
                status = "Eligible";
            }
        return status;
    }
    
}
