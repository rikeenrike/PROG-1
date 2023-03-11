import java.util.Arrays;
import java.util.Scanner;

public class Problem3_Goodbye_Duplicates {

    //method to find duplicates
    static void duplicates(int[]arr){ 
        System.out.print("Duplicates are: ");
        for(int i = 0; i < arr.length; i++) {  
            for(int ii = i + 1; ii < arr.length; ii++) {  
                if(arr[i] == arr[ii])  
                    System.out.print(" "+arr[ii]+" ");  
                }
            }
           
        }
        // method to display
        static void display(int[]array) {
            int[] nodupedisplay = array;
            for(int i = 0; i<nodupedisplay.length;i++)
            {
                System.out.println("#" + (i+1) + " - " + nodupedisplay[i]);
            }
        }
    
    public static void main(String[] args){
    Scanner collect = new Scanner(System.in);
    
    int inputUser = collect.nextInt();   
    int [] numofInputs = new int[inputUser];   
    
    if(inputUser <= 0 || inputUser > 100){
        System.out.println("OUT OF RANGE!");
        }else{
            for(int arrayIndex = 0; arrayIndex<inputUser;arrayIndex++)
            numofInputs[arrayIndex] = collect.nextInt();
    }

    display(numofInputs);
    duplicates(numofInputs);

    }
}