public class Test{
	public static void main(String args []){
		Human human1 = new Human(1);
		Human human2 = new Human(1);
		Human human3 = new Human(2);
		Human human4 = new Human(1);
		Human human5 = new Human(2);
		Human human6 = new Human(1);	

		human1.setName("�޷�");
		human1.setAge(18);
		human2.setName("���");
		human2.setAge(18);
		human3.setName("����");
		human3.setAge(18);
		human4.setName("����Լ��ѷ");
		human4.setAge(18);		
		human5.setName("÷�޷�");
		human5.setAge(18);
		human6.setName("���");
		human6.setAge(18);		
		human1.introduce();
		human2.introduce();	
		human3.introduce();	
		human4.introduce();	
		human5.introduce();	
		human6.introduce();	
		
		
	}
}