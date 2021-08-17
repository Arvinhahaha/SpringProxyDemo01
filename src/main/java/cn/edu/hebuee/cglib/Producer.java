package cn.edu.hebuee.cglib;

import cn.edu.hebuee.IProducer;

/**
 * @Classname Producer
 * @Description TODO
 * @Date 2021/8/16 17:30
 * @Created by 杨军望
 */
public class Producer {
    /**
      *
      * @Description 销售
      * @param [money]
      * @return void
      * @date 2021/8/16 17:33
      * @auther 杨军望
      */
   public void saleProduct(float money){
       System.out.println("销售产品，并拿到钱"+money);
   }
   /**
     *
     * @Description 售后
     * @param [money]
     * @return void
     * @date 2021/8/16 17:34
     * @auther 杨军望
     */
   public void afterService(float money){
       System.out.println("提供服务，并拿到钱"+money);
   }
}
