/**
 * 
 */
package com.ahstu.cels.dao;

import java.util.List;

import com.ahstu.cels.entity.TestRecord;


/**
 * @description ���������
 * @author ��ΰ��
 * @createDate ����4:51:37
 * @ version ver1.0
 */
public interface ITestRecordDao {
	// 1. ������Լ�¼
	/*******************
	 * �Լ��ϵķ�ʽ�������еĲ��Լ�¼��ÿ�α���������ǣ�
	 * 1. �Ȱ�ԭ�������ݶ�ȡ��������һ������
	 * 2. �����µĲ������ݵ�������
	 * 3. ���°��µļ���д�ص��ļ���
	 * @param records
	 */
	void save(List<TestRecord> records);
	// 2. ��ѯ���еĲ��Լ�¼
	List<TestRecord> query();
	
}
