package com.offcn;

import java.nio.charset.StandardCharsets;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.offcn.po.User;

public class RestTemplateTest {

	public static void main(String[] args) {
		String url="http://localhost:8080/Day005_RestCxfServiceServer001/service/v1/hello";
		RestTemplate rt = new RestTemplate();
		//设定resttemplate的默认编码为utf-8
		rt.getMessageConverters().set(1, new StringHttpMessageConverter(StandardCharsets.UTF_8));
		
		
		
		//发出get请求
		User u1 = rt.getForObject(url+"/get/a999", User.class);
		//System.out.println(u1);
		
		//发出post请求
		//User u2 = rt.postForObject(url+"/post/a888", u1, User.class);
		//System.out.println(u2);
		//发出put请求
		//rt.put(url+"/put/a666", u1);
		
		//发出delete请求
		rt.delete(url+"/delete/a7777");

	}

}
