public class ArrayPractice {
    public static void main(String[] args) {
        
        int[] numbers = {10,20,30,40,50};
    
    int max = numbers[0];
    for(int n : numbers){

        if(n>max){
            max =n;
        }
    }
    System.out.println("Maximum value: " + max);

    }


}