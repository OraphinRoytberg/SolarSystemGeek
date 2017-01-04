<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />
<section id="main-content">

	<div id="forumTitle">
		<h2>Solar System Geek Forum</h2>
	
		<c:url value="/geekPostInput" var="geekPostHref" />
		<a href="${geekPostHref}">Post a Message</a>
	</div>
	
	<c:forEach items="${allPosts}" var="forumPost" >
		<div class="forum-block">
			<div class="postHeader">
				<p><b>${forumPost.subject}</b><p>
				<p>by ${forumPost.username} on ${forumPost.datePosted.monthValue}/${forumPost.datePosted.dayOfMonth}/${forumPost.datePosted.year}
					 at ${forumPost.datePosted.hour}:${forumPost.datePosted.minute}:${forumPost.datePosted.second}</p>
			</div>
			<p>${forumPost.message}</p>
		</div>
	</c:forEach>

</section>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />