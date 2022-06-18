package test;

import com.google.gson.Gson;

/**
 * @author: YangJiao
 * @email 1320259466@qq.com
 * @date: 2022/6/18
 * @time: 18:11
 * @fuction: about the role of class.
 */
public class TestGson {

    public static void main(String[] args) {
        int[][] arr =  new int[10][10];
        String jsonSer = new Gson().toJson(arr);
        System.out.println(jsonSer);


    }
}
