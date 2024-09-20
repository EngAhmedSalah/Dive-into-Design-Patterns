package StrategyPattern;

public class CopyFilesStrategy implements Strategy
{

    @Override
    public String copy() {
        return "here is the copy of the file";
    }
}
