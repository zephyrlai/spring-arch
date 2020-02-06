package cn.zephyr.anno;

import cn.zephyr.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: AnnoBasedClazz
 * @Author: laizonghao
 * @Description:
 * @Date: 2020/2/6 14:39
 */
public class AnnoBasedClazz {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IndexService indexService = (IndexService)context.getBean("indexService");
        indexService.indexServiceFunc();
    }
}
