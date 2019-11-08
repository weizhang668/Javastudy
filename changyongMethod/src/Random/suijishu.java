package Random;

import java.util.Random;

/**
 * @Auther: 张伟
 * @Date: 2019/10/29
 * @Description: Random
 * @version: 1.0
 */
public class suijishu {
    public void random(){
        Random random=new Random();
        int[] ints=new int[54];

        ints[0]=random.nextInt(54);

        for(int i=1;i<ints.length;i++){
            int x=random.nextInt(54);
            ints[i]=x;
            //boolean flage;
            for(int j=1;j<i;j++){
                while (ints[i]==ints[j]){
                    i--;
                    break;
                }

            }
        }


    }
}
