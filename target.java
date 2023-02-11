import java.util.Scanner;
public class recursion_PW {
    //To find Index of array if target present return its index if not present return -1.
    static int index(int[] a, int n ,int target , int idx) {
        //Base case
        if (idx >= n) return -1;
        //self work
        if (a[idx] == target) return idx;
        //recursive work
        return index(a, n, target, idx + 1);
    }
    //To find element present or not in array if present return yes else return N0
    static boolean Search (int[] a, int n ,int target , int idx){
        //Base case
        if (idx>=n) return false;
        //self work
        if (a[idx]==target) return true;
        //recursive work
        return Search(a,n,target,idx+1);
        //or use if else but because of boolean return self true false statement
//        if (Search(a , target,idx+1)) {
//            return true;
//        }else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n= sc.nextInt();
        int [] a= new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter target");
        int target = sc.nextInt();
        if (Search(a,a.length,target,0)){
            System.out.println("Yes Target Present");
        }else {
            System.out.println("No Target Present");

        }
        System.out.print("Index of the Array = ");
        System.out.println(index(a,n,target,0));
    }
}
