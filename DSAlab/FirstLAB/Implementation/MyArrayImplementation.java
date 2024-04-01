package DSAlab.FirstLAB.Implementation;

import DSAlab.FirstLAB.Interface.MyArray;

public class MyArrayImplementation implements MyArray {
    private int[] arr;
    private int nextIndex;
    //Contructor
    public MyArrayImplementation(int size){
        arr = new int[size];
        nextIndex = 0;
    }
    public int[] getArr() {
        return arr;
    }

    public int getNextIndex() {
        return nextIndex;
    }

    @Override
    public void traverse() {
        for (int i = 0; i < nextIndex; i++) {
            System.out.println(arr[i]);
            if(i < arr.length - 1){
                System.out.println(",");
            }
        }
    }

    @Override
    public boolean insert(int element) {
        boolean response = false;
        if (nextIndex != arr.length){
            arr[nextIndex] = element;
            nextIndex++;
            response = false;
        }
        return response;
    }

    @Override
    public boolean delete() {
        boolean response = false;
        if (nextIndex != 0){
            nextIndex--;
            response = true;
        }
        return response;
    }

    @Override
    public void sort() {

    }

    @Override
    public boolean search(int element) {
        return false;
    }
}
