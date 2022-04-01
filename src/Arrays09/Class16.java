package Arrays09;

public class Class16 {
    public static void main(String[] args) {
            /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */

/*        String input = "ade1r4d3";
        String[] arr = input.split("");

        int sum = 0;
        for (String each : arr
        ) {
            if (Character.isDigit(each.charAt(0))) sum += Integer.parseInt(each);
        }
        System.out.println("The sum of the digits in the String is = " + sum);*/


       String input = "ade1r4d3";
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) sum +=Character.getNumericValue(input.charAt(i));
        }

        System.out.println("The sum of the digits in the String is = " + sum);

    }
}
