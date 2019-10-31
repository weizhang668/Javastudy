package com.banyuan.practice.p04;

import java.util.Scanner;

/**
 * @Auther: 张伟
 * @Date: 2019/10/30
 * @Description: com.banyuan.practice.p04
 * @version: 1.0
 */
/*题目
*编写敏感词过滤器。比如:恐怖 爆炸 性 枪 军火 色情 等 如果出现这些字眼
* 就用**代替,输入一句话其中包含敏感字符 最终输出屏蔽之后的数据
*/
public class p04 {
    public static void main(String[] args) {
        System.out.println("输入：");
        Scanner scanner=new Scanner(System.in);
        char[] chars = getChars(scanner);

        String s=new String(chars);
        System.out.println(s);
    }

    private static char[] getChars(Scanner scanner) {
        String string=scanner.next();
        char[]chars= string.toCharArray();
        for(int i=0;i<chars.length-1;i++){
            if (chars[i]=='恐'&&chars[i+1]=='怖'){
                chars[i]='*';
                chars[i+1]='*';
            }
            if (chars[i]=='爆'&&chars[i+1]=='炸'){
                chars[i]='*';
                chars[i+1]='*';
            }
            if (chars[i]=='军'&&chars[i+1]=='火'){
                chars[i]='*';
                chars[i+1]='*';
            }
            if (chars[i]=='色'&&chars[i+1]=='情'){
                chars[i]='*';
                chars[i+1]='*';
            }
            if (chars[i]=='性'){
                chars[i]='*';
                //chars[i+1]='*';
            }
            if (chars[i]=='枪'){
                chars[i]='*';
                //chars[i+1]='*';
            }

        }
        return chars;
    }
}
