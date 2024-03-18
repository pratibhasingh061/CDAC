package in.com;
class Student{
	 String Name;
    int Age;
    String Grade;
     void acceptRecord(String Name,int Age,String Grade) {
     this.Name = Name;
        this.Age = Age;
        this.Grade = Grade;
        }
     void printRecord() {
    	 System.out.println(Name+""+Age+""+Grade);
     }
     public static void main(String[]args) {
		Student pratibha = new Student();
		pratibha.acceptRecord("pratibha",28,"A");
		pratibha.printRecord();
	}
}
    