<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
version="1.0"
xmlns:xalan="https://xml.apache.org/xslt">

	<xsl:output method="xml" indent="yes" xalan:indent-amount="4"/>
	<xsl:template match="/">
		<html>
			<link rel="stylesheet" type="text/css" href="style.css"/>
			<body>
				<div class="maintitle">
					Bank Queuing System
				</div>
				<div class="bank">
					<xsl:for-each select="bank/queue">
					<xsl:sort select="description" order="descending" />
						
						<div class="bank">
							<xsl:call-template name="bank"/>
						</div>
					</xsl:for-each>
				</div>
			</body>
		</html>
	</xsl:template>
	
	<xsl:template name="bank">
		<div class="date">
		<a class="datewlink" name="{date}">
			<xsl:choose>
				<xsl:when test="count(date) = 1">

					<xsl:value-of select="date"/>

				</xsl:when>
				<xsl:otherwise>
					<span name="(date)">
						
						<xsl:apply-templates select="date"/>
						
					</span>
				</xsl:otherwise>
			</xsl:choose>
		</a>
		</div>
		<br/>
		<br/>
		<div class="info">
			<xsl:apply-templates select="description"/>
		</div>
		<br/>
		<br/>
		<div>
			<div class="content">
				<text>Name: </text>
				<xsl:apply-templates select="name"/>
			</div>
			<div class="content">
				<text>IC: </text>
				<xsl:apply-templates select="ic"/>
			</div>
			<div class="content">
				<text>Contact: </text>
				<xsl:apply-templates select="contact"/>
			</div>
			<div class="content">
				<text>Time: </text>
				<xsl:apply-templates select="time"/>
			</div>
		</div>
		<br/><br/>
	</xsl:template>

	<xsl:template match="date">
		
		<span name="date">
			<xsl:value-of select="."/>
			<br/>
			<br/>
			
		</span>
	</xsl:template>



</xsl:stylesheet>

