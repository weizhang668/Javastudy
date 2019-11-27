package entity;

/**
 * @Auther: 张伟
 * @Date: 2019/11/20
 * @Description: entity
 * @version: 1.0
 */
public class Question {

    private String title;
    private String answer;


    public Question() {
    }

    public Question(String title, String answer) {
        this.title = title;
        this.answer = answer;
    }
    public String getAnswer() {
        return answer;
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}


//    //重写Question类中的两个方法  equals  hashCode
//    //想要将Question集合存入HashSet集合中，让set集合帮我们去掉重复元素
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj instanceof Question) {
//            Question anotherQuestion = (Question) obj;
//            String thisTitle = title.substring(0, title.indexOf("<br>"));
//            String anotherTitle = anotherQuestion.getTitle().substring(0, anotherQuestion.getTitle().indexOf("<br>"));
//            if (thisTitle.equals(anotherTitle)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return title.substring(0, title.indexOf("<br>")).hashCode();
//    }



