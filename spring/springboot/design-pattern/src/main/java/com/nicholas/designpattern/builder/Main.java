package com.nicholas.designpattern.builder;

public class Main {

    public static void main(String[] args) {
        args = new String[]{"html"};
        if (args.length !=  1){
            usage();
            System.exit(0);
        }

        if (args[0].equals("plain")){
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.constract();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if (args[0].equals("html")){
            HtmlBuilder htmlBuilder = new HtmlBuilder();
            Director director = new Director(htmlBuilder);
            director.constract();
            String result = htmlBuilder.getResult();
            System.out.println(result + "文件编写完成。");
        } else {
            usage();
            System.exit(0);
        }
    }

    private static void usage() {
        System.out.println("Usage: Java Main Plain 编写的纯文本文档");
        System.out.println("Usage: Java Main Html 编写的HTML文档");
    }
}
