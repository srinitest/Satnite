package org.lang;

public class StateDetails extends LanguageInfo {
	public void southindia() {
System.out.println("Tamilnadu");
	}
	public void northindia() {
System.out.println("Delhi");
	}
	public static void main(String[] args) {
		StateDetails poo=new StateDetails();
		poo.southindia();
		poo.northindia();
		poo.tamillanguage();
		poo.englishlanguage();
		poo.hindilanguage();
}
}
