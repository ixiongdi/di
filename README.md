# di
Do it.

---

## 这是一个初创型公司的技术堆栈，对于初创型公司最重要的就是做，也就是Do it.

---

## 这个技术堆栈有如下的假设

- 小程序
- App
- 网页

基于这些假设所有的静态的都通过CDN加速来达到最快的访问速度，所有的动态资源包括HTTP、WebSocket都通过负载均衡进入服务器

## 负债均衡的选型

- **SLB** 选用各大云服务厂商的负载均衡最大的好处就是稳定，缺点就是要付费，可定制话的地方也比较少
- **Nginx** 免费、可定制化程度高。对于初创型公司来说没有性能瓶颈

## CDN选型

对于初创型公司的话来说自建CDN成本太高，还是用成熟方案比较好，项目初期的话费用也不贵

- **阿里云** 如果其他产品也用阿里云的话，最好使用阿里的。
- **七牛** 国内做的比较早的了，蛮成熟的了。

## 微服务选型

现在来说。微服务系统架构已经是主流，方便水平拓展，也很容易扩容。

- **Spring Cloud** 在Java技术堆栈里面算最火的了，也比较成熟。更新迭代也快。初创型公司就不要折腾了，成熟稳定大众的才是最好的。公司大了再去折腾也不迟。
- **Dobbo** 阿里出品的，国内以前比较火。沉寂一段时候后开始更新了，文档也很好。

## 基础Web框架选型

这方面来说选择性其实很多，但是对于初创型公司还是选择比较大众的。

- **Spring Boot** 大而全的一站式解决方案
- **Nutz Boot** 我个人感觉还不错

## 数据库

数据库的选择还是要根据业务场景来看。

- **MySQL** 常规业务
- **Redis** 高访问量、缓存业务

## 部署方式

部署方式要简单、安全。

- **Docker** 现在大公司基本都是基于容器的部署方式了吧。
- **Service Fabric** 微软最近开源的微服务部署方案，感觉不错。 

---

## 项目文件架构

目录、文件|释义
---------|----
nginx|存放和Nginx相关的文件，租如配置文件和密钥
nginx\cert|ssl证书
nginx\conf|nginx配置文件
nginx\logs|nginx日志文件
docker|存放Docker相关文件
docker\build|自己构建的的Dockerfile存放地
docker\compose|服务编排文件夹
spring-cloud|微服务
spring-cloud\eureka|云端服务发现，一个基于 REST 的服务，用于定位服务，以实现云端中间层服务发现和故障转移
spring-cloud\config|配置管理工具包，让你可以把配置放到远程服务器，集中化管理集群配置，目前支持本地存储、Git以及Subversion。
spring-cloud\zuul|Zuul 是在云平台上提供动态路由,监控,弹性,安全等边缘服务的框架。Zuul 相当于是设备和 Netflix 流应用的 Web 网站后端所有请求的前门。
spring-cloud\feign|Feign是一种声明式、模板化的HTTP客户端。
spring-boot|微服务
spring-boot\user|用户服务
spring-boot\...|很多的业务
spring-cloud-config|配置文件

## 快速开始

环境依赖
- Docker
- Docker Compose
- JDK8.0+
- Maven
- Git

目前代码基于Spring Boot 1.5.10和Spring Cloud Edgware.SR2等Spring Cloud Finchley发布正式版以后升级Spring Boot 2.0
拉取最新代码
```bash
git clone git@github.com:ixiongdi/di.git
```

