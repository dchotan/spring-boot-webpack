package com.patrickgrimard;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * Created on 2016-03-01
 *
 * @author Patrick
 */
@RequestMapping("/message")
@RestController
public class MessageController {

    private MessageService messageService;

    @Inject
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String message() {
        return messageService.getMessage();
    }
}
