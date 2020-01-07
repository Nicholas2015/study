package com.nicholas.designpattern.template;

public class Main {

    public static void main(String[] args) {
        AbstractDisplay charDisplay = new CharDisplay('N');
        AbstractDisplay stringDisplay = new StringDisplay("Hello,World!");

        charDisplay.display();

        stringDisplay.display();
    }
}
