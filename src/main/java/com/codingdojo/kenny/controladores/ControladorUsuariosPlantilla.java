package com.codingdojo.kenny.controladores;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.kenny.modelos.Usuario;
import com.codingdojo.kenny.servicios.ServicioUsuarios;

@Controller
public class ControladorUsuariosPlantilla {
	//instance serviciousuarios contains las funciones que ejecutan querys
	private final ServicioUsuarios servicio;
	
	//Service constructor 
	public ControladorUsuariosPlantilla(ServicioUsuarios servicio) {
		this.servicio = servicio;
	}
	//RequestMappings
	@RequestMapping(value="/dashboard", method=RequestMethod.GET)
	public String dashboard(Model model) {

		List<Usuario> usuarios = servicio.get_all();

		model.addAttribute("usuarios", usuarios);

		return "dashboard.jsp";
	}
	

//-----------------------------------------------------------	
//	@RequestMapping(value="/", method=RequestMethod.GET)
//	public String index() {
//		return "index.jsp";
//	}
//	
//	@RequestMapping(value="/muestraUsuario", method=RequestMethod.GET)
//	public String muestraUsuario(Model model) {
//		
//		Usuario user1 = new Usuario("Cynthia", "Castillo", 1);
//		Usuario user2 = new Usuario("Valeria", "Romero", 2);
//		
//		model.addAttribute("titulo", "Usuarios");
//		
//		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
//		
//		listaUsuarios.add(user1);
//		listaUsuarios.add(user2);
//		
//		model.addAttribute("listaUsuarios", listaUsuarios);
//		
//		HashMap<String, String> paises = new HashMap<String, String>();
//		
//		paises.put("Mexico", "CDMX");
//		paises.put("Estados Unidos", "Washington DC");
//		paises.put("El Salvador", "San Salvador");
//		
//		model.addAttribute("paises", paises);
//		
//		return "usuarios.jsp";
//		
//	}
//	
//	@RequestMapping(value="/registro", method=RequestMethod.GET)
//	public String registro() {
//		return "registro.jsp";
//	}
//	
//	@RequestMapping(value="/registraUsuario", method=RequestMethod.POST)
//	public String helloNombreParam(@RequestParam(value="nombre") String name, 
//								   @RequestParam(value="email") String email,
//								   HttpSession session,
//								   RedirectAttributes flash) {
//		//return "name: "+name +", email:"+email;
//		session.setAttribute("nombre", name);
//		session.setAttribute("email", email);
//		
////		ArrayList<String> mensajes = new ArrayList<String>();
//		//Boolean isTrue = false;
//		if(name.equals("")){
//			flash.addFlashAttribute("error_registro", "Porfavor introduce tu nombre");
//			return "redirect:/registro";
//		}
////		if(email.equals("")){
////			flash.addFlashAttribute("error_registro", "Porfavor introduce tu email");
////			return "redirect:/registro";
////		}
//		
//		
//			
//		
//		
//		return "redirect:/dashboard";
//	}
//	
//	@RequestMapping(value="/dashboard", method=RequestMethod.GET)
//	public String dashboard() {
//		return "dashboard.jsp";
//	}
	
}