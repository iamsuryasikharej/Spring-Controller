package com.app3.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MyController extends MultiActionController{
	
	public ModelAndView add(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws Exception
	{
		return new ModelAndView("add");
	}
	public ModelAndView search(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws Exception
	{
		return new ModelAndView("search");
	}
	public ModelAndView delete(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws Exception
	{
		return new ModelAndView("delete");
	}
}
