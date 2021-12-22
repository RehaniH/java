package loops;

public class SampleClass {

    private String name;
    private int age;
    private double salary;

    SampleClass(){
        this.name = "sample 1";
        this.age = 23;
        this.salary = 20000;
    }

    SampleClass(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    String getName(){
        return this.name;
    }

    int getAge(){
        return this.age;
    }

    double getSalary(){
        return this.salary;
    }

    void setSalary(double salary){
        this.salary = salary;
    }

    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }
    
}
