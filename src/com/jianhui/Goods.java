package com.jianhui;

public class Goods {
    private int currentCount = 0;
    public int finish(int count)
    {
        currentCount = currentCount+count;

        return  currentCount;
    }

    public void MulQuantity(int quantity){
        currentCount = currentCount- quantity;
        System.out.println("hello,my wife");
    }
}
