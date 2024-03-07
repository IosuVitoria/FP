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
                <a href="./partidos.xml">Partidos</a>
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
        <article>
            <div class="articulo">
                <img src="{@foto}" alt="Imagen del artículo"/>
            </div>
            <div style = "color:black">
                <h2 ><xsl:value-of select="precio"/> €</h2>               
                <h3 >
                    <xsl:text>Comentarios: </xsl:text><xsl:value-of select="count(comentarios)"/><xsl:text></xsl:text>
                </h3>
                <ul>
                     <xsl:apply-templates select="comentarios"/>
                </ul>
            </div>
        </article>
        
    </xsl:template>

    <!-- Plantilla para los elementos "comentarios" -->
    <xsl:template match="comentarios">
        <li class="comentario" style = "color:black">
             <xsl:value-of select="@fecha"/> : <xsl:value-of select="."/>
        </li>
    </xsl:template>
   

</xsl:stylesheet>
