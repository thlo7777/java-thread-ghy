package test;

import exthread.MyThread;

import exthread.MyThread;

public class Run2 {
	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		System.out.println("是否停止1？=" + Thread.interrupted());
		System.out.println("是否停止2？=" + Thread.interrupted());
		System.out.println("end!");
	}
}
