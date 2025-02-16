package list2.task2.test2;


public class Product1 {
	String name;
	int price;
	String category;
	int count;
	
	public Product1() {;}

	public Product1(String name, int price, String category, int count) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		this.count = count;
	}
	
    public Product1(Product1 other) {
        this.name = other.name;
        this.price = other.price;
        this.category = other.category;
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

	public String getcategory() {
		return category;
	}

	public void setcategory(String category) {
		this.category = category;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Product1 [name=" + name + ", price=" + price + ", category=" + category + ", count=" + count + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product1 other = (Product1) obj;
		return count == other.count && category.equals(other.category) && name.equals(other.name)
				&& price == other.price;
	}
	
	
}
