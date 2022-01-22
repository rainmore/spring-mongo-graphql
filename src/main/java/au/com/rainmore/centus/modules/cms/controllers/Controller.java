package au.com.rainmore.centus.modules.cms.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cms")
public class Controller {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping
    public String hello() {
        return "hello, world";
    }

}
