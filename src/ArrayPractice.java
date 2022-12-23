import java.util.Arrays;

public class ArrayPractice {
    static int [] numbers1;
    static void sorting (int[] numbers){
        numbers1=numbers;

        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                int temp=0;
                if(numbers[i]>numbers[j]){
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
            System.out.print(numbers[i]+" ");
        }

    }

    public static void main(String[] args) {
        int [] numbers={3,4,9,1,5,6,15,15,71,11,55,22,3,88,14,19,82,15};
        sorting(numbers);
        //System.out.println(Arrays.toString(numbers));
    }

}
