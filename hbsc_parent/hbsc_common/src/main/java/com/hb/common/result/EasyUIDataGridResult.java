package com.hb.common.result;



import java.io.Serializable;
import java.util.List;

public class EasyUIDataGridResult<T> implements Serializable{

	private long total;//总共多少条
	private List<T> rows;//这个条件下有多少行
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	
}
