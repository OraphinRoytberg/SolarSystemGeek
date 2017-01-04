<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />
<section id="main-content">

	<h2>New Geek Post</h2>

	<c:url value="geekPostInput" var="formAction" />
	<form method="POST" action="${formAction}">
	
		<div>
			<label for="username">Username</label>
			<input type="text" name="username" id="username" />
		</div>
		
		<div>
			<label for="subject">Subject</label>
			<input type="text" name="subject" id="subject" />
		</div>
		
		<div>
			<label for="message">Message</label>
			<input type="text" name="message" id="message" />
		</div>
		
		<div>	
			<label></label>
			<input type="submit" value="Submit Post" />
		</div>	
		
	</form>

</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />