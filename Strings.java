import java.io.File;

import javax.swing.plaf.basic.BasicDesktopIconUI;

//String is a class in java i.e., S in String is in upper case
//String reference variaable  are storing Hashcode
//String is a multi value container as they store more than 1 character
//we call string as a multivalue container or reference data type
//printing reference variables, we get data instead of hash codes
//toString method will automatically executed by compiler to show value by using references

public class Strings {
	static void file(String file,int num)
	{System.out.print("Mp3 files");
		String Array[]=file.split(" ");
		for (String string : Array) {
			System.out.println(string);
		}
		System.out.println();
	}
	static void file(String file,double num)
	{
		System.out.print("Png files");
		String Array[]=file.split(" ");
		for (String string : Array) {
			System.out.println(string);
		}
		System.out.println();
			
	}
	static void file(String file,char ch)
	{
		System.out.print("jpg files");
		String Array[]=file.split(" ");
		for (String string : Array) {
			System.out.println(string);
		}
		System.out.println();
	}

	// elaborating various string methods
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Hi Hello How are You";
		System.out.println(name.lastIndexOf('o',8));
		System.out.println(name.indexOf('a',4));
		System.out.println(name.substring(2,11));
		System.out.println(name.substring(5));
		System.out.println(name.concat(" Mr.Ishant"));
		System.out.println(name.replace('l', 'h'));
		System.out.println(name.replace(" H", "H"));
		System.out.println(name.trim());
		System.out.println(name.contains("ello"));
		System.out.println(name.charAt(name.length()-5));
		//
		
		
		//splitting and printing according the extension type
		String Array[]= {"hello.mp3","pinh.png","pic.jpg","unstoppable.mp3","natural.jpg","vintage.png"};
		String mp3="";
		String pngString="";
		String jpg="";
		for (String string : Array) {
			if(string.contains(".mp3"))
					mp3+=" "+string;
			else if (string.contains(".png")) {
				pngString+=" "+string;
			}
			else{
				jpg+=" "+string;
			}
		}
		file(jpg, 'A');
		file(mp3, 1);
		file(pngString, 1.33);
	}
	

}
