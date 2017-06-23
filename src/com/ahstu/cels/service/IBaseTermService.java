/**
 * 
 */
package com.ahstu.cels.service;

import java.util.List;
import java.util.Map;

import com.ahstu.cels.entity.PageBean;
import com.ahstu.cels.entity.Vocabular;
import com.ahstu.cels.entity.Word;

/**
 * @description ������ʴʻ�Ľӿ�
 * @author ��ΰ��
 * @createDate ����11:17:57
 * @ version ver1.0
 */
public interface IBaseTermService {
	Map<Character, List<Word>> getAllWords();
	//��ȡ���еĴʻ㣬�Է�ҳ��ʾ
	PageBean<Vocabular> getAllVocabulary();
}
