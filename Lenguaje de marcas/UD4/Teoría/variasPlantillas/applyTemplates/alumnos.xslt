<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
    <xsl:output encoding="utf-8" />

    <!-- Estilos CSS -->
    <xsl:template name="style">
        <style type="text/css">
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f4;
                margin: 0;
                padding: 0;
                display: flex;
				flex-direction:column;
                justify-content: center;
                align-items: center;
                min-height: 100vh;
            }
            nav {
                background-color: #333;
                color: white;
                padding: 10px;
                border-radius: 10px;
                box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
                margin-bottom: 20px;
            }
            nav ul {
                list-style-type: none;
                padding: 0;
                margin: 0;
                text-align: center;
            }
            nav ul li {
                display: inline;
                margin-right: 10px;
            }
            nav ul li a {
                text-decoration: none;
                color: white;
                padding: 5px 10px;
                border-radius: 5px;
                transition: all 0.3s ease;
            }
            nav ul li a:hover {
                background-color: #555;
            }
            h2 {
                color: #333;
                text-align: center;
                margin-bottom: 20px;
            }
            table {
                width: 80%;
                margin: 0 auto;
                border-collapse: collapse;
                box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
                border-radius: 10px;
            }
            th, td {
                padding: 10px;
                text-align: center;
                border-bottom: 1px solid #ddd;
            }
            th {
                background-color: #333;
                color: white;
            }
            .alumno {
                background-color: #fff;
                padding: 10px;
                margin-bottom: 10px;
                border-radius: 10px;
                box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
                transition: all 0.3s ease;
            }
            .alumno:hover {
                transform: translateY(-5px);
                box-shadow: 0 8px 12px rgba(0, 0, 0, 0.1);
            }
            .asignatura {
                margin-left: 20px;
                color: #555;
            }
            .nota {
                background-color: #f9f9f9;
                padding: 10px;
                margin-bottom: 10px;
                border-radius: 10px;
                box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            }
            .animation {
                transition: all 0.3s ease;
            }
            .animation:hover {
                transform: scale(1.1);
            }
        </style>
    </xsl:template>

    <!-- Plantilla principal. Selecciono los nodos o elementos con los que quiero trabajar -->
    <xsl:template match="/Resultados">
        <html>
            <head>
                <title>Resultados</title>
                <xsl:call-template name="style"/>
            </head>
            <body>
                <nav>
                    <ul>
                        <li><a href="/Lenguaje%20de%20marcas/UD4/Teoría/variasPlantillas/applyTemplates/alumnos_prueba.xml">Prueba</a></li>
                    </ul>
                </nav>
                <h2>Alumnado</h2>
				<table>
					<tr>
						<th>Nombre</th>
						<th>Código</th>
					</tr>
					<xsl:apply-templates select="Alumnos/alumno">
						<xsl:sort select="nombre" />
					</xsl:apply-templates>
				</table>
                
                <h2>Módulos</h2>
				<ul>
					<xsl:apply-templates select="Asignaturas/Asignatura" />
				</ul>

				<h2>Notas</h2>
				<table>
					<tr>
						<th>Alumno</th>
						<th>Asignatura</th>
						<th>Calificacion</th>
					</tr>
					<xsl:apply-templates select="Notas/Nota" />
				</table>

				<h2>Datos de centro</h2>
                <p>Curso: <xsl:value-of select="curso" /></p>
                <p>Centro: <xsl:value-of select="centro" /></p>
            </body>
        </html>
    </xsl:template>

    <!-- Plantilla para el alumnado -->
    <xsl:template match="alumno">
			<tr class="alumno animation">
				<td><xsl:value-of select="nombre"/></td>
				<td><xsl:value-of select="cod"/></td>
			</tr>
    </xsl:template>

    <!-- Plantilla para las Asignaturas -->
    <xsl:template match="Asignatura">
        <li class="asignatura animation"><xsl:value-of select="siglas"/></li>
    </xsl:template>

    <!-- Plantilla para las notas -->
    <xsl:template match="Nota">
		<tr class="nota animation">
			<td><xsl:value-of select="alum"/></td>
			<td><xsl:value-of select="asig"/></td>
			<td><xsl:value-of select="calificacion"/></td>
		</tr>
    </xsl:template>
</xsl:stylesheet>
