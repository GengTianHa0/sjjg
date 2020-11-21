package com.分类一.shuzu.shuzu;




public class Array<E>{


	private E[] data;
	private int size;

	public int getSize() {
		return size;
	}


	public Array(E e){

		data=(E[]) new Object[(Integer) e];
		size=0;
	}

	public Array(){

		data=(E[]) new Object[10];
		size=0;
	}


	/**
	 *
	 * =========================增加===================
	 * @param index
	 * @param e
	 */
	//在第index个位置插入一个新元素
	public void add(int index, E e){

		if(index < 0 || index > size)
			throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");

		if(size == data.length)
			resize(2 * data.length);

		for(int i = size - 1; i >= index ; i --)
			data[i + 1] = data[i];

		data[index] = e;

		size ++;
	}
	private void resize(int newCapacity) {
		E[] newData= (E[]) new Object[newCapacity];
		for(int i=0;i<size;i++){
			newData[i]=data[i];
		}
		data=newData;
	}
	//在开始位置插入
	public void addFrist(E e){

		add(0,e);

	}
	//在末位插入
	public void addLast(E e){

		add(size,e);

	}

	/**
	 *
	 * =========================删除===================
	 * @param index
	 * @param
	 */


	//从数组中删除index位置的元素，返回删除的元素
	public E remove(int index){
		if(index < 0 || index >= size)
			throw new IllegalArgumentException("Remove failed. Index is illegal.");

		E ret = data[index];
		for(int i = index + 1 ; i < size ; i ++)
			data[i - 1] = data[i];
		size --;
		data[size] = null; // loitering objects != memory leak

		if(size == data.length / 2)
			resize(data.length / 2);
		return ret;

	}


	//删除第一个
	public E removeFrist(){

		return remove(0);

	}

	//删除最后一个
	public E removeLast(){
		return remove(size-1);
	}

	//查看数组中是否有元素e，如果有则删除

	public void removeElement(E e){

		int i=find(e);
		if(i!=-1){
			remove(i);
		}


	}







	/**
	 *
	 * =========================修改===================
	 * @param index
	 * @param e
	 */




	//修改index索引位置的元素
	public void set(int index,E e){
		if(index<0||index>=size){

			throw new IllegalArgumentException("Get failed Index is illegal");
		}

		data[index]=e;
	}


	/**
	 *
	 * =========================查看===================
	 * @param index
	 * @param
	 */

	//根据索引去查找
	public E get(int index){

		if(index<0||index>=size){

			throw new IllegalArgumentException("Get failed Index is illegal");
		}

		return data[index];
	}

	//查找数组中是否有元素e
	public boolean contains(E e){

		for(int i=0;i<size;i++){

			if(data[i]==e){
				return true;
			}
		}
		return false;
	}

	//查看数组是否为空

	public boolean isEmpty(){

		return size==0;
	}

	public int find(E e){

		for(int i=0;i<size;i++){
			if(e==data[i]){
				return i;
			}
		}

		return -1;
	}

	//toString
	@Override
	public String toString(){
		StringBuilder res=new StringBuilder();


		res.append('[');
		for(int i=0;i<size;i++){

			res.append(data[i]);

			if(i!=size-1){
				res.append(", ");
			}
		}
		res.append(']');
		res.append(String.format("Array: size = %d , capacity = %d\n",size,data.length));
		return res.toString();
	}

}