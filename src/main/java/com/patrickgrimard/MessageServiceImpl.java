package com.patrickgrimard;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created on 2016-03-01
 *
 * @author Patrick
 */
@Service
@RefreshScope
public class MessageServiceImpl implements MessageService {

    private Environment env;

    @Inject
    public MessageServiceImpl(Environment env) {
        this.env = env;
    }

    public String getMessage() {
        return env.getProperty("message");
    }
}
