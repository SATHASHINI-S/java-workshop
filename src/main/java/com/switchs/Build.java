package com.switchs;

public class Build {
    public void tree(char variable){
        switch (variable){
            case 'a':
            case 'k':
            case 'z':
                System.out.println("11 buildings");
                break;
            case 'b':
            case 'm':
            case 'h':
                System.out.println("12 buildings");
                break;
            case 'c':
            case 'q':
                System.out.println("13 buildings");
                break;
            case 'd':
            case 'w':
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
        build.tree('k');
        build.tree('q');
        build.tree('m');
    }
}
