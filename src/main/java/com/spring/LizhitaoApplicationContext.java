package com.spring;


import java.io.File;
import java.net.URL;

/**
 * <p>类  名：com.spring.LizhitaoApplicationContext</p>
 * <p>类描述：todo</p>
 * <p>创建人：lzhit</p>
 * <p>创建时间：2022/10/28 16:55</p>
 * <p>修改人：</p>
 * <p>修改时间：</p>
 * <p>修改备注：</p>
 *
 * @author lzhit
 * @version 1.0
 */
public class LizhitaoApplicationContext {


    public LizhitaoApplicationContext(Class configClass) {

        System.out.println("进入自己写的逻辑");
        if(configClass.isAnnotationPresent(ComponentScan.class)){
            ComponentScan componentScan = (ComponentScan) configClass.getAnnotation(ComponentScan.class);
            String classPath = componentScan.value();

            classPath = classPath.replace(".","/");
            System.out.println(classPath);
            ClassLoader classLoader = LizhitaoApplicationContext.class.getClassLoader();
            URL resource = classLoader.getResource(classPath);
            System.out.println(resource.getFile());
            File file = new File(resource.getFile());
            //File file = new File(classPath);
            for (File listFile : file.listFiles()) {
               // System.out.println(listFile);
            }
        }

    }

    public Object getBean(String beanName){

        return null;
    }
}
