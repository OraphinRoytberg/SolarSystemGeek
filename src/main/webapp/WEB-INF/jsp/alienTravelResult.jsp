<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="main-content">
	
	
	<c:set value="${fn:toLowerCase(calculator.alienPlanet)}" var="planetPic" />
	<c:url value="/img/${planetPic}.jpg"  var="logoURL"/>
	<img id="resultImg" src="${logoURL}" />

	<p>Traveling by 
	<span id="transportation"><c:out value="${calculator.transportation}" /></span> you will reach 
	<span id="alienPlanet"><c:out value="${calculator.alienPlanet}"/></span> in  
	<span id="travelTime"><c:out value="${calculator.travelTime}"/></span> years. You will be 
	<span id="arrivalAge"><c:out value ="${calculator.arrivalAge}" /></span> years old. </p>


</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />