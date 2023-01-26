package com.example.paygatee.options;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Avail {
    public List<Options> options = new ArrayList<>(Arrays.asList(
            new Options(123456789,"Ramesh",456)));

    public List<Options2> options2 = new ArrayList<>(Arrays.asList(
            new Options2("Credit card","Debit card", "UPI")));

    public List<Options2> getOptions2(){
        return options2;
    }
    public List<Options> postOptions(){
        return options;
    }


}
