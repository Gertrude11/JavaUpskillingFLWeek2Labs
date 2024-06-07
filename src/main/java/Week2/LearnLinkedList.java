package Week2;

import java.util.LinkedList;
import java.util.Scanner;

public class LearnLinkedList {
    /*
     *linked list are linear DS where each element stores 2 nodes(head and tail), one for data and other for pointer to location of the another element
     * below there is application that shows some methods used in linked list
     * */
    static  LinkedList<String> names = new LinkedList<>();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to easy calling\n==========================\n");
        int choice;
        do{
            System.out.println("1. Add name ");
            System.out.println("2. Remove name ");
            System.out.println("3. Print names ");
            System.out.println("4. Search name");
            System.out.println("5. size");
            System.out.println("6. update name");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");

            choice = sc.nextInt();
            switch (choice){
                case 1:
                    addName(sc);
                    break;
                case 2:
                    removeName(sc);
                    break;
                case 3:
                    printName(names);
                    break;
                case 4:
                    searchName(sc);
                    break;
                case 5:
                    sizeofList();
                    break;
                case 6:
                    updateName(sc);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while (choice!=0);
    }
    //method for adding new name
    public static void addName(Scanner sc){
        System.out.println("Enter Name: ");
        String name = sc.next();
        names.add(name);
    }
    //method for removing name
    public static void removeName(Scanner sc){
        System.out.println("Enter index of name you want to delete");
        int index = sc.nextInt();
        names.remove(index);
        if(true){
            System.out.println("Successfully deleted");
        }
    }
    //method for printing names
    public static void printName(LinkedList<String> names){
        //one way you can print them
        System.out.println("List of names"+names);

        //another way
        for (int i=0; i<names.size(); i++){
            System.out.println(names.get(i) );
        }
    }
    //size of list
    public static void sizeofList(){
        int sizeOfLinkedList = names.size();
        System.out.println("Size of linked list is:" + sizeOfLinkedList);
    }
    //search a name
    public static void searchName(Scanner sc){
        System.out.println("Searching name: ");
        String name = sc.next();
        if (names.contains(name)){
            System.out.println("Successfully found " + name);
        } else{
            System.out.println("Not found " + name);
        }
    }
    //update name
    public static void updateName(Scanner sc){
        System.out.println("Enter index of name you want to update");
        int index = sc.nextInt();
        names.get(index);
        System.out.println("Enter new name: ");
        String newName = sc.next();
        names.set(index,newName);
    }
    public static void reverseName(){
        //declare a name
    }
}

