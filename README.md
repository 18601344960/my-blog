
<h1><a href="https://www.zhaozijing.cn">my-blog</a></h1>

# 本开源项目一切为了更好的学习和实践

>my-blog

> 博客基本功能都已实现，后续还会一直更新下去！本项目基于mayDay基础进行更改

## 使用说明
1. 下载代码
`git clone https://github.com/18601344960/my-blog.git`
2. 运行sql文件夹下的sql文件
3. 到src/main/resources下的application.yaml下修改你的数据库链接
4. 保存好以后 mvn package打包
5. 进入target文件夹运行nohup java -jar my-blog.jar &

### 如果使用又拍云cdn的话请到参数跟随里面设置全程跟随以及开启重定向跟随


### 关于评论功能
目前没有打算自己写评论功能。用的两个评论插件[gitalk](https://github.com/gitalk/gitalk)和[valine](https://ioliu.cn/2017/add-valine-comments-to-your-blog/)
## 图片演示
![install.png](http://www.zhaozijing.top/upload/2020/3/myblog-0120200315183520487.png)
![index.png](http://www.zhaozijing.top/upload/2020/3/myblog-0220200315183349296.png)
![login.png](http://www.zhaozijing.top/upload/2020/3/myblog-032020031518334921.png)
![admin.png](http://www.zhaozijing.top/upload/2020/3/myblog-0420200315183349882.png)
## 开源协议
[MIT](https://github.com/18601344960/my-blog/blob/master/LICENSE)
## 致谢：
 1. [SpringBoot](http://spring.io/projects/spring-boot) 版本2.0.4
 2. [MyBatis](http://www.mybatis.org/mybatis-3/) ORM框架
 3. [MySQL](https://www.mysql.com/) 数据库，版本5.6
 4. [Maven](http://maven.apache.org/)  依赖管理
 5. [Druid](https://github.com/alibaba/druid/) 阿里连接池
 6. [Thymeleaf](https://www.thymeleaf.org/) spring官方推荐的模板引擎
 7. [Vali Admin](https://github.com/pratikborsadiya/vali-admin) 后台模板
 8. [jquery toast插件](http://www.jqueryfuns.com/resource/2412) 信息提示插件
 9. [Font Awesome](http://www.fontawesome.com.cn/faicons/) 图标库
 10. [Thumbnailator](https://github.com/coobird/thumbnailator) 压缩图片工具类
 11. [Hutool](http://hutool.mydoc.io/) Hutool是一个Java工具包
 12. [PageHelper](https://pagehelper.github.io/) mybatis分页插件
 13. [Bootstrap-Fileinput](https://github.com/kartik-v/bootstrap-fileinput) bootstrap上传控件
 14. [halo](https://github.com/ruibaby/halo)  halo博客系统
 15. [Ehcache](http://www.ehcache.org/) Java的进程内缓存框架
 16. [MDTool](https://github.com/cevin15/MDTool) 将markdown转换为html的工具



