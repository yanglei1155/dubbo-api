package com.guigu.pojo;

import com.guigu.pojo.base.BaseObject;
import lombok.Data;

@Data
public class User  extends BaseObject {
    private String uid;
    private String username;
    private String password;
}
