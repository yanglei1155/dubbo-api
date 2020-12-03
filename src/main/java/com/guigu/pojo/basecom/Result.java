package com.guigu.pojo.basecom;

import com.guigu.pojo.base.BaseObject;
import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> extends BaseObject {
    private String message;
    private String statusCode;
    private T result;
}
