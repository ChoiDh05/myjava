package json.array.task;

import org.json.JSONArray;
import org.json.JSONObject;

import list.task.DBConnecter;

public class Page {
	public static void main(String[] args) {
		Computer computer = new Computer();
		
		Desktop rtx4090 = new Desktop(1, "RTX4090", "MSI", 2_500_000, 20);
		Desktop amdCPU = new Desktop(2, "Ryzen7950X3D", "AMD", 850_000, 18);
		Desktop mainBord = new Desktop(3, "X670-E", "MSI", 550_000, 12);
		Desktop ram = new Desktop(4, "G.Skill.32GB", "G.Skill", 300_000, 7);
		Desktop power = new Desktop(5, "HX.1200W", "Corsair", 320_000, 5);
		Desktop caseHyte = new Desktop(6, "HYTE.Y.70", "HYTE", 550_000, 17);
		Desktop cooler = new Desktop(7, "Kraken", "NZXT", 300_000, 11);
		
//		상품 추가
		computer.add(rtx4090);
		computer.add(amdCPU);
		computer.add(mainBord);
		computer.add(ram);
		computer.add(power);
		computer.add(caseHyte);
		computer.add(cooler);
		
//		상품 조회
		Desktop findProduct = computer.findDesktop("RTX4090");
        if (findProduct != null) {
            System.out.println("Found Product: " + findProduct.toJSON().toString());
        } else {
            System.out.println("Product not found.");
        }
		
		
//		모든 Desktop 객체를 JSON으로 변환하여 JSONArray에 추가
		JSONArray jsonArray = new JSONArray();
		for (int i = 0; i < DBConnecter.desktop.size(); i++) {
			Desktop desktop = DBConnecter.desktop.get(i);
			jsonArray.put(desktop.toJSON());
		}
		System.out.println(jsonArray.toString());
	}
}
