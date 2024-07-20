package com.ks.filehandling;

import java.io.File;

/**
 * List all the files
 * Created by deepak on 4/17/19.
 */
public class FileExample {

    public static void main(String[] args) {
        File file = new File("/Users/deepak/Documents");
        File[] files=file.listFiles();
        for (File f:files
             ) {
            System.out.println(f);
        }

    }
}
