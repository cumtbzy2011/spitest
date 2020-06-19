package com.xinan.spi;

import com.xinan.spi.service.SpiDemoInterface;

/**
 * @author xinan
 * @date 2020/6/19
 */
public class CatImpl implements SpiDemoInterface {
    public void say() {
        System.out.println("喵喵");
    }
}
