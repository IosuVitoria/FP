<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" indent="yes"/>

    <!-- Plantilla principal -->
    <xsl:template match="/">
        <html>
            <head>
                <link href="./estilo.css" rel="stylesheet" type="text/css" />
                <meta charset="utf-8"/>
                <meta name="description" content="Página principal" />
                <title>titulo de la web</title>
                <style>
                    .winning-score {
                        color: rgb(28, 23, 177);
                    }

                    .height{
                        margin-top: 50px;
                    }

                    .height2{
                        margin-top: -80px;
                    }

                    
                </style>
            </head>
            <body class="body__partidos" style="height: 50vh;">
                <header>
                    <img src= "./logotipo.png" alt= "Reservas" />
                    <a href="./tienda.xml">Tienda</a>
                    <a href="./equipo.xml">Equipos</a>
                    <a href="./partidos.xml">Partidos</a>
                </header>

                <main class="principal">
                    <h1 class="height2" >Partidos</h1>
                    <table class="height">
                        <tr>
                            <th>PARTIDO</th>
                            <th>FECHA</th>
                            <th>RESULTADO</th>
                        </tr>
                        <!-- Aplicar las plantillas a los partidos -->
                        <xsl:apply-templates select="//partido"/>
                    </table>
                </main>

                <footer>
                    <address>&#169; Desarrollado por info@birt.eus</address>
                </footer>
            </body>
        </html>
    </xsl:template>

    <!-- Plantilla para mostrar la información de cada partido -->
    <xsl:template match="partido">
        <tr>
            <td>
                <xsl:value-of select="equipos/local"/> - <xsl:value-of select="equipos/visitante"/>
            </td>
            <td>
                <xsl:value-of select="fecha"/>
            </td>
            <td>
                <!-- Aplicar la clase "winning-score" si el equipo visitante gana -->
                <xsl:variable name="local" select="number(equipos/local/@puntuacion)"/>
                <xsl:variable name="visitante" select="number(equipos/visitante/@puntuacion)"/>
                <xsl:choose>
                    <xsl:when test="$visitante &gt; $local">
                        <span class="winning-score">
                            <xsl:value-of select="concat($local, ' - ', $visitante)"/>
                        </span>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select="concat($local, ' - ', $visitante)"/>
                    </xsl:otherwise>
                </xsl:choose>
            </td>
        </tr>
    </xsl:template>
</xsl:stylesheet>
