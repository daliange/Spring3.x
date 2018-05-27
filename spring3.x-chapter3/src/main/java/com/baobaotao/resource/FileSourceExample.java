package com.baobaotao.resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;


public class FileSourceExample {
	
	public static void main(String[] args) {
		try {
			String filePath = "/Users/lijie/Documents/workspace/spring3.x/spring3.x-chapter3/src/main/resources/file1.txt";
			/**文件系统resource**/
			Resource res1 = new FileSystemResource(filePath);
			/**class目录resource**/
            Resource res2 = new ClassPathResource("file1.txt");
            
            InputStream ins1 = res1.getInputStream();
            InputStreamReader isr1 = new InputStreamReader(ins1);
            BufferedReader bf1 = new BufferedReader(isr1);
            System.out.println("res1:"+res1.getFilename());
            System.out.println(bf1.readLine());
            System.out.println(bf1.readLine());
            bf1.close();
            isr1.close();
            ins1.close();
            
            InputStream ins2 = res2.getInputStream();
            InputStreamReader isr2 = new InputStreamReader(ins2);
            BufferedReader bf2 = new BufferedReader(isr2);
            System.out.println("res2:"+res2.getFilename());
            System.out.println(bf2.readLine());
            System.out.println(bf2.readLine());
            bf2.close();
            isr2.close();
            ins2.close();
            
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
