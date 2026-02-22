class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Employee implements Cloneable {
    int id;
    Address address;

    Employee(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();   // shallow copy
    }
}
public class ShallowMain {
    public static void main(String[] args) throws Exception {

        Address addr = new Address("Delhi");
        Employee e1 = new Employee(1, addr);

        Employee e2 = (Employee) e1.clone();   // Shallow copy

        e2.address.city = "Mumbai";

        System.out.println(e1.address.city);   // Mumbai 
    }
}
