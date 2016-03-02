package com.patrickgrimard;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

/**
 * Created on 2016-03-01
 *
 * @author Patrick
 */
@Service
@RefreshScope
public class MessageServiceImpl implements MessageService {

    @Value("${message}")
    private String message;

    public String getMessage() {
        return message;
    }
}
