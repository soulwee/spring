package com.seecen.config;

import com.seecen.User;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;

//������==�����ļ�
@Configuration  //����Spring����һ��������

@ComponentScans(
		value = {
				@ComponentScan(value="com.seecen",
						/*includeFilters = {
					@Filter(type=FilterType.ANNOTATION,classes={Controller.class}),
						@Filter(type=FilterType.ASSIGNABLE_TYPE,classes={BookService.class}),
						@Filter(type=FilterType.CUSTOM,classes={MyTypeFilter.class})
				},*/ useDefaultFilters = true)
		}
		)
//@ComponentScan  value:ָ��Ҫɨ��İ�
//excludeFilters = Filter[] ��ָ��ɨ���ʱ����ʲô�����ų���Щ���
//includeFilters = Filter[] ��ָ��ɨ���ʱ��ֻ��Ҫ������Щ���
//FilterType.ANNOTATION������ע��
//FilterType.ASSIGNABLE_TYPE�����ո��������ͣ�
//FilterType.ASPECTJ��ʹ��ASPECTJ���ʽ
//FilterType.REGEX��ʹ������ָ��
//FilterType.CUSTOM��ʹ���Զ������
public class MainConfig {
	
	//��������ע��һ��Bean;����Ϊ����ֵ�����ͣ�idĬ�����÷�������Ϊid
	@Bean("person")
	public User person01(){
		return new User("lisi", 20);
	}

}
