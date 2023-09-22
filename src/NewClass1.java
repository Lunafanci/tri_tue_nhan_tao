import java.io.*;
import java.util.*;

public class NewClass1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        int N = Integer.parseInt(br.readLine());
        String[] strNums = br.readLine().split(" ");
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = Integer.parseInt(strNums[i]);
        }
        Arrays.sort(X);
        List<Integer> tom_toys = new ArrayList<>();
        List<Integer> jerry_toys = new ArrayList<>();
        for (int i = N - 1; i >= 0; i--) {
            if (sum(tom_toys) <= sum(jerry_toys)) {
                tom_toys.add(X[i]);
            } else {
                jerry_toys.add(X[i]);
            }
        }
        System.out.println("Danh sach do choi cua Tom: " + tom_toys);
        System.out.println("Danh sach do choi cua Jerry: " + jerry_toys);
        System.out.println("Chenh lech tong gia tri do choi: " + Math.abs(sum(tom_toys) - sum(jerry_toys)));
    }

    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
}
