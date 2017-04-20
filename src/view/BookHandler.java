package view;

import java.io.Serializable;
import java.net.URL;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.xml.namespace.QName;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import controller.Book;
import controller.WSLibrary;
import controller.WSLibraryService;

@ManagedBean
@ViewScoped
public class BookHandler implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LogManager.getLogger(BookHandler.class);
	
	private Book book = new Book();

	private static final QName SERVICE_NAME = new QName("http://controller/", "WS_LibraryService");

	public BookHandler() {

	}

	public void AddBook() {
		URL wsdlURL = WSLibraryService.WSDL_LOCATION;
		WSLibraryService service = new WSLibraryService(wsdlURL, SERVICE_NAME);
		WSLibrary port = service.getWSLibraryPort();

		port.addBook(book);

        logger.trace("Entering application.");
        logger.error("Didn't do it.");
		
		logger.trace("See on log!!!!");
		logger.error("Error !!! Log it!!!!!!!!!!!!!!");
	}

	public void DeleteBook(int id) {
		System.out.println(String.valueOf(id));

		URL wsdlURL = WSLibraryService.WSDL_LOCATION;
		WSLibraryService service = new WSLibraryService(wsdlURL, SERVICE_NAME);
		WSLibrary port = service.getWSLibraryPort();

		port.deleteBook(String.valueOf(id));
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}
