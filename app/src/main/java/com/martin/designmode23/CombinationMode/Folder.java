package com.martin.designmode23.CombinationMode;

import java.util.ArrayList;

/**
 * 文件夹类，继承Node，实现复制的方法
 * Created by Martin on 2015/7/26.
 */
public class Folder implements Node {
    private String folderName;
    // 用于存储文件夹下的文件夹或文件的信息
    private ArrayList nodeList = new ArrayList();

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    public void add(Node node) { // 增加文件或文件夹
        nodeList.add(node);
    }

    public void copy() { // 文件夹复制操作实现递归
        System.out.println("复制文件夹：" + folderName);
        for (int i = 0; i < nodeList.size(); i++) {
            Node node = (Node) nodeList.get(i);
            node.copy();
        }
    }
}
