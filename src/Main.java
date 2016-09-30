
/*
++++++++++++++HOME WORK #1+++++++++++++++++++++++++++++++++++++++++++++
TODO Create an exmaple of encapsulation [ Animals having 3 properties.]*/
import properties.Animals;

public class Main {

    public static void main(String[] args) {

        Animals properties = new Animals ();
        properties.setAnimalName ("Rattle Snake");
        properties.setAnimalExistence (true);
        properties.setAnimalSize (12.2f);

String introduceAnimal =properties.introduceAnimal ();
System.out.println(introduceAnimal);





    }
}
