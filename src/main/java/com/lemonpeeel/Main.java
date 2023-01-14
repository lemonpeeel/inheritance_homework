package com.lemonpeeel;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Human human = new Human();

        System.out.println("이름을 입력해 주세요.");
        human.name = scan.nextLine();


        human.belongToCommunity();
        human.study();





    }
}