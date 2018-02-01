package com.lick.vo;

import java.io.Serializable;

/**
 * @description：
 * @author: lick
 * @date: 2018年01月15日 16:45
 * @copyright: 版权归所有
 */
public class UserInfoReq implements Serializable {

    private static final long serialVersionUID = 7645468119307685151L;
    private String userCode;                              //用户编码

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
}
