package com.ks.learning.structural.composite;

public class File implements IFileSystem{

    private final int size;

    public File(int size){
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}
