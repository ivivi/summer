package ivivi.summer.ioc.container;

public interface BeanFactory {
	
	public Object getBean(String name);
	public Object getBean(String name,Class requiredType);
	public boolean containsBean(String name);
	public boolean isSingleton4Bean(String name);
	public Class getType4Bean(String name);
	public String[] getAliases(String name);
	
}
