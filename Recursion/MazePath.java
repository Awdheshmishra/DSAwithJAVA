package Recursion;
import java.util.Scanner;
public class MazePath {
    public static int maze(int row, int col, int m, int n){
        if(row == m || col == n) return 1;
        int rightways =  maze(row, col+1,m,n);
        int downways = maze(row+1, col, m,n);
        return rightways + downways;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        System.out.println("enter m: ");
        int m = sc.nextInt();
        System.out.println(maze(1,1,m,n));
    }
}
/*
ye batata hai ki ham matrics me kitne no. of times me tareget par pahuch skate
agar starting element 1st aur last wala end par ho to aur 2 ways rhte hain isme
        ya to ham rightways choose krenge ya downways*/
