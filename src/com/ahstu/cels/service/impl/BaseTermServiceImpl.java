/**
 * 
 */
package com.ahstu.cels.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.ahstu.cels.dao.IBaseTermDao;
import com.ahstu.cels.dao.impl.BaseTermDaoImpl;
import com.ahstu.cels.entity.PageBean;
import com.ahstu.cels.entity.Vocabular;
import com.ahstu.cels.entity.Word;
import com.ahstu.cels.service.IBaseTermService;

/**
 * @description ���������
 * @author ��ΰ��
 * @createDate ����8:52:36
 * @ version ver1.0
 */
public class BaseTermServiceImpl implements IBaseTermService{
	
	//��daoΪ֧��
	private IBaseTermDao baseTermDao = new BaseTermDaoImpl();
	/* (non-Javadoc)
	 * @see com.ahstu.cels.service.IBaseTermService#getAllWords()
	 */
	@Override
	public Map<Character, List<Word>> getAllWords() {
		//1. ����һ��Map������������յĽ��
		Map<Character, List<Word>> results = new TreeMap<>();
		//2. ������dao��ȡ��Set<Word>����
		Set<Word> words = baseTermDao.getAllWords();
		// ����һ��List������������о�����ͬ����ĸ�ĵ���
		List<Word> wordList = null; // �ݲ���ʼ��
		//3. �����ж����Word������ĸ�Ƿ������Map�У����û�г�����Map�У��򴴽�һ���µ�List������������Word,����
		//����ĸ�����List��ӵ�Map��
		
		for (Word w: words) {
			// ��ȡ������ʵ�����ĸ
			Character letter = w.getCaptical();
			// �ж�map ���Ƿ��Ѿ������������ĸ��Ӧ�ļ�¼
			if (results.containsKey(letter)) {
				// ˵�����Map���Ѿ������������ĸ�ļ�¼��,ֱ�Ӹ���key����ȡ��value
				wordList = results.get(letter);
			}else {
				// ˵�������map�л�û���������ĸ�ļ�¼���򴴽��µ�List
				wordList = new ArrayList<>();
				// �����������ĸ�뼯�ϵ�ӳ���ϵ��ӵ�map��
				results.put(letter, wordList);
			}
			// �����������ӵ�List��
			wordList.add(w);
		}
		// ����result
		return results;
	}

	/* (non-Javadoc)
	 * @see com.ahstu.cels.service.IBaseTermService#getAllVocabulary()
	 */
	@Override
	public PageBean<Vocabular> getAllVocabulary() {
		// TODO Auto-generated method stub
		return null;
	}

}
