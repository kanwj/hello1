/**
 * 
 */
package com.ahstu.cels.dao;

import java.util.Map;
import java.util.Set;

import com.ahstu.cels.entity.Vocabular;
import com.ahstu.cels.entity.Word;

/**
 * @description ���word��Vocabulary�����ݷ��ʲ���
 * @author ��ΰ��
 * @createDate ����11:35:33
 * @ version ver1.0
 */
public interface IBaseTermDao {
	// 1. �����еĵ���
	Set<Word> getAllWords();
	
	// 2. �����еĴʻ�
	Set<Vocabular> getAllVocabulars();
	
	//�־û���Ӣ�Ļ��������
	
	void persist(Map<String, String> data, boolean en2cn);
}
