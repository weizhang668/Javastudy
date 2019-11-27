package Controllor;

import Server.serverDemo;
import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.org.apache.xpath.internal.objects.XStringForChars;
import entity.Question;

import java.util.*;

/**
 * @Auther: 张伟
 * @Date: 2019/11/21
 * @Description: Controllor
 * @version: 1.0
 */
public class method {
    //登陆方法
    public static boolean dengluus(String name, char[] pw) {
        boolean flag = false;
        String password = new String(pw);
        //接受客户端的登陆信息 id，password
        for (String keyname : serverDemo.userInfo.keySet()) {
            System.out.println(keyname);
            if (keyname.equals(name)) {
                String p = serverDemo.userInfo.get(keyname);
                System.out.println(p);
                if (p.equals(password)) {
                    flag = true;
                    break;
                }
            }
        }
        System.out.println(flag);
        return flag;

    }

    public static boolean denglustu(String name, char[] pw) {
        boolean flag = false;
        String password = new String(pw);
        //接受客户端的登陆信息 id，password
        for (String keyname : serverDemo.stuInfo.keySet()) {
            System.out.println(keyname);
            if (keyname.equals(name)) {
                String p = serverDemo.stuInfo.get(keyname);
                System.out.println(p);
                if (p.equals(password)) {
                    flag = true;
                    break;
                }
            }
        }
        System.out.println(flag);
        return flag;

    }



//    public static boolean dengluus(String name, char[] pw) {
//        boolean flag = false;
//        String password = new String(pw);
//        //接受客户端的登陆信息 id，password
//        for (int i = 0; i < serverDemo.userInfo.size(); i++) {
//            Set<String> setid = serverDemo.userInfo.keySet();
//
//            Iterator it = setid.iterator();
//            if (it.hasNext()) {
//                Object j = it.next();
//                String k = (String) j;
//                if (k.equals(name)) {
//                    String p = serverDemo.userInfo.get(j);
//                    if (p.equals(password)) {
//                        flag = true;
//                        break;
//                    }
//                }
//            } else {
//                flag = false;
//            }
//
//
//        }
//        return flag;
//    }

//    public static boolean denglustu(String name, char[] pw) {
//        boolean flag = false;
//        String password = new String(pw);
//        //接受客户端的登陆信息 id，password
//        for (int i = 0; i < serverDemo.stuInfo.size(); i++) {
//            Set<String> setid = serverDemo.stuInfo.keySet();
//
//            Iterator it = setid.iterator();
//            if (it.hasNext()) {
//                Object j = it.next();
//                String k = (String) j;
//                if (k.equals(name)) {
//                    String p = serverDemo.stuInfo.get(j);
//                    if (p.equals(password)) {
//                        flag = true;
//                        break;
//                    }
//                }
//            } else {
//                flag = false;
//            }
//
//
//        }
//        return flag;
//    }
}