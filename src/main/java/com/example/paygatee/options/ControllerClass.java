package com.example.paygatee.options;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerClass {

    private Avail avl;

    public ControllerClass(Avail avl) {
        this.avl = avl;
    }

    @RequestMapping("/payment")
    public List<Options2> getOptions2(){
        return avl.getOptions2();
    }





}
