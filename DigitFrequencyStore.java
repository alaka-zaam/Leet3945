import java.util.Scanner;
class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(digitFrequencyScore(n));
    }
    public static int digitFrequencyScore(int n) {
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++)
            arr[i] = 0;
        int t = n;
        while (t != 0) {
            int dg = t % 10;
            arr[dg]++;
            t /= 10;
        }
        int score = 0;
        for (int i = 1; i < 10; i++) {
            score += i * arr[i];
        }
        return score;
    }
}