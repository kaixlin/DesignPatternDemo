package com.designpattern.kklin.adapter;

/**
 * 通过在内部包装一个Adaptee对象，把源接口转换成目标接口
 * @author kai
 *
 */
public class Adapter extends Target {
	private Adaptee adaptee = new Adaptee();
	
	@Override
	public void request() {
		adaptee.specificRequest();
	}
}
