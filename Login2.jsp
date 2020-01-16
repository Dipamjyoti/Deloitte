<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form"  prefix="f"%>
<!DOCTYPE html>
<html>

<body>
<f:form  modelAttribute="login1" >
		<table cellspacing="10" cellpading="10" align="center" >
			
			<tr>
				<td>Username</td>
				<td><f:input path="username" name="username" id="username" /></td>
						
			</tr>
			
			
			<tr>
				<td>Password</td>
				<td><f:input path="password" name="password" id="password" /></td>
			</tr>
			
				<tr>
                <td><input type="submit"  formaction="signin" value='<spring:message text="Sign in"/>'/></td>
                 <td><input type="submit"  formaction="signup" value='<spring:message text="Sign up"/>'/></td>
				<td><input type="reset"value="Reset"></td>
				
				
			</tr>	
				
		</table>
	</f:form>

</body>
</html>