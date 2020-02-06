package cn.zephyr.xml;

import cn.zephyr.IndexService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: XmlBasedClazz
 * @Author: laizonghao
 * @Description: 基于xml配置方式的 Spring IOC
 * @Date: 2020/2/5 15:01
 */
public class XmlBasedClazz {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IndexService indexService = (IndexService)context.getBean("indexService");
        indexService.indexServiceFunc();
    }
}
