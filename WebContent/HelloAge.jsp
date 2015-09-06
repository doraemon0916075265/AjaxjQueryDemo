<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	out.print("你好 " + name + " ,今年 " + age + " 歲");
%>
