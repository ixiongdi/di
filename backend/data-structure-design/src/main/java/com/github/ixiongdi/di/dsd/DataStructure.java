package com.github.ixiongdi.di.dsd;

import lombok.Data;

import java.util.List;

@Data
public class DataStructure {
    private String name;
    private List<DataStructureCol> cols;


    String getCreateTableDDL() {

        return null;
    }
}


