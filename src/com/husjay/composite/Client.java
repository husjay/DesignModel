package com.husjay.composite;

public class Client {
	
	public static void main(String[] args) {
		Folder f1;
		AbstractFile f2, f3, f4, f5, f6;
		f1 = new Folder("我的文件");
		f2 = new ImageFile("我的图片.jpg");
		f3 = new VideoFile("我的视频.mkt");
		
		f1.add(f2);
		f1.add(f3);
		
		f1.killVirue();
	}

}
