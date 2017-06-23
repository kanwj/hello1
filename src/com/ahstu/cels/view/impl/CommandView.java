/**
 * 
 */
package com.ahstu.cels.view.impl;

import com.ahstu.cels.view.IView;

/**
 * @description ���������е���ͼ����
 * @author ��ΰ��
 * @createDate ����10:19:50
 * @version ver1.0
 * 
 */
public class CommandView implements IView {

	/* (non-Javadoc)
	 * @see com.ahstu.cels.view.IView#description()
	 */
	@Override
	public void description() {
		System.out.println("###############################################");
		System.out.println("# ����Ŀ�Ǽ����Ӣ��ѧϰ��һ��С�����������Java��䣬����IO�����ӿڣ�ѭ��+��֧�ṹ�����");
		System.out.println("# ����ʹ�ù����У����κ����ʻ��飬����ϵfjinhao@qq.com");
		System.out.println("###############################################");
		System.out.println("-----------------------------------------------");
	}

	/* (non-Javadoc)
	 * @see com.ahstu.cels.view.IView#showMianMenu()
	 */
	@Override
	public void showMianMenu() {
		System.out.println(); //����
		System.out.println("# 1. ����ĸ˳���������");
		System.out.println("# 2. ����Ϸѧϰ����");
		System.out.println("# 3. �����Լ���ˮƽ��������⡿");
		System.out.println("# 0. �˳���");
		System.out.println();
		System.out.println("-----------------------------------------------");
	}

	/* (non-Javadoc)
	 * @see com.ahstu.cels.view.IView#showBaseMenu()
	 */

	/* (non-Javadoc)
	 * @see com.ahstu.cels.view.IView#subGameMenu()
	 */
	@Override
	public void subGameMenu() {
		System.out.println("-----------------------------------------------");
		System.out.println(" -> 1. ��ʾӢ�ģ��ش����ġ�ֻҪ���һ������ԡ�");
		System.out.println(" -> 2. ��ʾ���ģ��ش�Ӣ�ġ���Сд�����С�");
		System.out.println(" -> 0. ������һ��");
		System.out.println("-----------------------------------------------");
	}

	/* (non-Javadoc)
	 * @see com.ahstu.cels.view.IView#subTestingMenu()
	 */
	@Override
	public void subTestingMenu() {
		System.out.println("-----------------------------------------------");
		System.out.println(" -> 1. ��ʼ����");
		System.out.println(" -> 2. �ҵĲ��Լ�¼��ֻ��ʾ�����10�Ρ�");
		System.out.println(" -> 0. ������һ��");
		System.out.println("-----------------------------------------------");
	}

	/* (non-Javadoc)
	 * @see com.ahstu.cels.view.IView#subShowBaseMenu()
	 */
	@Override
	public void subShowBaseMenu() {
		System.out.println("------------");
		System.out.println("-> 1. �������");
		System.out.println("-> 2. ����ʻ�");
		System.out.println("-> 0. ������һ��");
		System.out.println("------------");
	}

}
