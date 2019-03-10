package com.caisebei.aspect.lock.springaspect.bean;

import com.caisebei.aspect.lock.springaspect.annotation.DistributeLock;
import org.springframework.stereotype.Component;


@Component
@DistributeLock
public class TestBean {

    public void testPrint(){
        System.out.println("test BEAN print method ****************");
    }
    public void testPrint2(){
        System.out.println("test BEAN print method *******22*********");
    }
}
