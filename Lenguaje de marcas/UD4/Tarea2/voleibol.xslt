<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <link href="./css/estilo.css" rel="stylesheet" type="text/css" />
                <meta charset="utf-8" />
                <meta name="description" content="Página principal" />
                <title>Título de la web</title>
                <style>
                    
                
                
                </style>
            </head>
            <body>
                <header>
                    <nav>
                        <img src="./img/logotipo.png" alt="Reservas" />
                        <li><a href="./tienda.xml">Tienda</a></li>
                        <li><a href="./equipo.xml">Equipos</a></li>
                        <li><a href="./voleibol.xml">Partidos</a></li>
                    </nav>
                    
                </header>
                <main>
                    <h1><a href="https://es.wikipedia.org/wiki/Julio_Velasco">JULIO VELASCO</a></h1>
                    <xsl:apply-templates select="//equipo[entrenador/nombre='Julio Velasco']" />
                </main>
                <footer>
                    <address>&#169; Desarrollado por info@birt.eus</address>
                </footer>
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="equipo">
        <article class="equipos">
            <h4><xsl:value-of select="nombre" /></h4>
            <xsl:apply-templates select="jugadores/jugador[@titular='si']" />
        </article>
    </xsl:template>
    
    <xsl:template match="jugador">
        <p><xsl:value-of select="@camiseta" /> - <xsl:value-of select="nombre" /></p>
    </xsl:template>
</xsl:stylesheet>
