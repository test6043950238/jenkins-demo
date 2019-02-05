package pl.p.lodz.jenkinsdemo;

public class JenkinsDemo{

    public String demo(int input){
        int unnecessaryvalue;
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
            return "It's a six";
        }

        if(input == 7){
            return "It's a six";
        }

        if(input == 8){
            return "It's a six";
        }


        return String.valueOf(input);
    }
}