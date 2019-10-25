package com.example.practica3;

import java.util.ArrayList;

public class schedule {
    public static ArrayList<user> list;

    public void schedule(){
        this.list = new ArrayList<user>();
    }

    public boolean search(String n){
        Boolean flag = false;
        //For each
        for(user u: list){
           if(u.getName().equals(n)){
                flag = true;
            }
        }
        return flag;
    }

    public void add(user u){
        this.list.add(u);
    }
}
