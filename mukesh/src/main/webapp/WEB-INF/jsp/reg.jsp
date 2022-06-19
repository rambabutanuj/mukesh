<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script type="text/javascript">


$(document).ready(function(){
	
	$("#stateCode").change(function(){
		 alert("hi");
		$.ajax({
		    url : "dist?stCode="+$("#stateCode").val(),
		    type: "GET",
		    success: function(data)
		    {
		        console.log(data);
		        $("#dcode").empty();
		        
		        for(var i=0; i<data.length; i++ ){
		        	$("#dcode").append("<option value="+data[i].distCode+">"+data[i].distName+"</option>");
		        }
		    },
		    error: function (errorThrown)
		    {
		    	console.log(errorThrown);
		 
		    }
		   });
		 
	});
	
});



</script>

</head>


<body>
 <f:form action="saveregis" modelAttribute="r">
		<table border="3" bgcolor="yellow">
			<tr>
				<td>Name</td>
				<td><f:input path="name" /> <f:errors path="name" /></td>
				<td>phone</td>
				<td><f:input path="phone" /> <f:errors path="phone" /></td>
			</tr>


			<tr>
				<td>Adhar</td>
				<td><f:input path="adhar" /> <f:errors path="adhar" /></td>

				<td>Add</td>
				<td><f:input path="add" /> <f:errors path="add" /></td>
			</tr>



			<tr>
				<td>State Name</td>
				<td><f:select path="stCode" id="stateCode">
						<f:option value="0" label="Select" />
						
						
    <f:options items="${statelist}" itemValue="stCode" itemLabel="stName" />
					</f:select>
					
					 <f:errors path="stCode" cssClass="error" /></td>


				
				<td>District Name</td>
				<td>
             
             <f:select path="distCode" id="dcode">
              
             </f:select>

					</td>




			</tr>

<tr>
				<td><input type="submit" value="save"></td>
			</tr>
		</table>
	</f:form>
</body>
</html>