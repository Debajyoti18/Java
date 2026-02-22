class Employee {
    int id;
    String address;

    Employee(int id, String address) {
        this.id = id;
        this.address = address;
    }
}

public class DeepMain {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Delhi");
        Employee e2 = new Employee(2, "Mumbai");

        System.out.println("Before swap: " + e1.id + " " + e2.id);

        swap(e1, e2);

        System.out.println("After swap: " + e1.id + " " + e2.id);
    }

    static void swap(Employee a, Employee b) {
        int temp = a.id;
        a.id = b.id;
        b.id = temp;
    }
}
