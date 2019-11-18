package com.zglu.java.jdk8.stream;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zglu
 */
@Data
public class Vo {
    private int id;
    private String name;
    private int value;
    private List<String> list = new ArrayList<>();

    public Vo(int value) {
        this.id = value;
        this.name = value + "";
        this.value = value;
        list.add(name);
        list.add(name);
    }
}