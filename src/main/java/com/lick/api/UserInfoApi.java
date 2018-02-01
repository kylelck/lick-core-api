package com.lick.api;

import com.lick.vo.UserInfoReq;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @description：
 * @author: lick@hsyuntai.com
 * @date: 2018年01月15日 16:58
 * @copyright: 版权归hsyuntai 所有
 */
@RequestMapping("/userinfo")
public interface UserInfoApi {

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    String getUserInfo(@RequestBody UserInfoReq userInfoReq);
}
