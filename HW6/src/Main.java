import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arrMenu = new int[size];
        boolean inWhile = true;
        boolean arrIsUsed = false;
        while (inWhile) {
            System.out.println("Menu:");
            System.out.println("a. Accept elements of an array");
            System.out.println("b. Display elements of an array");
            System.out.println("c. Search the element within array");
            System.out.println("d. Sort the array");
            System.out.println("0 to exit");
            System.out.print("Enter your choice: ");
            try {
                char choice = input.next().toCharArray()[0];
                switch (choice) {
                    case '0':
                        inWhile = false;
                        break;
                    case 'a':

                        if (!arrIsUsed) {
                            System.out.println("Enter " + arrMenu.length + " elements:");

                                for (int i = 0; i < arrMenu.length; i++) {
                                    try {
                                        arrMenu[i] = input.nextInt();
                                    }catch (InputMismatchException e ){
                                        e.toString();
                                    }catch (ArrayIndexOutOfBoundsException e){
                                        e.toString();
                                    }
                                }

                            arrIsUsed = true;
                            break;
                        } else {
                            System.out.println("Array is already filled");
                            break;
                        }
                    case 'b':
                        if (arrMenu.length == 0) {
                            System.out.println("Array is empty ");
                            break;
                        } else {
                            System.out.print("Elements of the array are: ");
                            for (int i : arrMenu) {
                                System.out.print(i + " ");
                            }
                            System.out.println();
                        }
                        break;
                    case 'c':
                        if (arrMenu.length == 0) {
                            System.out.println("Array is empty ");
                            break;
                        } else {
                            System.out.print("Enter the element to search: ");
                            try {
                                int element = input.nextInt();

                            boolean found = false;
                            for (int i : arrMenu) {
                                if (i == element) {
                                    found = true;
                                    break;
                                }
                            }

                            if (found) {
                                System.out.println("Element found in the array.");
                            } else {
                                System.out.println("Element not found in the array.");
                            }
                            }catch (InputMismatchException e){
                                e.toString();
                            }
                        }
                        break;
                    case 'd':
                        if (arrMenu.length == 0) {
                            System.out.println("Array is empty ");
                            break;
                        } else {
                            Arrays.sort(arrMenu);
                            System.out.println("Array has been sorted.");
                            break;
                        }
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }catch (InputMismatchException e){
                e.toString();
            }
        }

    }
}