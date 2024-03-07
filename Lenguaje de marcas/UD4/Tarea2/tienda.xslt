<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/club_voleibol">
    <html >
        <head>
            <link href="./estilo.css" rel="stylesheet" type="text/css" />
            <meta charset="utf-8"/>
            <meta name="description" content="Página principal" />
            <title>titulo de la web</title>
        </head>

        <body>
            <header>
                <img src= "./logotipo.png" alt= "Reservas" />
                <a href="./tienda.xml">Tienda</a>
                <a href="./equipo.xml">Equipos</a>
                <a href="./version.xml">Partidos</a>
            </header>
            
            <main class="principal">
                <xsl:apply-templates select="tienda/articulo" />
            </main>

            <footer>
                <address>&#169; Desarrollado por info@birt.eus</address>
            </footer>
        </body>
    </html>
    </xsl:template>

    <!-- Plantilla para los artículos de la tienda. -->
    
    <xsl:template match="articulo">
        <article></article>
        <div class="articulo">
            <img src="{@foto}" alt="Imagen del artículo"/>
        </div>
        <div class="articulo">
            <h2><xsl:value-of select="nombre"/></h2>
            <p><xsl:value-of select="descripcion"/></p>
            <p>Precio: <xsl:value-of select="precio"/> €</p>
            <h3>Comentarios:</h3>
            <xsl:apply-templates select="comentarios"/>
        </div>
        
    </xsl:template>

    <!-- Plantilla para los elementos "comentarios" -->
    <xsl:template match="comentarios">
        <div class="comentario">
            <!-- Mostrar la fecha del comentario -->
            <p><strong>Fecha:</strong> <xsl:value-of select="@fecha"/></p>
            <!-- Mostrar el contenido del comentario -->
            <p><xsl:value-of select="."/></p>
        </div>
    </xsl:template>
   

</xsl:stylesheet>
