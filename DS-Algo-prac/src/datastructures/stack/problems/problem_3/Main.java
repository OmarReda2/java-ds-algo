package datastructures.stack.problems.problem_3;

import java.util.ArrayList;

public class Main {

    // WRITE THE REVERSESTRING METHOD HERE //
    public static String reverseString(String str){
        ArrayList<Character> stackList = new ArrayList<>();
        String strReverse = "";

        for(int i=0; i<str.length(); i++){
            stackList.add(str.charAt(i));
        }

        for(int i=stackList.size()-1; i>=0; i--){
            strReverse+=stackList.get(i);
        }

        return strReverse;


    }



    public static void main(String[] args) {

        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */

    }

}
