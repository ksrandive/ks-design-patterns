package com.ks.learning.structural.composite;

public class Demo {

    public static void main(String[] args) {
        Folder root = new Folder(2);
        root.addChild(new File(5));
        root.addChild(new File(2));

        Folder new1 = new Folder(1);
        new1.addChild(new File(1));
        new1.addChild(new File(4));

        root.addChild(new1);

        System.out.println(root.getSize());
    }
}
