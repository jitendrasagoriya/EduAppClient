package com.eduapp.client.json;

import java.util.ArrayList;

public class Responce<T> {

	private ArrayList<T> content;

	public ArrayList<T> getContent() {
		return this.content;
	}

	public void setContent(ArrayList<T> content) {
		this.content = content;
	}

	private Pageable pageable;

	public Pageable getPageable() {
		return this.pageable;
	}

	public void setPageable(Pageable pageable) {
		this.pageable = pageable;
	}

	private boolean last;

	public boolean getLast() {
		return this.last;
	}

	public void setLast(boolean last) {
		this.last = last;
	}

	private int totalPages;

	public int getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	private int totalElements;

	public int getTotalElements() {
		return this.totalElements;
	}

	public void setTotalElements(int totalElements) {
		this.totalElements = totalElements;
	}

	private boolean first;

	public boolean getFirst() {
		return this.first;
	}

	public void setFirst(boolean first) {
		this.first = first;
	}

	private Sort2 sort;

	public Sort2 getSort() {
		return this.sort;
	}

	public void setSort(Sort2 sort) {
		this.sort = sort;
	}

	private int numberOfElements;

	public int getNumberOfElements() {
		return this.numberOfElements;
	}

	public void setNumberOfElements(int numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

	private int size;

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	private int number;

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	private boolean empty;

	public boolean getEmpty() {
		return this.empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

}
