import com.sun.jdi.IntegerType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = input.nextInt();

        if(n == 1 || n == 0){
            System.out.println( n + " está na sequência");
        }

        List<Integer> fibonacci = new ArrayList<Integer>();
        fibonacci.add(0);
        fibonacci.add(1);

        System.out.println(isIn(fibonacci, n) == true ? n + " está na sequência" : n + " não está na sequência");

    }

    public static boolean isIn(List<Integer> fibonacci, Integer n) {
        for (int i = 2; i <= 1000; i++) {
            fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
            if (fibonacci.get(i) == n) {
                return true;
            }
            else if (fibonacci.get(i) < n) {
                continue;
            }
            else {
                return false;
            }
        }
        return false;
    }
}
