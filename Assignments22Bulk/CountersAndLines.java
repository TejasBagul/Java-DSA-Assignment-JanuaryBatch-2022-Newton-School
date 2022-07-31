package Assignments.Assignments22Bulk;

import java.util.Scanner;

public class CountersAndLines {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long n, p, k;
        n = sc.nextLong();//counters
        p = sc.nextLong();//people
        k = sc.nextLong();//counter number we want to maximise
        long l = 1L, r = 10000000000L;

        while (l + 1 < r) {
            Long m = (l + r) / 2;//let there be m people at counter k
            if (get(m, k) + get(m, n - k + 1) - m > p)
                r = m;
            else l = m;
        }

        System.out.println((Long) l);
    }

    //cnt - counter, ed - people at counter k
    public static Long get(Long ed, Long cnt) {
        Long d = cnt;
        if (d > ed)
            d = ed;
        cnt -= d;
        return cnt + d * (2 * ed - d + 1) / 2; //number of people used
    }
}
