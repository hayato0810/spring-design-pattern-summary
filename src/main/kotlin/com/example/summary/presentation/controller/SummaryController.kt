package com.example.summary.presentation.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/summary")
class SummaryController {

    @GetMapping
    fun getSummary() : String {
        return "Hello Summary"
    }

    @GetMapping("/factory")
    fun getFactory() : String {
        return "Hello Factory"
    }

    @GetMapping("/template")
    fun getTemplate() : String {
        return "Hello Template"
    }
}