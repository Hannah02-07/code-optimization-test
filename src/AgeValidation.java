import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        final int AGE_LIMIT =18;
        Scanner scanner=new Scanner(System.in);

    System.out.println(" ingresa tu edad, por favor");
    int age = scanner.nextInt();
        
        if (age >= AGE_LIMIT) {
            System.out.println("Access granted");
        }
        
        else{ 
            System.out.println("Access denied");
        }
    }
}
