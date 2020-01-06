package com.hry.newInstance;

import java.io.Serializable;

public class single01 {

    private single01(){};

    private static volatile single01 singleD = null;

    public single01 getInstance(){
        if (singleD == null){
            synchronized (singleD){
                if (singleD == null){
                    singleD = new single01();
                }
            }
        }
        return singleD;
    }
}
