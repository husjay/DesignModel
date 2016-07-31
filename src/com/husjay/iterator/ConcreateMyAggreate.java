package com.husjay.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义聚合类
 * @author hsj
 *
 */
public class ConcreateMyAggreate {
	
	private List<Object> list = new ArrayList<Object>();

	public ConcreateMyAggreate() {
		super();
	}
	
	public void addObject(Object object) {
		this.list.add(object);
	}
	
	public void removeObject(Object object) {
		this.list.remove(object);
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}
	
	/**
	 * 获得迭代器
	 * @return
	 */
	public MyIterator createIterator() {
		return new ConcreateIterator();
	}
	
	private class ConcreateIterator implements MyIterator {
		
		//记录遍历位置
		private int cursor;

		@Override
		public void first() {
			cursor = 0;
		}

		@Override
		public void next() {
			if(cursor < list.size()) {
				cursor++;
			}
		}

		@Override
		public boolean hasNext() {
			if(cursor < list.size()) {
				return true;
			}
			return false;
		}

		@Override
		public boolean isFirst() {
			return cursor == 0 ? true : false;
		}

		@Override
		public boolean isLast() {
			return cursor == list.size() - 1 ? true : false;
		}

		@Override
		public Object getCurrentObj() {
			return list.get(cursor);
		}
		
	}
	
}
