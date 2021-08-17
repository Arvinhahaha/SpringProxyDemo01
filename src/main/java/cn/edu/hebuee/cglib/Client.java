package cn.edu.hebuee.cglib;

import cn.edu.hebuee.IProducer;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Classname Client
 * @Description TODO
 * @Date 2021/8/16 17:36
 * @Created by 杨军望
 */
public class Client {
    public static void main(String[] args) {
        final Producer producer = new Producer();
        producer.saleProduct(10000f);
        Producer cglibProducer = (Producer)Enhancer.create(producer.getClass(), new MethodInterceptor() {
            @Override
            /**
              *
              * @Description TODO
              * @param [proxy, method, args, methodproxy]
              * @return java.lang.Object
              * @date 2021/8/16 18:39
              * @auther 杨军望
              */
            public Object intercept(Object proxy ,Method method, Object[] args, MethodProxy methodproxy) throws Throwable {
                Float money = (Float) args[0];
                Object returnValue = null;
                if ("saleProduct".equals(method.getName())){
                    returnValue = method.invoke(producer,money*0.8f);
                }
                return returnValue;
            }
        });
        cglibProducer.saleProduct(20000f);
    }

}
