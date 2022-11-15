package top.yxtong.java.basic.array;

import top.yxtong.java.tool.array.ArrayTools;
import top.yxtong.java.tool.time.DateTimeTools;

import java.util.Date;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = ArrayTools.getMax(array);
        System.out.println(max);
        System.out.println(DateTimeTools.formatTime(new Date()));

    }
}


