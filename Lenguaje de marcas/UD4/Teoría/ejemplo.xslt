<?xml version="1.0" encoding="utf-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
<xsl:output encoding="utf-8" />

<!-- Plantilla principal: intercalamos código HTML con datos XML -->
<!-- <xsl:template match="//libro" >
	<html>
	<body>
		<h1>Libros</h1>
		<p>Título: <xsl:value-of select="titulo" /></p>
		<p>Publicacion: <xsl:value-of select="fechaPublicacion/@anio" /></p>
		<p>Nombre: <xsl:value-of select="autor" /></p>
	</body>
	</html>
</xsl:template>

</xsl:stylesheet> -->

	<!-- <xsl:template match="/" >
		<html>
			<head>
			<style>
				body{
					background-color:"blue"
				}
			</style>
			
			</head>
			<body>
				<h1>Libros</h1>
				<p>Título: <xsl:value-of select= "/biblioteca/libro/titulo" /></p>
				<p>Publicacion: <xsl:value-of select="//libro/fechaPublicacion/@anio" /></p>
				<p>Nombre: <xsl:value-of select="/biblioteca/libro/autor" /></p>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet> -->


<!-- <?xml version="1.0" encoding="utf-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
<xsl:output encoding="utf-8" /> -->

<!-- Plantilla principal: intercalamos código HTML con datos XML -->
<!-- <xsl:template match="//libro" >
	<html>
	<body>
		<h1>Libros</h1>
		<p>Título: <xsl:value-of select="titulo" /></p>
		<p>Publicacion: <xsl:value-of select="fechaPublicacion/@anio" /></p>
		<p>Nombre: <xsl:value-of select="autor" /></p>
	</body>
	</html>
</xsl:template>

</xsl:stylesheet> -->

	<xsl:template match="/" >
        <html>
            <head>
                <style>
                    body {
                        background-color: blue;
                        color: white;
                    }
                </style>
            </head>
            <body>
                <h1>Libros</h1>
                <!-- Utilizamos "//" para buscar en cualquier parte del documento -->
                <xsl:for-each select="//libro">
                    <!-- Accedemos a los elementos y atributos dentro de cada libro -->
                    <p>Título: <xsl:value-of select="titulo" /></p>
                    <p>Publicación: <xsl:value-of select="fechaPublicacion/@anio" /></p>
                    <p>Nombre: <xsl:value-of select="autor" /></p>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>