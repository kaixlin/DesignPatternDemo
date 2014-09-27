package com.designpattern.kklin.templatemethod;

/*
 * 定义并实现了一个模板方法。这个模板方法一般是一个具体方法，它给出了一个顶级逻辑的骨架，
 * 而逻辑的组成步骤在相应的抽象操作中，推迟倒子类实现，顶级逻辑也有可能调用一些具体方法。
 */
public abstract class AbstractClass {

	public abstract void primitiveOperation1();
	public abstract void primitiveOperation2();
	
	public void templateMethod() {
		primitiveOperation1();
		primitiveOperation2();
		System.out.println("Temlate Method");
	}

}
