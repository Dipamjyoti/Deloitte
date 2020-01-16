<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form"  prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">WELCOME</h1>
<f:form>

<%--  <input type="checkbox" name="adminCheckbox" id="adminCheckbox"
  <c:if test="${check your condition}">checked="checked"</c:if> /> --%>
  
  
<%--   <form:checkbox id="someCheckbox" path="someCheckbox" 
    <c:if test="${isChecked}">
        checked="checked"
    </c:if> 
/> --%>


<%-- <c:if test="${!empty product.productName}">
							<input type="submit"  formaction="add/update" value='<spring:message text="Edit Product"/>'/>
							</c:if>
							
							<c:if test="${empty product.productName}">
							<input type="submit"  formaction="saveProduct" value='<spring:message text="Add Product"/>'/>
							</c:if> --%>
							
							
<input type="checkbox" name="adminCheckBox" id="adminCheckBox">
<f:if test="${isChecked adminCheckBox}"/>
							

</f:form>

</body>
</html>