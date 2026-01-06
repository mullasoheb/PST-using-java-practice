import java.util.Scanner;

class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 3, 5, 7, 9, 12, 15};
        int n = arr.length;

        System.out.print("Enter target Element: ");
        int target = sc.nextInt();

        int low = 0;
        int high = n - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index " + mid);
                found = true;
                break;
            } 
            else if (target > arr[mid]) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not Found!");
        }

        sc.close();
    }
}
