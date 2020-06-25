package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.print("Quantos produtos você deseja cadastrar? ");
		int N = sc.nextInt();

		System.out.println();

		for (int i = 1; i <= N; i++) {
			System.out.println("Produto número #" + i);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Preço: R$ ");
			double price = sc.nextDouble();

			Product product = new Product(name, price);
			list.add(product);

			System.out.println();
		}

		list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));

		for (Product p : list) {
			System.out.println(p);
		}

		sc.close();

	}

}
