package fr.orsys.kierann.burger.servlets;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.orsys.kierann.burger.services.AccompagnementService;
import fr.orsys.kierann.burger.services.BoissonService;
import fr.orsys.kierann.burger.services.BurgerService;
import fr.orsys.kierann.burger.services.SauceService;

/**
 * Servlet implementation class indexServlet
 */
@WebServlet("/index")
public class indexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BurgerService burgerService = new BurgerService();
	private AccompagnementService accompagnementService = new AccompagnementService();
	private BoissonService boissonService = new BoissonService();
	private SauceService sauceService = new SauceService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public indexServlet() {
		super();
		burgerService.ajouterBurger("Big Mac", 560);
		burgerService.ajouterBurger("Whooper", 520);
		burgerService.ajouterBurger("Tower", 630);
		accompagnementService.ajouterAccompagnement("Frites", 100);
		accompagnementService.ajouterAccompagnement("Potatoes", 150);
		accompagnementService.ajouterAccompagnement("Salade", 300);
		boissonService.ajouterBoisson("Coca cola", 120);
		boissonService.ajouterBoisson("Fanta", 120);
		boissonService.ajouterBoisson("Eau", 150);
		sauceService.ajouterSauce("Ketchup", 0);
		sauceService.ajouterSauce("Mayonnaise", 0);
		sauceService.ajouterSauce("Barbecue", 0);
		sauceService.ajouterSauce("Curry", 0);
		sauceService.ajouterSauce("Samouraï", 0);
		sauceService.ajouterSauce("Burger", 0);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("burgers", burgerService.recupererBurgers());
		request.setAttribute("accompagnements", accompagnementService.recupererAccompagnements());
		request.setAttribute("boissons", boissonService.recupererBoissons());
		request.setAttribute("sauces", sauceService.recupererSauces());
		request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
