package myJAVA;

import java.util.Objects;

public class Cooler {
	private String id;
	private String name;
	private String kind;
	private String brand;
	private String tier;
	private int price;
	
	public Cooler() {;}
	
	public Cooler(Cooler cooler) {
		this(cooler.getId(),cooler.getName(),cooler.getKind(),cooler.getBrand(),cooler.getTier(),cooler.getPrice());
	}

	public Cooler(String id, String name, String kind, String brand, String tier, int price) {
		super();
		this.id = id;
		this.name = name;
		this.kind = kind;
		this.brand = brand;
		this.tier = tier;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getTier() {
		return tier;
	}

	public void setTier(String tier) {
		this.tier = tier;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cooler [id=" + id + ", name=" + name + ", kind=" + kind + ", brand=" + brand + ", tier=" + tier
				+ ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cooler other = (Cooler) obj;
		return id.equals(other.id);
	}
	
	
}
