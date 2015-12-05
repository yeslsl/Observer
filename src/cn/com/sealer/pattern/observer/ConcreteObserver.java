package cn.com.sealer.pattern.observer;
/**
 * 具体的观察者对象, 实现更新的方法, 使自身的状和目标的状态保持一致
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
