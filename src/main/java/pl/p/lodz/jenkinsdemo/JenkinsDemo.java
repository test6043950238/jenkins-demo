package pl.p.lodz.jenkinsdemo;

public class JenkinsDemo{

    public String demo(int input){
        if(input == -1){
            throw new IllegalArgumentException("Number must not be -1");
        }

        return String.valueOf(input);
    }
}