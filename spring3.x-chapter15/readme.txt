1、/Users/lijie/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/
2、学会使用safari浏览器，开发模式
3、获取request请求的头信息
4、需要学会用RestTemplate、MultiValueMap进行url测试
5、Cookie的值什么时间会变？
6、@RequestMapping的参数、Controller的入参
7、HttpSession session = request.getSession()获取HttpSession相关信息
8、StreamUtils.copy(in, out)学会spring的流拷贝
9、参数当中有HttpServletResponse ，可以不设置返回值
10、SpringMVC响应图片
	OutputStream osnew = response.getOutputStream();
	Resource res = new ClassPathResource("/image.jpg");
	FileCopyUtils.copy(res.getInputStream(), osnew);