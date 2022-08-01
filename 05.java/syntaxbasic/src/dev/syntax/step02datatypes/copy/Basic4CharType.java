package dev.syntax.step02datatypes.copy;

public class Basic4CharType {

	public static void main(String[] args) {
		// 4. ���� Ÿ�� char (acter)
		
		// 4-1. ���� Ÿ��, ���ڸ� ���� �� ���, �� ������ ���ڸ� ������ �� ����
		char a = 'A';
//		char b = 'AB'; // Too many characters in character literal(IntelliJ)
		
		// 4-2. ���� ���ͷ��� ���ڿ� ���ͷ�(literal)
		/*
		 * ���ڿ� ����'��'�� ���� �ٸ���.(���� ���ͷ��� ���ڿ� ���ͷ� ��ũ ����)
           char : Character, ������ ����ǥ��, Ȭ ����ǥ('')���, �ϳ��� ���ڸ� ���� �� ����ϴ� Java Ű����
           String : String, ���� �ǹ�, �ϳ��� ���ڰ� ���������� �����Ǿ��ִٴ� �ǹ�, �� ����ǥ("") ���,
              �� �� �̻��� ���ڸ� ����� �� ���� Java Ű����
		 */
		
//		char grade = "A"; // Type mismatch: cannot convert from String to char
		// ���ڿ� Ÿ��(String)������ �ֵ���ǥ ����
		
		String chocolate = "ABC";
		
		// 4-3. ���� ��(Blank value), �� ���ڿ�(Empty String)
		String emptyString = ""; // ���ڿ� ���ͷ� ""�� �ƹ��� ���� ���� ����ִ� ���ڿ��� �ۼ��� �� ����
//		char emptyChar = ''; // Compile error : Empty character literal(IntelliJ), ���� ���ͷ��� �Ұ���
		char blankValue = ' '; // ����(blank)�� �ϳ��� ��(value)���� ��޵�
		
		// 4-4. ���ڿ� ����(String concatnation)
		// + �����ڸ� Ȱ���ϸ� ���� ���� ������ �� ����.
		
		// 4-4-1. ���ڿ������� ���� ó��
		String orange = "orange";
		String cookie = "cookie";
		
		String orangeCookie = orange + cookie; // ���ڿ� + ���ڿ��� �������� ���ڿ�
		System.out.println(orangeCookie);
		
		String sixSigma = 6 + "sigma"; // ���� ���ͷ� + ���ڿ��� �������� ���ڿ�
		System.out.println(sixSigma);
		
		String surprise = true + "Ȥ�� ����"; // �� ���ͷ� + ���ڿ� = ���ڿ�
		System.out.println(surprise);
		
		System.out.println(5 + "5"); // ?? 55...
	}
}
