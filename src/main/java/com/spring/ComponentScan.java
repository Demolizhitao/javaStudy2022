package com.spring;

import org.springframework.context.annotation.ComponentScans;

import java.lang.annotation.*;

/**
 * <p>类  名：com.spring.ComponentScan</p>
 * <p>类描述：todo</p>
 * <p>创建人：xxxx</p>
 * <p>创建时间：2022/10/28 17:02</p>
 * <p>修改人：</p>
 * <p>修改时间：</p>
 * <p>修改备注：</p>
 *
 * @author xxxx
 * @version 1.0
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface ComponentScan {

    String value() default "";
}
