package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map((item)-> item*3+2).reduce(0,(sum,item)-> sum+item);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        /*List<Integer> arraylist1 = new ArrayList<>();
        for (int i = 0; i <arrayList.size() ; i++) {
            if(arrayList.get(i)%2!=0){
                arraylist1.add(arrayList.get(i)*3+2);
            }
            else
                arraylist1.add(arrayList.get(i));
        }
        return arraylist1;*/
        return arrayList.stream().map((item)-> item%2==0?item:item*3+2).collect(Collectors.toList());

    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        //return arrayList.stream().map((item)-> item%2==0?0:item*3+5).reduce(0,(sum,item)->sum+item);
        //return arrayList.stream().filter(item->item%2!=0).map(item->item*3+5).reduce(0,(sum,item)->sum+item);
        return arrayList.stream().reduce(0,(sum,item)->sum+(item%2==0?0:item*3+5));
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        //return arrayList.stream().filter(item->item%2==0).mapToDouble(i->i).average().getAsDouble();
        return arrayList.stream().filter(item->item%2==0).mapToDouble(i->i).average().orElse(0);//可选值
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        throw new NotImplementedException();
    }
}
