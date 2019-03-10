package com.caisebei.aspect.lock.springaspect;

import com.caisebei.aspect.lock.springaspect.annotation.DistributeLock;
import org.springframework.stereotype.Component;

@DistributeLock
@Component
public class TestBean {

    public void testPrint(){
        System.out.println("test BEAN print method ");
    }

}
