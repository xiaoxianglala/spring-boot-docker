package com.ysy.dockerspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author ysy
 * @since 2019/7/30 16:17
 */
@RestController
public class DockerController {

    @RequestMapping("/")
    public String index(){
        return "Hello Docker";
    }
}
