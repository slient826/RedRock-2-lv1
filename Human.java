class Human{
	private String name;
	String sex1 = "δ֪";
	private int age;
	public Human(int a){
		if(a == 1){
			sex1 = "ѧ��";
		}
		if(a == 2){
			sex1 = "ѧ��";
		}
	}
	
	void setName(String name){
		this.name = name;
	}
	void setAge(int age){
		this.age = age;
	}

	String getName(){
		return name;
	}
	int getAge(){
		return age;
	}
	
	void introduce(){
		System.out.println("��ã��ҽ�"+name+"������"+age+"�꣬�����"+sex1+"����ʲô�����������Ŷ��");
	}
	
	
	
	
	
	
	
	
}