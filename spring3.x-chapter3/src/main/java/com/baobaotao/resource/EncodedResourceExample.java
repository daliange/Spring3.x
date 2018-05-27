package com.baobaotao.resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.util.FileCopyUtils;
public class EncodedResourceExample {

	  public static void main(String[] args) throws Throwable  {
		  Resource res = new ClassPathResource("file1.txt");
		  /**new EncodedResource(res,"UTF-8")**/
		  EncodedResource encRes = new EncodedResource(res,"UTF-8");
		  /**重要方法FileCopyUtils.copyToString，将Read转换为String**/
		  String content  = FileCopyUtils.copyToString(encRes.getReader());
		  System.out.println(content);  
	}
}
