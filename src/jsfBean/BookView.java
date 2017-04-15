package jsfBean;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.xml.namespace.QName;

import controller.Book;
import controller.WSLibrary;
import controller.WSLibraryService;


@ManagedBean
@ViewScoped
public class BookView {

	private List<Book> books = new ArrayList<Book>();
	private static final QName SERVICE_NAME = new QName("http://controller/", "WS_LibraryService");
    
	public BookView() {
		
	}	
	
	@PostConstruct
	public void PopulateBooks(){

		URL wsdlURL = WSLibraryService.WSDL_LOCATION;
        WSLibraryService service = new WSLibraryService(wsdlURL, SERVICE_NAME);
        WSLibrary port = service.getWSLibraryPort();   
        
        java.util.List<controller.Book> booksResult = port.getBooks();
        this.books = booksResult;
        
//		for(Book book: this.books){
//			System.out.println(book.getId());
//			System.out.println(book.getName());
//			System.out.println(book.getAuthor());
//
//		}
	}	
	

	public List<Book> getBooks() {
		return books;
	}


	public void setBooks(List<Book> books) {
		this.books = books;
	}

}
