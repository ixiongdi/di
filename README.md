# DI

Do it.

## 框架起源

本码农有着7年的搬砖经验，有些感悟和想法，想把它付诸实践。

## 框架原则

- 最高开发效率，本世纪最宝贵的是时间，时间可以换金钱，金钱不能换时间

- 最低心智负担，自己写的代码过些日子都会看不懂，何况别人的代码

- 不造轮子（虽然本项目也是个轮子），就是能用别人的就用别人的

- 使用最广泛使用，最成熟稳定的第三方框架和库

## 一些特性

基于以上原则，Di会有如下特性

- 基于Java语言，虽然不是最完美的语言但简单易懂，符合最广泛、最成熟稳定、最低心智负担原则
- 基于Spring，目前来说由于甲骨文的封闭，Spring已经是Java EE事实上的标准，本框架将全面依赖Spring
- 微服务，微服务不仅能解耦复杂的应用，而且能更好的应对当今的应用场景，当然微服务不可避免的带来了开发和运维的复杂性，Di将致力于降低这种复杂性
- 分布式，Di天生支持分布式，并且会提供部署指南
- 代码生成器，自动化增删改查，在本码农这么些年的搬砖经验中可以说80%工作都是增删改查，专注于那20%，这20%才是代码的核心竞争力

## 数据结构+算法

程序的本质是数据结构加算法，本框架自带一个数据结构设计器，并会生成相应的代码

### 数据结构

本身来说数据是无类型的，但这样会增加转换成本和运行成本，本世纪最贵的是人力成本，存储成本和计算成本其次，所以本数据结构设计器会配合Java和数据库做一些综合考量。

#### 基础数据映射

|Java类型|数据库类型|Di类型|
|-|-|-|
|Boolean|bit|布尔值
|Byte|bigint|整型
|Char|bigint|整型
|Short|bigint|整型
|Intger|bigint|整型
|Long|bigint|整型
|Date|timestamp|时间
|Float|double|浮点型
|Double|double|浮点型
|String|text|文本

总共五种类型

## 技术选型



### 后端

- Java
- Spring Boot
- Spring Cloud
- Docker
- k8s
- protobuf
- grpc
- okhttp
- Spring Framework
- eventbus
- json-server
- ansible
- todomvc

### 前端

- JavaScript
- Vue
- Bootstrap
- axios
- TypeScript
- webpack
- ant-desgin
- elemnet
- vue-element-admin
- iview
- meterial-ui
