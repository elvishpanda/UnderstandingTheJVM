package com.xhtc.Chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zetrov on 2016/7/5.
 * VM Options:-XX:PermSize=10M -XX:MaxPermSize=10M
 *
 * String.intern()是一个NATIVE方法
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args){
        List<String> list = new ArrayList<String>();

        int i = 0;
        while(true){
            list.add(String.valueOf(i++).intern());
        }
    }

}
