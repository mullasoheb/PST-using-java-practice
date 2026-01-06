import java.util.Scanner;
class demo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to find in array: ");
        int input = sc.nextInt();
        int[] arr ={2,4,3,7,9};
        boolean found = false;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]==input){
                System.out.println("Element found at index " +i + " is: "+arr[i]+" ");
                found = true;
                break;
            }
            
        }
        if(!found){
            System.out.println("Element not found!");
        }
        
    }

}
