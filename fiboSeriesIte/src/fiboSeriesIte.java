import java.util.*;
public class fiboSeriesIte
{
    public static void main(String[] args) {

        long n = 7, a = 0, b = 1;
        System.out.print("Fibonacci Series of "+ n +" numbers:");

        for (long i = 1; i <= n; ++i)
        {
            System.out.print(a+" ");

            long sumOfPrevTwo = a + b;
            a = b;
            b = sumOfPrevTwo;
        }
    }
}

