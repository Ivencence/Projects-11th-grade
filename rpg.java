public class rpg {

    public static void main(String[] args){
        Wizard wizard = new Wizard("Merlin",100, 10,5);
        Warrior warrior = new Warrior("Ragnar",100,7,10);
        Archer archer = new Archer("John", 100, 10, 5);

        System.out.println(wizard.getName() + "'s health: " + wizard.getHealth());
        System.out.println(warrior.getName()+"'s health: " + warrior.getHealth());
        System.out.println("Game is starting...");
        wizard.setHealth(warrior);
        System.out.println( warrior.getName()+" attacks " + wizard.getName() + ". Health updated: " + wizard.getHealth());

        archer.setHealth(wizard);
        System.out.println(wizard.getName() + " attacks " + archer.getName() + ". Health updates: " + archer.getHealth());
        
    }
}


class Wizard {
    private String name;
    private int health;
    private int darkMagic;
    private int wizardArmor;

    public Wizard(String name, int health, int darkMagic, int wizardArmor){
        this.name = name;
        this.health = health;
        this.darkMagic = darkMagic;
        this.wizardArmor = wizardArmor;
    }

    public String getName() {
        return name;
    }

    public int getDarkMagic(){
        return darkMagic;
    }

    public void setHealth(Warrior attack) {
        health = health - (attack.getSword() - wizardArmor);
    }

    public int getHealth() {
        return health;
    }

}

class Warrior {
    private String name;
    private int health;
    private int sword;
    private int metalArmor;

    public Warrior(String name, int health, int sword, int metalArmor){
        this.name = name;
        this.health = health;
        this.sword = sword;
        this.metalArmor = metalArmor;
    }

    public String getName() {
        return name;
    }

    public int getSword() {
        return sword;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(Wizard attack) {
        health = health - (attack.getDarkMagic() - metalArmor);
    }

}

class Archer{
    private String name;
    private int health;
    private int arrows;
    private int archerArmour;

    public Archer(String name, int health, int arrows, int archerArmour){
        this.name= name;
        this.health = health;
        this.arrows = arrows;
        this.archerArmour = archerArmour;
    }

    public String getName (){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public int getArrows(){
        return arrows;
    }

    public int getArcherArmour(){
        return archerArmour;
    }

    public void setHealth(Wizard attack){
        health = health - (attack.getDarkMagic() - archerArmour);
    }
}
