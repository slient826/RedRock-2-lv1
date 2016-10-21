import java.math.*;
class factorial{
	BigInteger sum = new BigInteger("1");
	String result(int input){
		for(int i = input; i > 0; i--){
			sum = sum.multiply(new BigInteger(String.valueOf(i)));
		}
		System.out.println(sum);
		return "成功计算！";
	}
	
	String subResult(int input,int start,int end){
		for(int i = input; i > 0; i--){
			sum = sum.multiply(new BigInteger(String.valueOf(i)));
		}
		System.out.println(sum.toString().substring(start,end));
		return "成功计算！";
	}

}