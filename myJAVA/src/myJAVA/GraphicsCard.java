package myJAVA;

import java.util.Objects;

public class GraphicsCard extends PC{
	private String id;
	private String name;
	private String kind;
	private String brand;
	private String tier;
	private int price;
	
//	public GraphicsCard() {;}
//	
//	public GraphicsCard(GraphicsCard graphicsCard) {
//		this(graphicsCard.getId(), graphicsCard.getName(), graphicsCard.getkind(), graphicsCard.getBrand(),  graphicsCard.getTier(), graphicsCard.getPrice());
//		
//	}
//
//
	public GraphicsCard(String id, String name, String kind, String brand, String tier, int price) {
		super(id, name, kind, brand, tier, price);
		
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
//	public String getTier() {
//		return tier;
//	}
//
//	public void setTier(String tier) {
//		this.tier = tier;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
//
//	@Override
//	public String toString() {
//		return "GraphicsCard [id=" + id + ", name=" + name + ", kind=" + kind + ", brand=" + brand + ", tier=" + tier
//				+ ", price=" + price + "]";
//	}
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
