package cn.com.sealer.pattern.observer;
/**
 * ����Ĺ۲��߶���, ʵ�ָ��µķ���, ʹ�����״��Ŀ���״̬����һ��
 * @author mysealer
 *
 */
public class ConcreteObserver implements Observer {
	
	private String observerState;
	@Override
	public void update(Subject subject) {
		observerState = ((ConcreteSubject)subject).getSubjectState();
	}
	
	
	public String getObserverState() {
		return observerState;
	}
	
	
}
