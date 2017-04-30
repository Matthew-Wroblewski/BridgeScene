package interpreter;

import java.util.ArrayList;

public interface Map<T> {
	
	public void put(String key,Object val);
	public Object get(String key);
	public ArrayList<String> getArrayList();
	public ArrayList<Object> getArrayList1();
}
