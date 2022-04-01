package Arrays09;

import java.util.Scanner;
public class Class13 {

    public static void main(String[] args) {
           /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)
         */

        Scanner scanner = new Scanner(System.in);
        int arr[]=new int[8];


        for (int i = 0; i <8;i++){
            System.out.print(i+1+". number: ");
             arr[i]=scanner.nextInt();
        }

        System.out.println("The total number that can evenly devided to 3 is: " + diveded3(arr));
    }

    public static int diveded3(int[] arr) {

        int count = 0;
        for (int each:arr
             ) {
            if(each%3==0) count++;
        }
        return count;
    }
}
