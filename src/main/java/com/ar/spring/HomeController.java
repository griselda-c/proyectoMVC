package com.ar.spring;


import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ar.spring.modelo.Producto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	/*@InitBinder
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    dateFormat.setLenient(false);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}*/ // no setea ninguna fechas

	@RequestMapping(value = "/")
	public ModelAndView home() {
		//nombre del jsp, modelAttribute , objeto al q se va setear los datos
		ModelAndView model = new ModelAndView("home","producto", new Producto());
		return model;
	}
	
	
	@RequestMapping(value="/agregarProducto",method=RequestMethod.POST)
	public String agregar(Model model,Producto producto){
		model.addAttribute("nombre", producto.getNombreProducto());
		model.addAttribute("stock", producto.getStockMinimo());
		//model.addAttribute("inicio", dateFormat.format(producto.getPrecio().getFechaInicio()));
		model.addAttribute("inicio",producto.getPrecio().getFechaInicio());
		model.addAttribute("fin", producto.getPrecio().getFechaHasta());
		return "productoCreado";
		
	}
	
}
