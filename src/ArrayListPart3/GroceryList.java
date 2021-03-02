package ArrayListPart3;

import java.util.ArrayList;

public class GroceryList {



    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){

        groceryList.add(item);
    }
    public void printGroceyList(){
        System.out.println("You have" + groceryList.size() + " items in your grocery List");
        for(int i =0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    // how to modify element

    public void modifyGroceryItem (int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position>=0){
            modifyGroceryItem(position);
        }
    }

    private void modifyGroceryItem(int position) {
    }

    private void removeGroceryItem(int position){
        groceryList.remove(position);

    }
    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);

    }
    // find the number and pass the number and the string to modify grocery item method

    public void modifyGroceryItem(String currentItem, String newItem){

        int position = findItem(currentItem);
        if(position>=0){
            modifyGroceryItem(position, newItem);
        }

    }
    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position>=0){
            return true;
        }
        return false;
    }
}
