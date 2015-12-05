package cn.com.sealer.pattern.observer;
/**
 * �����Ŀ�����, ������й�״̬������Ӧ�Ĺ۲��߶�����
 * @author mysealer
 *
 */
public class ConcreteSubject extends Subject {
	//Ŀ������״̬
	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
		this.notifyObservers(); 
	}
	
	
}
