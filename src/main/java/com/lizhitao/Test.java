package com.lizhitao;

import com.lizhitao.service.UserService;
import com.spring.LizhitaoApplicationContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>类  名：com.lizhitao.Test</p>
 * <p>类描述：todo</p>
 * <p>创建人：lzhit</p>
 * <p>创建时间：2022/10/28 16:33</p>
 * <p>修改人：</p>
 * <p>修改时间：</p>
 * <p>修改备注：</p>
 *
 * @author lzhit
 * @version 1.0
 */
@Slf4j
public class Test {

    public static void main(String[] args) {

        LizhitaoApplicationContext applicationContext = new LizhitaoApplicationContext(AppConfig.class);

        UserService obj = (UserService) applicationContext.getBean("userService");
        obj.test();
        System.out.println(obj);
    }
}
