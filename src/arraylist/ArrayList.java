package arraylist;
import java.util.*;
public class ArrayList {
    
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        System.out.println("Enter 10 for ten elements: ");
        int arrlength = s.nextInt();
        
        int myArray[] = new int[arrlength];
        System.out.println("Enter the values of 10 array: ");
        
        for(int i=0; i<arrlength; i++){
          
          myArray[i] = s.nextInt();
        }
        int min = myArray[0];
        for(int i=0; i<myArray.length; i++){
        
        if(myArray[i]< min){
            min = myArray[i];
        }
    }
        System.out.println(Arrays.toString(myArray));        
        System.out.println("Minimum value is: " + min);
        
        Arrays.sort(myArray);
        System.out.println("After Sorting the values: "); 
        for (int i = 0; i < myArray.length; i++) {           
        System.out.println(" " +myArray[i]);
        };
        myArray[3] = min;
        myArray[6] = min;
        myArray[9] = min;
        //System.out.println("Final Result: ");
        System.out.println("Final Result: " + Arrays.toString(myArray));
        for(int i=0; i<arrlength; i++){  
          myArray[i] = s.nextInt();
        }                       
    }    
}

