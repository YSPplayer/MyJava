package 常用类.Array类;

import java.util.Arrays;
import java.util.Comparator;

public class Array_ {
    public static void main(String[] args) {
        Integer[] integers = {10, 11, 11, 22};
        Arrays.toString(integers);//把数组所有元素打印

        //因为数组是引用类型，排序后会直接影响到实参
        Arrays.sort(integers);//默认排序

        //compare定制排序，使用的是匿名内部类，要求实现Comparator方法
        //原理：接口编程一种方式
        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        //以下是自己的自定义排序
        int[] temp = {10, 96, 11, 22};
        Array_.MyArrays(temp, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int a = (int)o1 ;
                int b = (int)o2 ;
                return a - b;
            }
        });
        System.out.println(Arrays.toString(temp));


    }

    //冒泡排序
    public static void MyArrays(int[] arr) {
        int temp = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void MyArrays(int[] arr, Comparator c) {
        int temp = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(c.compare(arr[j],arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
