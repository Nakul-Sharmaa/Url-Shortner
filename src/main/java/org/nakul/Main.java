package org.nakul;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        URLShortener urlShortener = new URLShortener();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Shorten URL");
            System.out.println("2. Expand URL");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter long URL: ");
                    String longURL = scanner.nextLine();
                    String shortURL = urlShortener.shortenURL(longURL);
                    System.out.println("Short URL: " + shortURL);
                    break;
                case 2:
                    System.out.print("Enter short URL: ");
                    String inputShortURL = scanner.nextLine();
                    String expandedURL = urlShortener.expandURL(inputShortURL);
                    System.out.println("Long URL: " + expandedURL);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
