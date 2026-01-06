import java.util.Scanner;
class maxelement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {8, 23, 5, 70, 22};
        int n = arr.length;
        int max = arr[0];
        for(int i = 1; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element is: " +max);
    }
}