import java.util.*;

public class CheckString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = { "srk", "ramu", "raju", "mohan", "karachi", "rahul", "mary","david" };
        System.out.println(isCheck(arr, n));
    }

    public static int isCheck(String arr[], int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == n) {
                count++;
            }
        }
        return count;
    }
}
