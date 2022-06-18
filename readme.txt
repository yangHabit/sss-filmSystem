springMVC 管理控制层对象

web.xml(web项目最重要的配置文件）
	创建spring容器
	创建springMVCz中央调度器 DispatcherServlet
spring .xml
	<bean>标签  /   自动扫描
springMVC.xml
	配置控制层对象
	配置视图解析器
spring+mybatis
mybatis封装了连接池的使用
整合就是 通过spring 创建sqlSessionFactory对象
	可以配置数据源 配置mybatis的xml文件 以及动态sql的xml文件

先创建包结构--各类配置文件--在编写功能代码--mapper接口及xml配置


1.引入依赖（pom.xml)
2.更改配置：从web.xml开始

[影片列表功能]
图片存储？A 直接存在数据库中  B存储到某个位置后数据库存储地址
影片表 film
id bigint 主键自增
film_id varchar 电影唯一id
file_name  varchar 电影名
img_path varchar 海报地址


前端页面 ---JSP

jstl标签库==
引入 依赖===在页面中引入taglib --使用核心标签


影片表 film
id bigint 主键自增
film_id varchar 电影唯一id
file_name  varchar 电影名
img_path varchar 海报地址

director varchar 导演
player varchar 主演列表
type varchar 类型（也可以另外设置一张表 关联起来）
country varchar 制片国家
length int 片长
synopsis varchar 剧情介绍
play_time date 上映时间



影片详情：
在列表页中增加对详情的跳转链接
在controller层接受、处理、获取数据、渲染结果等

影院表 cinema
cinema_id  cinema_name address telphone  desc

排片表play
play_id film_id cinema_id play_time languge room_id price seat_info（作为信息）

放映厅表room
room_id cinema_id room_name seat_info（作为信息）

订单表 order
order_id create_time user_id play_id  cnt(票的数量） seat（具体座位） price订单总格
支付状态（未支付）

座位通过二维数组表示