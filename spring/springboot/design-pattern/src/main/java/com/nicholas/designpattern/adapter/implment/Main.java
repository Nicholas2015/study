package com.nicholas.designpattern.adapter.implment;

public class Main {

    public static void main(String[] args) {
        Print p = new PrintBanner("nicholas");

        p.printWeak();
        p.printStrong();
    }
}
