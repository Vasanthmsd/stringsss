package Java.org;

public class Strings {
	public static void main(String[] args) {
		String s = "GreensTechnology";
		
		int li = s.length();
		System.out.println(li);
		
		boolean eq = s.equals("GreensTechnology");
		System.out.println(eq);
		
		boolean co = s.contains("Greens");
		System.out.println(co);
		
		char ch = s.charAt(4);
		System.out.println(ch);
		
		String s1 = "    vasanth kumar   ";
		
		String[] sp = s1.split("  ");
		for (String string : sp) {
			System.out.println(string);
			
			int cm = s.compareTo("v");
			System.out.println(cm);
		}
			
		}
	}


