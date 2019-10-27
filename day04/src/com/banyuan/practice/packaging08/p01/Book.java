package com.banyuan.practice.packaging08.p01;

/**
 * @Auther: 张伟
 * @Date: 2019/10/25
 * @Description: com.banyuan.practice.packaging.p01
 * @version: 1.0
 */
public class Book {
    private String title;
    private int pageNum=200;

    public Book() {
    }

    public Book(String title, int pageNum) {
        this.title = title;
        this.pageNum = pageNum;
    }

    public static void detail(Book[] book){
        /*
        *detail：书籍数组的遍历
        *book表示存储的书籍数组
        */
        for(int i=0;i<book.length;i++){
            System.out.println(book[i].toString());

        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        if (pageNum>=200){
            this.pageNum = pageNum;
        }else{
            System.out.println("书籍页数不能小于200。");
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageNum=" + pageNum +
                '}';
    }
}
