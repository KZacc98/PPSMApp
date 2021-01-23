package com.example.studstacctraccv10nonandroidx;

public class ClassStat {

    private String className;
    private String gradeName;
    private double gradeValue;

    public ClassStat(String className, String gradeName, double gradeValue) {
        this.className = className;
        this.gradeName = gradeName;
        this.gradeValue = gradeValue;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public double getGradeValue() {
        return gradeValue;
    }

    public void setGradeValue(double gradeValue) {
        this.gradeValue = gradeValue;
    }

}
