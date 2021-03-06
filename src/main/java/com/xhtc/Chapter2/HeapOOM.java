package com.xhtc.Chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zetrov on 2016/7/5.
 *
 * VM options: -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 *
 * 限制Java堆大小为20M,不可扩展(将堆的最小值-Xms参数与最大值-Xmx参数设置为一样即可避免堆自动扩展)，
 * 通过参数-XX:+HeapDumpOnOutOfMemoryError可以让虚拟机在出现内存一出异常时Dump出当前的内存堆转储快照以便事后进行分析。
 *
 */

public class HeapOOM {

    static class OOMObject{

    }

    public static void main(String[] args){
        List<OOMObject> list = new ArrayList<OOMObject>();

        while(true){
            list.add(new OOMObject());
        }
    }

}

