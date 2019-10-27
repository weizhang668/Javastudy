package com.banyuan.practice.packaging10;

/**
 * @Auther: 张伟
 * @Date: 2019/10/27
 * @Description: com.banyuan.practice.packaging10
 * @version: 1.0
 */
public class Grade {
    private String className;
    private int classId;

    public Grade() {
    }

    public Grade(String className, int classId) {
        this.className = className;
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "className='" + className + '\'' +
                ", classId=" + classId +
                '}';
    }
}
