package com.martin.designmode23.CombinationMode;

/**
 * 文件类，对文件的操作，继承Node，实现复制的方法
 * Created by Martin on 2015/7/26.
 */
public class File implements Node {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void copy() {
        System.out.println("复制文件：" + fileName);
    }
}
