package LinkedListLesson;

import java.util.LinkedList;

import static java.lang.System.*;

public class Cat {


    public static void main (String[] args){
        LinkedList<String> cats = new LinkedList<>();

        String str1 = new String("Bobik");
        String str2 = new String("Smokey");
        String str3 = new String("Barsik");
        String str4 = new String("Murka");

        cats.add(str1);
        cats.addFirst(str4);
        out.println(cats);

        Cat[] catsArray = cats.toArray(new Cat[2]);
        out.println(catsArray.toString());

    }
}
