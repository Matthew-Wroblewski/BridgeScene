package interpreter;

import java.util.ArrayList;

public interface GenericTable<KeyType,ValueType> {
	
	public void put(KeyType key,ValueType val);
	public ValueType get(String key);
	public ArrayList<String> getArrayList();
	public ArrayList<Object> getArrayList1();
}
