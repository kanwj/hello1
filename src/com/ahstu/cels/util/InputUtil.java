/**
 * 
 */
package com.ahstu.cels.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description ���������
 * @author ��ΰ��
 * @createDate ����3:45:25
 * @version ver1.0
 * 
 */
public class InputUtil {
	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	/**
	 * �����û�����ʾ����ȡһ������
	 * @param msg ��ʾ��Ϣ
	 * @return
	 */
	 public synchronized static int getInt(String msg) {
		int result = 0;
		try {
			// �����ʾ��Ϣ
			System.out.println(msg);
			String line = br.readLine(); // ���û������뵱�����ַ��������ж�ȡ
			if (line != null && line.trim().length() > 0) {
				result = Integer.parseInt(line);
			}else {
				System.out.println(" >> �����ȫ�ǿհ��ַ�����������");
				return getInt(msg);
			}
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
			// �ص��Լ�
			return getInt(msg);
		}catch (RuntimeException e) {
			System.out.println(" >> �����Ĳ�������");
			//�ص��Լ�
			return getInt(msg);
		}
		//���ض���������
		return result;
	}
	 
	 /******
	  * �Ӽ��̶�ȡһ���ַ�
	  * @param msg
	  * @return
	  */
	public synchronized static char getChar(String msg) {
		char result = ' ';
		try {
			//��ʾ
			System.out.println(msg);
			//��ȡ
			String line = br.readLine();
			//ȡ����һ����ĸ
			result = line.charAt(0);
			//�ж��Ƿ�����ĸ
			if (!Character.isLetter(result)) {
				// ���µ����Լ�
				System.out.println("���棬����Ĳ�����ĸ");
				return getChar(msg);
			}
		} catch (IOException e) {
			System.out.println("error, IO����");
			return getChar(msg);
		}
		// ����
		return result;
	}
}
