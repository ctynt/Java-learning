package top.yxtong.java.tool.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayToolsTest {

    @Test
    public void getMax() {
        int[] array=new int[]{1,2,3,4,5,6,7,8,9,10};
        assertEquals(10,ArrayTools.getMax(array));
    }
    @Test
    public void testSort(){
        int[] array=new int[]{5,4,3,8,10};
        int[] result=ArrayTools.sort(array);
        System.out.println(Arrays.toString(result));
        System.out.println("hello");
        System.out.println("world");


    }
}