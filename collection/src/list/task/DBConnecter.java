package list.task;

import java.util.ArrayList;

import home.work.list.task.Product;
import home2.work2.list.task2.LoLChampion;
import home3.list3.task.Music;
import json.array.task.Desktop;
import list.task.food.Food;
import list.task.fruit.Fruit;
import list.task2.user.User;
import list2.task2.test2.Product1;
import my.list.task.food.MyFood;
import my.list.task.food.Type;

public class DBConnecter {
	
//	외부에서 DBConnecter를 객체화 할 수 없게 막아준다.
//	단, 상속받은 자식 클래스에서는 사용할 수 있다.
//	그것도 싫으면 private으로 작성한다.
	protected DBConnecter() {;}
	
	public static ArrayList<Fruit> fruits = new ArrayList<Fruit>();
	public static ArrayList<Food> foods = new ArrayList<Food>();
	public static ArrayList<User> users = new ArrayList<User>();
	public static ArrayList<Product> products = new ArrayList<Product>();
	public static ArrayList<LoLChampion> lolchampion = new ArrayList<LoLChampion>();
	public static ArrayList<Music> music = new ArrayList<Music>();
	public static ArrayList<Product1> products1 = new ArrayList<Product1>();
	public static ArrayList<Desktop> desktop = new ArrayList<Desktop>();
//ArrayList<WesternFood> westernFoods = new ArrayList<WesternFood>();
}
