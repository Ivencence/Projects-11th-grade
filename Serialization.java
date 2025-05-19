import java.io.*;
import java.util.*;
public class Serialization {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter file:");
        String file = myObj.nextLine();

        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee(1234, "Anna", "Peters"));
        employee.add(new Employee(5678, "Boris", "Johnson"));
        employee.add(new Employee(9101, "Clark", "Kent"));

        writeObject(file, employee);
        readObject(file);

    }
    public static void writeObject(String file, List<Employee> employee) {
        try (ObjectOutputStream object = new ObjectOutputStream(new FileOutputStream(file))) {
            for(Employee element: employee){
            object.writeObject(element);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void readObject(String file){
        try(ObjectInputStream object = new ObjectInputStream(new FileInputStream(file))) {
            try {
                while (true) {
                    Employee employee = (Employee) object.readObject();
                    System.out.println("Name: " + employee.name + " " + employee.surname + "; Id:" + employee.id);
                }

            } catch(EOFException e){}
                catch (IOException | ClassNotFoundException e) {
                    System.out.println(e.getMessage());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
class Employee implements Serializable{
    int id;
    String name;
    String surname;

    public Employee(int id, String name, String surname){
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
}
