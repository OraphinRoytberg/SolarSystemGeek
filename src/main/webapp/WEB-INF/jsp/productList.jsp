<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />
<section id="main-content">

	<h2>Solar System Geek Gift Shop</h2>
	<c:url value="/shoppingCart" var="shoppingCartURL" />
	<a id="shoppingCartLink" href="${shoppingCartURL}"><p>View Cart</p></a>
	
		<c:forEach items="${productList}" var="product">
		<div class="productDiv">
			<div class="shopImg">
				<c:url value="/productDetail" var="detailURL" >
					<c:param name="productId" value="${product.id}" />
				</c:url>
				
				<c:url value="/img/${product.imageName}" var="imgURL"/>
				<a href="${detailURL}"><img src="${imgURL}" alt="${product.name}"></a>
			</div>
			
			<div class="listItem">
				<p> ${product.name} </p>
				<p class="price"> ${product.price} </p>
			</div>
		</div>
		</c:forEach>
		
</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />