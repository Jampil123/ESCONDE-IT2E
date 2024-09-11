
package esconde.it2e;

public class Implementor {
    String name, status, fit_g;
    int id, age;
    double bmi;
    public void addRecords(int pid,int page, String pname, double pbmi ){
        this.age = page;
        this.id = pid;
        this.name = pname;
        this.bmi = pbmi;
    }
    public void viewRecords(){
        System.out.printf("%-10d %-10s %-10d -10.1f -10s -10s",
                this.id, this.name, this.age, this.bmi, this.fit_g, this.status);
    }
}
