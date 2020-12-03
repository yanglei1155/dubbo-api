package com.guigu.pojo.code;

import com.guigu.pojo.base.BaseObject;
import lombok.Data;

import java.io.Serializable;

@Data
public class ResultCode extends BaseObject {
    public static final String success="succdess_001";
    public static  final String failure="failure_002";
}
