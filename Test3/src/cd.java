/**
 * @Auther: 张伟
 * @Date: 2019/11/4
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
import java.util.*;

public class cd {
    //public class TestListSet{
        public static void main(String args[]){
            List list = new Vector();
            list.add("Hello");
            list.add("Learn");
            list.add("Hello");
            list.add("Welcome");
            Set set = new HashSet();
            set.addAll(list);
            System.out.println(set.size());
        }
    }

