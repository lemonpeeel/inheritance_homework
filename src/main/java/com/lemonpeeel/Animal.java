package com.lemonpeeel;

public class Animal {

    String name;
    // Human 에 BMI 계산기 만들 예정이다.
    double weightInKilogram;
    double metricHeight;
    String food;

    boolean hungry;

    // 식사 관련 메소드로 만들 예정이다.
    public void eat() {
        if (hungry) {
        System.out.println(name + "이/가 " + food + "를 먹습니다.");}
    }








}
