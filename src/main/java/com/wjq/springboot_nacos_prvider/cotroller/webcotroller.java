package com.wjq.springboot_nacos_prvider.cotroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class webcotroller {
    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
    public String echo(@PathVariable String string) {
        System.out.println(string);

        return "Hello Nacos Discovery02 " + "server port : " + port + string;

    }
}
