package map.test;

import java.util.Objects;

public class Product {
	private int id;
	private String name;
	private int price;
	private int count;
	
	public Product() {;}

	public Product(String name, int price, int id, int count) {
		super();
		this.name = name;
		this.price = price;
		this.id = id;
		this.count = count;
	}
	
    public Product(Product other) {
        this.name = other.name;
        this.price = other.price;
        this.id = other.id;
        this.count = other.count;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", id=" + id + ", count=" + count + "]";
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
		Product other = (Product) obj;
		return id == other.id;
	}
	
	
}
