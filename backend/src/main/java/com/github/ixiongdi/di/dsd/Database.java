package com.github.ixiongdi.di.dsd;

import lombok.Data;

import java.util.List;

@Data
public class Database {
    private String name;
    private String code;


    private List<Table> tables;
}
