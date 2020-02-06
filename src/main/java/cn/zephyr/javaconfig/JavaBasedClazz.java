package cn.zephyr.javaconfig;

import cn.zephyr.IndexService;
import cn.zephyr.anno.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: JavaBasedClazz
 * @Author: laizonghao
 * @Description:
 * @Date: 2020/2/6 14:59
 */
public class JavaBasedClazz {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(SpringConfig.class);
        IndexService indexService = (IndexService)context.getBean("indexService");
        indexService.indexServiceFunc();
    }
}
