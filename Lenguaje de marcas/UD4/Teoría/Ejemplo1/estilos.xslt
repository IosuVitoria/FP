<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" encoding="UTF-8"/>
    
    <!-- Template para la página de información de la biblioteca -->
    <xsl:template match="/biblioteca/informacion">
        <html>
            <head>
                <title>Información de la Biblioteca</title>
                <link rel="stylesheet" type="text/css" href="estilo_informacion.css"/>
            </head>
            <body>
                <nav>
                    <ul>
                        <li class="active"><a href="informacion_biblioteca.html">Información de la Biblioteca</a></li>
                        <li><a href="lista_libros.html">Lista de Libros</a></li>
                    </ul>
                </nav>
                <div id="informacion">
                    <h1><xsl:value-of select="nombre"/></h1>
                    <p><strong>Dirección:</strong> <xsl:value-of select="direccion"/></p>
                    <p><strong>Teléfono:</strong> <xsl:value-of select="telefono"/></p>
                    <p><strong>Descripción:</strong> <xsl:value-of select="descripcion"/></p>
                    <p><strong>Horario:</strong> <xsl:value-of select="horario"/></p>
                </div>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>

