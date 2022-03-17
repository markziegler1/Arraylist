import java.util.ArrayList;
import java.util.List;

public class Arraylist {
  public static void main(String[] args) {

    String[] names = {"Harry", "Ron", "Hermione"}; // Opretter Array med navne
    ArrayList<String> people = new ArrayList<>(List.of(names)); // Opretter Arraylist med String
    System.out.println(people); // Udskriver listen people
    people.add("Draco"); // Tilføjer Draco
    people.add("Neville"); // Tilføjer Neville
    people.remove("Draco"); // Fjerner Draco
    people.add("Luna"); // Tilføjer Luna
    List youThree = people.subList(0,3); // Tager udgangspunkt i String øverst
    people.add(1,"Cho");
    System.out.println(people);
    people.set(1,"Ginny");
    System.out.println(people);
    people.addAll(List.of(new String[]{"Fred", "Georg"}));
    int result = people.indexOf("Fred");
    people.remove(result);



    ArrayList<Integer> numbers2 = new ArrayList<>();
    int number = 5;
    Integer box = Integer.valueOf(number);
    numbers2.add(box);
    numbers2.add(11);
    System.out.println(numbers2);

   /* ArrayList<String> STRENGTH=new ArrayList<String>();//Creating arraylist
    System.out.println("STRENGTHS");
    STRENGTH.add("1: Kræver ikke vedligeholdelse (3)");//Adding object in arraylist
    STRENGTH.add("2: Kræver mindre end computerspil (4)");
    //Printing the arraylist object
    STRENGTH.forEach(System.out::println);
    
    */
  }
}
