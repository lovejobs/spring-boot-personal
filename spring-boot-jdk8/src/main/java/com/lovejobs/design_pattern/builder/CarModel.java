package com.lovejobs.design_pattern.builder;

import java.util.ArrayList;
import java.util.List;

public abstract class CarModel {

    private ArrayList<String> sequence = new ArrayList<String>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run(){
        for (int i = 0; i < this.sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            switch (actionName){
                case "start":
                    this.start();
                    break;
                case "stop":
                    this.stop();
                    break;
                case "alarm":
                    this.alarm();
                    break;
                case "engine boom":
                    this.engineBoom();
                    break;
            }
        }
    }
    final public void setSequence(List sequence){
        this.sequence= (ArrayList<String>) sequence;
    }
}
