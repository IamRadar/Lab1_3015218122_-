package test_case;

public class test_case {
  public String triangle(int a,int b,int c){
	  if((a+b>c)&&(a+c>b)&&(b+c>a)&&(a>0)&&(b>0)&&(c>0)){
	  if((a==b)&&(b==c)){
		  System.out.println("equilateral");
		  return "equilateral";
	  }
	  else if((a==b)||(b==c)||(a==c)){
		  System.out.println("isoscele");
		  return "isoscele";
	  }
	  else System.out.println("scalene");
	  return "scalene";
	  }
	  else System.out.println("not a triangle");
	return "not a triangle";
  }
}
