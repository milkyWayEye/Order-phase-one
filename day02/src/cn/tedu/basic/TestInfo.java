package cn.tedu.basic;
/**����������ɸ�����Ϣ�������*/
public class TestInfo {
	public static void main(String[] args) {
		/**
		 * 1.��������Ĺ��򣺱��������� ���������� ������ֵ
		 * 2.��������
		 */
		int age = 18;//��ʾ�������䣬ֵΪ18
		double salary = 100000.99;//��ʾ����нˮ��ֵΪ100000.99
		/**һ���ַ�����Java����String����Ҳ�����ַ������ͱ���
		 * ע�⣺String���͵�������Ҫʹ��""��������*/
		String name = "����";
		//3.����ͨ����ӡ���鿴������ֵ
		System.out.println(age);
		/**3.���ǿ���ʹ��+�Ѿ�̬�����붯̬����ƴ������*/
		System.out.println("����"+name);
		System.out.println(String.format("Java�ܹ�ʦ%s����%d��,��н%f,�п�Java����������"
				+ "�õ�����",name,age,salary));
	}
}
