package cn.com.sealer.pattern.observer;
/**
 * 这是一个观察者接口, 定义一个更新的接口, 给那些在目标发生改变时被通知的对象
 * @author mysealer
 *
 */
public interface Observer {
	/**
	 * 更新的接口
	 * @param subject 传入目标对象, 方便获取相应目标的状态
	 */
	void update(Subject subject);
}
