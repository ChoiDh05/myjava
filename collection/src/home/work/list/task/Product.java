package home.work.list.task;

import java.util.Objects;

public class Product {
	String name;
	int price;
	String kind;
	int count;
	
	public Product() {;}

	public Product(String name, int price, String kind, int count) {
		super();
		this.name = name;
		this.price = price;
		this.kind = kind;
		this.count = count;
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

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", kind=" + kind + ", count=" + count + "]";
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
		return count == other.count && kind.equals(other.kind) && name.equals(other.name)
				&& price == other.price;
	}
	
	
}
