import java.util.*;

public class demo {
    public static void main(String[] args) {

       Map<String, String> fruits = new LinkedHashMap<>();
       fruits.put("яблоко", "apple");
       fruits.put("персик", "peach");
       fruits.put("ананас", "pineapple");

       for(Map.Entry<String,String> entry: fruits.entrySet()){
           System.out.println(entry.getKey()+" "+ entry.getValue());
       }








        /*Set str = new HashSet<>();
        str.add("apple");
        str.add("apple");
        str.add("apple");
        str.add("dog");
        str.add("dog");

        System.out.println(str.toArray().length);

        for (int i=0; i<=str.toArray().length-1; i++) {
            System.out.println(str.toArray()[i]);
        }*/


       /* List<String> myString = new ArrayList<>();
        myString.add("1st");
        myString.add("2nd");
        myString.add("3rd");
        myString.add("4th");
        myString.add("5th");

        List tiuh = new ArrayList();

        for (String i : myString
        ) {
            System.out.println(i);
        }

        List myString2 = new LinkedList<>();
        myString2.add(tiuh);


        List<Integer> input = new ArrayList<Integer>();
        input.add(1);
        input.add(4);
        input.add(65);
        input.add(14);
        input.add(57);

       // Collections.sort(input);

        for(int i=0; i<input.size();i++ )
        {
            System.out.println(input.get(i));
        }*/

    }

}





