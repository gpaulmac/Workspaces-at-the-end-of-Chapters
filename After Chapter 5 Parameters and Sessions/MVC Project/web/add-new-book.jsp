<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>

   <head>
   	<title>Enter a new book</title>
   	<link href="<c:url value="/styles.css"/>" rel="Stylesheet" type="text/css"/>   
   </head>

   <body>
	  <jsp:include page="/header.jsp"/>

	  <div id="addBook">
	      <form action="addNewBook.do" method="post">
	          <label><fmt:message key="book.isbn"/></label><input type="text" name="isbn"/>
	         <label><fmt:message key="book.title"/></label><input type="text" name="title"/>
	         <label><fmt:message key="book.author"/></label><input type="text" name="author"/>
	         <label><fmt:message key="book.price"/></label><input type="text" name="price"/>  
	
	         <input type="submit" value="Add New Book"/>
	      </form>
      </div>
      
      
      <jsp:include page="/footer.jsp"/>
   </body>
</html>
