import java.util.Scanner;
class CheckEvenOrOdd{
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter Number : ");
        num = sc.nextInt();

        if(num % 2 == 0){
            System.out.print(num + " is Even ");
        }else{
            System.out.print(num + " is Odd ");
        }
    }
}