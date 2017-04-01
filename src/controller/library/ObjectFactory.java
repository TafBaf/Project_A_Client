
package controller.library;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the controller.library package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddBook_QNAME = new QName("http://controller/", "AddBook");
	private final static QName _AddBookResponse_QNAME = new QName("http://controller/", "AddBookResponse");
	private final static QName _GetBooks_QNAME = new QName("http://controller/", "GetBooks");
    private final static QName _GetBooksResponse_QNAME = new QName("http://controller/", "GetBooksResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: controller.library
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddBook }
     * 
     */
    public AddBook createAddBook() {
        return new AddBook();
    }

	/**
     * Create an instance of {@link AddBookResponse }
     * 
     */
    public AddBookResponse createAddBookResponse() {
        return new AddBookResponse();
    }

	/**
     * Create an instance of {@link GetBooks }
     * 
     */
    public GetBooks createGetBooks() {
        return new GetBooks();
    }

    /**
     * Create an instance of {@link GetBooksResponse }
     * 
     */
    public GetBooksResponse createGetBooksResponse() {
        return new GetBooksResponse();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "AddBook")
    public JAXBElement<AddBook> createAddBook(AddBook value) {
        return new JAXBElement<AddBook>(_AddBook_QNAME, AddBook.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "AddBookResponse")
    public JAXBElement<AddBookResponse> createAddBookResponse(AddBookResponse value) {
        return new JAXBElement<AddBookResponse>(_AddBookResponse_QNAME, AddBookResponse.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "GetBooks")
    public JAXBElement<GetBooks> createGetBooks(GetBooks value) {
        return new JAXBElement<GetBooks>(_GetBooks_QNAME, GetBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller/", name = "GetBooksResponse")
    public JAXBElement<GetBooksResponse> createGetBooksResponse(GetBooksResponse value) {
        return new JAXBElement<GetBooksResponse>(_GetBooksResponse_QNAME, GetBooksResponse.class, null, value);
    }

}
