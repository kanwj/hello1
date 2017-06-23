/**
 * 
 */
package com.ahstu.cels.service;

import java.util.List;

import com.ahstu.cels.entity.BaseTerm;
import com.ahstu.cels.entity.TestRecord;

/**
 * @description ���������
 * @author��ΰ��
 * @createDate ����11:28:38
 * @ version ver1.0
 */
public interface ITestingService {
	//1. �����û�����Ĳ������ݡ���ȡ��������
	/******
	 * 
	 * @param items �û�������Ե�����
	 * @return
	 */
	List<BaseTerm> getTestingData(int items);
	//2. ��ȡ���еĲ��Լ�¼�����10�Ρ�
	/****
	 * 
	 * @return �������10�εĲ��Լ�¼�������е�
	 */
	List<TestRecord> getALLTestRecord();
	
	//3. �����������
	/*******
	 * 
	 * @param record Ҫ�־û��Ĳ�������
	 */
	void saveTestRecord(TestRecord record);
}
