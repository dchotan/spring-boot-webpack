package com.patrickgrimard

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 *
 *
 * Created on 2016-03-24
 *
 * @author Patrick
 */
@RestController
class MessageController constructor(val messageService: MessageService) {

    @GetMapping(value = "/messages")
    fun message(): Array<Message> {
        return messageService.getMessages()
    }
}
