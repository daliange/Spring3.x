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
17、Spring，SpringMVC的父子容器关系
18、web应用获取spring的容器
	1）通过Spring提供的工具类获取ApplicationContext对象
	2）
	
19、WebApplicationContext
	WebApplicationContext是专门为Web应用准备的，它允许从相对于web根目录的路径中加载配置文件完成初始化工作。
	WebApplicationContext扩展了ApplicationContext,
	WebApplicationContext定义了一个常量ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE,在上下文启动时，
	我们可以直接通过下面的语句从web容器中获取WebApplicationContext:
	WebApplicationContext wac=
		(WebApplicationContext)servletContext.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);

20、web上下文、spring上下文、springMVC上下文之间的关系

21、@PathVariable用来做url参数绑定
	@RequestMapping(value="/{userId}")
	public ModelAndView showDetail(@PathVariable("userId") String userId){}

22、RequestMapping的参数含义，userId表示包含userId参数的请求
		@RequestMapping(value = "/createUser",
		method ={ RequestMethod.POST,RequestMethod.GET},
		headers="Content-Type=application/*", 
		params = "userId")
		
23、①@RequestParam绑定方法入参
	@RequestMapping(value = "/handle1")
	public String handle1(
			@RequestParam("userName") String userName,
			@RequestParam("password") String password,
			@RequestParam("realName") String realName	) {}

24、②将Cooke值及报文头属性绑定到入参中
	@RequestMapping(value = "/handle2")
	public ModelAndView handle2(
			@CookieValue("JSESSIONID") String sessionId,
			@RequestHeader("Accept-Language") String accpetLanguage	) {}
			
25、③请求参数按名称匹配的方式绑定到user的属性中、方法返回对应的字符串代表逻辑视图名
	@RequestMapping(value = "/handle3")
	public String handle3(User user) {}