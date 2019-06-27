package com.github.ixiongdi.di.dsd;

import lombok.Data;

import java.util.List;

@Data
public class Table {
    private String name;
    private String code;

    List<Field> fields;
}
