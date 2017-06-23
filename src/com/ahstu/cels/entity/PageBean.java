/**
 * 
 */
package com.ahstu.cels.entity;

import java.util.List;

/**
 * @description ���������
 * @author ��ΰ��
 * @createDate ����9:43:29
 * @ version ver1.0
 */
public class PageBean<T> {
	//����
	//1.  �ܼ�¼����������DAO��
	private int count;
	//2 . ÿҳ�����С��������úõġ�
	private int rows;
	//3. Ҫ��ҳ������
	private List<T> data;
	//4. ��ҳ��
	private int pages;
	
	//5. ��һҳ
	private int first = 1;
	//6. ���һҳ
	private int last;
	//7. ǰһҳ
	private int previous;
	//8. ��һҳ
	private int next;
	//9. ��ǰҳ
	private int current = 1;
	//10. ��ҳ��ʽ
	private String style = "| 1 | 2 | 3 | ... |";
	/**
	 * @param count
	 * @param rows
	 */
	public PageBean(int count, int rows) {
		super();
		this.count = count;
		this.rows = rows;
		//1.����������
		this.pages = this.count % this.rows == 0 ?
				this.count / this.rows : this.count / this.rows + 1;
		//����setCurrent������Ĭ���ǵ�һҳ
		setCurrent(1);
	}
	public void setCurrent(int current) {
		//��current ��ֵ
		
		//�޸�����������ֵ
		if (current < 0)
			this.current = 1;
		else if (current > this.pages) {
			this.current = this.pages;
		}
		else {
			this.current = current;
		}
		this.last = this.pages;
		//
		this.next = this.current  == this.last ? this.current : this.current + 1;
		//
		this.previous = this.current  == this.first ? this.first : this.current - 1;
		//����style
		this.style = this.current >= this.pages - 3 ?
				"| 1 | 2 | 3 | . . . | " + this.pages + " |" :
				"| " + this.current + " | " + (this.current + 1) + " | " + (this.current + 2)
				+" | . . . | " + this.pages + " |";
				
	}
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	/**
	 * @return the rows
	 */
	public int getRows() {
		return rows;
	}
	/**
	 * @return the data
	 */
	public List<T> getData() {
		return data;
	}
	/**
	 * @return the pages
	 */
	public int getPages() {
		return pages;
	}
	/**
	 * @return the first
	 */
	public int getFirst() {
		return first;
	}
	/**
	 * @return the last
	 */
	public int getLast() {
		return last;
	}
	/**
	 * @return the previous
	 */
	public int getPrevious() {
		return previous;
	}
	/**
	 * @return the next
	 */
	public int getNext() {
		return next;
	}
	/**
	 * @return the current
	 */
	public int getCurrent() {
		return current;
	}
	/**
	 * @return the style
	 */
	public String getStyle() {
		return style;
	}
}
