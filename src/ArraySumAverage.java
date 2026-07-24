public class ArraySumAverage {
    public static void main(String[] args) {


        int[] numbers = {100,500,200,6};
        int  sum = 0;
        for(int n: numbers){
            sum=sum+n;

        }
        double average = sum/numbers.length;
        System.out.println("sum:"+sum);
        System.out.println("average:"+average);

    }
}
