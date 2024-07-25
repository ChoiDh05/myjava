package map.test;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MyJSONArrayTest {
	public static void main(String[] args) {
		
	
	JSONArray names = new JSONArray();
	names.put("최대환");
	names.put("김태희");
	
	JSONObject users = new JSONObject();
	try {
		users.put("age","27");
		users.put("city","seoul");
		users.put("names",names);
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(users);
	
	
	JSONObject product = new JSONObject();
	try {
		product.put("그래픽카드", "RTX4080");
		product.put("CPU", "라이젠7950X3D");
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	JSONArray desktop = new JSONArray();
	desktop.put(product);
	System.out.println(desktop);
}
}