package cn.edu.hebuee;

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
      Producer producer = new Producer();
        producer.saleProduct(10000f);
        IProducer proxyProducer  =(IProducer) Proxy.newProxyInstance(Producer.class.getClassLoader(),
                producer.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Float money = (Float) args[0];
                        Object returnValue = null;
                        if ("saleProduct".equals(method.getName())){
                            returnValue = method.invoke(producer,money*0.8f);
                        }
                        return returnValue;
                    }
                });
        proxyProducer.saleProduct(1000f);
    }

}
