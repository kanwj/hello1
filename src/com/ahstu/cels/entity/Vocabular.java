/**
 * 
 */
package com.ahstu.cels.entity;

/**
 * @description ���������
 * @author ��ΰ��
 * @createDate ����5:27:01
 * @version ver1.0
 * 
 */
public class Vocabular extends BaseTerm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7709059420195809459L;
	//����
	//1. ���
	private String abbr;
	// ������Ҫ���������������

	public Vocabular(String en, String[] cn, String abbr) {
		super(en, cn);
		this.abbr = abbr;
	}

	public String getAbbr() {
		return abbr;
	}

	public void setAbbr(String abbr) {
		this.abbr = abbr;
	}
	
}
