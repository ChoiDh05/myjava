package anonymousTask;

public interface Form {
//	판매를 해야하니까 품목이 있어야한다. getmenu
//	파는 양식도 필요하겠지? sell
	public String[] getMenu();
	public void sell(String order);
}
