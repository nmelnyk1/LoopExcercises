package AutoBoxingChallenge;

import ArrayListPart3.IntClass;

import java.util.ArrayList;

public class AutoboxingUnboxing {
    public static void main (String[] args){
        String[] myArray = new String[10];
        int[] intArray = new int[10];
        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Nataliia");

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
       // ArrayList<int> intArrayList = new ArrayList<int>(); error

        Integer integer = new Integer(54);
        Double myDOuble = new Double(12.54);

        // Autoboxing
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i<=10; i++){
            intArrayList.add(Integer.valueOf(i));
        }
        //Unboxing
        for(int i = 0; i<=10; i++){
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue =  56;// compile time it will look like this = Integer.valueOf(56)
        int myInt =  myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl<=10.0; dbl+=0.5){
            myDoubleValues.add(Double.valueOf(dbl));
        }
 for ( int i = 0; i<myDoubleValues.size(); i++){
     double value = myDoubleValues.get(i).doubleValue();
     System.out.println(i + value);
 }

    }
}
