import java.util.Arrays;
import java.util.Scanner;
public class Problem2_Working_With_HiLo {
    //MINIMUM METHOD
    static double minimum(double[] arrayMin, int length){  
    Arrays.sort(arrayMin);  
    return arrayMin[0];  
    }
    
    //MAXMIMUM METHOD
    static double maxmimum(double[] arrayMax){
    double theIndex = arrayMax[0];
    for(int j = 1; j <arrayMax.length; j++)
        if(arrayMax[j] > theIndex)
        theIndex = arrayMax[j];

    return theIndex;      
    }
    
    //AVERAGE METHOD
    static double average(double[] arrayAvg){
    double total = 0, sum = 0, average = 0;
    int index;
    for( index = 0 ; index < arrayAvg.length; index++)
        total  =  sum += arrayAvg[index];   
        average = total /= index;
        
    return average;
    }
    
    //DISPLAY METHOD
    static void display(double[] arrayPrint){   
    for(int index = 0, NumberList = 1; index< arrayPrint.length; index++, NumberList++){
    System.out.println("");
    System.out.printf(NumberList+"#-"+ "%, .2f",arrayPrint[index]);
    }       
}
        
    public static void main(String[] args) {
        Scanner collect = new Scanner(System.in);
        int inputUser = collect.nextInt();   
        double [] numofInputs = new double[inputUser];   
        
        if(inputUser <= 0 || inputUser > 100){
              System.out.println("OUT OF RANGE!");
            }else{
            int arrayIndex = 0;
            for(int i = 0 ; inputUser > i; inputUser-- , arrayIndex++)
                numofInputs[arrayIndex] = collect.nextDouble();
        
        display(numofInputs); 
        System.out.println("");
        System.out.printf("Minimum = " + "%, .2f, ",minimum(numofInputs,arrayIndex)); 
        System.out.printf("Maximum = " +"%, .2f, ",maxmimum(numofInputs));   
        System.out.printf("Average = "+ "%, .2f",average(numofInputs));  
                       
            }
    } 
}