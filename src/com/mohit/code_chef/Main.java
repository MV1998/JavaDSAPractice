package com.mohit.code_chef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        FastReader fastReader = new FastReader();
        int tc = fastReader.nextInt();
        int[] array = new int[tc];
        StringTokenizer stringTokenizer = new StringTokenizer(fastReader.nextLine());
        for (int i = 0; i < tc; i++) {
            array[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        for (int i = 0; i < tc; i++) {
            System.out.println(array[i]);
        }
    }
    public static int getFactorial(int num) {
        if (num == 0) return 1;
        return num * getFactorial(num-1);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
