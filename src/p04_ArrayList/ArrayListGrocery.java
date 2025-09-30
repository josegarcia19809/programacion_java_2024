package p04_ArrayList;


import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int quantity) {
    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }
}

public class ArrayListGrocery {
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0]= new GroceryItem("milk");
        groceryArray[1]= new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2]= new GroceryItem("oranges", "PRODUCE", 7);

        System.out.println(Arrays.toString(groceryArray));

        ArrayList<GroceryItem> groceryArrayList = new ArrayList<>();
        groceryArrayList.add(new GroceryItem("Butter"));

        System.out.println(Arrays.toString(groceryArrayList.toArray()));

    }
}
