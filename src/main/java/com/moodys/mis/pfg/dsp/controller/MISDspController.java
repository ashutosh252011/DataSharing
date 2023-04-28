package com.moodys.mis.pfg.dsp.controller;

import com.moodys.mis.pfg.dsp.service.MIsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MISDspController {

    private final MIsService mIsService;

    @GetMapping("/hello")
    public String getData(){

        return "hello data";
    }
}
