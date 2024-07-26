package myJAVA;

import java.util.Objects;

public class MainBoard extends PC{
	private String id;
	private String name;
	private String kind;
	private String brand;
	private String tier;
	private int price;

//	public MainBoard() {;}
//
//	public MainBoard(MainBoard mainBoard) {
//		this(mainBoard.getId(),mainBoard.getName(), mainBoard.getKind(), mainBoard.getBrand(), mainBoard.getTier(),mainBoard.getPrice());
//	}

	public MainBoard(String id, String name, String kind, String brand, String tier, int price) {
		super(id, name, kind, brand, price);
		this.tier = tier;
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
	public String getTier() {
		return tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}
//
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
		return "MainBoard [tier=" + tier + "]";
	}

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
//		MainBoard other = (MainBoard) obj;
//		return id.equals(other.id);
//	}

}
