package com.orangeart.protocal.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ClassCascaderItem {

    private String code;

    private String name;

    private List<ClassCascaderItem> items=new ArrayList<>();

}
