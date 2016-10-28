package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int parametr = Integer.parseInt(bf.readLine());

		ArrayList<Integer> list = fibonacci(parametr);
		for (int a : list) {
			System.out.println(a);

		}
	}

	public static ArrayList<Integer> fibonacci(int parametr) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		int sum;
		int i = 0;
		for (;;) {
			sum = list.get(i) + list.get(i + 1);
			i++;
			if (sum <= parametr) {
				list.add(sum);
			} else
				break;
		}

		return list;
	}

}
