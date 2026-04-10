package com.ks.learning.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IFileSystem {

    private int size;

    private List<IFileSystem> items = new ArrayList<>();

    public Folder(int size){
        this.size = size;
    }

    @Override
    public int getSize() {
        int size = 0;
        for(IFileSystem item : items){
            size += item.getSize();
        }
        return this.size + size;
    }

    public void addChild(IFileSystem item){
        items.add(item);
    }

}
