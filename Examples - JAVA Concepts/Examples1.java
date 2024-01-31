import java.util.ArrayList;
public class Examples1 {
    public static void main(String[] args) {
        
        ArrayList<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");
        fruitsList.add("Grapes");
        System.out.println("Fruits in the ArrayList:");
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }

        fruitsList.remove("Banana");
        System.out.println("Does ArrayList contain 'Banana'? \n => " + fruitsList.contains("Banana"));
    }
}
