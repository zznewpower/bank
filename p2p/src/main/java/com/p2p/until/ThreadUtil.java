package com.p2p.until;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2017/10/24.
 */
public class ThreadUtil {
   static ExecutorService executorService;
    static {
        executorService  = Executors.newFixedThreadPool(10);
    }
    public static void svaFile(Runnable runnable){
        executorService.execute(runnable);
    }
}
