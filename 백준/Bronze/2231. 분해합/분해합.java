import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        int result = 0;
 
        for(int i=1; i<n; i++){
            int sum = 0;
            int number = i;
            while(number != 0){
                sum += number%10;
                number = number/10;
            }
 
            if(sum+i == n){
                result = i;
                break;
            }
        }
 
        System.out.println(result);
    }
}