package dev.syntax.step06collection.advanced;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class MyArrayList<T> implements List<T> {
	// List 인터페이스를 직접 구현할 구현 클래스 MyArrayList
	// List 인터페이스를 구현하겠다고 선언 -> implements 인터페이스명
	// List<T> -> List<String>으로 만들 수도 있고, List<Person>으로 만들 수도 있기 때문에 어떤 타입이 올지모르니까
	// T라고 명시해두는 것
	// The type MyArrayList<T> must implement the inherited abstract method
	// List<T>.size() -> 메서드 구현하세요~
	
	// 멤버 필드 중에서 인스턴스 변수
	private int size; // 요소의 개수 추적용 필드 size
	private T[] array; // 실제로 요소를 저장하는 고정길이 배열 array
	
	// 기본 생성자
	public MyArrayList() {
		array = (T[])new Object[10];// 길이가 10인 Object 배열로 초기화, T[]로 명시적 형 변환
		size = 0; // 초기 사이즈 0, size란 실제로 들어있는 요소의 개수 기준으로 함
	}
	/**
	 * @return array에 들어있는 실제 요소의 개수(size)
	 */
	@Override
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		return "MyArrayList [size=" + size + ", array=" + Arrays.toString(array) + "]";
	}
	
	/**
	 * @param element - 배열의 가장 뒷 부분에 추가할 요소(값)
	 */
	@Override
	public boolean add(T element) {
		/*
		 * 현재 배열(array)에 여분의 공간이 없을 경우?
		 * 1. 현재 배열의 공간(length)보다 더 큰 배열을 만듦
		 * 2. 기존의 배열에 담겨있는 요소를 새롭게 생성한 배열에 복사(이동)
		 * 3. 새롭게 추가된 요소의 개수만큼 요소의 개수(size) 증가 (size=10에서 11로)
		 */
		if (size >= array.length) {
			System.out.println("현재 요소의 개수(" + size + ")가 현재 배열의 길이(공간의 크기)인 " + array.length + "보다 크거나 같습니다.");
			
			// 더 큰 배열을 만들고 요소들을 복사
			T[] biggerArray = (T[])new Object[array.length * 2]; // 기존 배열의 2배 크기의 새로운 배열 생성
			System.out.println("더 넓은 크기의 새로운 배열 biggerArray, length(" + biggerArray.length + "): " + Arrays.toString(biggerArray));
			
			/*
			 * src : 복사할 배열 이름
			 * srcPos: 복사할 배열의 첫 번째 위치
			 * dest: 복사해서 붙여넣을 대상 배열의 이름
			 * destPos: 복사해서 대상 배열에 붙여넣기를 시작할 첫 번째 위치
			 * length: src에서 dest으로 자료를 복사할 요소의 개수
			 */
			System.arraycopy(array, 0, biggerArray, 0, array.length);
			array = biggerArray; // array라는 필드로 쓸꺼니까
		}
		array[size] = element;
		size++;
		return true;
	}
	
	@Override
	public void add(int index, T element) {
		
	}
	@Override
	public T get(int index) {
		if(index <0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		return array[index];
	}
	/**
	 * @param index - index of the element to replace
	 * 
	 */
	@Override
	public T set(int index, T element) {
		T previousElement = array[index];
		array[index] = element;
		
		return previousElement;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ListIterator<T> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}