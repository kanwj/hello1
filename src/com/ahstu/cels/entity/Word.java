/**
 * 
 */
package com.ahstu.cels.entity;

/**
 * @description ������
 * @author ��ΰ��
 * @createDate ����5:24:20
 * @version ver1.0
 * 
 */
public class Word extends BaseTerm{
	/**
	 * 
	 */
	private static final long serialVersionUID = -857523324430612615L;
	public Word(String en, String []cn) {
		super(en, cn);
		this.captical = en.toUpperCase().charAt(0);
	}

	

	//����
	//1. ����ĸ����д��
	private Character captical;
	//������Ҫ���������������



	public Character getCaptical() {
		return captical;
	}
}
