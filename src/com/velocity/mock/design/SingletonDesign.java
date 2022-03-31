package com.velocity.mock.design;

public class SingletonDesign implements Cloneable {
	
	private static SingletonDesign sDesign;
	
	private SingletonDesign() {
		System.out.println("This is private Constructor ");
	}
	
	public static SingletonDesign checkObject() {
		
		synchronized (SingletonDesign.class) {
			if (sDesign==null) {
				sDesign=new SingletonDesign();
			}else {
				return sDesign;
			}
			
		}
		return sDesign;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return sDesign;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		SingletonDesign obj1=SingletonDesign.checkObject();
//		SingletonDesign obj2=SingletonDesign.checkObject();
		System.out.println("Hashcode 1 "+obj1.hashCode());
//		System.out.println("Hashcode 2 "+obj2.hashCode());
		SingletonDesign obj3=(SingletonDesign) obj1.clone();
		System.out.println("Hashcode 3 "+obj3.hashCode());
		
		System.out.println(SingletonDesign.checkObject().hashCode());
		//SingletonDesign s1=new SingletonDesign();
		//System.out.println(s1.hashCode());
	}
	
	
}
