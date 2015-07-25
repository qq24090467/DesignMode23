package com.martin.designmode23.TemplateMethodModel;

/**
 * 模板类
 * Created by Martin on 2015/7/26.
 */
public abstract class Benchmark {
    /**
     * 下面操作是我们希望在子类中完成
     */
    public abstract void benchmark();

    /**
     * 重复执行benchmark次数
     *
     * @param count
     * @return
     */
    public final long repeat(int count) {
        long startTime;
        if (count <= 0) {
            return 0;
        } else {
            startTime = System.currentTimeMillis();
        }

        for (int i = 0; i < count; i++) {
            benchmark();
        }
        long stopTime = System.currentTimeMillis();
        return stopTime - startTime;
    }

}
