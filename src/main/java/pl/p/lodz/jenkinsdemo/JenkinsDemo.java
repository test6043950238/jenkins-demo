package pl.p.lodz.jenkinsdemo;

import java.rmi.server.Operation;

public class JenkinsDemo{

    public String demo(int input){

        Operation op = new Operation("op");
        String sixvalue = "It's a six";

        if(input == -1){
            return "Number must not be -1";
        }

        if(input == 2){
            return "It's a two";
        }

        if(input == 4){
            return "It's a four";
        }

        if(input == 6){
            return sixvalue;
        }

        if(input == 7){
            return sixvalue;
        }

        if(input == 8){
            return sixvalue;
        }


        return String.valueOf(input);
    }
}