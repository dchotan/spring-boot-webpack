package com.patrickgrimard

/**
 *
 *
 * Created on 2016-03-24
 *
 * @author Patrick
 */
@org.springframework.stereotype.Service
open class MessageServiceImpl : MessageService {
    override fun getMessages(): Array<Message> {
        return arrayOf(Message(0, "Hello"), Message(1, "Spring Rocks!"), Message(2, "Thought you would like to know..."))
    }
}