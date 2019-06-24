package com.github.ixiongdi.di.dsd;


import com.samskivert.mustache.Mustache;
import com.samskivert.mustache.Template;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import org.apache.tomcat.util.http.fileupload.IOUtils;
//import sun.misc.IOUtils;
;

public class Design {

    private static final Map<DataType, String> map;

    static {
        map = new HashMap<DataType, String>();
        map.put(DataType.BOOLEAN, "bit(1)");
        map.put(DataType.INTEGER, "int");
        map.put(DataType.FLOAT, "float");
        map.put(DataType.DATE, "date");
        map.put(DataType.STRING, "text");
    }


    public static void main(String[] args) throws IOException {

//        String text = IOUtils.toString(Design.class.getClassLoader().getResourceAsStream("create-table.mustache"));
        String text = IOUtils.resourceToString("create-table.mustache", Charset.defaultCharset(), ClassLoader.getSystemClassLoader());
        Template tmpl = Mustache.compiler().compile(text);
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("tableName", "用户");
        data.put("tableCode", "user");

        List<Map<String, String>> tableFields = new ArrayList<>();
        Map<String, String> field1 = new HashMap<String, String>();
        field1.put("name", "ID");
        field1.put("type", map.get(DataType.INTEGER));
        field1.put("code", "id");
        tableFields.add(field1);
        Map<String, String> field2 = new HashMap<String, String>();
        field2.put("name", "姓名");
        field2.put("type", map.get(DataType.STRING));
        field2.put("code", "name");
        tableFields.add(field2);
        data.put("tableFields", tableFields);
        System.out.println(tmpl.execute(data));
    }
}
