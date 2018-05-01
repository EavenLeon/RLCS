package IWSRC.RLCC;

 /** 
 * @author: Yiwen Liang[ywhuak@163.com]
 * @date: Created on 11:23 2018/5/1 
 * @Description:  
 */
public class Lab {
	@ST
	private Student stu;

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	@Override
	public String toString() {
		return "Lab [stu=" + stu + "]";
	}
	
}
