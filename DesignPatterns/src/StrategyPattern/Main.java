package StrategyPattern;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Strategy strategy;

        String action = new Scanner(System.in).next();
        if(action.equals("file"))
            strategy = new CopyFilesStrategy();
        else if(action.equals("image"))
            strategy = new CopyImagesStrategy();
        else if(action.equals("video"))
            strategy = new CopyVideosStrategy();
        else
            throw new IllegalArgumentException("Invalid action");

        System.out.println(strategy.copy());
    }
}
