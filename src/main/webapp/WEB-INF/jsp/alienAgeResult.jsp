<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="main-content">

	<c:set value="${fn:toLowerCase(calculator.alienPlanet)}" var="planetPic" />
	<c:url value="/img/${planetPic}.jpg"  var="logoURL"/>
	<img id="resultImg" src="${logoURL}" />

	<p>If you are 
		<span id="earthAge"><c:out value="${calculator.earthAge}" /></span>
		 yours old on planet Earth, then you are 
		<span id="alienAge"><c:out value="${calculator.alienAge}"/></span> 
		<span id="alienPlanet"><c:out value="${calculator.alienPlanet}"/> yours old.</p></span>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />