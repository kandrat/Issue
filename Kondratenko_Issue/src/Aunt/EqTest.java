package Aunt;
//Просто сравнение отдельным классом и вывод (верно или не верно)

public class EqTest {
	String d;
	String c;
	String x;
	String a;
	String b;
	protected String Equalss(String a,String b,String c,String d){
	if (a.equals(b) && c.equals(d)){
		x=("Аунтификация прошла успешно");}
	 else 
	 {x="Аунтификация не произведена";}
	return x;
}

}




