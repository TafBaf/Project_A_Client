package jsfBean;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.xml.namespace.QName;

import controller.library.Book;
import controller.library.WSLibrary;
import controller.library.WSLibraryService;


@ManagedBean
@SessionScoped
public class ViewBook {

	private List<Book> books = new ArrayList<Book>();
    private static final QName SERVICE_NAME = new QName("http://controller/", "InfoProviderService");
    
	public ViewBook() {
		
	}	
	
	@PostConstruct
	public void PopulateBooks(){

		URL wsdlURL = WSLibraryService.WSDL_LOCATION;
        WSLibraryService service = new WSLibraryService(wsdlURL, SERVICE_NAME);
        WSLibrary port = service.getWSLibraryPort();   
        
        java.util.List<controller.library.Book> books = port.getBooks();
	}	
	

	public List<Book> getBooks() {
		return books;
	}


	public void setBooks(List<Book> books) {
		this.books = books;
	}

}
