package com.lovejobs.design_pattern.template_method;

public class HummerH2Model extends HummerModel{
    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void alarm() {

    }

    @Override
    public void engineBoom() {

    }

    @Override
    public void run() {
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }
}
