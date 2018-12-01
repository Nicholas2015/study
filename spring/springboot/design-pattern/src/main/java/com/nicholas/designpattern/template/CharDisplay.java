package com.nicholas.designpattern.template;

public class CharDisplay extends AbstractDisplay {

    private char content;

    public CharDisplay(char content) {
        this.content = content;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(this.content);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
