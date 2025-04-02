package datastructures.hashTable.impl;//package datastructures.hashTable;
import java.util.HashMap;




public class Main {


    public static boolean itemInCommon(int[] arr1, int[] arr2){
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();

        for(int i: arr1){
            myHashMap.put(i,true);
        }

        for (int i: arr2){
            if(myHashMap.get(i) != null) return true;
        }

        return false;
    }



    public static void main(String[] args) {

        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};
        System.out.println(itemInCommon(array1, array2));


/*

        HashTable myHashTable = new HashTable();
        myHashTable.printTable();


//            EXPECTED OUTPUT:
//            ----------------
//            0:
//            1:
//            2:
//            3:
//            4:
//            5:
//            6:
//

*/




/*

        HashTable myHashTable = new HashTable();

        // HASH METHOD MUST BE SET TO PUBLIC FOR THESE LINES TO WORK
        System.out.println( myHashTable.hash("paint") );
        System.out.println( myHashTable.hash("bolts") );
        System.out.println( myHashTable.hash("nails") );
        System.out.println( myHashTable.hash("stuff") );
        System.out.println( myHashTable.hash("lumber") );

//            EXPECTED OUTPUT:
//            ----------------
//            2
//            4
//            6
//            5
//            6
//

*/




/*

        HashTable myHashTable = new HashTable();

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);

        myHashTable.printTable();

//            EXPECTED OUTPUT:
//            ----------------
//            0:
//            1:
//            2:
//            3:
//               {screws= 140}
//            4:
//               {bolts= 200}
//            5:
//            6:
//               {nails= 100}
//               {tile= 50}
//               {lumber= 80}
//

*/




/*

        HashTable myHashTable = new HashTable();

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        System.out.println("Lumber:");
        System.out.println( myHashTable.get("lumber") );

        System.out.println("\nBolts:");
        System.out.println( myHashTable.get("bolts") );

//            EXPECTED OUTPUT:
//            ----------------
//            Lumber:
//            80
//
//            Bolts:
//            0
//

*/






/*

        HashTable myHashTable = new HashTable();

        myHashTable.set("paint", 20);
        myHashTable.set("bolts", 40);
        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        System.out.println( myHashTable.keys() );

//        	EXPECTED OUTPUT:
//        	----------------
//        	[paint, bolts, nails, tile, lumber]

*/






    }
}
