package Arrays09;

public class Class07 {
    public static void main(String[] args) {

        /* TASK :
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,-3},{41,55},{-61,-17,80}}
         * Output : 8
         */

        int[][]arr={{1,2,-3},{41,55},{-61,-17,80}};

        System.out.println(maxValue(arr));
    }

    public static int maxValue(int[][] arr) {
        int max=Integer.MIN_VALUE;
        for (int[] each:arr) {
            for (int ara:each) {
                if(ara>max) max=ara;
            }
        }
        return max;


    }
}
