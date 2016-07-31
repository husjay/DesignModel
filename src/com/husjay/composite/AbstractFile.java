package com.husjay.composite;

import java.util.ArrayList;
import java.util.List;

//抽象构件
public interface AbstractFile {
	void killVirue();
}

class ImageFile implements AbstractFile {
	private String name;
	
	public ImageFile(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void killVirue() {
		System.out.println("--图像文件--"+name+"进行查杀");
	}
	
}

class VideoFile implements AbstractFile {
	private String name;
	
	public VideoFile(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void killVirue() {
		System.out.println("--视频文件--"+name+"进行查杀");
	}
	
}

//容器构件
class Folder implements AbstractFile {
	private String name;
	//定义容器，存放容器构件下的子节点
	private List<AbstractFile> list = new ArrayList<AbstractFile>();
	
	public Folder(String name) {
		super();
		this.name = name;
	}
	
	public void add(AbstractFile file) {
		list.add(file);
	}
	
	public void remove(AbstractFile file) {
		list.remove(file);
	}
	
	public AbstractFile getChild(int index) {
		return list.get(index);
	}

	@Override
	public void killVirue() {
		System.out.println("--文件夹--"+name+"进行查杀");
		
		for(AbstractFile file : list) {
			file.killVirue();
		}
	}
}


