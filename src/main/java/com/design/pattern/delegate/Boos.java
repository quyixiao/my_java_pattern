package com.design.pattern.delegate;

public class Boos {

    public void command(String command,Leader leader){
        leader.doing(command);
    }
}
