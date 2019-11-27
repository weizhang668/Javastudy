/**
 * @Auther: 张伟
 * @Date: 2019/11/20
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
import java.util.ArrayList;
import java.util.List;

public class Pet {
    public static void main(String[] args) {
        List&lt;? super Pet> list = new ArrayList&lt;>();

        list.add(new Cat());


        list.add(new Dog());

    }

}

class Cat extends Pet {

}

class Dog  extends Pet {

}
