import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) throws MyFirstException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int firstNumber = sc.nextInt();
        System.out.println("enter 2nd number:");
        int secondNumber = sc.nextInt();
        int sum = firstNumber+secondNumber;
        try{
            if(sum<150){
                throw new MyFirstException("Custom Exception Occured");
            }
            else {
                System.out.println("sum = " + sum);
            }
        }
        catch (MyFirstException e){
            System.out.println(e);
        }
    }
    }

