package com.github.juanmougan.springreactauth0

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Home Controller.
 */
@Controller
class HomeController {
    @RequestMapping(value = "/")
    fun index(): String {
        return "index"
    }
}