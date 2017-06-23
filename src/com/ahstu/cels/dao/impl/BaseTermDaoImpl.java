/**
 * 
 */
package com.ahstu.cels.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.ahstu.cels.dao.IBaseTermDao;
import com.ahstu.cels.entity.Vocabular;
import com.ahstu.cels.entity.Word;

/**
 * @description ���������
 * @author ��ΰ��
 * @createDate ����4:59:21
 * @ version ver1.0
 */
public class BaseTermDaoImpl implements IBaseTermDao {
	/**
	 * ��������еĵ��ʵ������ļ�
	 */
	private static final String WORD_FILE = "datas/dic/w.dic";
	/**
	 * ��������еĴʻ�������ļ�
	 */
	private static final String VOCABULAR_FILE = "datas/dic/v.dic";
	/* (non-Javadoc)
	 * @see com.ahstu.cels.dao.IBaseTermDao#getAllWords()
	 */
	@Override
	public Set<Word> getAllWords() {
		// 1. ����File ����
		File file = new File(WORD_FILE);
		// 2. �ж��ļ��Ƿ����
		if (!file.exists() && file.isFile()) {
			// System.out.println("���������ļ������ڣ��뱣֤���ļ�����...");
			throw new RuntimeException("���������ļ�������...");
		}
		// ����һ������ ���������еĵ���
		Set<Word> words = new HashSet<>();
		// 3. ����ļ����ڣ����ȡ, ת����IO��
		try (BufferedReader br = new BufferedReader(new FileReader(file));){
			// ��ȡ
			String line = null; // ���ڱ���ÿ�ζ�������
			Word w = null; // ���word���󡣡������Ķ�����÷������桿
			// 4. ѭ����ȡ�����Ѷ���������ת����word����
			while ((line = br.readLine()) != null) {
				// ���������line�������ݡ�������ת����word����
				String[] temp = line.split("\\s+");
				String en = temp[0]; // ��һ��Ԫ����Ӣ��
				String cn = temp[1]; // �ڶ���Ԫ��������
				// ����һ��Word
				w = new Word(en, cn.split(":+"));
				// 5. �����Word��ӵ�������
				words.add(w);
			}
		} catch (IOException e) {
			// ��ӡ�쳣��ջ
			e.printStackTrace();
		}
		// 6. ����
		return words;
	}

	/* 
	 * (non-Javadoc)
	 * @see com.ahstu.cels.dao.IBaseTermDao#getAllVocabulars()
	 */
	@Override
	public Set<Vocabular> getAllVocabulars() {
		// 1. ����File ����
				File file = new File(VOCABULAR_FILE);
				// 2. �ж��ļ��Ƿ����
				if (!file.exists() && file.isFile()) {
					// System.out.println("���������ļ������ڣ��뱣֤���ļ�����...");
					throw new RuntimeException("�ʻ���ļ�������...");
				}
				// ����һ������ ���������еĵ���
				Set<Vocabular> words = new HashSet<>();
				// 3. ����ļ����ڣ����ȡ, ת����IO��
				try (BufferedReader br = new BufferedReader(new FileReader(file));){
					// ��ȡ
					String line = null; // ���ڱ���ÿ�ζ�������
					Vocabular w = null; // ���word���󡣡������Ķ�����÷������桿
					// 4. ѭ����ȡ�����Ѷ���������ת����word����
					while ((line = br.readLine()) != null) {
						// ���������line�������ݡ�������ת����word����
						String[] temp = line.split("#+");
						String en = temp[0]; // ��һ��Ԫ����Ӣ��
						String cn = temp[1]; // �ڶ���Ԫ��������
						String abbr = null; //����������д
						if (temp.length > 2) { //˵������������д
							abbr = temp[2];
						}
						// ����һ��Word
						w = new Vocabular(en, cn.split(":+"), abbr);
						// 5. �����Word��ӵ�������
						words.add(w);
					}
				} catch (IOException e) {
					// ��ӡ�쳣��ջ
					e.printStackTrace();
				}
				// 6. ����
				return words;
	}

	/* (non-Javadoc)
	 * @see com.ahstu.cels.dao.IBaseTermDao#persist(java.util.Map, boolean)
	 */
	@Override
	public void persist(Map<String, String> data, boolean en2cn) {
		// TODO Auto-generated method stub
		//�־û����϶���
	}

}
