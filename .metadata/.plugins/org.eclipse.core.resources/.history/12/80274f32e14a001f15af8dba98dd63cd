package myJAVA;

import java.util.Objects;

public class CPU extends PC{
	private String id;
	private String name;
	private String kind;
	private String tier;
	private int price;
	
	public CPU() {;}
	
	public CPU (CPU cpu) {
		this(cpu.getId(), cpu.getName(), cpu.getKind(), cpu.getTier(), cpu.getPrice());
	}
	

	public CPU(String id, String name, String kind, String tier, int price) {
		super();
		this.id = id;
		this.name = name;
		this.kind = kind;
		this.tier = tier;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
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
		return "CPU [id=" + id + ", name=" + name + ", kind=" + kind + ", tier=" + tier + ", price=" + price + "]";
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
		CPU other = (CPU) obj;
		return id.equals(other.id);
	}
	
	
}
