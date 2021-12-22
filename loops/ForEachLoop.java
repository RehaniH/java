package loops;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {

    public static void main(String[] args){

        SampleClass sampleClass = new SampleClass();
        System.out.println("Name: " + sampleClass.getName());
        System.out.println("Age: " + sampleClass.getAge());
        System.out.println("Salary: " + sampleClass.getSalary());

        SampleClass sampleClass2 = new SampleClass("Shama", 45, 450000);
        System.out.println("\nName: " + sampleClass2.getName());
        System.out.println("Age: " + sampleClass2.getAge());
        System.out.println("Salary: " + sampleClass2.getSalary());

        SampleClass sampleClass3 = new SampleClass("Shain", 25, 120000);
        System.out.println("\nName: " + sampleClass3.getName());
        System.out.println("Age: " + sampleClass3.getAge());
        System.out.println("Salary: " + sampleClass3.getSalary());

        List<SampleClass> empList = new ArrayList<>();
        empList.add(sampleClass);
        empList.add(sampleClass2);
        empList.add(sampleClass3);

        System.out.println(empList.size());

        for (SampleClass sc : empList) {

            System.out.println(sc.getName());
            
        }


        


    }
    
}
