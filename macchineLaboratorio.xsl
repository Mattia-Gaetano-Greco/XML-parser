<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <h1 align="center">Dettagli macchine</h1>
                <table border="3" align="center" >
                    <tr>
                        <th>ID</th>
                        <th>IP</th>
                        <th>Mac</th>
                        <th>Processore</th>
                        <th>Sistema operativo</th>
                        <th>RAM</th>
                        <th>Scheda grafica</th>
                    </tr>
                    <xsl:for-each select="laboratorio/macchina">
                        <tr>
                            <td><xsl:value-of select="@numero"/></td>
                            <td><xsl:value-of select="@ip"/></td>
                            <td><xsl:value-of select="@mac"/></td>
                            <td><xsl:value-of select="processore"/></td>
                            <td><xsl:value-of select="sistema_operativo"/></td>
                            <td><xsl:value-of select="ram"/></td>
                            <td><xsl:value-of select="scheda_grafica"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>