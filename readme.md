## 带单元测试的springboot  web 简单项目

### 例子

> DemoControllerTest

1. 重写了`EnableAutoConfiguration`类,手动指定需要加载的`AutoConfiguration`类
2. 对service方法进行了两种mock例子
3. 由于dubbo自带的reference注解是在初始化本地bean的时候给自动设置的，如果想自动修改mock需要重新`AnnotationInjectedBeanPostProcessor<Reference>`

### test
`gradle test`


