package i_String;

public class ConcatMethod {

	public static void main(String[] args) {
		Daddy d = new Daddy();
        String result = "";
        int i = 5;
        result += Daddy.Son("20");
        i++;
        result += d.Daughter();
        i++;
        d.Child(i);
        i++;
        result += GrandFather.Son(result);
        System.out.print(i + " - " + result);
	}	
}

class GrandFather extends Daddy {
    public String Son() {
        String hai = "Good Morning";
       
        Daddy.Son(hai);
        return "";
    }
}
class Daddy {
	public static String Son(String str) {
		return "I am " + str + " years old, ";
	}
    public String Daughter() {
        String str = Son("25");
        str += "I am 24 years old, ";
        return str;
    }
    public void Child(int i) {
        i++;
        String str = "I am child, ";
    }
}