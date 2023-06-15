package Task_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateRandomIntList {
public static List<Integer> RandomNumList(){
            Random rnd=new Random();
            List<Integer> iList= new ArrayList<>();

            for (int i = 0; i < 30; i++){
            iList.add(rnd.nextInt());
        }
    return iList;
}
}