package com.guigu.pojo;

import com.guigu.pojo.base.BaseObject;
import lombok.Data;

@Data
public class Account extends BaseObject {
    private String uid;
    private Double money;
}
