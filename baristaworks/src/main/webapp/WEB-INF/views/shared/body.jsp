<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/shared/taglibs.jsp" %>

<div class="hero-unit">
	<h1>baristaworks!</h1>
	<p>This is a template for a simple marketing or informational
		website. It includes a large callout called the hero unit and three
		supporting pieces of content. Use it as a starting point to create
		something more unique.</p>
    <sec:authorize url='/admin/index'>
      <p>
      You can currently access "/admin" URLs.
      </p>
    </sec:authorize>
    <sec:authorize url='/admin/extreme/index'>
      <p>
      You can currently access "/admin/extreme" URLs.
      </p>
    </sec:authorize>
	<p>
		<a href="https://github.com/seungbeomi/baristaworks" target="blank" class="btn btn-primary btn-large">GitHub Source Reposiroty &raquo;</a>
	</p>
</div>
<div class="row-fluid">
	<div class="span4">
		<h2>Your principal object is...</h2>
		<p>
      <%= request.getUserPrincipal() %>
    </p>
		<p>
			<a class="btn" href="#">View details &raquo;</a>
		</p>
	</div>
	<!--/span-->
	<div class="span4">
		<h2>Heading</h2>
		<p>Donec id elit non mi porta gravida at eget metus. Fusce
			dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut
			fermentum massa justo sit amet risus. Etiam porta sem malesuada magna
			mollis euismod. Donec sed odio dui.</p>
		<p>
			<a class="btn" href="#">View details &raquo;</a>
		</p>
	</div>
	<!--/span-->
	<div class="span4">
		<h2>Heading</h2>
		<p>Donec id elit non mi porta gravida at eget metus. Fusce
			dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut
			fermentum massa justo sit amet risus. Etiam porta sem malesuada magna
			mollis euismod. Donec sed odio dui.</p>
		<p>
			<a class="btn" href="#">View details &raquo;</a>
		</p>
	</div>
	<!--/span-->
</div>
<!--/row-->
<div class="row-fluid">
	<div class="span4">
		<h2>Heading</h2>
		<p>Donec id elit non mi porta gravida at eget metus. Fusce
			dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut
			fermentum massa justo sit amet risus. Etiam porta sem malesuada magna
			mollis euismod. Donec sed odio dui.</p>
		<p>
			<a class="btn" href="#">View details &raquo;</a>
		</p>
	</div>
	<!--/span-->
	<div class="span4">
		<h2>Heading</h2>
		<p>Donec id elit non mi porta gravida at eget metus. Fusce
			dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut
			fermentum massa justo sit amet risus. Etiam porta sem malesuada magna
			mollis euismod. Donec sed odio dui.</p>
		<p>
			<a class="btn" href="#">View details &raquo;</a>
		</p>
	</div>
	<!--/span-->
	<div class="span4">
		<h2>Heading</h2>
		<p>Donec id elit non mi porta gravida at eget metus. Fusce
			dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut
			fermentum massa justo sit amet risus. Etiam porta sem malesuada magna
			mollis euismod. Donec sed odio dui.</p>
		<p>
			<a class="btn" href="#">View details &raquo;</a>
		</p>
	</div>
	<!--/span-->
</div>
<!--/row-->