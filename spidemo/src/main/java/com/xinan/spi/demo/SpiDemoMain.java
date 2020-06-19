package com.xinan.spi.demo;

import com.xinan.spi.service.SpiDemoInterface;

import java.util.ServiceLoader;

/**
 * @author xinan
 * @date 2020/6/19
 */
public class SpiDemoMain {
    public static void main(String[] args) {
        ServiceLoader<SpiDemoInterface> load = ServiceLoader.load(SpiDemoInterface.class);
        for (SpiDemoInterface next : load) {
            next.say();
        }
    }
}
