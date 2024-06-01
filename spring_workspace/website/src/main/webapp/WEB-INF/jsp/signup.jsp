<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
 <h1>Signup page!</h1>
 <form:form action="registerUser" modelAttribute="user">
 name:
 <form:input path="name"/>
 <br/>
 <br/>
 gender:
 <br/>
 male<form:radiobutton path="gender" value="male"/>
 female<form:radiobutton path="gender" value="female"/>
 <br/>
 <br/>
 location:
 <form:select path="location">
 	<form:option value="India"></form:option>
 	<form:option value="NRI"></form:option>
 </form:select> 
 <br/>
 <br/>
 college:
 <form:select path="college">
 	<form:option value="dtu"></form:option>
 	<form:option value="iitgn"></form:option>
 </form:select>
 <input type="submit">
 </form:form>
</html>