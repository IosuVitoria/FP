<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <xsl:template match="/">
    <html>
      <head>
        <title>Lista de Libros</title>
        <style>
          /* Estilos para la lista de libros */
          body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
          }
          h1 {
            color: #333;
            text-align: center;
          }
          .libro {
            margin-bottom: 20px;
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            padding: 20px;
          }
          .titulo {
            font-size: 20px;
            color: #333;
          }
          .autor {
            font-size: 16px;
            color: #666;
          }
          .fecha {
            font-size: 14px;
            color: #999;
          }
        </style>
      </head>
      <body>
        <h1>Lista de Libros</h1>
        <xsl:apply-templates select="biblioteca/libro"/>
      </body>
    </html>
  </xsl:template>

  <xsl:template match="libro">
    <div class="libro">
      <div class="titulo">
        <xsl:value-of select="titulo"/>
      </div>
      <div class="autor">
        <xsl:text>Autor: </xsl:text>
        <xsl:value-of select="autor"/>
      </div>
      <div class="fecha">
        <xsl:text>Publicado en: </xsl:text>
        <xsl:value-of select="fechaPublicacion/@año"/>
      </div>
    </div>
  </xsl:template>

</xsl:stylesheet>
