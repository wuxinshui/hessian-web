# hessian-web
1. Hessian是一个轻量级的remoting onhttp工具，使用简单的方法提供了RMI的功能。 相比WebService，Hessian更简单、快捷。采用的是二进制RPC协议，因为采用的是二进制协议，所以它很适合于发送二进制数据。
2. 由于使用二进制RPC协议传输数据，对象必须进行序列化，实现Serializable 接口
3. JAVA服务器端必须具备以下几点：
  - 包含Hessian的jar包
  - 设计一个接口，用来给客户端调用
  - 实现该接口的功能
  - 配置web.xml，配好相应的servlet
4. 客户端必须具备以下几点：
  - java客户端包含Hessian.jar的包。C#中引用hessianCSharp.dll
  - 具有和服务器端结构一样的接口。包括命名空间都最好一样
  - 利用HessianProxyFactory调用远程接口。
