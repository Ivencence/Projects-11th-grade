public class Zoo {
    public static void main(String[] args) {
        Habitat hab1 = new Habitat("river", 200, 30);
        Habitat hab2 = new Habitat("forest", 300, 20);
        Habitat hab3 = new Habitat("savannah", 300, 30);
        Habitat hab4 = new Habitat("terrarium", 10, 35);

        Staff st1 = new Staff("Chuck", "Zookeeper", hab1);
        Staff st2 = new Staff("Mimi", "Specialist", hab2);
        Staff st3 = new Staff("Emma", "Zookeeper", hab3);
        Staff st4 = new Staff("Paul", "Zookeeper", hab4);
        

        Zoo zoo1 = new Zoo();
        zoo1.addAnimal1(hab1);

        Zoo zoo2 = new Zoo();
        zoo2.addAnimal2(hab2);

        Zoo zoo3 = new Zoo();
        zoo3.addAnimal3(hab3);

        Zoo zoo4 = new Zoo();
        zoo4.addAnimal4(hab4);
     
    }
}
class Animal{
String name;
String species;
int age;
Habitat type;

public Animal(String name, String species, int age, Habitat type){
    this.name = name;
    this.species = species;
    this.age = age;
    this.type = type;
}

void eat(String food, Staff staff, Animal animal){
    System.out.println(animal + " is being fed " + food + " by " + staff);
}

}

class Habitat{
    String type;
    double size;
    double temperature;

    public Habitat(String type, double size, double temperature){
        this.type = type;
        this.size = size;
        this.temperature = temperature;
    }
}

class Zoo {
Animal a1;
Animal a2;
Animal a3;
Animal a4;

void addAnimal1(Habitat habitat){
a1 = new Animal("Martha", "hippo", 3, habitat); // composition and association
}
void addAnimal2(Habitat habitat){
a2 = new Animal("Mimi", "bear", 5, habitat);
}
void addAnimal3(Habitat habitat){
    a3 = new Animal("Leo", "lion", 4, habitat);
}
void addAnimal4(Habitat habitat){
    a4 = new Animal("Bob", "snake", 2, habitat);
}
}

class Staff{
    String name;
    String role;
    Habitat assignedHabitat;

public Staff(String name, String role, Habitat assignedHabitat){
    this.name = name;
    this.role = role;
    this.assignedHabitat = assignedHabitat;
}
}
