package Lab01;

public class Soal02 {
    public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Enter 4 number inputs
    System.out.print("Enter the first number : ");
    int i = input.nextInt();

    System.out.print("Enter the second number: ");
    int j = input.nextInt();

    System.out.print("Enter the third number : ");
    int k = input.nextInt();

    System.out.print("Enter the fourth number: ");
    int l = input.nextInt();

    //Calculating the maximum and minimum numbers
    int max = i;
    int min = i;

    if (j > max){
        max = j;
    }
    if (k > max){
        max = k;
    }
    if (l > max){
        max = l;
    }
    
    if (j < min){
        min = j;
    }
    if (k < min){
        min = k;
    }
    if (l < min){
        min = l;
    }

    //Printing the maximum and minimum numbers
    System.out.println("The maximum number is: " + max);
    System.out.println("The minimum number is: " + min);
    }
}
