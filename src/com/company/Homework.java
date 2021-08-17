package com.company;

import java.util.ArrayList;
import java.util.List;

public class Homework {

    public static void main(String[] args) {
        List<String> example=new ArrayList<>();
        example.add("Hello");
        example.add("my");
        example.add("name");
        example.add("is");
        example.add("Danil");
        System.out.println(deleteMore4(example));
    }
    public static List deleteMore4(List<String>example){
        List<String>result=new ArrayList<>(example);
        for(int i=result.size()-1;i>=0;i--){
            if(result.get(i).length()>4){
                result.remove(result.get(i));}
        }
        return result;
    }
}
