package com.example.admin.testactivities;

import android.arch.lifecycle.LiveData;
import android.content.Context;

/**
 * Created by admin on 26.09.2017.
 */

public class UserData extends LiveData<String> {

    private static UserData instance;


    public void setName(String name) {
        setValue(name);
    }

    public static UserData getInstance(){
        if (instance==null){
            instance = new UserData();
        }
        return instance;
    }

    private UserData(){

    }


}
