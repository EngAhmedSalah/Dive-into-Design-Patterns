package StrategyPattern;

public class CopyVideosStrategy implements Strategy
{

    @Override
    public String copy() {
        return "here is the copy of the Videos";
    }
}
