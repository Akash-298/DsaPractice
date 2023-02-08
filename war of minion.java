
import java.util.*;
import java.io.*;

class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        // int k = sc.nextInt();
        String dt = sc.nextLine();
        // int[] a = new int[n];

        // for(int i=0;i<n;i++){
        // a[i] = sc.nextInt();
        // }
        // call(a,n,k);
        System.out.println(nions(dt));
    }

    static String nions(String s) {

        // System.out.println(s);
        Stack<Character> tack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (!tack.empty() && tack.peek() == c) {

                tack.pop();
            } else {

                tack.push(c);
            }
        }
        if (tack.empty()) {
            return "-1";
        }
        StringBuilder sb = new StringBuilder();
        while (!tack.empty()) {

            sb.append(tack.pop());

        }
        return sb.reverse().toString();
    }
}
