<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="main-content">

	<c:set value="${fn:toLowerCase(calculator.alienPlanet)}" var="planetPic" />
	<c:url value="/img/${planetPic}.jpg"  var="logoURL"/>
	<img id="resultImg" src="${logoURL}" />

	<p>If you are 
	<span id="earthWeight"><c:out value="${calculator.earthWeight}" /></span> 
	lbs on planet Earth you would weigh 
	<span id="alienWeight"><c:out value="${calculator.alienWeight}"/></span> lbs. on 
	<span id="alienPlanet"><c:out value="${calculator.alienPlanet}"/></span> </p>


</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />