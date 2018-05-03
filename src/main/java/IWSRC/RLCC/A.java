package IWSRC.RLCC;

import java.lang.reflect.Field;

/** 
 * @author: Yiwen Liang[ywhuak@163.com]
 * @date: Created on 21:13 2018/4/30 
 * @Description:  
 */
public class A {
	public static void my() {
		Lab lab = new Lab();
        for(Field field : lab.getClass().getDeclaredFields()){  
            if(field.isAnnotationPresent(ST.class)){  //如果存在MyTag标签  
            	ST st = field.getAnnotation(ST.class);  
            	lab.setStu(new Student(st.name(),st.lab()));  
            }  
        }  
		System.out.println(lab);
	}
}
