package com.switchs;

public class Build {
    public void tree(char variable){
        switch (variable){
            case 'a':
                System.out.println("11 buildings");
                break;
            case 'b':
                System.out.println("12 buildings");
                break;
            case 'c':
                System.out.println("13 buildings");
                break;
            case 'd':
                System.out.println("14 buildings");
                break;
            case 'e':
                System.out.println("15 buildings");
                break;
            default:
                System.out.println("16 buildings");


        }

    }

    public static void main(String[] args) {
        Build build=new Build();
        build.tree('a');
        build.tree('b');
        build.tree('f');
    }
}
