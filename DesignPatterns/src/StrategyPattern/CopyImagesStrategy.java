package StrategyPattern;

public class CopyImagesStrategy implements Strategy
{

    @Override
    public String copy() {
        return "here is the copy of the image";
    }
}
