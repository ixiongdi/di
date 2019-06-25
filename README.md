# DI

Do it.

## 框架起源

本码农有着 7 年的搬砖经验，有些感悟和想法，想把它付诸实践。

## 框架原则

- 最高开发效率，本世纪最宝贵的是时间，时间可以换金钱，金钱不能换时间

- 最低心智负担，自己写的代码过些日子都会看不懂，何况别人的代码

- 不造轮子（虽然本项目也是个轮子），就是能用别人的就用别人的

- 使用最广泛使用，最成熟稳定的第三方框架和库

## 一些特性

基于以上原则，Di 会有如下特性

- 基于 Java 语言，虽然不是最完美的语言但简单易懂，符合最广泛、最成熟稳定、最低心智负担原则
- 基于 Spring，目前来说由于甲骨文的封闭，Spring 已经是 Java EE 事实上的标准，本框架将全面依赖 Spring
- 微服务，微服务不仅能解耦复杂的应用，而且能更好的应对当今的应用场景，当然微服务不可避免的带来了开发和运维的复杂性，Di 将致力于降低这种复杂性
- 分布式，Di 天生支持分布式，并且会提供部署指南
- 代码生成器，自动化增删改查，在本码农这么些年的搬砖经验中可以说 80%工作都是增删改查，专注于那 20%，这 20%才是代码的核心竞争力

## 数据结构+算法

程序的本质是数据结构加算法，本框架自带一个数据结构设计器，并会生成相应的代码

### 数据结构

本身来说数据是无类型的，但这样会增加转换成本和运行成本，本世纪最贵的是人力成本，存储成本和计算成本其次，所以本数据结构设计器会配合 Java 和数据库做一些综合考量。

#### 基础数据映射

<<<<<<< Updated upstream
|Java类型|数据库类型|Di类型|
|-|-|-|
|Boolean| unsigned tinyint |布尔值
|Byte|bigint|整型
|Char|bigint|整型
|Short|bigint|整型
|Intger|bigint|整型
|Long|bigint|整型
|Date|timestamp|时间
|Float|double|浮点型
|Double|double|浮点型
|String|text|文本
=======
| Java 类型 | 数据库类型 | Di 类型 |
| --------- | ---------- | ------- |
| Boolean   | bit        | 布尔值  |
| Byte      | bigint     | 整型    |
| Char      | bigint     | 整型    |
| Short     | bigint     | 整型    |
| Intger    | bigint     | 整型    |
| Long      | bigint     | 整型    |
| Date      | timestamp  | 时间    |
| Float     | double     | 浮点型  |
| Double    | double     | 浮点型  |
| String    | text       | 文本    |
>>>>>>> Stashed changes

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

前端使用 Vue，因为 Vue 降低心智负担的哲学和 Di 不谋而合。简单易学好上手。

| 框架和库          | 版本      |
| ----------------- | --------- |
| vue-element-admin | bit       |
| Byte              | bigint    |
| Char              | bigint    |
| Short             | bigint    |
| Intger            | bigint    |
| Long              | bigint    |
| Date              | timestamp |
| Float             | double    |
| Double            | double    |
| String            | text      |

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

### 开发计划

1. 根据数据库表结构，生成增删改查代码