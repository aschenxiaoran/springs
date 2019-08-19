package com.xiaoran.springs.genericTypes;

import java.util.List;

/**
 * @ClassName GenericTypeClean
 * Description TODO
 * Author xiaoran
 * Date 2019/8/19 15:50
 * Version 1.0
 **/
public class GenericTypeClean {

    public  static String method(List<String> stringList){
        System.out.println("这里是泛型重载1");
        return "";
    }

    public  static int method1(List<Integer> integerList){
        System.out.println("这里是泛型重载1");
        return 1;
    }

}
