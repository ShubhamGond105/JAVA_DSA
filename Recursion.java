import java.util.Scanner;
public class question {
    //Multiple Of Two Numbers
    static int mul(int x, int y){
        if (x<y) return mul(x,y);
        else if (y!=0) return (x +mul(x,y-1));
        else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(mul(x,y));

    }
}
