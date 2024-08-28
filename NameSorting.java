package java0919;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class NameSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number of names: ");
		        int numberOfNames = scanner.nextInt();
		        scanner.nextLine();  
		        List<String> names = new ArrayList<>();
		        System.out.println("Enter the names:");
		        for (int i = 0; i < numberOfNames; i++) {
		            names.add(scanner.nextLine());
		        }
		        System.out.print("Enter 1 for Ascending order or 2 for Descending order: ");
		        int choice = scanner.nextInt();
		        if (choice == 1) {
		            Collections.sort(names);
		            System.out.println("Names sorted in Ascending order:");
		        } else if (choice == 2) {
		            Collections.sort(names, Collections.reverseOrder());
		            System.out.println("Names sorted in Descending order:");
		        } else {
		            System.out.println("Invalid choice. Please enter 1 or 2.");
		            return;
		        }
		        for (String name : names) {
		            System.out.println(name);
		        }

		        scanner.close();
		    }
		}

