package StackAndQueue.StockSpanner;

import java.util.ArrayList;

public class OnlineStockSpan {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        StockSpanner stockSpanner = new StockSpanner();
        arrayList.add(stockSpanner.span(100));
        arrayList.add(stockSpanner.span(80));
        arrayList.add(stockSpanner.span(60));
        arrayList.add(stockSpanner.span(70));
        arrayList.add(stockSpanner.span(60));
        arrayList.add(stockSpanner.span(75));
        arrayList.add(stockSpanner.span(85));

        for (int i: arrayList){
            System.out.print(i + " ");
        }

    }

}
