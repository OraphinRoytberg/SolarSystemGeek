<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />
<section id="main-content">

	<h2>Alien Age Calculator</h2>

	<c:url value="/alienAgeResult" var="formAction" />
	<form method="GET" action="${formAction}">
	
		<div>
			<label for="planet">Choose a Planet</label>
			<select name="planet" id="planet">
				<option value="Mercury">Mercury</option>
				<option value="Venus">Venus</option>
				<option value="Mars">Mars</option>
				<option value="Jupiter">Jupiter</option>
				<option value="Saturn">Saturn</option>
				<option value="Neptune">Neptune</option>
				<option value="Uranus">Uranus</option>	
			</select>
		</div>
		
		<div>
			<label for="earthAge">Enter Your Earth Age</label>
			<input type="text" name="earthAge" id="earthAge" />
		</div>
		
		<div>	
			<label></label>
			<input type="submit" name="Calculate Age" value="Calculate Age" id="calculateAge" />
		</div>	
		
	</form>

</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />