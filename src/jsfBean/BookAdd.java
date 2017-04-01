package jsfBean;

import java.io.Serializable;
import java.net.URL;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.xml.namespace.QName;

import controller.library.Book;
import controller.library.WSLibrary;
import controller.library.WSLibraryService;


@ManagedBean
@ViewScoped
public class BookAdd implements Serializable {

	private static final long serialVersionUID = 1L;

	private Book book = new Book();

	private static final QName SERVICE_NAME = new QName("http://controller/", "WS_LibraryService");

	public BookAdd() {
		
	}
	
	public void Add() {
		URL wsdlURL = WSLibraryService.WSDL_LOCATION;
        WSLibraryService service = new WSLibraryService(wsdlURL, SERVICE_NAME);
        WSLibrary port = service.getWSLibraryPort();   
        
        port.addBook(book);
	}
	

	public Book getBook() {
		return book;
	}

	
	public void setBook(Book book) {
		this.book = book;
	}

	
}
