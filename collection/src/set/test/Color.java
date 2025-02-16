package set.test;

import java.util.Objects;

public class Color {
	private String name;
	private int id;
	
	public Color() {;}

	public Color(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return id;
	}


	public Color(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Color [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Color other = (Color) obj;
		return id == other.id;
	}
	
	
	
}
