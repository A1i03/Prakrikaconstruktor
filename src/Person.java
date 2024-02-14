public class Person {
    String name;
    int age;
    String work;
    long salary;
    int phoneprice;

    public Person(String name, int age, String work, long salary, int phoneprice) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.salary = salary;
        this.phoneprice = phoneprice;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work='" + work + '\'' +
                ", salary=" + salary +
                ", phoneprice=" + phoneprice +
                '}';
    }
}
