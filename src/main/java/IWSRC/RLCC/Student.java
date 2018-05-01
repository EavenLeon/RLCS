package IWSRC.RLCC;

 /** 
 * @author: Yiwen Liang[ywhuak@163.com]
 * @date: Created on 11:20 2018/5/1 
 * @Description:  
 */
public class Student {
	private String name;
	private String lab;
	public Student(String name , String lab) {
		this.name = name;
		this.lab = lab;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLab() {
		return lab;
	}
	public void setLab(String lab) {
		this.lab = lab;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", lab=" + lab + "]";
	}
	
}
