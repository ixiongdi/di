package com.github.ixiongdi.di.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

/**
 * @author xiongdi (kotlin@qq.com)
 * @since
 */
@Data
public class Response {
    private Integer code;
    private String message;
    private Object data;
}
