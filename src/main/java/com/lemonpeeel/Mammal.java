package com.lemonpeeel;
import java.util.Scanner;
public class Mammal extends Animal {

    Scanner scan = new Scanner(System.in);
    boolean isTired;
    boolean isThirsty;


    public void viviparousBirth() {
        this.name = name;

        System.out.println(name + " gives birth to babies.");
    }

    public void maintainBodyTemperature() {


        double AmbientTemperature;
        AmbientTemperature = Double.parseDouble(scan.nextLine());

        if (AmbientTemperature <= 15) {
            System.out.println(new StringBuilder().append("모세혈관이 수축합니다.\n")
                                                  .append("서늘함을 느낍니다.")
                                                  .toString());
        }
        return;
    }
    public void sleep() {
        if (isTired = true){
            System.out.println(name + "이/가 휴식을 취합니다.\n" +
                                       "zzz... zzz... zzz...");
            isTired = false;
            System.out.println("피로가 회복되었습니다.");
        }
        else {
            System.out.println("아직 피곤하지 않아 쉴 필요가 없습니다.");
        }
    }

    public void drink() {
        if (isThirsty){
            System.out.println(name + "이/가 물을 마십니다.");
            isThirsty = false;
            System.out.println("꿀꺽\n" +
                                       "갈증이 해소되었습니다.");
        }
        else {
            System.out.println("아직 목이 마르지 않습니다. 하지만 물은 자주 섭취해야 합니다.\n" +
                                       name + "이/가 물을 마십니다.\n" +
                                       "꿀꺽\n");
        }
    }




}
