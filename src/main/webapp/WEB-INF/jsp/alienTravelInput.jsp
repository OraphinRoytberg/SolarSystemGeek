<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />
<section id="main-content">

	<h2>Alien Travel Calculator</h2>

	<c:url value="/alienTravelResult" var="formAction" />
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
			<label for="transportation">Choose a model of transportation</label>
			<select name="transportation" id="transportation">
				<option value="Walking">Walking</option>
				<option value="Car">Car</option>
				<option value="Bullet Train">Bullet Train</option>
				<option value="Boeing 747">Boeing 747</option>
				<option value="Concorde">Concorde</option>
				</select>
		</div>
		
		<div>
			<label for="earthAge">Enter Your Earth Age</label>
			<input type="text" name="earthAge" id="earthAge" />
		</div>
		
		<div>	
			<label></label>
			<input type="submit" name="Calculate Travel Time" value="Calculate Travel Time" id="culculateTravelTime" />
		</div>	
		
	</form>

</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />