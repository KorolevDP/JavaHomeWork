package Task_01;

import java.util.Random;
public class CreateRandomArray {
        public static int[] NewRandomArray(){
            int length = 20;
            int[] nums = new int[length];

            Random rnd = new Random();

            for (int i = 0; i < length; i++){
                nums[i] = rnd.nextInt(50);
            }
            return nums;
        }
}