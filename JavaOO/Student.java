package javaprj;
class Student {

	String hakgwa;
	int stdnum;
	
	void print() {
		System.out.println("�а� :"+hakgwa);
		System.out.println("�й� :"+stdnum);
	}
	
	public static void main(String args[]){
		Student std = new Student();
		std.hakgwa="��ǻ���������а�";
		std.stdnum=20130672;
		std.print();
		}
	}