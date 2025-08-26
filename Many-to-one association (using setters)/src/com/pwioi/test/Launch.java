package com.pwioi.test;
import java.util.Arrays;

import com.pwioi.entites.*;
public class Launch {

	public static void main(String[] args) {
		Branch b=new Branch(123,"hyd");
		Employee [] arr=new Employee [3];
		arr[0]=new Employee(123,"munaf",b);
		arr[1]=new Employee(124,"snuhtith",b);
		arr[2]=new Employee(125,"Sai",b);
		
		System.out.println(Arrays.toString(arr));
	}

}
