
/*
정보검색실에서 노트북으로 문서를 작성하던 광곽이는 갑자기 어떠한 파일의 확장자를 보고 이 확장자가 어떤 파일인지 잊어버렸다.

광곽이가 파일.확장자를 입력하면 이게 어떤 프로그램인지 알 수 있도록 도와주자.

광곽이는 대소문자에 예민하다!

확장자 종류  
.dib : Paint.Picture  
.doc : Word.Document.8  
.docx : Word.Document.12  
.htm : htmfile  
.html : htmlfile  
.hwp : Hwp.Document.96  
.hwpx : Hwp.Document.hwpx.96  
.hwt : Hwp.Document.hwt.96  
.jpe, .jpeg, .jpg : jpegfile  
.ppt : PowerPoint.Show.8  
.pptx : PowerPoint.Show.12  
.pptxml : powerpointxmlfile

 */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)  {
			
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		if(a.contains(".pptx")) {
			System.out.println("PowerPoint.Show.12");
		} else if(a.contains(".dib")) {
			System.out.println("Paint.Picture");
		} else if(a.contains(".docx")) {
			System.out.println("Word.Document.12");
		} else if(a.contains(".doc")) {
			System.out.println("Word.Document.8");
		} else if(a.contains(".htm")) {
			System.out.println("htmfile");
		} else if(a.contains(".hwp")) {
			System.out.println("Hwp.Document.96");
		} else if(a.contains(".hwpx")) {
			System.out.println("Hwp.Document.hwpx.96");
		} else if(a.contains(".hwt")) {
			System.out.println("Hwp.Document.hwt.96");
		} else if(a.contains(".jpe")) {
			System.out.println("jpegfile");
		} else if(a.contains(".jpeg")) {
			System.out.println("jpegfile");
		} else if(a.contains(".jpg")) {
			System.out.println("jpegfile");
		} else if(a.contains(".pptxml")) {
			System.out.println("powerpointxmlfile");
		} else if(a.contains(".ppt")) {
			System.out.println("PowerPoint.Show.8");
		}
		
		
	}
}

	
	

