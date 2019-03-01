package com.yuancx.demo.test;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSort {
    private static final Logger logger = LoggerFactory.getLogger(TestSort.class);

    /**
     * 冒泡排序
     * @param args
     */
    public static void main(String args[]){

        int array[] = {32,1,313,3131,20,3131,63,42424};



        //System.out.println("冒泡排序---"+JSON.toJSONString( bubleSort(array)));


        System.out.println("选择排序---"+JSON.toJSONString( selectSort(array)));


    }


    /**
     * 冒泡排序
     * @param array
     * @return
     */
    public static int [] bubleSort(int [] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    /**
     * 选择排序
     */
    public static int[] selectSort(int [] array){

        for(int i=0 ;i < array.length;i++){
            int k = i;
            for(int j = i+1;j<array.length;j++){
                if(array[k]>array[j]){
                    k = j;
                }
            }

            int temp = array[i];
            array[i] = array[k];
            array[k] = temp;
            printList(array);
            System.out.println();
        }
        return  array;
    }

    public static void printList(int [] array){
        if(null != array && array.length>0){

            for(int i : array){
                System.out.print(i+"\t");
            }
        }

    }
}
