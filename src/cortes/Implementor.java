package cortes;

public class Implementor {
    
    int id, age;
    String name, goal, stats;
    double bmi;
    
    public void addRecord(int r_id, String r_name, int r_age, double r_bmi, String r_goal, String r_stats){
        this.id = r_id;
        this.name = r_name;
        this.age = r_age;
        this.bmi = r_bmi;
        this.goal = r_goal;
        this.stats = r_stats;
    }
    
    public void viewRecord(){
        System.out.printf("%-5d %-10s %-5d %-5.1f %-20s %-20s\n", id, name, age, bmi, goal, stats);
    }
}
