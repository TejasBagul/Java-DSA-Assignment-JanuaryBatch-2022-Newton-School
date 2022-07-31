package Assignments;


import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;

public class BuildingTower {
    public static void main(String[] ARGS) {
//        new Thread(null, () -> new Main().solve(), "1", 1 << 26).start();
    }

    static void solve() {
        InputStream IS = System.in;
        OutputStream OS = System.out;
        ScanReader in = new ScanReader(IS);
        PrintWriter out = new PrintWriter(OS);
        DiskTower disktower = new DiskTower();
        disktower.solve(in, out);
        out.close();
    }

    static class DiskTower {
        public void solve(ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            int current_need = n;
            PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
            for (int i = 0; i < n; i++) {
                int x = in.scanInt();
                if (current_need == x) {
                    out.print(x + " ");
                    current_need--;

                    while (!queue.isEmpty() && current_need == queue.peek()) {
                        out.print(queue.poll() + " ");
                        current_need--;
                    }
                } else {
                    queue.add(x);
                }

                out.println();
            }
        }

    }

    static class ScanReader {
        private final byte[] buf = new byte[4 * 1024];
        private int index;
        private final BufferedInputStream in;
        private int Total_Char;

        public ScanReader(InputStream inputStream) {
            in = new BufferedInputStream(inputStream);
        }

        private int scan() {
            if (index >= Total_Char) {
                index = 0;
                try {
                    Total_Char = in.read(buf);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (Total_Char <= 0) return -1;
            }
            return buf[index++];
        }

        public int scanInt() {
            int integer = 0;
            int n = scan();
            while (isWhiteSpace(n)) n = scan();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = scan();
            }
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    integer *= 10;
                    integer += n - '0';
                    n = scan();
                }
            }
            return neg * integer;
        }

        private boolean isWhiteSpace(int n) {
            return n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1;
        }

    }
}
