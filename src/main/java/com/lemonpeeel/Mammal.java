package com.lemonpeeel;
import java.util.Scanner;
public class Mammal extends Animal {

    boolean sleepy;
    boolean thirsty;


    public void viviparousBirth() {
        this.name = name;

        System.out.println(name + " gives birth to babies.");
    }

    public void MaintainBodyTemperature() {
        Scanner scan = new Scanner(System.in);

        double AmbientTemperature;
        AmbientTemperature = Double.parseDouble(scan.nextLine());

        if (AmbientTemperature <= 15) {
            System.out.println(new StringBuilder().append("모세혈관이 수축합니다.\n")
                                                  .append("서늘함을 느낍니다.")
                                                  .toString());
        } return;
    }
    public void sleep() {
        if (sleepy){
            System.out.println(name + "이/가 잠을 잡니다.");}
    }

    public void drink() {
        if (thirsty){
            System.out.println(name + "이/가 물을 마십니다.");}
    }




}
