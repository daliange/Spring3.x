常用获取配置文件的类：
ClassPathResource：类目录加载
ServletContextResource：web容器上下文
FileSystemResource：文件目录加载
Resource res1 = new ClassPathResource("file1.txt");