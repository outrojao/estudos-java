package estudos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Crud {
	
	public static void saveProducts(List<Product> products) {
	    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("products.txt"))) {
	        for (Product product : products) {
	            bufferedWriter.write(product.toString());
	            bufferedWriter.newLine();
	        }
	    } catch (IOException e) {
	        System.out.println(e);
	    }
	}
	
	public static void readProducts() {
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader("products.txt"))){
			String line = bufferedReader.readLine();
			while (line != null) {
				System.out.printf("%s\n", line);
			    line = bufferedReader.readLine();
			}
		} catch (IOException e) {
	        System.out.println(e);
	    }
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> products = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("MENU:");
			System.out.println("1 - Add new product");
			System.out.println("2 - Remove product");
			System.out.println("3 - Edit product's info");
			System.out.println("4 - List all products");
			System.out.println("0 - Exit");
			
			int option = -1;
            try {
                option = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("PLEASE ENTER A VALID MENU OPTION!");
                sc.nextLine();
            }
			
            System.out.println();
			switch(option) {
				case 1:
					Product newProduct = new Product();
					String name;
					double price;
					int quantity;
					
					while(true) {
						try {
							System.out.print("Name: ");
							name = sc.nextLine();
							if(name.equals("")) {
								throw new IllegalArgumentException("THE NAME OF THE PRODUCT SHOULDN'T BE EMPTY!");
							}
							
							System.out.print("Price: ");
							price = sc.nextDouble();
							if(price < 0) {
								throw new IllegalArgumentException("THE PRICE OF THE PRODUCT SHOULDN'T BE NEGATIVE!");
							}
							
							
							System.out.print("Quantity: ");
							quantity = sc.nextInt();
							if(quantity < 0) {
								throw new IllegalArgumentException("THE QUANTITY OF THE PRODUCT SHOULDN'T BE NEGATIVE!");
							}
							
							sc.nextLine();
							break;
						} catch(InputMismatchException e){
							System.out.println("PLEASE ENTER THE CORRECT TYPE DATA FOR THE NEW PRODUCT!");
							sc.nextLine();
						} catch(IllegalArgumentException e) {
							System.out.println(e.getMessage());
						}
					}
					
					newProduct.name = name;
					newProduct.price = price;
					newProduct.quantity = quantity;
					products.add(newProduct);
					System.out.printf("%n%s WAS ADD%n%n", newProduct.name.toUpperCase());
					break;
				case 2:
					System.out.print("ENTER THE ID OF THE PRODUCT THAT SHOULD BE REMOVED: ");
					int productRemovedId = sc.nextInt();
					System.out.printf("%n%s WAS REMOVED%n%n", products.get(productRemovedId - 1).getName().toUpperCase());
					products.remove(productRemovedId - 1);
					break;
				case 3:
					System.out.print("ENTER THE ID OF THE PRODUCT THAT SHOULD BE EDITED: ");
					int productEditedId = sc.nextInt();
					Product productEdited = products.get(productEditedId - 1);
					
					System.out.println();
					System.out.println("DATA TO EDIT:");
					System.out.println("1 - Name");
					System.out.println("2 - Price");
					System.out.println("3 - Quantity");
					System.out.println("0 - Exit");
					
					int dataOption = -1;
		            try {
		            	dataOption = sc.nextInt();
		                sc.nextLine();
		            } catch (InputMismatchException e) {
		                System.out.println("PLEASE ENTER A VALID MENU OPTION!");
		                sc.nextLine();
		            }
					
		            System.out.println();
					switch(dataOption) {
						case 1:
							System.out.printf("ENTER THE NEW NAME: ");
							String newName = sc.nextLine();
							productEdited.setName(newName);
							break;
						case 2:
							System.out.printf("ENTER THE NEW PRICE: ");
							double newPrice = sc.nextDouble();
							productEdited.setPrice(newPrice);
							break;
						case 3:
							System.out.printf("ENTER THE NEW QUANTITY: ");
							int newQuantity = sc.nextInt();
							productEdited.setQuantity(newQuantity);
							break;
						case 0:
							System.out.println();
							break;
					}
					
					System.out.printf("%nPRODUCT %d WAS EDITED%n%n", productEdited.getId());
					break;
				case 4:
					if(!products.isEmpty()) {
						System.out.println("YOUR PRODUCTS LIST:");
						for(Product product : products) {
							System.out.println(product);
						}
					} else {
						System.out.println("YOUR PRODUCTS LIST ARE EMPTY!");
					}
					System.out.println();
					break;
//				case 5:
//					readProducts();
				case 0:
					sc.close();
					saveProducts(products);
					System.out.println("EXITING PROGRAM...");
					return;
				default:
					System.out.println("INVALID MENU OPTION!");
					break;
			}
		}
	}

}
