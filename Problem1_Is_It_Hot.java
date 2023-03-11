import java.util.Scanner;
public class Problem1_Is_It_Hot 
{ 
    public static void main(String[] args) 
{
        Scanner collect = new Scanner(System.in);
    //To Ask User's Input
    int inputUser = collect.nextInt();   
    int [] numofInputs = new int[inputUser];   
    if(inputUser <= 0 || inputUser > 30)
    {
    System.out.println("OUT OF RANGE!");
    }
    else
    {
        int arrayIndex = 0;
        while(inputUser > 0)
            {
            numofInputs [arrayIndex] = collect.nextInt();
            inputUser--;
            arrayIndex++;
            }

    //To Determine Hot, LukeWarm, Cold Below
    int arrayLength = 0;
    while(arrayLength<arrayIndex){
        switch(numofInputs[arrayLength])
        {
        case 1: 
            System.out.println("HOT");
            arrayLength++;
            break;
        case 2:
            System.out.println("LUKE WARM"); 
            arrayLength++;
            break;
        case 3:
            System.out.println("COLD");
            arrayLength++;
            break;
        
        default:
            System.out.println("OUT OF RANGE!");
            arrayLength++;
        }
    }    
    }
            
}
}