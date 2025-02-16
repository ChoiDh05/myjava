package home2.work2.list.task2;

import java.util.Objects;

public class LoLChampion {
//	- 챔피언 이름
//	- 챔피언 주 직업군(전사, 탱커, 힐러, 원딜, 서폿, 메이지, 암살자)
//	- 챔피언 부 직업군
//	- 챔피언의 주라인
//	- 마나 사용 유무
	
//	전역변수
	private String name;
	private String mainClass;
	private String subClass;
	private String line;
	private boolean mana;

//	기본생성자
	public LoLChampion() {;}

//	깊은복사
	public LoLChampion(LoLChampion lolChampion) {
		this(lolChampion.getName(), lolChampion.getMainClass(), lolChampion.getSubClass(), lolChampion.getLine(),lolChampion.mana);
	}
	
//	생성자
	public LoLChampion(String name, String mainClass, String subClass, String line, boolean mana) {
		super();
		this.name = name;
		this.mainClass = mainClass;
		this.subClass = subClass;
		this.line = line;
		this.mana = mana;
	}
	
//	
//	public LoLChampion(LoLChampion other) {
//		this.name = other.name;
//		this.mainClass = other.mainClass;
//		this.subClass = other.subClass;
//		this.line = other.line;
//		this.mana = other.mana;
//	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMainClass() {
		return mainClass;
	}

	public void setMainClass(String mainClass) {
		this.mainClass = mainClass;
	}

	public String getSubClass() {
		return subClass;
	}

	public void setSubClass(String subClass) {
		this.subClass = subClass;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public boolean isMana() {
		return mana;
	}

	public void setMana(boolean mana) {
		this.mana = mana;
	}

	@Override
	public String toString() {
		return "LoLChampion [name=" + name + ", mainClass=" + mainClass + ", subClass=" + subClass + ", line=" + line
				+ ", mana=" + mana + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoLChampion other = (LoLChampion) obj;
		return line.equals(other.line) && mainClass.equals(other.mainClass) && mana == other.mana
				&& name.equals(other.name) && subClass.equals(other.subClass);
	}

}
