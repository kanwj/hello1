/**
 * 
 */
package test.com.ahstu.cels.dao;

import java.util.Set;

import org.junit.Test;

import com.ahstu.cels.dao.IBaseTermDao;
import com.ahstu.cels.dao.impl.BaseTermDaoImpl;
import com.ahstu.cels.entity.Vocabular;
import com.ahstu.cels.entity.Word;

/**
 * @description ���������
 * @author ��ΰ��
 * @createDate 2017��6��13�� ����5:40:24
 * @version ver1.0
 * 
 */
public class BaseTermDaoImplTest {
	private IBaseTermDao dao=new BaseTermDaoImpl();
	@Test
	public void testGetAllWords() {
		//
		Set<Word> words =dao.getAllWords();
		//
		if(words!=null) {
			for(Word w: words) {
				System.out.println(w);
			}
		}
		System.out.println("���ƣ�"+words.size());
	}
	@Test
	public void testGetAllVocabulars() {
		Set<Vocabular> vs = dao.getAllVocabulars();
		if (vs != null) {
			for (Vocabular v: vs) {
				System.out.println(v);
			}
		}
		System.out.println("�����У�"+vs.size()+" ������");
	}
}
