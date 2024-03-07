<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" indent="yes"/>

    <!-- Variable para almacenar el nombre del entrenador -->
    <xsl:variable name="nombreEntrenador" select="/club_voleibol/equipo[entrenador/nombre = 'Julio Velasco']/entrenador/nombre"/>

    <!-- Plantilla principal -->
    <xsl:template match="/club_voleibol">
        <html>
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

                <!-- Mostrar el nombre usando la variable antes mencionada. -->
                <main>
                    <h1>
                        <a href="#"> <xsl:value-of select="$nombreEntrenador"/></a>
                    </h1>
                    <xsl:apply-templates select="equipo[entrenador/nombre = 'Julio Velasco']/jugadores"/>
                </main>

                <footer>
                    <address>&#169; Desarrollado por info@birt.eus</address>
                </footer>
            </body>
        </html>
    </xsl:template>

    <!-- Plantilla para mostrar los jugadores -->
    <xsl:template match="jugadores">
        <article class="equipos">
            <h4><xsl:value-of select="../nombre"/></h4>
            <xsl:apply-templates select="jugador[nombre != 'Ana Silva']"/>
        </article>
    </xsl:template>

    <!-- Plantilla para mostrar los jugadores -->
    <xsl:template match="jugador">
        <p>
            <xsl:value-of select="@camiseta"/> - <xsl:value-of select="nombre"/>
        </p>
    </xsl:template>

</xsl:stylesheet>

