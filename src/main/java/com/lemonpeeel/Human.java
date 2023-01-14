package com.lemonpeeel;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner;


public class Human extends Mammal{
    Scanner scan = new Scanner(System.in);

    int age;
    String humanRight;
    String philosophy;


    public void study() {
        String discipline;
        int hour;
        int minute;

        System.out.println(name + "이/가 공부할 과목/주제를 입력하세요.");
        discipline = scan.nextLine();

        System.out.println("공부할 시간을 입력하세요.");

        System.out.println("시간: ");
        hour = Integer.parseInt(scan.nextLine());

        System.out.println("분: ");
        minute = Integer.parseInt(scan.nextLine());

        if (hour >=1 & minute >= 0) {
        System.out.println(MessageFormat.format("{0}이/가 {1}을/를 {2}시간 {3}분 동안 공부합니다.", name, discipline, hour, minute));}


        if (hour >= 4) {
            isTired = true;
            System.out.println("4시간 이상 공부하여 피로가 쌓였습니다.");
            this.sleep();

        }
    }


    public void belongToCommunity() {

        System.out.println(name + "의 나이를 입력해 주세요. (한국식 나이)");
        this.age = Integer.parseInt(scan.nextLine());

        if (1 <= age & 5 > age) {
            String[] socialCommunity = {"가정"};
            System.out.println("5세 미만 영아는 " + Arrays.toString(socialCommunity) + " 공동체에 속할 수 있습니다.");
        }
        else if (5 <= age & 8 > age) {
            String[] socialCommunity = {"가정", "유치원"};
            System.out.println("5세 이상 8세 미만 유아는 " + Arrays.toString(socialCommunity) + " 등의 공동체에 속할 수 있습니다.");
        }
        else if (8 <= age & 14 > age) {
            String[] socialCommunity = {"가정", "초등학교", "학원"};
            System.out.println("8세 이상 14세 미만 어린이는 " + Arrays.toString(socialCommunity) + " 등의 공동체에 속할 수 있습니다.");
        }
        else if (14 <= age & 17 > age) {
            String[] socialCommunity = {"가정", "중학교", "학원", "동아리"};
            System.out.println("14세 이상 17세 미만 청소년은 " + Arrays.toString(socialCommunity) + " 등의 공동체에 속할 수 있습니다.");
        }
        else if (17 <= age & 20 > age) {
            String[] socialCommunity = {"가정", "고등학교", "학원", "동아리", "아르바이트 근로처"};
            System.out.println("17세 이상 20세 미만 청소년은 " + Arrays.toString(socialCommunity) + " 등의 공동체에 속할 수 있습니다.");
        }
        else if (20 <= age & 130 > age) {
            System.out.println("성인은 경제 생산 활동에 참여하는 사회의 일원으로 활동할 수 있습니다.\n" +
                                       "남성은 군 복무의 의무가 있으며, 경우에 따라 공익 근무 요원으로 배치되거나 병역 면제를 받을 수 있습니다.");
        }
        else if (130 <= age) {
            System.out.println("보통 인간은 130살 이상 못 삽니다.");
            return;
        }
        else {
            System.out.println("한국식 나이는 0 이하일 수 없습니다.");
            return;
        }
    }

    public double calculateBMI(String firstString, String secondString) {

        weightInKilogram = Double.parseDouble(firstString);
        metricHeight = Double.parseDouble(secondString);

        double bodyMassIndex = weightInKilogram / Math.pow(metricHeight, 2);

        // 메인에 비만인지 아닌지 알려주는 코드 짤 예정이다.
        return bodyMassIndex;
    }




}
