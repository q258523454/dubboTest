package web;
// Created by ZhangJian on 18/2/26.


import com.service.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Zhang {
    @Autowired
    private Test test;

    @RequestMapping(value="/zhang",produces = "application/json; charset=UTF-8")
    public @ResponseBody String abc() throws Exception{
        return test.zhang("test dubbo");
    }
}
