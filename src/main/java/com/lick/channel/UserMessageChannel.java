package com.lick.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @description： 消息通道
 * @author: lick
 * @date: 2018年01月23日 11:39
 * @copyright: 版权归 lick 所有
 */
public interface UserMessageChannel {

    String USERINPUT = "user_input";
    String USEROUTPUT = "user_output";

    @Input(UserMessageChannel.USERINPUT)
    SubscribableChannel userInput();

    @Output(UserMessageChannel.USEROUTPUT)
    MessageChannel useroutput();
}
