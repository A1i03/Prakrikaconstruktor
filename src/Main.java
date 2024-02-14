import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Student student1 = new Student();
//        student1.name = "Ali";
//        student1.dateOfbirth=LocalDate.of(2003,04,14);
//        student1.phoneNumber="225282802";
//        student1.nationality="KGZ";
//
//        Student student2 = new Student();
//        student2.name = "Ali";
//        student2.dateOfbirth=LocalDate.of(2003,04,14);
//        student2.phoneNumber="225282802";
//        student2.nationality="KGZ";
//
//        Student student3 = new Student("Ali",LocalDate.of(2003,4,14),"225282802","KGZ");
//        Student student4 = new Student("Ali",LocalDate.of(2003,4,14),"225282802","KGZ");
//        Student student5 = new Student("Ali",LocalDate.of(2003,4,14),"225282802","KGZ");
//
//        Student [] students = {student1,student2,student3,student4,student5};
//        for (Student student : students){
//            System.out.println(student);
//            System.out.println(student.getAge());
//        }

        Person person1 = new Person("Ali",20,"net",50000,20000);
        Person person2 = new Person("Sabina",18,"salon",80000,70000);
        Person person3 = new Person("Asan",15,"afto",20000,30000);
        Person person4 = new Person("Uson",30,"texnik",600000,90000);
        Person person5 = new Person("Tinatin",20,"soda",100000,200000);

        Person[] person = {person1,person2,person3,person4,person5};int maxSalary = Integer.MIN_VALUE;
        for (Person name : person){    if (name.salary > maxSalary){
            maxSalary = (int) name.salary;
        }}
        System.out.println("Эн коп зарплата: " + maxSalary);
        int minSalary = Integer.MAX_VALUE;
        for (Person names : person){    if (names.salary < minSalary){
            minSalary = (int) names.salary;    }
        }System.out.println("Эн томон зарплата: " + minSalary);
        }




        }


