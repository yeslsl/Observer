package cn.com.sealer.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象, 他知道观察它的观察者, 并提供注册(添加)和删除观察者的接口
 * @author mysealer
 *
 */
public class Subject {
	//用来保存注册的观察者对象
	private List<Observer> observers = new ArrayList<Observer>();	
	/**
	 * 添加指定的观察者
	 * @param observer
	 */
	public void attach(Observer observer){
		observers.add(observer);
	}	
	/**
	 * 删除指定的观察者
	 * @param observer
	 */
	public void dettach(Observer observer){
		observers.remove(observer);
	}	
	/**
	 * 通知所有注册的观察者对象
	 */
	protected void notifyObservers(){
		for(Observer observer : observers){
			observer.update(this);
		}
	}
	
}
