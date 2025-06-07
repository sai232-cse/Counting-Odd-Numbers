import java.util.Scanner;
public class CountingOddNumbers{
    public static void main(String args[]){
        Scanner snr=new Scanner(System.in);
	System.out.println("Enter the start value");
        int start=snr.nextInt();
	System.out.println("Enter the end value");
        int end=snr.nextInt();
        int count=0;
        for(int i=start;i<=end;i++){
            if(i%2!=0){
                count++;
            }
        }
	System.out.println("The total number of odd numbers present between " + start + " and " + end + " is: ");
        System.out.println(count);
    }
}