* 动态代理
    * 特点：字节码随时创建，随用随加载
    * 作用：不修改源码的基础上对方法增强
    * 分类：
      * 基于接口的动态代理
      * 基于子类的动态代理
    * 基于接口的动态代理
      * 涉及的类：Proxy
      * 提供者：JDK官方
    * 如何创建代理对象
        * 使用Proxy类中newProxyInstance方法
    * 创建代理对象的要求
        * 被代理至少实现一个接口
        * newProxyInstance 参数
    
* ClassLoader 类加载器 用于加载代理对象字节码

* Class[]  字节码数组 

* InvocationHandler

Exception

Exception in thread "main" java.lang.IllegalArgumentException: argument type mismatch

传入的参数不对

基于第三方的动态代理

 