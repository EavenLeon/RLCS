package IWSRC.RLCC;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** 
 * @author: Yiwen Liang[ywhuak@163.com]
 * @date: Created on 11:17 2018/5/1 
 * @Description:  
 */

@Target({ElementType.METHOD,ElementType.FIELD})  
@Inherited  
@Retention(RetentionPolicy.RUNTIME) 
public @interface ST {

	String name() default "梁益闻哈哈哈哈哈哈哈";
	String lab() default "207哈哈哈哈哈哈哈";
}
