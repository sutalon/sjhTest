package com.jianhui;

public class Goods {
    public int currentCount = 0;
    public int finish(int count)
    {
        currentCount = currentCount+count;

        return  currentCount;
    }

    public void MulQuantity(int quantity){
        currentCount = currentCount- quantity;

    }
}
