<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" encoding="UTF-8"/>
    
    <!-- Template para la página de lista de libros -->
    <xsl:template match="/biblioteca/libros">
        <html>
            <head>
                <title>Lista de Libros</title>
                <link rel="stylesheet" type="text/css" href="estilo_lista_libros.css"/>
            </head>
            <body>
                <nav>
                    <ul>
                        <li><a href="informacion_biblioteca.html">Información de la Biblioteca</a></li>
                        <li class="active"><a href="lista_libros.html">Lista de Libros</a></li>
                    </ul>
                </nav>
                <div id="libros">
                    <h1>Lista de Libros</h1>
                    <ul>
                        <xsl:for-each select="libro">
                            <li>
                                <h2><xsl:value-of select="titulo"/></h2>
                                <p><strong>Autor:</strong> <xsl:value-of select="autor"/></p>
                                <p><strong>Género:</strong> <xsl:value-of select="genero"/></p>
                                <p><strong>Descripción:</strong> <xsl:value-of select="descripcion"/></p>
                            </li>
                        </xsl:for-each>
                    </ul>
                </div>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
