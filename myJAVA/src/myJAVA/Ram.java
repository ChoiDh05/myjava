package myJAVA;

import java.util.Objects;

public class Ram extends PC{
	private String id;
	private String name;
	private String kind;
	private String brand;
	private int price;
	
	
	
//	public Ram(Ram ram) {
//		this(ram.getId(),ram.getName(),ram.getKind(),ram.getBrand(),ram.getPrice());
//	}

	public Ram(String id, String name, String kind, String brand, int price) {
		super(id, name, kind, brand, price);
		 
	}

//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
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
//	public String getBrand() {
//		return brand;
//	}
//
//	public void setBrand(String brand) {
//		this.brand = brand;
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
//		return "Ram [id=" + id + ", name=" + name + ", kind=" + kind + ", brand=" + brand + ", price=" + price + "]";
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
//		Ram other = (Ram) obj;
//		return id.equals(other.id);
//	}
	
	
}
