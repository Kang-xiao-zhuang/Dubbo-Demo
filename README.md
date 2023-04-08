# Dubbo-Demo
根据Dubbo官方文档写的快速理解和上手Demo
# 配置Dubbo提前需要zookeeper环境
# Zookeeper安装

## Zookeeper单机安装（Windows）

下载地址：[Apache ZooKeeper](https://zookeeper.apache.org/releases.html)



1.1 下载安装

下载好的文件进行解压缩得到apache-zookeeper-3.8.0-bin目录，创建zkdata及log目录，后续作为数据存放目录![在这里插入图片描述](https://img-blog.csdnimg.cn/5fbe08c1e1454838b4bc0b0ed1d0ac7e.png)

### 1.2 配置启动

我们进入conf目录下，复制zoo_sample.cfg文件，这个是官方提供的配置样例，我们修改复制的文件名称未zoo.cfg，用编辑器打开配置文件进行配置。修改数据存储目录，其它的用默认的。

![在这里插入图片描述](https://img-blog.csdnimg.cn/ae99a69714dd48978cc84090988028e4.png)

![在这里插入图片描述](https://img-blog.csdnimg.cn/b6566fa0b9f8457080d5401fa9cec224.png)



windows下面双击启动zkServer.cmd，出现下面页面表示启动成功

![在这里插入图片描述](https://img-blog.csdnimg.cn/735641818fd0488899c8bfc0b01dcf8f.png)

![在这里插入图片描述](https://img-blog.csdnimg.cn/2ce7d3799cf8483da3c925d8a1d47ba7.png)



启动zkCli.cmd来进行测试zk服务是否启动成功，显示zk:localhost:2181说明已经链接上本地zkServer

![在这里插入图片描述](https://img-blog.csdnimg.cn/c5c10d850ce740899e715cfc2f9eb48d.png)



## Zookeeper单机安装（Linux）

### 1.1 下载安装

下载地址：[Apache ZooKeeper](https://zookeeper.apache.org/releases.html)



**1、环境准备**

ZooKeeper服务器是用Java创建的，它运行在JVM之上。需要安装JDK 7或更高版本。

**2、上传**

将下载的ZooKeeper放到/opt/ZooKeeper目录下

```shell

#上传zookeeper alt+p
put f:/setup/apache-zookeeper-3.5.6-bin.tar.gz
#打开 opt目录
cd /opt
#创建zooKeeper目录
mkdir  zooKeeper
#将zookeeper安装包移动到 /opt/zooKeeper
mv apache-zookeeper-3.5.6-bin.tar.gz /opt/zookeeper/
```

**3、解压**

将tar包解压到/opt/zookeeper目录下

```shell
tar -zxvf apache-ZooKeeper-3.5.6-bin.tar.gz 
```

### 1.2 配置启动

**1、配置zoo.cfg**

进入到conf目录拷贝一个zoo_sample.cfg并完成配置

```shell
#进入到conf目录
cd /opt/zooKeeper/apache-zooKeeper-3.5.6-bin/conf/
#拷贝
cp  zoo_sample.cfg  zoo.cfg
```



修改zoo.cfg

```shell
#打开目录
cd /opt/zooKeeper/
#创建zooKeeper存储目录
mkdir  zkdata
#修改zoo.cfg
vim /opt/zooKeeper/apache-zooKeeper-3.5.6-bin/conf/zoo.cfg
```

![在这里插入图片描述](https://img-blog.csdnimg.cn/9c0bca100ee645f4bc57da9a5209b257.png)

修改存储目录：dataDir=/opt/zookeeper/zkdata

**2、启动ZooKeeper**

```shell
# 在bin目录赋予权限
chmod a+xwr zkServer.sh

cd /opt/zooKeeper/apache-zooKeeper-3.5.6-bin/bin/
#启动
 ./zkServer.sh  start
```

![在这里插入图片描述](https://img-blog.csdnimg.cn/4bd7195be1034df38dc9cdaca83dc1a4.png)

看到上图表示ZooKeeper成功启动

**3、查看ZooKeeper状态**

```shell
./zkServer.sh status
```

zookeeper启动成功。standalone代表zk没有搭建集群，现在是单节点

![在这里插入图片描述](https://img-blog.csdnimg.cn/2f7108a32c964623ba24f1fe120cff0c.png)

zookeeper没有启动

![在这里插入图片描述](https://img-blog.csdnimg.cn/72deb6179ad44b41a6851702175eaa1d.png)