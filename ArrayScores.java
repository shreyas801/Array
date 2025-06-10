public class ArrayScores{
    public static void main(String[] args) {
        int[] scores = {97,81,41,35,10};
        int sum=0;
        for(int score:scores)
        {
            sum += score;
        }

        int average = sum/5;

        System.out.println("Sum is:"+sum);
        System.out.println("Average is:"+average);
    }
}