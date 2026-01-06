import java.util.Scanner;
class demo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to find in array: ");
        int input = sc.nextInt();
        int[] arr ={2,4,3,7,9};
        int n = arr.length;
        
        if(input>0 && input<n){
            System.out.println("Element found at index " +input + " is: "+arr[input]+" ");
        }else{
            System.out.println("Element not found!");
        }
            
        
    }
}