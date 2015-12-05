package cn.com.sealer.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Ŀ�����, ��֪���۲����Ĺ۲���, ���ṩע��(���)��ɾ���۲��ߵĽӿ�
 * @author mysealer
 *
 */
public class Subject {
	//��������ע��Ĺ۲��߶���
	private List<Observer> observers = new ArrayList<Observer>();	
	/**
	 * ���ָ���Ĺ۲���
	 * @param observer
	 */
	public void attach(Observer observer){
		observers.add(observer);
	}	
	/**
	 * ɾ��ָ���Ĺ۲���
	 * @param observer
	 */
	public void dettach(Observer observer){
		observers.remove(observer);
	}	
	/**
	 * ֪ͨ����ע��Ĺ۲��߶���
	 */
	protected void notifyObservers(){
		for(Observer observer : observers){
			observer.update(this);
		}
	}
	
}
