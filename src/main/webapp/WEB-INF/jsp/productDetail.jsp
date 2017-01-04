<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />
<section id="main-content">

	<h2>Solar System Geek Gift Shop</h2>
	
	<div id="detailView">
		<div id="detailImg">
			<c:url value="/img/${product.imageName}" var="imgURL"/>
			<img src="${imgURL}" alt="${product.name}" />
		</div>
	
		<div id="detailText">
			<h4><c:out value="${product.name}" /></h4>
			<p class="price"><c:out value="${product.price}" /></p>
			<p><c:out value="${product.description}" /></p>
			
			<c:url value="/shoppingCart" var="cartURL" />
			<form action="${cartURL}" method="POST">
				<label for="quantity">Quantity to buy</label>
				<input type="text" name="quantity" id="quantity" />
				 
				<input id="cartButton" type="submit" value="Add to Cart" />
				<input type="hidden" name="productId" value="${product.id}" />
			</form>
		</div>

	</div>
		
		
</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />