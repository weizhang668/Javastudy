package zw;

import java.io.*;
import java.util.List;

/**
 * @Auther: 张伟
 * @Date: 2019/11/5
 * @Description: com.banyuan.practice.p01
 * @version: 1.0
 */
public class IOp01 {
    public static void main(String[] args) throws IOException, InterruptedException {
        File file=new File("/Users/edz/Desktop/zw");
        File file2=new File("2.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        if (!file2.exists()){
            file2.createNewFile();
        }

        List<File> list=FileList.getFileList(file);
        for (File f:list) {
            String s=f.getPath();
            //System.out.println(s.toString());
            if (s.endsWith(".doc")){
                InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream(f),"utf-16");
                //InputStream inputStream=new FileInputStream(f);
                //OutputStream outputStream=new FileOutputStream("2.txt",true);
                OutputStreamWriter outputStreamWriter=new OutputStreamWriter(new FileOutputStream("2.txt",true),"utf-8");
                //byte[] bytes=new byte[(int) f.length()];
                char[] chars=new char[(int) f.length()];
                //inputStream.read(bytes);
                inputStreamReader.read(chars);
                System.out.println(new String(chars));
                System.out.println("===============");
                //outputStream.write(bytes);
                outputStreamWriter.write(chars);
                //outputStream.flush();
                Thread.sleep(1000);
                //outputStream.close();
                outputStreamWriter.close();
                inputStreamReader.close();


            }
        }




    }
}
