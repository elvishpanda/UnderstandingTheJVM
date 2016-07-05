package com.xhtc.Chapter2;

/**
 * Created by Zetrov on 2016/7/5.
 * VM Options: -Xss2M
 *
 * 电脑假死！
 */

public class JavaVMStackOOM {

    private void dontStop(){
        while (true){

        }
    }

    public void stackLeakByThread(){
        while(true){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args){

        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();

    }


}
