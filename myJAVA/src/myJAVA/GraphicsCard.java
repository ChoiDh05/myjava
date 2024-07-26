package myJAVA;

import java.util.Objects;

public class GraphicsCard extends PC{
	private String id; //제품아이디
	private String name; //제품이름 예) 4080SUPER 불칸
	private String kind; //엔비디아 or 라이젠
	private String brand; //ASUS, MSI, 기가바이트 등
	private String tier; //제품 등급: 4080S, 4090, 4070등
	private int price; // 가격
	
//	public GraphicsCard() {;}
//	
//	public GraphicsCard(GraphicsCard graphicsCard) {
//		this(graphicsCard.getId(), graphicsCard.getName(), graphicsCard.getkind(), graphicsCard.getBrand(),  graphicsCard.getTier(), graphicsCard.getPrice());
//		
//	}
//
//
	public GraphicsCard(String id, String name, String kind, String brand, String tier, int price) {
		super(id, name, kind, brand, price);
		this.tier = tier;
	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getKind() {
//		return kind;
//	}
//
//	public void setKind(String kind) {
//		this.kind = kind;
//	}
//
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public String getkind() {
//		return kind;
//	}
//
//	public void setkind(String kind) {
//		this.kind = kind;
//	}
//
//	public String getBrand() {
//		return brand;
//	}
//
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//
	public String getTier() {
		return tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}

//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
//

	
	@Override
	public String toString() {
		return "GraphicsCard [tier=" + tier + "]";
	}
	
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		GraphicsCard other = (GraphicsCard) obj;
//		return id.equals(other.id);
//	}
	
	
}
