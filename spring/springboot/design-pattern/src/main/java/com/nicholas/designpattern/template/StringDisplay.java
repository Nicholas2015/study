package com.nicholas.designpattern.template;

public class StringDisplay extends AbstractDisplay {

    private String content;

    public StringDisplay(String content) {
        this.content = content;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + this.content + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine(){
        int width = this.content.getBytes().length;

        System.out.print("+");
        for (int i = 0; i < width; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
