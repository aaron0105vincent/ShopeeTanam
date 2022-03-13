import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    private static int[][] array;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String NM[] = br.readLine().trim().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        int array[][] = new int[N][M + 1];
        int arrayInv[][] = new int[N][M + 1];

        //T is the test case
        for (int i = 0; i < T; i++) {

            //PositionLeft or right
            boolean positionLeft = true;

            for (int j = 0; j < N; j++) {
                array[0][0] = 0;
                String[] arrayM = br.readLine().trim().split(" ");

                for (int k = 1; k < M + 1; k++) {
                    int integerM = Integer.parseInt(arrayM[(k - 1)]);
                    int integerInvM = Integer.parseInt(arrayM[M - k]);
                    int max = 0;


                    arrayInv[j][M] = 0;


                    //Make the sum for each step in a day
                    if (j == 0) {
                        array[j][k] = array[j][k - 1] + integerM;
                    } else if (j > 0) {
                        array[j][k] = array[j][k - 1] + integerM;
                        arrayInv[j][(M) - k] = arrayInv[j][(M + 1) - k] + integerInvM;
                    }
                }
            }
            System.out.println(recursion(array, arrayInv, N, M, 0));
        }

    }

    public int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int recursion(int[][] array, int[][] arrayInv, int n, int m, int start) {
        int max = 0;
        int index = 0;
        if (start < n) {
            for (int i = 0; i < m; i++) {
                if (max < array[start][i]) {
                    max = array[start][i];
                    index = i;
                }
            }
        }

        if (n != start) {
            //stay at start
            int case1 = (0 + recursion(array, arrayInv, n, m, start + 1));
            //move-go back to start
            int case2 = (max + recursion(array, arrayInv, n, m, start + 1));
            //move all the way
            int case3 = (array[start][m] + recursionInv(array, arrayInv, n, m, start + 1));

            if (case1 >= case2 && case1 >= case3) {
                return case1;
            } else if (case2 >= case1 && case2 >= case3) {
                return case2;
            } else {
                return case3;
            }
        } else {
            return max;
        }
    }

    public static int recursionInv(int[][] array, int[][] arrayInv, int n, int m, int start) {
        int max = 0;
        int index = 0;
        if (start < n) {
            for (int i = 0; i < m; i++) {
                if (max < arrayInv[start][i]) {
                    max = arrayInv[start][i];
                    index = i;
                }
            }
        }

        if (n != start) {
            //stay at start
            int case1 = (0 + recursionInv(array, arrayInv, n, m, start + 1));
            //move-go back to start
            int case2 = (max + recursionInv(array, arrayInv, n, m, start + 1));
            //move all the way
            int case3 = (array[start][m] + recursion(array, arrayInv, n, m, start + 1));

            if (case1 >= case2 && case1 >= case3) {
                return case1;
            } else if (case2 >= case1 && case2 >= case3) {
                return case2;
            } else {
                return case3;
            }

        } else {

            return max;
        }
    }
}

