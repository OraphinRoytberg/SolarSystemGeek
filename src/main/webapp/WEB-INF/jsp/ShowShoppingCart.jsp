<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />
<section id="main-content">

	<h2>Solar System Geek Gift Shop</h2>
	
	<c:choose>
		<c:when test="${shoppingCart.cartEmpty}" >
			<div id="emptyCartDiv">
				<c:url value="/img/emptycart.jpg" var="emptyCartURL" />
				<img id="emptyCart" src="${emptyCartURL}" alt="Your Cart Is Empty" />
			</div>
		</c:when>
		<c:otherwise>
		
			<table>
				<tr class="cartHeaders">
					<th></th>
					<th id="nameCol">Name</th>
					<th>Price</th>
					<th>Qty.</th>
					<th>Total</th>
					<th></th>
				</tr>
				
				<c:forEach items="${shoppingCart.purchases}" var="purchase">
				<tr>
					<c:url value="/img/${purchase.product.imageName}" var="imgURL" />
					<td class="checkoutImg"><img src="${imgURL}" alt="${purchase.product.name}"></td>
					<td>${purchase.product.name}</td>
					<td>${purchase.product.price}</td>
					<td>${purchase.quantity}</td>
					<td>${purchase.totalOwed}</td>
					<td>
						<c:url value="/shoppingCart" var="cartURL" />
						<form action="${cartURL}" method="POST" >
							<input type="hidden" name="productId" value="${purchase.product.id}" />
							<input type="hidden" name="quantity" value="-1"/>
							<input type="submit" value="Remove One" />
						</form>
					</td>
				</tr>
				</c:forEach>
				
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td><b>Grand Total</b></td>
					<td>${shoppingCart.totalOwed}</td>
					<td></td>
				</tr>
				
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td><a href="#">Check out</a></td>
					<td></td>
				</tr>
			</table>
	
		</c:otherwise>
	</c:choose>

</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />