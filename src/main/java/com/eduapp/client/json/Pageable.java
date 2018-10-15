package com.eduapp.client.json;

public class Pageable {

	private Sort sort;

	public Sort getSort() {
		return this.sort;
	}

	public void setSort(Sort sort) {
		this.sort = sort;
	}

	private int pageSize;

	public int getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	private int pageNumber;

	public int getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	private int offset;

	public int getOffset() {
		return this.offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	private boolean unpaged;

	public boolean getUnpaged() {
		return this.unpaged;
	}

	public void setUnpaged(boolean unpaged) {
		this.unpaged = unpaged;
	}

	private boolean paged;

	public boolean getPaged() {
		return this.paged;
	}

	public void setPaged(boolean paged) {
		this.paged = paged;
	}

}
