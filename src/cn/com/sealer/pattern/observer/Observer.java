package cn.com.sealer.pattern.observer;
/**
 * ����һ���۲��߽ӿ�, ����һ�����µĽӿ�, ����Щ��Ŀ�귢���ı�ʱ��֪ͨ�Ķ���
 * @author mysealer
 *
 */
public interface Observer {
	/**
	 * ���µĽӿ�
	 * @param subject ����Ŀ�����, �����ȡ��ӦĿ���״̬
	 */
	void update(Subject subject);
}
