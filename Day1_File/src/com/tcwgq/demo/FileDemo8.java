package com.tcwgq.demo;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

import org.junit.Test;

public class FileDemo8 {
	/**
	 * 文件过滤器：
	 * 
	 */
	/**
	 * public interface FilenameFilter:实现此接口的类实例可用于过滤器文件名。 
	 * Abstract WindowToolkit的文件对话框组件使用这些实例过滤 File类的 list方法中的目录清单。
	 */
	/**
	 * boolen accept(File dir, String name):测试指定文件是否应该包含在某一文件列表中。
	 * dir表示被找到的文件所在的目录。 name表示文件的名称。
	 */
	
	/**
	 * String[] list(FilenameFilter
	 * filter):返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中满足指定过滤器的文件和目录。
	 * 除了返回数组中的字符串必须满足过滤器外，此方法的行为与 list() 方法相同。
	 * 
	 */
	/**
	 * 获取d:/data目录下的所有txt文件名称，注意文件夹也可能以.txt结尾
	 */
	@Test
	public void fun() {
		File file = new File("d:/data");
		String[] names = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				boolean flag = false;
				System.out.println(dir + "---" + name);//dir为d:/data,name为data下的所有文件及文件夹
				File file = new File(dir, name);
				if(file.isFile()&&name.endsWith(".txt"))
					 flag = true;
				return flag;
			}
		});
		for (String s : names) {
			System.out.println(s);
		}
	}
	
	/**
	 * 
	 * File[] listFiles(FileFilter filter):返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
	 * 除了返回数组中的路径名必须满足过滤器外，此方法的行为与 listFiles() 方法相同。
	 * boolean accept(File pathname):测试指定抽象路径名是否应该包含在某个路径名列表中。
	 * pathname:要测试的抽象路径名
	 * 实际上此方法就是将FilenameFilter中的accept方法的dir和name合成一个文件，
	 * 免去在方法体中使用File(File file, String child)构造一个新的File
	 * 
	 */
	
	/**
	 * 获取d:/data目录下的所有txt文件名称，注意文件夹也可能以.txt结尾
	 */
	@Test
	public void fun1(){
		File file = new File("d:/data");
		File[] files = file.listFiles(new FileFilter(){
			@Override
			public boolean accept(File pathname) {
				//System.out.println(pathname);//pathname为data目录下的文件及文件夹绝对路径
				if(pathname.isFile()&&pathname.getName().endsWith(".txt"))
				return true;//File即可表示目录也可表示文件，所以得进行类型的判断
				return false;
			}
		});
		for(File f: files){
			System.out.println(f.getName());
		}
	}
	
	/**
	 * File[] listFiles(FilenameFilter filter):返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
	 * 除了返回数组中的路径名必须满足过滤器外，此方法的行为与 listFiles() 方法相同。
	 */
	
	/**
	 * 获取d:/data目录下的所有txt文件名称，注意文件夹也可能以.txt结尾
	 */
	@Test
	public void fun2(){
		File file = new File("d:/data");
		File[] files = file.listFiles(new FilenameFilter(){
			//查询d:/data目录下的TXT文件
			@Override
			public boolean accept(File dir, String name) {
				File file1 = new File(dir, name);
				if(file1.isFile()&&file1.getName().endsWith(".txt"))
				return true;
				return false;
			}
		});
		for(File f:files){
			System.out.println(f.getName());
		}
	}

}
