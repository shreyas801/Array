public class ArrayScores{
    public static void main(String[] args) {
        int[] scores = {97,81,41,35,10};
        int sum=0;
        int max = scores[0];
        int min = scores[0];
        for(int score:scores)
        {
            sum += score;
        }

        int average = sum/5;

        System.out.println("Sum is:"+sum);
        System.out.println("Average is:"+average);

        for(int score:scores){
            if(max < score)
            {
                max = score;
            }
            if(min > score)
            {
                min = score;
            }
        }
        System.out.println("Maximum is:"+max);
        System.out.println("Minimum is:"+min);
    }
}