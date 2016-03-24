package com.patrickgrimard

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import javax.inject.Inject

/**
 *
 *
 * Created on 2016-03-24
 *
 * @author Patrick
 */
@RestController
class MessageController @Inject constructor(val messageService: MessageService) {

    @RequestMapping(value = "/message", method = arrayOf(RequestMethod.GET))
    fun message(): String {
        return messageService.getMessage()
    }
}
