class Human{
	private String name;
	String sex1 = "未知";
	private int age;
	public Human(int a){
		if(a == 1){
			sex1 = "学长";
		}
		if(a == 2){
			sex1 = "学姐";
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
		System.out.println("你好！我叫"+name+"，今年"+age+"岁，是你的"+sex1+"，有什么问题可以问我哦！");
	}
	
	
	
	
	
	
	
	
}