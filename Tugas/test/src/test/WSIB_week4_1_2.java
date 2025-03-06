package test;
public class WSIB_week4_1_2 { 
    //❤❤
    public static void main(String[] args) {
        int[]exampleVariableOne = {2,9,6,7,4,5,3,0,1};
        int target = 4;
        sequintalSearch(exampleVariableOne, target);
    }
    public static void sequintalSearch(int []parameterOne, int parameterTwo){
        int index = -1;
        for(int i = 0; i < parameterOne.length; i++){
            if(parameterOne[i]==parameterTwo){
                index = i;
                break;
            }
        }
        if(index==-1){
            System.out.println("Your target integer doesn't exist in the area");
        }else{
            System.out.println("Your target integer is in index "+index+" of the array");
        }
    }
}
