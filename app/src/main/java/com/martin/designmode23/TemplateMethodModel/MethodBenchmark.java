package com.martin.designmode23.TemplateMethodModel;

/**
 * Created by Martin on 2015/7/26.
 */
public class MethodBenchmark extends Benchmark {
    /**
     * 真正定义benchmark内容
     */
    @Override
    public void benchmark() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.println("i=" + i);
        }
    }
}
