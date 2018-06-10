1、/Users/lijie/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/
2、学会使用safari浏览器，开发模式
3、获取request请求的头信息
4、需要学会用RestTemplate、MultiValueMap进行url测试
   
5、Cookie的值什么时间会变？
6、@RequestMapping的参数、Controller的入参
7、HttpSession session = request.getSession()获取HttpSession相关信息
8、StreamUtils.copy(in, out)学会spring的流拷贝
9、参数当中有HttpServletResponse ，可以不设置返回值
10、SpringMVC响应图片,拷贝图片
	OutputStream osnew = response.getOutputStream();
	Resource res = new ClassPathResource("/image.jpg");
	FileCopyUtils.copy(res.getInputStream(), osnew);
	学会使用FileCopyUtils，很重要
	byte[] fileData = FileCopyUtils.copyToByteArray(res.getInputStream());
	Resource outFile = new FileSystemResource("/Users/lijie/Desktop/image_copy.jpg");
	FileCopyUtils.copy(fileData, outFile.getFile());
11、org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter
	org.springframework.http.converter.HttpMessageConverter
	org.springframework.http.converter.StringHttpMessageConverter
	org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
12、拷贝Bean的属性，
	BeanUtils.copyProperties(pubObj, obj);
13、URL编码、解码
	java.net.URLDecoder.decode
	java.net.URLEncoder.encode
14、需要学习设计模式
15、解决中文乱码问题web.xml需要配置
	org.springframework.web.filter.CharacterEncodingFilter
16、Iterator与Enumeration都是迭代器