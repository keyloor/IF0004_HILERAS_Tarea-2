**Debe investigar y mencionar qué es una hilera de caracteres, y algunos ejemplos:**

En Java, una hilera de caracteres es una secuencia de texto representada por la clase String.  
Se utiliza para almacenar palabras, frases, números en forma de texto y símbolos.

Ejemplos:
```java
String saludo = "Hola";
String nombre = "Keylor";
String numero = "123";
String vacio = "";
```


**Debe marcar la diferencia entre un carácter y una hilera:**

Un carácter (char) representa un solo carácter mientras que una hilera (String) representa varios caracteres juntos.


**Investigue y mencione qué operaciones se pueden realizar con una hilera:**

# Operaciones básicas con hileras de caracteres en Java

**Longitud:** obtiene la cantidad de caracteres de la hilera.  
`texto.length();`

**Concatenación:** une dos o más hileras.  
`texto + " Mundo";`  
`texto.concat(" Mundo");`

**Acceso a un carácter:** obtiene un carácter según su posición.  
`texto.charAt(0);`

**Subcadena:** extrae una parte del texto.  
`texto.substring(1, 3);`

**Comparación:** compara dos hileras para saber si son iguales.  
`texto.equals("Hola");`  
`texto.equalsIgnoreCase("hola");`

**Búsqueda de texto:** verifica si una palabra o carácter está dentro de la hilera.  
`texto.contains("Ho");`  
`texto.indexOf("la");`

**Reemplazo:** cambia una parte del texto por otra.  
`texto.replace("Hola", "Adiós");`

**Mayúsculas y minúsculas:** convierte el texto a mayúsculas o minúsculas.  
`texto.toUpperCase();`  
`texto.toLowerCase();`

**Eliminación de espacios:** quita espacios al inicio y al final.  
`texto.trim();`

**División de hileras:** divide una hilera usando un separador.  
`"1,2,3".split(",");`

