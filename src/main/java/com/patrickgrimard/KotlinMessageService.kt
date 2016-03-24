package com.patrickgrimard

/**
 *
 *
 * Created on 2016-03-24
 *
 * @author Patrick
 */
open class KotlinMessageService : MessageService {
    override fun getMessage(): String {
        return "Hello Kotlin!!"
    }
}