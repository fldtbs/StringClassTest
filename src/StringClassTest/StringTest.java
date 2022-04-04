package StringClassTest;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Korea";
		String b = "Japan";
		String c = "  USA  ";
		String d = "Korea,Japan,China,USA";
		
		int str_count = a.length();//문자열의 길이(개수)
		
		System.out.println(str_count);
		
		String ab = a.concat(b);//문자열연결
		System.out.println(ab);
		
		String c_trim = c.trim();//양쪽 공백 제거
		System.out.println(c);
		System.out.println(c_trim);
		
		String a_0 = a.replace("K", "k");//특정 문자 치환
		System.out.println(a_0);
		
		String a_sub = a.substring(3);//인덱스 3부터 끝가지 출력
		System.out.println(a_sub);
		
		char a_ch = a.charAt(2);
		System.out.println(a_ch);
		
		String s[] = d.split(",");//문자열을 구분자로 분리
		for(int i=0; i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		

	}

}
